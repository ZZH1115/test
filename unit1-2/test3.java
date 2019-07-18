import java.util.Scanner;
public class test3{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入一个字母");
	   int c = input.nextInt();
	if(c>65 && c<90){
		System.out.println("您输入的是一个大写字母"+(char)c);
	}
	else{
		System.out.println("您输入的是一个小写字母"+(char)c);
	}
    
		}
}