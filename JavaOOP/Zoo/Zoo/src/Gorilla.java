
public class Gorilla extends Mammal{
	public Gorilla(){
	super();
}
public void Throwthings() {
	System.out.println("Gorilla has throw something in people !");
	energy = this.getEnergy();
	energy-=5;
	
}
public void eatBananas() {
	System.out.println("Gorilla has eat Banana !");
	energy = this.getEnergy();
	energy+=10;
}
public void climp() {
	System.out.println("Gorilla has Climp the tree !");
	energy = this.getEnergy();
	energy-=10;
}
}
