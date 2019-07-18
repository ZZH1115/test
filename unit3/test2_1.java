//根据输出参数数量打印直角三角形
import java.util.Scanner;
public class test2_1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输出直角三角形的高");
		int num = input.nextInt();

		printTriangle(num);
	}
	public static void printTriangle(int line){
		for(int i=1;i<=line;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}