//二分查找算法
import java.util.Scanner;
public class test24{
	public static void main(String[] args) {
		
		int[] nums = {10,20,25,30,35,40};
		int index = binarySearch(nums,35);
		System.out.println(index);

	}

	//二分查找算法
	public static int binarySearch(int[] nums,int key){
		int start = 0;
		int end = nums.length-1;

		while(start<=end){
			int middle = (start+end)/2;
			if(nums[middle]>key){
				end = middle-1;
			}else if(nums[middle]<key){
				start = middle +1;
			}else{
				return middle;
			}
			}
			return -1;

		}
	}
