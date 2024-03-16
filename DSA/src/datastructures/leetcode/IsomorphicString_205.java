package datastructures.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicString_205 {

    public boolean isIsomorphic(String s, String t) {
        ArrayList<String> sCharArray = new ArrayList<String>();
        ArrayList<String> tCharArray = new ArrayList<String>();
        Map<Character, Character> charMap = new HashMap<Character, Character>();
        if (s.length() != t.length())
            return false;
        String str = "";

        //making the dictionary
        for(int i=0; i<s.length(); i++){
            if(!charMap.containsKey(s.charAt(i)) && !charMap.containsValue(t.charAt(i)))
                charMap.put(s.charAt(i), t.charAt(i));
        }

        //build the string
        for(int i=0; i<s.length(); i++){
            str = str + charMap.get(s.charAt(i));
        }

        if(t.equals(str))
            return true;

        return false ;
    }

}
