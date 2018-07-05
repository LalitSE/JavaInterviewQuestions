import java.util.Scanner;

class Demo1 {
	public void reverseString() {
		System.out.println("Please enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String reverseName = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			reverseName = reverseName + name.charAt(i);
		}
		System.out.println("User input value is: "+name);
		System.out.println("Reversed name is : "+reverseName);
	}
}
public class ReverseString {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.reverseString();

	}

}
