import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		System.out.println("ArrayListを使ってみよう！");
		System.out.println("Listに数字をどんどん追加していってみよう。");
		
		ArrayList<Integer>numbers = new ArrayList<Integer>();
		
		while(true) {
			System.out.print("要素追加するよ数字を入れてね（0で終了） > ");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == 0) {
				System.out.println("――結果――");
				System.out.println("要素数："+numbers.size());
				System.out.print("要素：");
				for(int numb : numbers) {
					System.out.print(numb+",");
				}
				return;
			}else {
				numbers.add(num);
				System.out.println(num+"をListに追加したよ！");
			}
			
		}

	}

}
