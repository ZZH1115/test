import java.util.Scanner;
public class test4{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入你的成绩:");
	int score = input.nextInt();
	if(score>=90){
		System.out.println("你的成绩是A");
	}
	else if(score>=80 && score<90){
		System.out.println("你的成绩是B");
	}
	else if(score>=70 && score<80){
		System.out.println("你的成绩是C");
	}
	else if(score>=60 && score<70){
		System.out.println("你的成绩是D");
	}
	else if(score<60){
		System.out.println("你的成绩是E");
	}
}
}