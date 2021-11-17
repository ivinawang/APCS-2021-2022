/*
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
*/

public class commonEnd{
	public static boolean commonEnd1(int[] a, int[] b) {
		return ((a[0] == b[0]) || (a[a.length-1] == b[b.length-1]));
  }
	public static void main(String[] args) {
		int[] test = {1,2,3};
		int[] second0 = {7,3};
		int[] second1 = {7,3,2};
		int[] second2 = {1,3};

		System.out.println(commonEnd1(test, second0));
		System.out.println(commonEnd1(test, second1));
		System.out.println(commonEnd1(test, second2));
	}

}
