
public class Ninja extends Human{
public Ninja() {
	super();
	this.stealth=10;
}
public void steal(Human h) {
	int other_human_health = h.getHealth();
	int stealhealth = other_human_health -= stealth;
	h.setHealth(stealhealth);
}

}
