// import java.io.InputStream;
import java.util.Scanner;

public class Userinput {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
		int a= sc.nextInt();
        System.out.print("enter b:");
		int b= sc.nextInt();
        int sum = a+b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("your su m is : " + sum);


    }

    
}



// import java.util.Scanner;  // Import the Scanner class

// class Main {
//   public static void main(String[] args) {
//     Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//     System.out.println("Enter username");

//     String userName = myObj.nextLine();  // Read user input
//     System.out.println("Username is: " + userName);  // Output user input
//   }
// }