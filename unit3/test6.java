//冒泡排序法
import java.util.Scanner;
public class test6{
	public static void main(String[] args) {
		
		int[] nums = {34,4,56,56,90,65};

		for(int i=0;i<nums.length-1;i++){

			for(int j=0;j<nums.length-1;j++){

				if(nums[j]>nums[j+1]){
					nums[j] = nums[j]+nums[j+1];
					nums[j+1] = nums[j]-nums[j+1];
					nums[j] = nums[j]-nums[j+1];
				}
			}
		}
		for(int n : nums){
			System.out.println(n);
		}
}
}