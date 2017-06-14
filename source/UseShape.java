/* Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides ( ).Provide three classes named Trapezoid, Triangle and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides ( ) that shows the number of sides in the given geometrical  figures.*/

abstract class Shape
{	abstract void numberOfSides(int s);
}
class Trapezoid extends Shape
{	void numberOfSides(int s)
{	System.out.println("the no of sides of a trapizoid is "+s);
}
}
class Triangle extends Shape
{
void numberOfSides(int s)
{	System.out.println("the no of sides of a triangle is "+s);
}
}
class Hexagonal extends Shape
{
void numberOfSides(int s)
{	System.out.println("the no of sides of a Hexagonal is "+s);
}
}
class UseShape
{
public static void main(String args[])
{	Trapezoid  t=new Trapezoid();
Triangle tr=new Triangle();
Hexagonal h=new Hexagonal();
Shape s;
s=t;	s.numberOfSides(4);
s=tr;	s.numberOfSides(3);
s=h;	s.numberOfSides(6);
}
}
