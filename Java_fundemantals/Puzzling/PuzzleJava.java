import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {
public static void main(String [] args){
    int [] arr = {3,5,1,2,7,9,8,13,25,32};
    System.out.println(printSum(arr));
    returnArr(arr);
    String [] Starr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    shuffleStrings(Starr);
    shuffleALpha();
    randomNumber();
    randomNumber2();
    randomString();
    randomStringOfStrings();
}
public static Integer printSum(int [] arr){
    int sum = 0;
    for(int i =0 ; i<arr.length ; i++){
        sum+=i;
    }
    return sum;
}
public static int[] returnArr(int[] arr){
    int [] newarr = new int [arr.length];
    for(int i = 0 ; i<arr.length;i++){
        if(arr[i]>10)
        newarr[i] = arr[i];
        if(newarr[i]!=0)
        System.out.println(newarr[i]);
    }
    return newarr;
}
public static void shuffleStrings(String[] arr){
    ArrayList<String> newList = new ArrayList<String>();
    ArrayList<String> newList5 = new ArrayList<String>();
    for(int i = 0; i < arr.length; i++){
        if(arr[i].length() > 5){
            newList5.add(arr[i]);
        }
        newList.add(arr[i]);
    }
    Collections.shuffle(newList);
    System.out.println(newList);
    System.out.println(newList5);
}
public static void shuffleALpha(){
    ArrayList<String> arrlist = new ArrayList<String>();
    for(char a ='A'; a<='Z'; a++){
        arrlist.add(Character.toString(a));
    }
    System.out.println(arrlist);
    Collections.shuffle(arrlist);
    System.out.println(arrlist);
    String first = arrlist.get(0);
    if("AEIOU".indexOf(first)>0)
    System.out.println("the first letter is vowel");
}
public static void randomNumber(){
    ArrayList<Integer> randList = new ArrayList<Integer>();
    Random rand = new Random();
    for(int i = 0 ; i<10 ; i++){
        int r = ThreadLocalRandom.current().nextInt(55, 101);
        randList.add(r);
    }
    System.out.println(randList);
}
public static void randomNumber2(){
    ArrayList<Integer> randList2 = new ArrayList<Integer>();
    Random rand2 = new Random();
    int max = 0;
    int min  = 55;
    for(int i = 0 ; i<10 ; i++){
        int r2 = ThreadLocalRandom.current().nextInt(55, 101);
        randList2.add(r2);
        if(r2>max)
        max = r2;
        if(r2<min)
        min  = r2;
    }
    Collections.sort(randList2);
    System.out.println(randList2);
    System.out.println("max is :"+max);
    System.out.println("min is : "+min);

}
public static void randomString(){
    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i < 5; i++){
        randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
    }
    String finalString = randString.toString();
    System.out.println(finalString);
}

public static void randomStringOfStrings(){
    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    ArrayList<String> randList = new ArrayList<String>();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i <10; i++){
        for(int j = 0; j < 5; j++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        randList.add(finalString);
        randString.setLength(0);
    }
    System.out.println(randList);
}
}