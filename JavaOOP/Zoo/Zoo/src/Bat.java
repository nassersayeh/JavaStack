public class Bat extends Mammal{
	public Bat() {
		super();
		this.energy = 300;
	}
public void fly() {
	
	System.out.println("the sound a bat taking off !");
	energy-=50;
	
	
}
public void eatHumans() {
	System.out.println("so , will , never mind !");
	this.energy+=25;
}
public void attackTown() {
	System.out.println("sound of a towm on fire !");
	this.energy+=100;
}
}
