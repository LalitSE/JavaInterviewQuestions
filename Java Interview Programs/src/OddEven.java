import java.util.Scanner;

class Demo {
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the value: ");
		int input = sc.nextInt();
		if(input % 2 == 0) {
			System.out.println(input + " is a even number");
		}
		else System.out.println(input +" is a odd number");
		sc.close();
	}
}
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		obj.userInput();

	}

}
