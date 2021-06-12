
public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat newbat = new Bat();
		newbat.attackTown();
		newbat.attackTown();
		newbat.attackTown();
		newbat.eatHumans();
		newbat.eatHumans();
		newbat.fly();
		newbat.fly();
		int energy = newbat.energy;
		System.out.print(energy);
	}

}
