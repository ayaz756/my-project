
public class Class_Circle extends Class_Shape
{
		private
		Class_Shape s1=new Class_Shape("yellow",true);
		double radius;
		public
		Class_Circle()
		{
			radius=1.0;
		}
		public Class_Circle(double r)
		{
			radius=r;
		}
		public Class_Circle(double r,String c,boolean f)
		{
			radius=r;
			s1.setColor(c);
			s1.setFilled(f);
		}
		double getradius_Method()
		{
			return radius;
		}
		void setradius_Method(double r)
		{
			radius=r;
		}
		double getArea_Method()
		{
			return 3.14*radius*radius;
		}
		double getPerimeter_Method()
		{
			return 2*3.14*radius;
		}
		public String toString()
		{
			if (s1.isFilled_Method()==true)
	 			return "A Circle with radius= "+radius+" , which is a subclass of A Shape with color of "+s1.getColor()+" and filled";
	 		else
	 			return "A Circle with radius= "+radius+" , which is a subclass of A Shape with color of "+s1.getColor()+" and Not filled";
		}
}


