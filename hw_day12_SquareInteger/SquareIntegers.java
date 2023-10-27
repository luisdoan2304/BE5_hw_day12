package hw_day12_SquareInteger;

import java.util.ArrayList;
import java.util.List;

public class SquareIntegers {

	 public static List<Integer> getSquareIntegers(int start, int end) {
	        List<Integer> squareIntegers = new ArrayList<>();

	        for (int i = start; i <= end; i++) {
	            double squareRoot = Math.sqrt(i);
	            if (squareRoot == (int) squareRoot) {
	                squareIntegers.add(i);
	            }
	        }

	        return squareIntegers;
	    }

	    public static void main(String[] args) {
	        int start = 1;
	        int end = 20;
	        List<Integer> result = getSquareIntegers(start, end);
	        System.out.println("Square Integers between " + start + " and " + end + ":");
	        for (int num : result) {
	            System.out.println(num);
	        }
	    }

}
