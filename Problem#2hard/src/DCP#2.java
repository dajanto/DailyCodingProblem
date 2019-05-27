import java.util.ArrayList;

class Problem {

	// input [1,2,3,4,5]
	// [2*3*4*5, 1*3*4*5, 1*2*4*5, 1*2*3*5, 1*2*3*4]
	// output [120,60,40,30,24]

	private static ArrayList<Integer> array = new ArrayList<Integer>();

	private static ArrayList productOfAll(ArrayList<Integer> originalArray) {

		ArrayList<Integer> newArray = new ArrayList<Integer>();

		int result = 1;
		int product;

		for (int j = 0; j < originalArray.size(); j++) {
			for (int i = 0; i < originalArray.size(); i++) {
				if(i != j) {
					product = originalArray.get(i);
					result = result * product;
				}
			}
			newArray.add(result);
			result = 1;
		}
		return newArray;
	}

	public static void main(String[] args) {

		array.add(3);
		array.add(2);
		array.add(1);

		System.out.println(productOfAll(array));
	}
}
