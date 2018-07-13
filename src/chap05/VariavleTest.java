package chap05;

public class VariavleTest {
	public static void main(String args[]) {
		VariavleTest vt = new VariavleTest();
		int a = 10;
		System.out.println("before test a:"+a);
		vt.test(a);
		System.out.println("after test a:"+a);
		
		int[] iarray = {10};
		System.out.println("before test2 iarray:"+iarray[0]);
		vt.test2(iarray);
		System.out.println("after test2 iarray:"+iarray[0]);
		
	}
	/**
	 * 局部变量 基本类型是值传递
	 * 本方法中不变
	 * @param a
	 */
	public void test(int a) {
		a++;
		System.out.println("into test a:"+a);
	}
	
	public void test2(int[] iarray) {
		iarray[0]++;
		System.out.println("into test2 iarray:"+iarray[0]);
	}
}
