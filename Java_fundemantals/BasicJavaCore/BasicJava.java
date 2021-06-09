public class BasicJava {
public static void main(String [] args){
        printOneToNumber(255);
        printOdd(255);
        printSum(255);
        int [] arr = {1,2,3,4,5,4,3,45,4};
        iteratingArray(arr);
        findMax(arr);
        getAverage(arr);
        arrOdd(255);
        System.out.println(greaterThany(arr,3));
        int [] arr2 = {1,2,3,4};
        squareValues(arr2);
        int [] arr3 = {1, 5, 10, 7, -2};
        eliminateNegative(arr3);
        System.out.println("max is :"+maxMinAvg(arr2)[0]);
        System.out.println("min is :"+maxMinAvg(arr2)[1]);
        System.out.println("avg is :"+maxMinAvg(arr2)[2]);
        shiftingValue(arr3);
}
public static void printOneToNumber(int number){
    for(int i = 1 ; i < number+1 ; i++){
        System.out.println(i);
    }
}
public static void printSum(int number){
    int sum = 0;
    for (int i = 0 ; i<number+1 ; i++){
        sum += i;
        System.out.println("new number : "+ i + "  sum:"+sum);
    }
}
public static void printOdd(int number){
    for (int i = 1 ; i<number+1 ; i++){
        if ( i % 3 == 0)
        System.out.println("Odd number :"+i);
    }
}
public static void iteratingArray(int[] arr){
    for(int i = 0 ; i< arr.length;i++){
        System.out.println(arr[i]);
    }
}
public static void findMax(int [] arr){
    int max = arr[0];
    for(int i = 0 ; i< arr.length;i++){
        if ( arr[i] > max)
        max = arr[i];
    }
    System.out.println("Max number is :"+max);
}
public static void getAverage(int [] arr){
    double sum = 0;
    for ( int i = 0 ; i<arr.length ; i++){
        sum+=arr[i];
    }
    double avg = sum /2 ;
    System.out.println(avg);
}
public static void arrOdd(int number){
    int [] arr = new int [number+1];
    for(int i = 1; i<number+1 ; i++){
        if(i % 3 == 0)
        {
            arr[i]= i;
        }
    }
    for(int i = 0 ; i<arr.length;i++)
        if(arr[i]!=0)
        System.out.println("array odd number :"+arr[i]);
}
public static Integer greaterThany(int [] arr , int y){
    int c = 0;
    for(int i = 0 ; i<arr.length;i++){
        if(arr[i]>y)
        c++;
    }
    return c ;
}
public static void squareValues(int [] arr){
    for(int i=0;i<arr.length;i++){
        arr[i]= arr[i]*arr[i];
    }
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
}
public static void eliminateNegative(int [] arr){
    for(int i = 0 ; i<arr.length;i++){
        if(arr[i]<0)
        {
            arr[i] = 0;
        }
        System.out.println(arr[i]);
    }

}
public static int[] maxMinAvg(int [] arr){
    int max = arr[0];
    int min=arr[0];
    int avg = 0;
    int sum = 0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max)
        max = arr[i];
        if(arr[i]<min)
        min = arr[i];
        sum+=arr[i];
    }
    avg = sum/2;
    int[] newarr = {max,min,avg};
    return newarr;
}
public static void shiftingValue(int [] arr){
    for(int i = arr.length-1 ; i > 0 ; i--){
        arr[i]=arr[i-1];
    }
    for(int i = 0 ; i<arr.length;i++)
    System.out.println(arr[i]);
}
}