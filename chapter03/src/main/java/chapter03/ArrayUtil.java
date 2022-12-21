package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] is) {
		double[] result = new double[is.length];
		
		for(int i = 0; i<is.length; i++) {
			result[i]=is[i];
		}
		return result;
	}

}
