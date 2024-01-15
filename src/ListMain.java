import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {

		ArrayList<Human> humans = new ArrayList<Human>();
		for (int i = 0; i < 100; i++) {
			Human h = new Human("村人" + i);
			humans.add(h);

		}

		for (Human human : humans) {
			human.intro();
		}

	}

}
