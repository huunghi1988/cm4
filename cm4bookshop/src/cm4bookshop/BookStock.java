package cm4bookshop;

public class BookStock {
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public BookStore getBookStore() {
		return bookStore;
	}
	public void setBookStore(BookStore bookStore) {
		this.bookStore = bookStore;
	}
private int id;
private int quantity;
private Book book;
private BookStore bookStore;

}
