import java.util.Scanner;
public class test9{
	public static void main(String[] args) {
	int i = 1;
	while(i<100){
		if(i%2==1){
			System.out.println("奇数:"+i);
		}
		else if (i%2==0) {
			System.out.println("偶数:"+i);
		}
		if (i%3==0) {
			System.out.println("3的倍数:"+i);
		}
		i++;
	}		
	}
}