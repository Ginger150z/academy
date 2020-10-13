package by.academy.classwork.lesson1;

public class Cat {
	
	int age;
	String nickname;
	int money;
	String initials;
	boolean isHomeAnimal; 

	public Cat() {
		
	}
	
	public Cat(String nickname) {
		this.nickname = nickname;
		this.initials = this.nickname.substring(0, 1);	
				}
	
	public Cat(int money) {
		this.money = money;
	}
	
	public void setMoney (int moneyToGive) {
		this.money = moneyToGive;
	}
	
	public int getMoney () {
		System.out.println(this.money);
		return this.money;
	}
	
	public void setInitials (String initials) {
		this.initials = initials;
	}
	
	public String getInitials () {
		System.out.println(this.initials);
		return this.initials;
	}
	
	public void setisHomeAnimal (boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}
	
	public boolean getisHomeAnimal () {
		System.out.println(this.isHomeAnimal);
		return this.isHomeAnimal;
	}

	public void grow() {
		age = age + 1;
		}
	
	public void sleep () {
		System.out.println("Cat is sleeping ");
	}
	
	public void eat () {
		System.out.println("Cat is eating ");
	}
	
	public void walk () {
		System.out.println("Cat is walking ");
	}
}
