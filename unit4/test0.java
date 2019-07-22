public class Test0{
    public static void main(String[] args){
        Dog dog = new Dog();  
        Dog dog1 = new Dog("wangwang",5);
    }
}
class Dog{
    
  //默认构造方法，通常有其他构造方法时，要保留默认构造方法
  public Dog(){
   //System.out.println("构造方法执行了");
   }
  public Dog(String name){
       this.name = name;
       System.out.println("带一个参数的构造方法执行了");
   }
  public Dog(String name,int age){
   this(name); //调用其他构造方法时，此语句需要在第一句,在构造方法相互调用时必须要有出口
   //this.name = name;
   this.age = age;
   System.out.println("带两个参数的构造方法执行了");
  }
  private String name;
  private int age;
  public void setName(String name){
     this.name = name;
  }
  public void getName(){
     return name;
  }
  public void setAge(int age){
     this.age = age;
  }
  public void getAge(){
     return age;
  }
 }