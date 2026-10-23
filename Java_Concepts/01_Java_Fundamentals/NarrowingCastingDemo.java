/*
 * Program Name : NarrowingCastingDemo.java
 * Concept      : Explicit Type Casting
 */

public class NarrowingCastingDemo
{
    public static void main(String[] args)
    {
        double dValue = 99.99;

        int iValue = (int) dValue;

        System.out.println("Double Value  : " + dValue);
        System.out.println("Integer Value : " + iValue);
    }
}