package chap05;

public class OverLoad{
	public static void main(String args[]) {
		OverLoad ol = new OverLoad();
		ol.add(10);
		ol.add("helloworld");
		ol.add(10,"helloworld");
		ol.add("helleworld",10);
	}
	/**
	 * 方法重载 方法名称相同  但是方法参数不一样
	 */
	public void add() {
		System.out.println("add()");
	}
//	public void add() {
//		System.out.println("add()");
//	}
	public void add(int a) {
		System.out.println("add(int)");
	}
	public void add(String str) {
		System.out.println("add(String)");
	}
//	public void add(int b) {
//		System.out.println("add(b)");
//	}
	public void add(int a ,String str) {
		System.out.println("add(int,String)");
	}
	public void add(String str,int a) {
		System.out.println("add(String,int)");
	}
	public void add(String str,String s) {
		System.out.println("add(str,str)");
	}
}
