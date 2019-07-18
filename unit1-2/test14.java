import java.util.Scanner;
public class test14{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int num1 = input.nextInt();
		System.out.println("请输入第二个数:");
		int num2 = input.nextInt();
		System.out.println("请输入操作符(+,-,*,/)");
		String op = input.next();
		switch(op){
			case"+":
			System.out.println("num1+num2="+(num1+num2));
			break;
			case"-":
			System.out.println("num1-num2="+(num1-num2));
			break;
			case"*":
			System.out.println("num1*num2="+(num1*num2));
			break;
			case"/":
			System.out.println("num1/num2="+(num1/num2));
			break;
			default:
			System.out.println("您输入的操作符有误");
			break;
					
			}
	}
}