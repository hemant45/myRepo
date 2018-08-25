package com.practice.random;


abstract class AbstractTest
        {public int getNum()
        {
        return 45;
        }
        public abstract class Bar
        {public int getNum()
        {
        return 38;
        }
        }
        public static void main (String [] args)
        {
        AbstractTest t = new AbstractTest()
        {
        public int getNum()
        {
        return 22;
        }
        };
        AbstractTest.Bar f = t.new Bar()
        {
        public int getNum()
        {
        return 57;
        }
        };

        System.out.println(f.getNum() + " " + t.getNum());
        }
        }

public class Rough {

    public static void main(String [] args){

        boolean odd =true;
        if(odd) /* Line 4 */
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("even");
        }

    }
}
