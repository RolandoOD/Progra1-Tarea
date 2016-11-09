
public class Rectangulo {
	private	double base;
	private	double altura;
		


protected Rectangulo(String color, double base,double altura)
{
	this.altura=altura;
	this.base=base;
}

protected double getBase()
{
	return base;
}

protected double getAltura()
{
	return altura;
}
protected void setBase(double base)
{
	this.base=base;
}
protected void setAltura(double altura)
{
	this.altura=altura;
}
protected double getArea()
{
	return area;
}
}