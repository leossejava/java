import java.util.*;
class ASMD
{
    public static void main(String args[])
    {
        Scanner ja=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the number : ");
        a=ja.nextDouble();
        System.out.println("Enter the number : "); 
        b=ja.nextDouble();
        c=a+b;
        System.out.println("Add two number :  "+c);
        c=a-b;
        System.out.println("Subration two number :  "+c);
        c=a*b;
        System.out.println("Multiple two number :  "+c);
        c=a/b;
        System.out.println("divition two number :  "+c);
        c=a%b;
        System.out.println("Modless two number :  "+c);
     }
}