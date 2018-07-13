package chap05;

public class OverWrite {
	public static void main(String args[]) {
		SubTest st = new SubTest();
		st.print(); 
	}
}
class SuperTest {
	String showMe() {
		return "super";
	}
	public void print() {
		System.out.println(showMe());
	}
}
class SubTest extends SuperTest{
	public String showMe() {
		return "Sub";
	}
}
