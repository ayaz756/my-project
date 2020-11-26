
public class Class_Test {
		public static void main(String args[])
		{   
			Class_Shape Shape;//Shape Project
			Class_Shape Circle1;
			Class_Shape Circle2;
			Class_Shape Rectangle1;
			Class_Shape Rectangle2;
			Class_Rectangle Square1;
			Class_Rectangle Square2;
			Shape=new Class_Shape("yellow",true);
			Circle1 = new Class_Circle(5.0);
			Circle2= new Class_Circle(5.0,"black",false);
			Rectangle1= new Class_Rectangle(1.0,2.0);
			Rectangle2= new Class_Rectangle(1.0,2.0,"White",false);
			Square1=new Class_Square(6.0);
			Square2=new Class_Square(6.0,"pink",true);
			System.out.println(Shape);	
			System.out.println(Circle1);
			System.out.println(Circle1.getArea_Method());
			System.out.println(Circle1.getPerimeter_Method());
			System.out.println(Circle2);
			System.out.println(Circle2.getArea_Method());
			System.out.println(Circle2.getPerimeter_Method());
			System.out.println(Rectangle1);		
			System.out.println(Rectangle1.getArea_Method());
			System.out.println(Rectangle1.getArea_Method());
			System.out.println(Rectangle2);	
			System.out.println(Rectangle2.getArea_Method());
			System.out.println(Rectangle2.getArea_Method());
			System.out.println(Square1);	
			System.out.println(Square1.getArea_Method());
			System.out.println(Square1.getArea_Method());
			System.out.println(Square2);
			System.out.println(Square2.getArea_Method());
			System.out.println(Square2.getArea_Method());
		}
	}


