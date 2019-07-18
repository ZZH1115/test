import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class test23{
	public static void main(String[] args) {
		
		//定义相关变量
		int[] userRedBall = new int [6];//用户选择的红球号码
		int[] sysRedBall = new int [6];//系统生成的红球号码
		int userBlueBall = 0;//用户选择的蓝球号码
		int sysBlueBall = 0;//系统生成的蓝球号码
		int redCount = 0;//记录用户选择的正确红球数
		int blueCount = 0;//记录用户选择的正确蓝球数
		int []redBall = new int[33];//用于存储1~33的红球号码
		//需要随机生成6个在1~33之间不重复的数（算法）
		for(int i=0;i<redBall.length;i++){
			redBall[i]=i+1;
		}

		//游戏开始，系统提示
		System.out.println("双色球游戏开始，good luck!");
		System.out.println("请问您是要机选或手选号码（1：机选，2：手选）：");

		Scanner input = new Scanner(System.in);
		Random r =new Random();
		boolean flag = true;
		while(flag){

			int isAuto = input.nextInt();
			switch(isAuto){

				case 1:
				//机选
				computerSelection(redBall,userRedBall);//机选红球
				userBlueBall = r.nextInt(16)+1;//机选蓝球
				flag = false;
				break;

				case 2:
				//手选
				System.out.println("请选择6个红球号码（1-33）：");
				for (int i=0;i<userRedBall.length;i++){
					userRedBall[i] = input.nextInt();
				}
				System.out.println("请选择1个蓝球号码（1-16）：");
				userBlueBall = input.nextInt();
				flag = false;
				break;

				default:
				System.out.println("请问您是要机选或手选号码（1：机选，2：手选）：");
				break;
			}
			}
			//系统随机生成号码
			//红球
			computerSelection(redBall,sysRedBall);
			//蓝球
			sysBlueBall = r.nextInt(16)+1;

			//统计结果：
			//统计红球
			for(int i=0;i<userRedBall.length;i++){
				for(int j =0;j<sysRedBall.length-redCount;j++){
					if(userRedBall[i]==sysRedBall[j]){
						int temp=sysRedBall[j];
						sysRedBall[j]= sysRedBall[sysRedBall.length-1-redCount];
						sysRedBall[sysRedBall.length-1-redCount]=temp;
						redCount++;
						break;
					}
				}
			}
			//统计篮球
			if(userBlueBall==sysBlueBall){
				blueCount=1;
			}
			//验证是否中奖
			if(blueCount ==0 && redCount<=3){
				System.out.println("很遗憾，您没有中奖");}
				else if(blueCount ==1 && redCount<3){
				System.out.println("恭喜你中了六等奖");}
				else if((blueCount ==1 && redCount==3) || (blueCount==0 && redCount==4)){
				System.out.println("恭喜你中了五等奖");}
				else if((blueCount ==1 && redCount==4) || (blueCount==0 && redCount==5)){
				System.out.println("恭喜你中了四等奖");}
				else if(blueCount ==1 && redCount==5){
				System.out.println("恭喜你中了三等奖");}
				else if(blueCount ==1 && redCount==6){
			    System.out.println("恭喜你中了二等奖");}
				else if(blueCount ==0 && redCount==6){
				System.out.println("恭喜你中了一等奖");}
				else{
				System.out.println("系统有误，中奖无效！");
				}

				//公布系统号码
				System.out.println("本期中奖红球号码为：");
				sort(sysRedBall);
				System.out.println(Arrays.toString(sysRedBall));
				System.out.println("本期中奖蓝球号码为："+sysBlueBall);

				//公布用户号码
				System.out.println("您选择的红球号码为：");
				sort(userRedBall);
				System.out.println(Arrays.toString(userRedBall));
				System.out.println("您选择的蓝球号码为："+userBlueBall);

				System.out.println("买双色球，造福你我他！谢谢");
			}

			//冒泡排序
			public static void sort (int[] ball){
				for(int i =0;i<ball.length-1;i++){
					for(int j=0;j<ball.length-1-i;j++){
						if(ball[j]>ball[j+1]){
							ball[j]=ball[j]+ball[j+1];
							ball[j+1]=ball[j]-ball[j+1];
							ball[j]=ball[j]-ball[j+1];
						}
					}
				}
			}

			//用于在指定数列中，随机生成多个不重复的数算法
			public static void computerSelection(int[] redBall,int[] userRedBall){

				Random r =new Random();
				int index = -1;
				for(int i = 0;i<userRedBall.length;i++){
					index = r.nextInt(redBall.length-i);
					userRedBall[i]=redBall[index];

					int temp = redBall[index];
					redBall[index] = redBall[redBall.length-1-i];
					redBall[redBall.length-1-i]=temp;
			}
				}
		}
	
