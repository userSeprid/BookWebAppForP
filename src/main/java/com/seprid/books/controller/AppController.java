package com.seprid.books.controller;

import com.seprid.books.dto.AdminLogin;
import com.seprid.books.dto.ClientDetails;
import com.seprid.books.entity.Book;
import com.seprid.books.entity.Transactions;
import com.seprid.books.repository.BookRepository;
import com.seprid.books.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class AppController {
    private BookRepository bookRepository;
    private TransactionRepository transactionRepository;

    @Autowired
    public AppController(BookRepository bookRepository, TransactionRepository transactionRepository) {
        
        this.bookRepository = bookRepository;
        this.transactionRepository = transactionRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public String getIndexPage(Model model) {
        AdminLogin adminLogin = new AdminLogin();
        model.addAttribute("adminLogin", adminLogin);

        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/index")
    public String enterToAdminPanel() {
        return "redirect:/adminPanel";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/adminPanel")
    public String getAdminPanel(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("booksList", books);
        Book exampleBook = new Book();
        model.addAttribute("book", exampleBook);

        return "adminPanel";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/adminPanel")
    public String createBook(@ModelAttribute("book") Book book) {

        bookRepository.save(new Book(book.getTitle(), book.getAuthor(), book.getGenre(), book.getDescription(), book.getPrice()));

        return "redirect:/adminPanel";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/adminPanel/{bookId}")
    public String getAdminBookDetails(Model model, @PathVariable Integer bookId) {

        Book book = bookRepository.getOne(bookId);
        model.addAttribute("book", book);

        return "adminBookDetails";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/adminPanel/saveBook")
    public String setAdminBookDetails(@ModelAttribute("book") Book book) {
        bookRepository.save(book);

        return "redirect:/adminPanel";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bookPage")
    public String getBookList(Model model) {
        List<Book> books = bookRepository.findAll();
        model.addAttribute("bookList", books);
        ClientDetails clientDetails = new ClientDetails();
        model.addAttribute("details", clientDetails);

        return "bookList";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bookPage/{bookId}")
    public String getUserBookDetails(Model model, @PathVariable Integer bookId) {
        Book book = bookRepository.getOne(bookId);
        model.addAttribute("aBook", book);
        ClientDetails clientDetails = new ClientDetails();
        model.addAttribute("userDetails", clientDetails);

        return "userBookDetails";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/bookPage/bookBuy")
    public String buyABook(@ModelAttribute("userDetails") ClientDetails clientDetails) {
        Transactions transactions = new Transactions(clientDetails);
        transactionRepository.save(transactions);

        return "redirect:/bookPage/";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bookPage/transactionsList")
    public String getTransactionsList(Model model) {

        List<Transactions> transactionsList = transactionRepository.findAll();
        model.addAttribute("transactions", transactionsList);

        return "transactionsList";
    }
}