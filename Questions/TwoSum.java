package Questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
 public int[] twoSum(int[] nums, int target) {
    // LC : 1
       Map<Integer,Integer> map = new HashMap<>();
        int arr[]={-1,-1};
        for(int i=0;i<nums.length;i++) {
            int check= target-nums[i];
            if(map.containsKey(check)) {
               arr[0]=map.get(check);
               arr[1]=i; 
            }
            else
            map.put(nums[i],i);
        }

     return arr;   
    }

}
