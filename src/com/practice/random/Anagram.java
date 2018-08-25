package com.practice.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        Map<Character, Integer> charSeta = new HashMap<Character, Integer> ();
        Map <Character, Integer> charSetb = new HashMap<Character, Integer>();
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() == b.length()){

            for(int i=0; i < a.length(); i++){
                if(charSeta.containsKey(a.charAt(i))){
                    charSeta.put( a.charAt(i),charSeta.get(a.charAt(i))+1 );
                } else {
                    charSeta.put(a.charAt(i),1);
                }

                if(charSetb.containsKey(b.charAt(i))){
                    charSetb.put( b.charAt(i),charSetb.get(b.charAt(i))+1 );
                } else {
                    charSetb.put(b.charAt(i),1);
                }
            }
        } else {
            return false;
        }
            System.out.println("a map : "+ charSeta.toString());
            System.out.println("b map : "+ charSetb.toString());
        if(charSeta.equals(charSetb)){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*String a = scan.next();
        String b = scan.next();*/

        String a = "TOMato";
        String b = "atootm";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
