package chap04;

public class CopyTest {
	/**
	 *数组的复制用System.arraycopy(五个参数)
	 * @param args
	 */
	public static void main(String[] args) {
		int[] srcArray = {10,20,30,40};
		int[] destArray = new int[10];
		System.arraycopy(srcArray, 1, destArray, 0, 3);
		for (int i = 0; i < destArray.length; i++) {
			System.out.print(destArray[i]+" ");
		}
		System.out.println();
	}
}
