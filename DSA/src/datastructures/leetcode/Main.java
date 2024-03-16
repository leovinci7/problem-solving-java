package datastructures.leetcode;
//import datastructures.leetcode.* ;

public class Main {

    public static void main (String[] args){

        int[] number = new int[]{1, 3, 3, 4};
        IsomorphicString_205 isomorphic = new IsomorphicString_205();
        boolean result = isomorphic.isIsomorphic("badc", "baec");
        System.out.println(result);

        ReverseAString_344 reverseStr = new ReverseAString_344() ;

        char[] s = new char[] {'h', 'e', 'l', 'l', 'o'} ;
        reverseStr.reverseString(s);
    }


}

