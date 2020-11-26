
public class Class_Shape 
	{
		private String color;
		private boolean filled;
		public Class_Shape()
		{
			color="green";
			filled= true;
		}
		public Class_Shape(String color1, boolean filled1) 
		{
			color=color1;
			filled=filled1;
		}
		public String getColor_Method() 
	 	{
	 		return color;
	 	}	
	 	public void setColor_Method(String color1)
	 	{	
	 		color=color1;
	 	}
	 	public boolean isFilled_Method()
	 	{
	 		return filled;
	 	}
	 	public void setFilled_Method(boolean filled1)
	 	{	
	 		filled=filled1;
	 	}
	 	public String toString()
	 	{
	 			return "A Shape with color of "+color+" and filled"+filled;	
	 	}
	 	public double getArea_Method()
	 	{
	 		return 0.0;
	 	}
	 	public double getPerimeter_Method()
	 	{
	 		return 0.0;
	 	}
	 	}
	}


