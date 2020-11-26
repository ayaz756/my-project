	import javax.swing.*;
	public class Date {
		private int Day;
		private String month;
		private int year;
		public Date()
		{
			Day=12;
			month="Jan";
			year=2001;
		}
		public Date(int Day1,String month1,int year1)
		{
			Day=Day1;
			month=month1;
			year=year1;
		}
		public int getDay_Method()
		{
			return Day;
		}
		public void setDay_Method(int Day1)
		{
			Day=Day1;
		}
		public String getmonth_Method()
		{
			return month;
		}
		public void setmonth_Method(String month1)
		{
			month=month1;
		}  
		public int getyear_Method()
		{
			return year;
		}
		public void setyear_Method(int year1)
		{
			year=year1;
		}
		public void setDate_Method(Date Date)
		{
			Day=Date.Day;
			month=Date.month;
			year=Date.year;
		}
		public String toString()
		{
			return +Day+"/" +month+"/"+year;
		}
	}



