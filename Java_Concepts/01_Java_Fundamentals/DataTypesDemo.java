/*
 * Program Name : DataTypesDemo.java
 * Description  : Demonstration of 8 primitive data types in Java.
 * Concept      : Java Fundamentals - Data Types
 */

public class DataTypesDemo
{
    public static void main(String[] args)
    {
        // 1. Byte - 1 byte
        byte bValue = 100;

        // 2. Short - 2 bytes
        short sValue = 30000;

        // 3. Integer - 4 bytes
        int iValue = 100000;

        // 4. Long - 8 bytes
        long lValue = 10000000000L;

        // 5. Float - 4 bytes
        float fValue = 25.5f;

        // 6. Double - 8 bytes
        double dValue = 99.999;

        // 7. Character - 2 bytes
        char cValue = 'A';

        // 8. Boolean - true or false
        boolean bRet = true;

        // Display all values
        System.out.println("Byte Value    : " + bValue);
        System.out.println("Short Value   : " + sValue);
        System.out.println("Integer Value : " + iValue);
        System.out.println("Long Value    : " + lValue);
        System.out.println("Float Value   : " + fValue);
        System.out.println("Double Value  : " + dValue);
        System.out.println("Character     : " + cValue);
        System.out.println("Boolean Value : " + bRet);
    }
}