package myDefault;

public class Main
{
	public static void main(String[] args)
	{
		Complex a = new Complex(2.0,3.0);
		Complex b = new Complex(2.0,3.0);
		
		System.out.println(a+" + "+b+" = "+a.add(b));
		System.out.println(a+" - "+b+" = "+a.sub(b));
		System.out.println(a+" * "+b+" = "+a.mul(b));
		System.out.println(a+" / "+b+" = "+a.div(b));
	}

}

class Complex 
{
	private double real;
	private double imag;
	
	public Complex(double real, double imag)
	{
		this.real=real;
		this.imag=imag;
	}
	
	public Complex add(Complex other)
	{
		return new Complex(real+other.real,imag+other.imag);
	}
	
	public Complex sub(Complex other)
	{
		return new Complex(real-other.real,imag-other.imag);
	}
	
	public Complex mul(Complex other)
	{
		return new Complex(real*other.real-real*other.imag,real*other.imag+imag*other.real);
	}
	
	public Complex div(Complex other)
	{
		Complex top = mul(other.conjugate());
		Complex bot = other.mul(other.conjugate());
		return new Complex(top.real/bot.real,top.imag/bot.real);
	}
	private Complex conjugate()
	{
		return new Complex(real,-imag);
	}
	
	
	
	public String toString()
	{
		return "("+real+" + "+imag+"i)";
	}
}