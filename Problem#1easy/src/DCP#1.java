import java.util.ArrayList;

class problem {

	// Given a list of numbers and a number k
	// Return whether any two numbers from the list add up to k
	// f.e. [10,15,3,7] and k of 17, return true since 10+7 is 17

	static ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
    static boolean isso = false;

	static boolean twoNumbers(ArrayList array, int k) {
	    if(listOfNumbers.size() >= 2) {
            int first = listOfNumbers.get(0);
            for (int i = 1; i < array.size(); i++) {
                if(first + listOfNumbers.get(i) == k) {
                    return true;
                }
            }
            listOfNumbers.remove(0);
            return twoNumbers(listOfNumbers,k);
        }
        return false;
	}

	public static void main(String[] args) {

        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(9);

        System.out.println(twoNumbers(listOfNumbers, 5));
	}
}
