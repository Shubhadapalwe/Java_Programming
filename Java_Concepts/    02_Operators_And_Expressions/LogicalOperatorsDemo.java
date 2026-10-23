public class LogicalOperatorsDemo
{
    public static void main(String[] args)
    {
        int age = 23;
        boolean hasID = true;

        System.out.println("AND : " + (age >= 18 && hasID));
        System.out.println("OR  : " + (age < 18 || hasID));
        System.out.println("NOT : " + (!hasID));
    }
}