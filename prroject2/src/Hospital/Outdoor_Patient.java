package Hospital;

public class Outdoor_Patient extends Patient {
		private Patient Patient;
		private Date Date;
		private Time Time;
		private Doctor doctor;
		private int fee;
		Patient=new Patient();
		Date=new Date(21,"jan",2010);
		Time=new Time(11,55,"am");
		doctor=new Doctor();
		public Outdoor_Patient()
		{
			fee=500;
		}
		public Outdoor_Patient(int Ofee,Time Time,Date Date,Doctor Doctor,String P_name,String P_cnic,String P_address,String P_phoneNo,char P_gender,int P_age)
		{
			fee=Ofee;
			Date.setDate_Method(Date);
			Time.setTime_Method(Time);	
			doctor.setDoctor_Method(Doctor);
			Patient.setname_Method(P_name);
			Patient.setcnic_Method(P_cnic);
			Patient.setphoneNo_Method(P_phoneNo);
			Patient.setaddress_Method(P_address);
			Patient.setgender_Method(P_gender);
			Patient.setage_Method(P_age);
		}
		public String getDoctorName_Method()
		{
			return doctor.getName_Method();
		}
		public Patient getPatient_Method()
		{
			return Patient;
		}
		public Doctor getDoctor_Method()
		{
			return doctor;
		}
		public Date getDate_Method()
		{
			return Date;
		}
		public void setDate_Method(Date date)
		{
			Date.setDate_Method(date);
		}
		public Time getTime_Method()
		{
			return Time;
		}
		public void setTime_Method(Time time)
		{
			Time.setTime_Method(time);
		}
		public int getfee_Method()
		{
			return fee;
		}
		public void setfee_Method(int Ofee)
		{
			fee=Ofee;
		}
		public String toString()
		{
			return "Patient's Info: "+Patient+"  Date of appointment= "+ Date+" Time of appointment: "+Time+" Doctor's Info: "+doctor+" fee "+fee;
		}
}
