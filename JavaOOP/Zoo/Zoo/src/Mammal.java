
public class Mammal {
int energy ;
public Mammal() {
	this.energy = 100;
}
public int displayEnergy() {
	System.out.println(this.energy);
	return this.energy;
}
public int getEnergy() {
	return energy;
}
public void setEnergy(int energy) {
	this.energy = energy;
}

}
