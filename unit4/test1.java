public class test1{
	public static void main(String[] args) {
		Horse h = new Horse(); 
		h.name = "赤兔马";
		h.age = 350;
		h.run();
		h.eat();
	}
}
class Horse{
	String name;
	int age;
	public void run(){
		System.out.println("我是"+name+"我"+age+"岁，我日行千里");
	}
	public void eat(){
		System.out.println("我吃草");
	}
}