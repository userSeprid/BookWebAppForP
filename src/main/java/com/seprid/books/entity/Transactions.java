package com.seprid.books.entity;

import com.seprid.books.dto.ClientDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fName;
    private String lName;
    private String address;
    private int bookId;
    private int amount;
    private int bookPrice;
    private Date purchaseTimeStamp;

    public Transactions(String fName, String lName, String address, int bookId, int amount, int bookPrice, Date purchaseTimeStamp) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.bookId = bookId;
        this.amount = amount;
        this.bookPrice = bookPrice;
        this.purchaseTimeStamp = purchaseTimeStamp;
    }

    public Transactions(ClientDetails clientDetails) {
        this.fName = clientDetails.getFName();
        this.lName = clientDetails.getLName();
        this.address = clientDetails.getAddress();
        this.amount = clientDetails.getAmount();
        this.bookId = clientDetails.getBookId();
        this.bookPrice = clientDetails.getBookPrice();
        this.purchaseTimeStamp = new Date();
    }

    public Transactions() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getPurchaseTimeStamp() {
        return purchaseTimeStamp;
    }

    public void setPurchaseTimeStamp(Date purchaseTimeStamp) {
        this.purchaseTimeStamp = purchaseTimeStamp;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
}
