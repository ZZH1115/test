//选择排序算法
import java.util.Scanner;
public class test7{
	public static void main(String[] args) {
		int [] nums = {34,4,56,17,90,65};//待排序的数列
		int minIndex = 0;//用于记录每次比较的最小值下标
		//控制轮数
		for(int i=0;i<nums.length;i++){

			minIndex = i;//每轮假设一个最小值下标

			for(int j =i+1;j<nums.length;j++){

				if(nums[minIndex]>nums[j]){
					minIndex =j;
				}
			}
			//判断需要交换的数下标是否为自己
			if(minIndex!=i){
				nums[minIndex] =nums[minIndex]+nums[i];
				nums[i] = nums[minIndex]-nums[i];
				nums[minIndex] = nums[minIndex]-nums[i];
			}
		}
		//输出结果
		for(int n:nums){
			System.out.println(n);
		}
	}
}