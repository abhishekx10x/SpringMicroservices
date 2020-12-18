package com.india.rest.BookSearchMS;

public class BookPriceInfo
{
	 private Integer bookId;
	 private double price;
	 private double offer;
	 private String serverPort;
	 
	 
	 
	 
	public BookPriceInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookPriceInfo(Integer bookId, double price, double offer, String serverPort) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.offer = offer;
		this.serverPort = serverPort;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getOffer() {
		return offer;
	}
	public void setOffer(double offer) {
		this.offer = offer;
	}
	public String getServerPort() {
		return serverPort;
	}
	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}
	@Override
	public String toString() {
		return "BookPriceInfo [bookId=" + bookId + ", price=" + price + ", offer=" + offer + ", serverPort="
				+ serverPort + "]";
	}
}
