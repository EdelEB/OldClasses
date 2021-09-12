package myDefault;

public class Main 
{
	public static void main(String [] args)
	{
		Rational a = new Rational(2,4);
		Rational b = new Rational(4,16);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a+" + "+b+" = "+a.add(b));
		System.out.println(a+" - "+b+" = "+a.sub(b));
		System.out.println(a+" * "+b+" = "+a.mul(b));
		System.out.println(a+" / "+b+" = "+a.div(b));
	}
	
	
}

class Rational
{
	public Rational(int numerator, int denominator)
	{
		this.numerator = numerator/gcd(numerator,denominator);
		this.denominator = denominator/gcd(numerator,denominator);
		
	}
	
	public Rational add(Rational other)
	{
		return new Rational((numerator*other.denominator)+(other.numerator*denominator),denominator*other.denominator);
	}
	
	public Rational div(Rational other)
	{
		return new Rational(numerator*other.denominator,denominator*numerator);
	}
	
	public int gcd(int m,int n)
	{
		//find the gcd then divide by top and bottom
		int r = 0;
		while (n != 0)
		{
			r = m%n;
			m=n;
			n=r;
		}
		return m;
	}
	
	public Rational mul(Rational other)
	{
		return new Rational(numerator*other.numerator,denominator*other.denominator);
	}
	
	public Rational sub(Rational other)
	{
		return new Rational((numerator*other.denominator)-(other.numerator*denominator),denominator*other.denominator);
	}
	
	public String toString()
	{
		return numerator+"/"+denominator;
	}
	
	private int numerator;
	private int denominator;

}