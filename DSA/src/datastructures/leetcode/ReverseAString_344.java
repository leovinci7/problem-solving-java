package datastructures.leetcode;

public class ReverseAString_344 {

    public void reverseString(char[] s) {
        int arrSize = s.length ;
        int index = 0 ;
        char currentChar ;

        while(arrSize >= 0){
            if(arrSize > index) {
                currentChar = s[arrSize - 1];
                s[arrSize-1] = s[index] ;
                s[index] = currentChar ;
            }
            index++ ;
            arrSize-- ;
        }

        System.out.println(s);
    }



}
