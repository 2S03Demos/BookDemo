
public class Book {
	private IPage[] bookData;
	
	public Book(IPage... bookData) {
		this.bookData = bookData;
	}
	
	public IPage[] getData() {
		return bookData;
	}
}
