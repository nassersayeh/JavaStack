public class StringManipulator {
    public  static String trimAndConcat(String one , String two){
        String trim1 = one.trim();
        String trim2 = two.trim();
        String res = trim1 + trim2;
        return res;
}
    public static Integer getIndexOrNull(String one , char two){
        int pos1 = one.indexOf(two);
        if(pos1 == -1)
        return null;
        else
        return pos1 ;
    }
    public static Integer getIndexOrNull(String one , String two){
        int pos1 = one.indexOf(two);
        if(pos1 == -1)
        return null;
        else
        return pos1;
    }
    public static String concatSubstring(String sone , int one , int two , String stwo){
        String three = sone.substring(one,two);
        String finalstring = three + stwo;
        return finalstring;
    }
    public static void main(String [] args){
        System.out.println(trimAndConcat("    hi   ", "   there  "));
        char letter = 'o';
        System.out.println(getIndexOrNull("Hollo",letter));
        System.out.println(getIndexOrNull("Hll",letter));
        System.out.println(getIndexOrNull("Hello","llo"));
        System.out.println(concatSubstring("Hello",1,2,"world"));

    }
    
}