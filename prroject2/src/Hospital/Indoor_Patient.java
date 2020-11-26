package Hospital;

public class Indoor_Patient extends Patient {
		private Patient Patient;
		private int wardno;
		private int Roomno;
		private int bedno;
		private int fee;  
		private Doctor Doctor;
		private Date Date;
		Patient=new Patient();
		Doctor= new Doctor();
		Date= new Date();
		public Indoor_Patient()
		{
			 wardno=1;
			 Roomno=1;
			 bedno=1;
			 fee=500;   
		}
		public Indoor_Patient(int Iwardno, int IRoomno, int Ibedno,int Ifee,Date Date,Doctor Doctor,String P_name,String P_cnic,String P_address,String P_phoneNo,char P_gender,int P_age)
		{
			 wardno=Iwardno;
			 Roomno=IRoomno;
			 bedno=Ibedno;
			 fee=Ifee;
			 Date.setDate_Method(Date);
			 Doctor.setDoctor_Method(Doctor);
			 Patient.setname_Method(P_name);
			 Patient.setcnic_Method(P_cnic);
			 Patient.setphoneNo_Method(P_phoneNo);
			 Patient.setaddress_Method(P_address);
			 Patient.setgender_Method(P_gender);
			 Patient.setage_Method(P_age);
		}
		public Patient getPatient_Method()
		{
			return Patient;
		}
		public Doctor getDoctor_Method()
		{
			return Doctor;
		}
		public Date getDate_Method()
		{
			return Date;
		}
		public int getwardno_Method()
		{
			return wardno;
		}
		public void setwardno_Method(int Iwardno)
		{
			wardno=Iwardno;
		}
		public int getRoomno_Method()
		{
			return Roomno;
		}
		public void setRoomno_Method(int IRoomno)
		{
			Roomno=IRoomno;
		}
		public int getbedno_Method()
		{
			return bedno;
		}
		public void setbedno_Method(int Ibedno)
		{
			bedno=Ibedno;
		}
		public int getfee_Method()
		{
			return fee;
		}
		public void setfee_Method(int Ifee)
		{
			fee=Ifee;
		}
		public String toString()
		{
			return "Patient's Info: "+Patient+" admit in wardno: "+wardno+" Roomno= "+ Roomno+" bedno "+bedno+"  Dateission= "+ Date+" Doctor's Info: "+Doctor+" fee "+fee;
		}
	}


