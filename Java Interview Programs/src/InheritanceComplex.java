class Parent {
	public void method1() {
		System.out.println("Parent method1");
	}
	public void method2() {
		System.out.println("Parent method2");
	}
	public void method3() {
		System.out.println("Parent method3");
	}
	public void method6() {
		System.out.println("Parent method6");
	}
}

class Child extends Parent {
	public void method4() {
		System.out.println("child method4");
	}
	public void method5() {
		System.out.println("chicld method5");
	}
	public void method6() {
		System.out.println("child method6");
	}
}
public class InheritanceComplex  {

	public static void main(String[] args) {
		Parent p1 = new Parent(); //can access 4 methods only
		Child c1 = new Child(); // parent 3, child 3
		Parent p2 = new Child(); // parent 3, child 1(overriding)
	//	Child c2 = new Parent();
		p1.method1(); //parent method1
		p1.method2(); //parent method2
		p1.method3(); //parent method3
		
		c1.method4(); //child method4
		c1.method5(); //child method5
		
		c1.method1(); //parent method1
		c1.method2(); //parent method2
		c1.method3(); //parent method3
		
		c1.method6(); //child method6
		p2.method6(); //parent method6(wrong) child method6(right)
		
		p2.method1(); //parent method1
		p2.method2(); //parent method3
		p2.method3(); //parent method3
		
		p1.method6(); //parent method6

	}

}
