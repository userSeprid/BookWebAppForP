# Web application for Provectus.

This is a web-application that works as a book's store. 

This store persist data about:
- Books (ID, title, author, genre, description, price);
- Client transactions (ID, client first name, client last name, client address, book ID, amount of buyed books, book/s price, timestamp(when transaction was performed);
- Application consists of 6 pages and additional forms:

First page - index:
- Index page, here user can earn admin privileges by 'Sign in' form. From this page user can enter to admin interface and user's part of web-app.

Second page - bookList:
- List of aviable books with no-admin access (ID's in table are clickable and refer to 'BookDetails' without admin privileges);
- User can filer the list by using form in head of page and he can view book details by cliking on its ID. 
- Also from this page user can enter to 'transactions' page.

Third page - transactionsList:
- List of all performed transactions. User can user the form in top of page to find the concrete transaction by it ID.

Fourth page - userBookDetails:
- Table with data about concrete book.
- Book purchase form.

Fifth page - adminPanel:
- List of aviable books with admin access (ID's in table are clickable and refer to 'BookDetails' with admin privileges);
- User can filer the list by using form in head of page and he can view book details by cliking on its ID. 
- Book creation form.

Sixth page - adminBookDetails: 
- Table with data about concrete book.
- Book edit form.

Technology, tools, libs used:
- Maven
- Spring-boot
- Spring Security
- H2 DB
- Thymeleaf

For deployment spring-boot plugin is uses. (org.springframework.boot:spring-boot-maven-plugin:2.0.2.RELEASE)

To start do the following:

1. Install apache maven 'https://maven.apache.org/index.html'.
2. Type ' mvn -version' in command line. If as input you have message with information about your maven and java version and path ande other information it mean that maven configured properrly.
3. Open command line in root project directory
4. Type 'mvn spring-boot:run' to start the application.
5. Open in your browser 'http://localhost:8090/index'
! Maven must be installed and configured !

- Administrator login : 'user', password : 'password'.
