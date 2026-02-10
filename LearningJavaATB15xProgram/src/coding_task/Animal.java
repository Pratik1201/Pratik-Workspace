package coding_task;

public class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");

}
	public static void main(String[] args) {
		Animal Dog = new Dog();
		Animal Cat = new Cat();
		
		Dog.makeSound();
		Cat.makeSound();
	}
	
}
