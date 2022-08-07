// Find Peak Element
// A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
// You must write an algorithm that runs in O(log n) time.


import java.util.*;

class PeakElement {
    
    public static int findPeakElement(int[] nums) {
      int l = 0;
      int r = nums.length - 1;
  
      while (l < r) {
        final int m = (l + r) / 2;
        if (nums[m] >= nums[m + 1])
          r = m;
        else
          l = m + 1;
      }
  
      return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findPeakElement(arr);
        System.out.println(result);
        sc.close();
    }
  }