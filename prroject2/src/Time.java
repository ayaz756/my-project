
	import javax.swing.*;
	public class Time {
		private int Hours;
		private int Mins;
		private String ampm;
		public Time()
		{
			Hours=10;
			Mins=59;
			ampm="am";
		}
		public Time(int Hours1,int Mins1,String ampm1)
		{
			Hours=Hours1;
			Mins=Mins1;
			ampm=ampm1;
		}
		public int getHours_Method()
		{
			return Hours;
		}
		public void setHours_Method(int Hours1)
		{
			Hours=Hours1;
		}
		public int getMins_Method()
		{
			return Mins;
		}
		public void setMins_Method(int Mins1)
		{
			Mins=Mins1;
		}
		public String getampm_Method()
		{
			return ampm;
		}
		public void setampm_Method(Time Time)
		{
			Hours=Time.Hours;
			Mins=Time.Mins;
			ampm=Time.ampm;   
		}  
		public void setampm_Method(String ampm1)
		{
			ampm=ampm1;
		}
		public String toString()
		{
			return  +Hours+" : " +Mins+" ("+;
		}
	}

