
public class Samurai extends Human{
	int counter = 0;
public Samurai(){
	super();
	this.health=200;
	counter+=1;
}
public void deathBlow(Human h) {
	int healthtoDecrise = h.getHealth();
	healthtoDecrise = 0;
	h.setHealth(healthtoDecrise);
	this.health/=2;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	health = this.getHealth();
	int halfhealth=health/2;
	health+=halfhealth;
	this.setHealth(health);
}
public void meditate() {
	this.health = 200;
}
public int howMany() {
	
	return counter;
}

}
