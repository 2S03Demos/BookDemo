
public abstract class AbstractPage implements IPage{

	private int x;
	private int y;
	
	public AbstractPage(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}
	
	public static int countSpaces(String data) {
		int count = 0;
		while(data.contains(" ")) {
			count++;
			data = data.replace(" ", "");
		}
		return count;
	}
	
	public abstract int analyze();
	
}
