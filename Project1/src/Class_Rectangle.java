
public class Class_Rectangle extends Class_Shape
{
		private Class_Shape Shape;
		Shape=new Class_Shape("green",true);
		private double width;
		private double length;
		public Class_Rectangle()
		{
			width=1.0;
			length=1.0;
		}
		public Class_Rectangle(double width1,double length1) 
		{
			width=width1;
			length=length1;
		}
		public Class_Rectangle(double width1,double length1,String color1, boolean filled1)
		{
			width=width1;
			length=length1;
			Shape.setColor_Method(color1);
			Shape.setFilled_Method(filled1);
		}
		public double getwidth_Method()
	 	{
	 		return width;
	 	}
		public void setwidth_Method(double width1) 
	 	{
	 		width=width1;
	 	}
		public double getlength_Method()
	 	{
	 		return length;
	 	}
		public void setlength_Method(double lenght1) 
	 	{
	 		length=length1;
	 	}
		public double getArea_Method() 
	 	{
			double Area;
			Area=length*width;
	 		return Area;
	 	}
		public double getPerimeter_Method()
	 	{
			double Perimeter;
			Perimeter=2*(length+width);
			return Perimeter;
	 	}
		//new change
	 	public String toString() 
	 	{
	 			return "A Rectangle with width= "+width+" and length= "+length+" ,which is a subclass of A Shape with color of "+Shape.getColor_Method()+" and filled"+Shape.isFilled_Method();
	 	}
}


