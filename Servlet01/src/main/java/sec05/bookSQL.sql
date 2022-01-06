use servletdb;

CREATE TABLE book (
	bookNo varchar(10) NOT NULL PRIMARY KEY,
    bookName varchar(20) DEFAULT NULL,
	bookAuthor varchar(30) DEFAULT NULL,
	bookPrice int DEFAULT NULL,
	bookDate date DEFAULT NULL,
	bookStock int DEFAULT NULL,
	pubNo varchar(10) NOT NULL
);