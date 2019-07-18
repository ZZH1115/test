import java.util.Scanner;
public class test0{
		public static void main(String[] args) {

			for(int i=1;i<=5;i++){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				System.out.println("");
			}



			for(int i=1;i<=5;i++){
				for(int j=5;j>0;j--){
					if(j<=i){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}


			for(int i=1;i<=5;i++){
				for(int j=5;j>=i;j--){
					System.out.print(" ");
				}
				for(int j=1;j<=i*2-1;j++){
					System.out.print("*");
				}
					System.out.println();
			}
		
	}
}
