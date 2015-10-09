import java.util.Arrays;
import java.util.List;

import javax.management.remote.SubjectDelegationPermission;

public class BlocksPage extends AbstractPage{
	private List<String> data;
	public BlocksPage(int x, int y, List<String> data) {
		super(x, y);
		this.data = data;
	}
	
	public BlocksPage(int x, int y, String[] data) {
		super(x, y);
		this.data = Arrays.asList(data);
	}
	
	@Override
	public Object getData() {
		return data;
	}

	@Override
	public int getDataSize() {		
		return data.size();
	}
	
	public static int countSpaces(String data) {
		return countSpaces(data);
	}

	@Override
	public int analyze() {
		return data.indexOf("The");
	}
	
	
	
}
