public class FractionMain
{
 public static void main(String[] args)
 {
     Fraction f1, f2, f3;
     
     f1 = new Fraction(2, 7);
     f2 = new Fraction(4, 24);
     
     f3 = f1.subtract(f2);
     
     System.out.println(f1 + " operand " + f2 + " = " + f3);
     
     Fraction f4;
     
     f4 = new Fraction(2, 3);
     
     System.out.println(f1.plus(f2));
     System.out.println(f2.plus(f1));
 }
}