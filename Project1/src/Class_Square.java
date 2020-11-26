
public class Class_Square extends Class_Rectangle {
			private Class_Rectangle Rectangle;
			Rectangle=new Class_Rectangle(5.0,10.0);
			private Class_Shape
			Shape = new Class_Shape("White",false);
			private double side;
			public Class_Square()
			{
				side=Rectangle.getlength_Method();
			}
			public Class_Square(double side1)
			{
				side=side1;
			}
			public Class_Square(double side1,String color1, boolean filled1)
			{
				side=side1;
				Rectangle.setColor_Method(color1);
				Rectangle.setFilled_Method(filled1);
			}
			public double getside_Method()
		 	{
		 		return side;
		 	}
			public void setside_Method(double side1) 
		 	{
		 		side=side1;
		 	}
			public double getArea_Method() 
		 	{
				double Area;
				Area=side*side;
		 		return Area;
		 	}
			public double getPerimeter_Method()
		 	{
				double Perimeter;
				Perimeter=4*side;
		 		return Perimeter;
		 	}
			public String toString()
	 		{
				return "A Square with side= "+side+" , which is a subclass of A Rectangle with width= "+Rectangle.getwidth_Method()+" and length= "+Rectangle.getlength_Method()+" which is a subclass of A Shape with color of "+Shape.getColor_Method()+" and filled"+Shape.isFilled_Method();
	 		}
	}


