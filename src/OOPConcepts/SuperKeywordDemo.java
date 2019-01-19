package OOPConcepts;

// parent class
class Animal{
	String color = "white";
	
	void Eat() {
		System.out.println("eating something..");
	}
	
	//constructor
	Animal(){
		System.out.println("Animal object is created..");
	}
	
}

//child class inherits Animal class
class Dog extends Animal{
	
	String color = "black"; // variable is over-ridden
	
	//constructor
	Dog(){
			super(); // this calls the Animal constructor explicitly
			System.out.println("Dog object is created..");
			
		}
	
	void displaycolor() {
		System.out.println(color);//child class dog color
		System.out.println(super.color);// super keyword refers to parent class Animal color
	}
	
	// over riding eat method of parent class
	
	void Eat() {
		System.out.println("eating dog food..yummy yum!!");
		super.Eat();// calling the parent function eat by using super keywork
		
	}
	
}

public class SuperKeywordDemo {
	
	public static void main(String[] args) {
		
		Dog dog=new Dog();// first Animalconstructor is called and then dog constructor is called eventhoug dog 
							// class does not use super() keyword. When you use the super() key word again 
							//animal and dog constructors are called - there is no difference
		
	/*	dog.displaycolor(); // black & white
		
		dog.Eat();*/
	}

}
