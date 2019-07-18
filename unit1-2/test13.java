//switch语句
import java.util.Scanner;
public class test13{
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.println("今天是星期几?");
			int day = input.nextInt();
			switch(day){
				case 1:
					System.out.println("星期一");
					break;
				case 2:
					System.out.println("星期二");
					break;
				case 3:
					System.out.println("星期三");
					break;
			    case 4:
					System.out.println("星期四");
					break;
				case 5:
					System.out.println("星期五");
					break;
				case 6:
					System.out.println("星期六");
					break;
				case 7:
					System.out.println("星期日");
					break;
				default:
					System.out.println("地球不适合你,请回火星吧");
					break;

			}
			}	
}