public class ShiftOperatorsDemo
{
    public static void main(String[] args)
    {
        int a = 8;

        System.out.println("Left Shift     : " + (a << 1));
        System.out.println("Right Shift    : " + (a >> 1));
        System.out.println("Unsigned Shift : " + (a >>> 1));
    }
}