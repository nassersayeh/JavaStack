public class FizzBuzz {
    public  static String fizzBuzz(int number){
        String result = "";
        if(number % 3 == 0 && number % 5 == 0){
        result = "FizzBuzz";
    }
        else if(number % 3 == 0){
        result = "Fizz";
        }
        else if(number % 5 == 0){
        result = "Buzz";
    }
    
    return result;
}
    public static void main(String [] args){
        System.out.println(fizzBuzz(15));
    }
    
}