//三个班各有3名学生参加竞赛 求每个班分数的平均值
import java.util.Scanner;
public class test21{
	public static void main(String[] args) {
		int[][] scores ={{78,98,88},{87,96,85},{67,78,89}};
		int classLen = scores.length;
		for(int i=0 ; i<classLen ; i++){
			int sum = 0;
			int count = scores[i].length;
			for(int j=0;j<count;j++){
				sum+=scores[i][j];
			}
			int avg = sum/count;
			System.out.println("第"+(i+1)+"班的平均成绩是:"+avg);


			}
		}
		}
		
	
		
		
