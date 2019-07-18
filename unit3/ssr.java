import java.util.Scanner;
import java.util.Random;
public class ssr{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random j = new Random();
		int gl=0;
		int ssr=0;int sr=0; int r=0;
		for(int i =1 ; i<=10;i++){
			gl= j.nextInt(101);
		if(gl>99){
			System.out.println("你抽中的式神是:SSR!!");
			ssr++;
		}
		else if(gl<79){
			System.out.println("你抽中的式神是:R");
			r++;
		}
		else if(99>gl && gl>=79){
			System.out.println("你抽中的式神是:SR");
			sr++;
		}	
	}
			System.out.println("SSR:"+ssr+"SR:"+sr+"R:"+r);
	}
}