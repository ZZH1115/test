import java.util.Scanner;
public class test6{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("今天天气如何(1.晴天,2.雨天):");
		int weather = input.nextInt();

		if(weather==1){
			System.out.println("今天天气太好了，我是去逛公园还是逛街呢(1.逛街,2.逛公园):");
		    int flag = input.nextInt();
		if(flag==1){
			System.out.println("去逛街");}
		else if(flag==2){
			System.out.println("去公园溜达");}
		}
		else if (weather==2){
			System.out.println("今天天气不好，我是在家看电影还是打游戏呢(1.看电影,2.打游戏):");
		    int flag = input.nextInt();
		if(flag==1){
			System.out.println("看电影");
		}
		else if(flag == 2){
			System.out.println("打游戏");
		}
		}
	}
}
