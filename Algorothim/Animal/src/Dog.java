
public class Dog extends Animal{
public Dog() {
	System.out.println("Type : Animal");
	System.out.println("I am a dog");
}
public void display() {
	System.out.println("this is Dog class");
}
public void printMessage() {
	super.display();
	this.display();
}
public void printType() {
	super.printType();
	System.out.println(type);
}
}
