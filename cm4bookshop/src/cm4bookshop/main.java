package cm4bookshop;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		BookStore bookStore1_Amazon = new BookStore();
		bookStore1_Amazon.setId(1);
		bookStore1_Amazon.setName("Amazon");
		bookStore1_Amazon.setAddress("Online");

		BookStore bookStore2_Baker = new BookStore();
		bookStore2_Baker.setId(2);
		bookStore2_Baker.setName("Baker&Taylor");
		bookStore2_Baker.setAddress("Library NSW");

		BookStore[] bookStores = { bookStore1_Amazon, bookStore2_Baker };

		Book book1_Java = new Book();
		book1_Java.setId(1);
		book1_Java.setName("java");
		book1_Java.setISBN("12345678");
		book1_Java.setAuthor("Dung");

		Book book2_Dotnet = new Book();
		book2_Dotnet.setId(2);
		book2_Dotnet.setName(".net");
		book2_Dotnet.setISBN("987654321");
		book2_Dotnet.setAuthor("Tri");

		Book book3_Csharp = new Book();
		book3_Csharp.setId(3);
		book3_Csharp.setName("C#");
		book3_Csharp.setISBN("1234567812");
		book3_Csharp.setAuthor("Dung");

		Book book4_Cplus = new Book();
		book4_Cplus.setId(4);
		book4_Cplus.setName("C++");
		book4_Cplus.setISBN("98765432321");
		book4_Cplus.setAuthor("Tri");

		Book[] books = { book1_Java, book2_Dotnet, book3_Csharp, book4_Cplus };

		BookStock bookStock1 = new BookStock();
		bookStock1.setId(1);
		bookStock1.setQuantity(10);
		bookStock1.setBook(book1_Java);
		bookStock1.setBookStore(bookStore1_Amazon);

		BookStock bookStock2 = new BookStock();
		bookStock2.setId(2);
		bookStock2.setQuantity(10);
		bookStock2.setBook(book2_Dotnet);
		bookStock2.setBookStore(bookStore2_Baker);

		BookStock bookStock3 = new BookStock();
		bookStock3.setId(3);
		bookStock3.setQuantity(10);
		bookStock3.setBook(book3_Csharp);
		bookStock3.setBookStore(bookStore1_Amazon);

		BookStock bookStock4 = new BookStock();
		bookStock4.setId(4);
		bookStock4.setQuantity(10);
		bookStock4.setBook(book4_Cplus);
		bookStock4.setBookStore(bookStore2_Baker);

		BookStock[] bookStocks = { bookStock1, bookStock2, bookStock3, bookStock4 };

		Category cate1 = new Category();
		cate1.setId(1);
		cate1.setType("Arts");

		Category cate2 = new Category();
		cate2.setId(2);
		cate2.setType("Computer");

		Category cate3 = new Category();
		cate3.setId(3);
		cate3.setType("Engineer");

		Category[] cates = { cate1, cate2, cate3 };

		BookCategory bookCate1 = new BookCategory();
		bookCate1.setId(0);
		bookCate1.setBook(book1_Java);
		bookCate1.setCategory(cate3);

		BookCategory bookCate2 = new BookCategory();
		bookCate2.setId(1);
		bookCate2.setBook(book2_Dotnet);
		bookCate2.setCategory(cate1);

		BookCategory bookCate3 = new BookCategory();
		bookCate1.setId(2);
		bookCate1.setBook(book3_Csharp);
		bookCate1.setCategory(cate2);

		BookCategory bookCate4 = new BookCategory();
		bookCate4.setId(3);
		bookCate4.setBook(book4_Cplus);
		bookCate4.setCategory(cate1);

		BookCategory[] bookCates = { bookCate1, bookCate2, bookCate3, bookCate4 };

		Customer cus1 = new Customer();
		cus1.setId(0);
		cus1.setName("Nghi Tran");

		Customer cus2 = new Customer();
		cus2.setId(1);
		cus2.setName("thay Dung");

		Customer[] customers = { cus1, cus2 };

		BorrowRecord borrowRec1 = new BorrowRecord();
		borrowRec1.setId(0);
		borrowRec1.setBook(book1_Java);
		borrowRec1.setBookStore(bookStore1_Amazon);
		borrowRec1.setCustomer(cus1);
		borrowRec1.setBorrowDate("12/12/2022");

		BorrowRecord borrowRec2 = new BorrowRecord();
		borrowRec2.setId(1);
		borrowRec2.setBook(book2_Dotnet);
		borrowRec2.setBookStore(bookStore1_Amazon);
		borrowRec2.setCustomer(cus1);
		borrowRec2.setBorrowDate("12/11/2022");
		borrowRec2.setReturnDate("12/12/2022");

		BorrowRecord borrowRec3 = new BorrowRecord();
		borrowRec3.setId(2);
		borrowRec3.setBook(book3_Csharp);
		borrowRec3.setBookStore(bookStore2_Baker);
		borrowRec3.setCustomer(cus2);
		borrowRec3.setBorrowDate("12/11/2022");
		borrowRec3.setReturnDate("12/12/2022");
		
		BorrowRecord borrowRec4 = new BorrowRecord();
		borrowRec4.setId(3);
		borrowRec4.setBook(book1_Java);
		borrowRec4.setBookStore(bookStore2_Baker);
		borrowRec4.setCustomer(cus2);
		borrowRec4.setBorrowDate("12/11/2024");
		borrowRec4.setReturnDate("12/12/2025");

		BorrowRecord[] borrowRecords = { borrowRec1, borrowRec2, borrowRec3,borrowRec4 };

		// show borrow list by store and book name + return status
		findBorrowList(borrowRecords);
		findBorrowAndReturn(borrowRecords);


	}

	public static void findBorrowList(BorrowRecord[] borrowRecords)
	{
		for (BorrowRecord borrowRecord:borrowRecords) {
			
				System.out.println("Book name is : "+borrowRecord.getBook().getName());
				System.out.println("ISBN is : "+borrowRecord.getBook().getISBN());
				System.out.println("Book store is : "+borrowRecord.getBookStore().getName());
				System.out.println("borrow date is : "+borrowRecord.getBorrowDate());
				if(borrowRecord.getReturnDate()==null) {
					System.out.println("Book is not return");
				}
				else
				System.out.println("Return date is "+borrowRecord.getReturnDate());
				System.out.println("---------------------------------------");
				}
			
			
			
	}
	
	public static void findBorrowAndReturn(BorrowRecord[] borrowRecords) {
		
		String storeName;
		String bookName;

		System.out.println("Find borrow list by store and book name");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please input the store Name"); storeName = sc.nextLine();
		  
		  System.out.println("Please input the book Name"); bookName = sc.nextLine();
		  System.out.println();
		 
		for (BorrowRecord borrowRecord:borrowRecords) {
			if(borrowRecord.getBook().getName().equals(bookName)&&borrowRecord.getBookStore().getName().equals(storeName))
				{
				System.out.println("Book name is : "+borrowRecord.getBook().getName());
				System.out.println("ISBN is : "+borrowRecord.getBook().getISBN());
				System.out.println("Book store is : "+borrowRecord.getBookStore().getName());
				System.out.println("borrow date is : "+borrowRecord.getBorrowDate());
				if(borrowRecord.getReturnDate()==null) {
					System.out.println("Book is not return");
				}
				else
				System.out.println("Return date is "+borrowRecord.getReturnDate());
				System.out.println("---------------------------------------");
				}
			
			
			}
		
		}
	
		
		
		
	}


