/*通过键盘输入圆柱体的高和地面半径，求圆柱体体积*/
import java.util.Scanner;

public class test{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入圆柱体的高:");
		int h = input.nextInt();
		System.out.println("请输入圆柱体的底面半径:");
		int r = input.nextInt();
		double result = 3.14*r*r*h;
		System.out.println("圆柱体的体积为:"+result);
		}
	}	