//根据传入参数的数量打印等腰三角形
import java.util.Scanner;
public class test2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输出三角形的行数：");
		int num = input.nextInt();

		printTriangle(num);
	}

	public static void printTriangle(int line){
		//外循环控制行数
		for(int i=1;i<=line;i++){
			//内循环输出空格
			for(int j=i;j<line;j++){
				System.out.print(" ");
			}
			//内循环输出*
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}