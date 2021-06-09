public class PythagoreanTheorem {
    public static double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double lega = Math.pow(legA,2);
        double legb = Math.pow(legB,2);
        double c = lega+legb;
        double result = Math.sqrt(c);
        return result;
        
    }
    public static void main(String[] args) {
        System.out.println(PythagoreanTheorem.calculateHypotenuse(4,2));
    }
}
