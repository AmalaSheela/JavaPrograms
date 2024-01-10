package com.obsqura.program.Aggregation;

public class Book {
	
	String BookName;
	int price;
	Author BookAuthor;

	public Book(String bookName, int price, Author bookAuthor) {
		super();
		BookName = bookName;
		this.price = price;
		BookAuthor = bookAuthor;
	}

void display()
{
	System.out.println(BookAuthor.authorName + "," + BookAuthor.age + "," + BookAuthor.place + "" );
	System.out.println(BookName + "" + price+ "" );
	
}


	public static void main(String[] args) {
		Author A1 = new Author("Roy",35,"Banglore");
		Book B1 = new Book("TheTruthStories", 250, A1);
		B1.display();

	}

}
