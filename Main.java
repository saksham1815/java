// public class Main {
// 	int x = 5;

// 	public static void main(String[] args) {
// 		Main obj = new Main();
// 		System.out.println(obj.x);
// 	}
// }

public class Main {
	int x = 5;

}

class second extends Main {
	public static void main(String[] args) {
		Main myObj = new Main();
		System.out.println(myObj.x);
	}
}
