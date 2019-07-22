public class test4{
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName = ("咪咪");
		cat.setAge = (3);
		cat.eat();
	}
}
class Cat{
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void eat(){
		System.out.println("我是"+this.getname()+"我爱吃鱼");
	}
}