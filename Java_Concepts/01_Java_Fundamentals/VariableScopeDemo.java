/*
 * Program Name : VariableScopeDemo.java
 * Concept      : Variable Scope in Java
 */

public class VariableScopeDemo
{
    static int globalValue = 100;

    public static void main(String[] args)
    {
        int localValue = 50;

        System.out.println("Class Variable : " + globalValue);
        System.out.println("Local Variable : " + localValue);

        if (localValue > 10)
        {
            int blockValue = 25;

            System.out.println("Block Variable : " + blockValue);
        }

        // blockValue cannot be accessed here.
    }
}