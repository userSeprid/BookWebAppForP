package com.seprid.books.dto;


public class ClientDetails {

	private String fName;
	private String lName;
	private String address;
	private int bookId;
	private int amount;
	private int bookPrice;


	public ClientDetails() {}

	public ClientDetails(String fName, String lName, String address, int bookId, int amount, int bookPrice) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
        this.bookId = bookId;
        this.amount = amount;
        this.bookPrice = bookPrice;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
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

    @Override
    public String toString() {
        return "ClientDetails{" +
                "first name=" + fName +
                ", last name=" + lName +
                ", address=" + address +
                ", amount=" + amount +
                '}';
    }
}
