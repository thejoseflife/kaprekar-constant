package MathPrograms;

import java.util.ArrayList;

public class KaprekarConstant {
	
	private QuickSort qs = new QuickSort();
	
	public int arrangeUp(int num) {
		String s = String.valueOf(num);
		String tempString = "";
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			nums.add(Integer.parseInt(s.substring(i, i + 1)));
		}
		qs.sort(nums, 0, nums.size() - 1);
		for(int i: nums) {
			tempString += String.valueOf(i);
		}
		return Integer.parseInt(tempString);
	}
	
	public int arrangeDown(int num) {
		String s = String.valueOf(num);
		String tempString = "";
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			nums.add(Integer.parseInt(s.substring(i, i + 1)));
		}
		qs.sort(nums, 0, nums.size() - 1);
		
		for(int i = nums.size() - 1; i >= 0; i--) {
			tempString += String.valueOf(nums.get(i));
		}
		return Integer.parseInt(tempString);
	}
	
	public int findConstant(int num) {
		ArrayList<Integer> iterations = new ArrayList<Integer>();
		iterations.add(12288448);
		int n = arrangeDown(num) - arrangeUp(num);
		iterations.add(n);
		
		while(arrangeDown(n) - arrangeUp(n) != n) {
			System.out.println(n);
			n = arrangeDown(n) - arrangeUp(n);
			iterations.add(n);
		}
		return iterations.get(iterations.size() - 1);
	}
	
	public static void main(String[] args) {
		KaprekarConstant ks = new KaprekarConstant();
		System.out.println(ks.findConstant(3290));

	}

}
