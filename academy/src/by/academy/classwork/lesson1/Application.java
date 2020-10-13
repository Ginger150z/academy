package by.academy.classwork.lesson1;

public class Application {
	public static void main(String ...args){

	Cat cat1 = new Cat();
	Cat cat2 = new Cat("Barsik");
	
	System.out.println(cat2.nickname);
	cat2.eat();
	cat2.sleep();
	cat2.walk();
	
	cat1.grow();
	cat1.grow();
	cat1.grow();
	
	System.out.println(cat1.age);
	
	cat1.setMoney(4);
	cat1.getMoney();
	
	cat2.getInitials();
	cat2.setisHomeAnimal(true);
	cat2.getisHomeAnimal();
	}

}
