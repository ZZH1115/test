//white循环 计算1~100所有整数之和
import java.util.Scanner;
public class test7{
	public static void main(String[] args) {
		
		int num = 0; //计算总数
		int i = 1;//增量
		while(i<=100){
			num+=i;
			i++;
		}
		System.out.println(num);
	}
}