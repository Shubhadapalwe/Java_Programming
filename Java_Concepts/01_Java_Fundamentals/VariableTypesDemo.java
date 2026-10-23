/*
 * Program Name : VariableTypesDemo.java
 * Concept      : Local, Instance and Static Variables
 */

public class VariableTypesDemo
{
    // Instance variable
    int age = 23;

    // Static variable
    static String college = "PUCSD";

    public void display()
    {
        // Local variable
        String name = "Shubhada";

        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);
    }

    public static void main(String[] args)
    {
        VariableTypesDemo obj = new VariableTypesDemo();

        obj.display();
    }
}