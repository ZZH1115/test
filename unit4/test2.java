public class test2{
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("飞飞");
		p1.setAge(18);
		p1.run(10);
	}
}
class Person{
	private String name;
	private int age;

	public void setName(String name){
		this.name = name;
	}
	//public String getName(){
	//	return name;
	//}
	public void setAge(int age){
		this.age = age;
	}
	//public int getAge(){
	//	return age;
	//}
	public void run(int len){
		int m =len;
		System.out.println("我叫"+name+"我跑了"+m+"米");
	}
}