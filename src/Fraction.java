public class Fraction
{
    private int myNumerator;
    private int myDenominator;
    
    public Fraction(int n, int d)
    {
        myNumerator = n;
        myDenominator = d;
        
        simplify();
    }
    
    public Fraction plus(Fraction other)
    {
        Fraction result;
        
        result = new Fraction(myNumerator * other.myDenominator + 
                              other.myNumerator * myDenominator,
                              myDenominator * other.myDenominator);
        
        simplify();
        
        return result;
    }
    public Fraction divide(Fraction other){
        return new Fraction(myNumerator * other.myDenominator, myDenominator * other.myNumerator);
    }
    public Fraction subtract(Fraction other){
        Fraction result = new Fraction(myNumerator * other.myDenominator -
                other.myNumerator * myDenominator,
                myDenominator * other.myDenominator);
        simplify();
        return result;
    }
        
    public Fraction times(Fraction other)
    {
        Fraction result;
        
        result = new Fraction(myNumerator * other.myNumerator, 
                              myDenominator * other.myDenominator);
        
        return result;
    }
    
    public String toString()
    {

        return myNumerator + "/" + myDenominator;
    }
    
    private void simplify()
    {
        int gcd = getGCD(myNumerator, myDenominator);
        
        myNumerator = myNumerator / gcd;
        myDenominator = myDenominator / gcd;
    }
    
    private int getGCD(int x, int y)
    {
        if (y == 0)
            return x;
        else
            return getGCD(y, x % y);
    }    
}