public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone, String Unlock) {
        super(versionNumber, batteryPercentage, carrier, ringTone,Unlock);
    }
    @Override
    public String ring() {
        // your code here
    	System.out.print("Galaxy "+super.getVersionNumber()+" Says ");
    	return super.getRingTone();
    }
    @Override
    public String unlock() {
        // your code here
    	System.out.print("Unlocking Via ");
    	return super.getUnlock() ;
    }
    @Override
    public void displayInfo() {
        // your code here    
    	System.out.println("Galaxy "+super.getVersionNumber()+" from "+ super.getCarrier());
    }
}