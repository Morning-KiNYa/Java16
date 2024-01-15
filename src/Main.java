import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("佐々木");
		names.add("佐々江");
		names.add("佐々山");
		
		names.set(1,"佐々崎");
		names.remove(0);

		System.out.println(names.size() + "個");
		System.out.println(names.get(1));

	}

}
