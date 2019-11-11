import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BookInformation {
	String author;
	String title;
	int yearpublished;
	String summary;
	
	public BookInformation(String author, String title, int year, String summary) {
		this.author = author;
		this.title = title;
		this.yearpublished = year;
		this.summary = summary;
	}	
	public String getauthor() {
		return(author);
	}
	public String gettitle() {
		return(title);
	}
	public int getyearpublished() {
		return(yearpublished);
	}
	public String getsummary() {
		return(summary);
	}
}

class BookLibrarian {
	List<BookInformation> bookinfo = new ArrayList<BookInformation>();
	sortbook sortbook;
	
	public void addbook(BookInformation b) {
		bookinfo.add(b);
	}
	
	public void printList() {
		List<BookInformation> booklist;
		if(sortbook != null) {
			booklist = sortbook.sort(bookinfo);
			System.out.print("running");
		}
		else {
			booklist = bookinfo;
		}
		for (BookInformation bookinfo : booklist) {
			System.out.println("Author: " + bookinfo.getauthor() + "\tTitle: " + bookinfo.gettitle() + "\tYear Published: " + bookinfo.getyearpublished() + "\tSummary: " + bookinfo.getsummary());
		}
	}
		
	public void setSortMethods(sortbook sortMethod) {
		this.sortbook = sortMethod;
	}

}

class sortbook {
	List<BookInformation> bookinfo = null;
	String sortby;
	
	public sortbook(String sort) {
		this.sortby =sort;
	}
	
	public List<BookInformation> sort(List<BookInformation> b){
		List<BookInformation> sortedbookinfo;
		switch(sortby)
		{
			case "author":
				sortedbookinfo = sortauthor(b);
				return sortedbookinfo;
			case "title":
				sortedbookinfo = sorttitle(b);
				return sortedbookinfo;
			case "yearpublished":
				sortedbookinfo = sortyearpublished(b);
				return sortedbookinfo;
			default :
				return null;
		}
	}
	
	public List<BookInformation> sortauthor(List<BookInformation> bookinfo) { 
		Collections.sort(bookinfo, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation book1, BookInformation book2) {
				return String.valueOf(book1.getauthor()).compareTo(book2.getauthor());
			}
		});	
		return bookinfo;
	}
	
	public List<BookInformation> sorttitle(List<BookInformation> bookinfo) {
		Collections.sort(bookinfo, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation book1, BookInformation book2) {
				return String.valueOf(book1.gettitle()).compareTo(book2.gettitle());
			}
		});
		return bookinfo;
	}
	
	public List<BookInformation> sortyearpublished(List<BookInformation> bookinfo) {
		Collections.sort(bookinfo, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation book1, BookInformation book2) {
				return Integer.valueOf(book1.getyearpublished()).compareTo(book2.getyearpublished());
			}
		});
		return bookinfo;
	}
}

public class StrategyPattern {
	public static void main(String[] args) {
		BookLibrarian book =new BookLibrarian ();
		book.addbook(new BookInformation(“Tolkien", "The Lord of the Rings", 1954, "good" ));
		book.addbook(new BookInformation(“John Steinbeck“, “The Grapes of Wrath”, 1939, “good” ));
		book.addbook(new BookInformation(“Herman Melville”, “Moby-Dick”, 1851, “good” ));
		book.addbook(new BookInformation("Tolkien", “The Hobbit”, 1937,” good” ));
		book.addbook(new BookInformation(“John Steinbeck”, “Of Mice and Men”, 1937, ”good” ));
		book.addbook(new BookInformation(“Mark Twain”, “Adventures of Huckleberry Finn”, 1884,”good” ));
		book.addbook(new BookInformation(”Miguel de Cervantes“, “Don Quixote”, 1605, ”good” ));
		book.addbook(new BookInformation(”Victor Hugo”, “Les Misérables”,1862,”good” ));
		book.addbook(new BookInformation(”Jane Austen“, “Pride and Prejudice”, 1813, ”good” ));
		book.addbook(new BookInformation(”Charles Dickens”, “A Christmas Carol”, 1843,”good” ));
		book.addbook(new BookInformation(”William Golding“, “Lord of the Flies”, 1954, ”good” ));
		book.addbook(new BookInformation(”J. D. Salinger”, “The Catcher in the Rye”, 1951, ”good” ));
		book.addbook(new BookInformation(”Charles Dickens“, “A Tale of Two Cities”, 1859, ”good” ));
		book.addbook(new BookInformation(“Aldous Huxley“, “Brave New World”, 1931, ”good” ));
		book.addbook(new BookInformation(”Kurt Vonnegut”, “Slaughterhouse-Five”, 1969, ”good” ));
		book.addbook(new BookInformation(”Alexandre Dumas“, “The Count of Monte Cristo”, 1844, ”good” ));
		book.addbook(new BookInformation(“Joseph Heller”, “Catch-22”, 1961, ”good” ));
		book.addbook(new BookInformation(” Mark Twain”, “The Adventures of Tom Sawyer”, 1876, ”good” ));
		book.addbook(new BookInformation(”Fyodor Dostoyevsky”, “Crime and Punishment”, 1866, ”good” ));
		book.addbook(new BookInformation(”Lewis Carroll”, “Alice in Wonderland”, 1865, ”good” ));
		System.out.println("unsorted:");
		book.printList();
		System.out.println("sort by title:");
		book.setSortMethods(new sortbook("title"));
		book.printList();
		System.out.println("sort by author:");
		book.setSortMethods(new sortbook("author"));
		book.printList();
		System.out.println("sort by yearpublished:");
		book.setSortMethods(new sortbook("yearpublished"));
		book.printList();
	}
}
