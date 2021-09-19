/**
 * 
 * @author
 * aakash.verma
 * 
 * Instagram: https://www.instagram.com/aakashverma1102/
 * LinkedIn: https://www.linkedin.com/in/aakashverma1124/
 * 
 */

import java.util.*;

class Smallest_K_Elements {

	public static List<Integer> findKSmallestNumbers(int[] nums, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
		for(int i = 0; i < k; i++) {
			maxHeap.add(nums[i]);
		}

		for(int i = k; i < nums.length; i++) {
			if(nums[i] < maxHeap.peek()) {
				maxHeap.poll();
				maxHeap.add(nums[i]);
			}
		}
		return new ArrayList<>(maxHeap);
	}

	public static void main(String[] args) {
		List<Integer> result = Smallest_K_Elements.findKSmallestNumbers(new int[] {3, 1, 5, 12, 2, 11}, 3);
		System.out.println(result);
	}
	
}