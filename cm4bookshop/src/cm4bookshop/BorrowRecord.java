package cm4bookshop;

public class BorrowRecord {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public BookStore getBookStore() {
	return bookStore;
}
public void setBookStore(BookStore bookStore) {
	this.bookStore = bookStore;
}
public String getBorrowDate() {
	return borrowDate;
}
public void setBorrowDate(String borrowDate) {
	this.borrowDate = borrowDate;
}
public String getReturnDate() {
	return returnDate;
}
public void setReturnDate(String returnDate) {
	this.returnDate = returnDate;
}
private Book book;
private Customer customer;
private BookStore bookStore;
private String borrowDate;
private String returnDate;

}
