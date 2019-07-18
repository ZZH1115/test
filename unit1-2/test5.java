import java.util.Scanner;
public class test5{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入第一个数:")	;
	int num1 = input.nextInt();
	System.out.println("请输入第二个数:");
	int num2 = input.nextInt();
	if(num1>num2){
		System.out.println("第一个数大于第二个数");
	}
	else if(num1<num2){
		System.out.println("第一个数小于第二个数");
	}
	else{
		System.out.println("两个数相等");
	}
	}
}