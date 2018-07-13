package chap04;

public class RandomTest {
	public static void main(String[] args) {
		String[] str = {"123456","234567","345678","456789","567890"};
		RandomTest rt = new RandomTest();
		rt.getTel(str);
//		System.out.println(rt.getTel(str));
	}
	
	
	/**
	 * 字符串数组随机调用
	 * @param str
	 */
	public void getTel(String[] str) {
		int index = (int)(Math.random()*str.length);
		String s = str[index];
//		return s;
		System.out.println(s);
	}
}
