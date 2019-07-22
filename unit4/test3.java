
public class test3{
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dog1 = new Dog("wangwang",5);
	}
}
	class Dog{
		public Dog(){

		}
		public Dog(String name){
			this.name=name;
			System.out.println("带一个参数的构造方法执行了");
		}
		public Dog(String name,int age){
			this(name);
			this.age = age;
			System.out.println("带两个参数的构造方法执行了");

		}
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
	}