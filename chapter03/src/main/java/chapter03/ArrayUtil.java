package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] is) {
		double[] result = new double[is.length];
		
		for(int i = 0; i<is.length; i++) {
			result[i]=is[i];
		}
		return result;
	}
	
	public static int[] doubleToInt(double[] d) {
		int[] a = new int[d.length];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)d[i];
		}
		
		return a;
	}
	public static int[] concat(int[] a1, int[] a2) {
		int[] a = new int[a1.length + a2.length];
		
		int index = 0;
		
		for(int i : a1) {
			a[index++] = i;
		}
		
		for(int i : a2) {
			a[index++] = i;
		}
		
		return a;
	}

}
