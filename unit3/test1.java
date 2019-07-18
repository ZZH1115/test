import java.util.Scanner;
public class test1{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入年数:");
			int nian = input.nextInt();
			boolean bool= isRunNian(nian);
			if(bool){
				System.out.println(nian+"年是闰年");
			}
			else{
				System.out.println(nian+"年是平年");
			}

}
		public static boolean isRunNian(int year){
			if((year % 4 ==0 && year%100!=0)||year%400==0){
				return true;
			}
			else{
				return false;
			}
		}
}