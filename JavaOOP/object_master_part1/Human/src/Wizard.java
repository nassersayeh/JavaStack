
public class Wizard extends Human{

	int health = 50;
	int intelligence = 8;
	public Wizard(int health,int inte) {
		super();
		this.health = health;
		this.intelligence = inte;
	}
public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
public void heal(Human h) {
	health = h.getHealth();
	health+=intelligence;
}
public void fireball(Human h) {
	health = h.getHealth();
	health-=3*intelligence;
}
}
