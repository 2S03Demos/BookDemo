
public class DemoMain {
	public static void main(String[] args) {
		Book myBook = new Book(new Page(5, 5, "Hello World"),
				new Page(4, 6, "Wow this is the best page"),
				new BlocksPage(9, 9, new String[] {
						"Hello", "2S03"
				}));
		
		for(IPage page : myBook.getData()) {
			System.out.println(page.getDataSize());
		}
	}
}
