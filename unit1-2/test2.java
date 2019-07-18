//根据天数计算周数和剩余的天数
import java.util.Scanner;
public class test2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入天数:");
		int day = input.nextInt();
		System.out.println("周数是:"+(day/7));
		System.out.println("剩余天数是:"+(day%7));
	}
}
   
