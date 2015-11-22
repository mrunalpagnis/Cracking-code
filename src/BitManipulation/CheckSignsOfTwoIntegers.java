package BitManipulation;

public class CheckSignsOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 90; int j = -135555;
		System.out.println((i >> (Integer.SIZE - 1)) == (j >> (Integer.SIZE - 1))?"Same sign":"Oppositet Sign");
	}

}
