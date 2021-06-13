
public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy s9 = new Galaxy("S9",99,"Verizon","Ring Ring Ring !","Finger Print");
		IPhone iphoneTen = new IPhone("X",100,"AT&T","Zing","Facial recognition");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());

	}

}
