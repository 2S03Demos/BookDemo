
public class Page extends AbstractPage{
	private String data;
	public Page(int x, int y, String data) {
		super(x, y);
		this.data = data;
	}

	@Override
	public Object getData() {
		return data;
	}

	@Override
	public int getDataSize() {
		return super.countSpaces(data);
	}
	
	public static Page parseToPage(String data) {
		int x = Math.round(countSpaces(data)/5);
		int y = Math.round(countSpaces(data)/3);
		return new Page(x, y, data);
		
	}

	@Override
	public int analyze() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
