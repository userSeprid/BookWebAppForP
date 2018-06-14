INSERT INTO book (id, title, author, genre, description, price) VALUES
(1,'Run', 'Mike Mikes', 'Vestern', 'This an epic story about runing!', 49),
(2, 'Karate', 'John Jones', 'Science', 'How to Karate as MASTA', 150),
(3, 'Weed', 'Annonymus', 'Science', 'How to grow it in your home', 99),
(4, 'Girl storyes', 'Mart Back', 'Comedy', 'Set of funny storyes', 29),
(5, 'Zihoza', 'Alladin Lamps', 'Drama', 'What you must do if your lamp hate you', 25),
(6, 'Recover', 'Mark Van; Adris Shetin', 'Health', 'How to get up and newer fall again', 60),
(7, 'Name of this book', 'John Jones', 'Drama; Comedy', 'What you must do if run out of names for books ideas!', 120),
(8, 'Gap', 'Alex Stieve; J.J.', 'History', 'How to fall properly', 299);


INSERT INTO transactions (id, f_Name, l_Name, address, book_Id, amount, book_Price, purchase_Time_Stamp) VALUES
(1, 'Mike', 'Mikes', 'NY', 5, 2, 49, current_timestamp );