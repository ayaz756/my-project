package Hospital;

public class Patient { 
		private String name;
		private String cnic;
		private String address; 
		private String phoneNo;
		private char gender;
		private int age;
		private Date Date;
		Date=new Date();
		public Patient()
		{
			name="Saira";
			cnic="37405-5463806-2";
			address= "Rawat"; 
			phoneNo= "0349-1202428";
			gender='F';
			age=21;
		}
		public Patient(String P_name,String P_cnic,String P_address,String P_phoneNo,char P_gender,int P_age)
		{
			name=P_name;
			cnic=P_cnic;
			address= P_address; 
			phoneNo= P_phoneNo;
			gender=P_gender;
			age=P_age;
		}
		public String getname_Method()
		{
			return name;
		}
		public void setname_Method(String P_name)
		{
			name=P_name;
		}
		public String getcnic_Method()
		{
			return cnic;
		}
		public void setcnic_Method(String P_cnic)
		{
			cnic=P_cnic;
		}
		public String getaddress_Method()
		{
			return address;
		}
		public void setaddress_Method(String P_address)
		{
			address=P_address;
		}
		String getphoneNo_Method()
		{
			return phoneNo;
		}
		public void setphoneNo_Method(String P_phoneNo)
		{
			phoneNo=P_phoneNo;
		}
		public char getgender_Method()
		{
			return gender;
		}
		public void setgender_Method(char P_gender)
		{
			gender=P_gender;
		}
		public int getage_Method()
		{
			return age;
		}
		public void setage_Method(int P_age)
		{
			age=P_age; 
		}
		public String toString()
		{
			return "Patient's Name: "+name+" cnic: "+cnic+"  phoneNo "+phoneNo+ " address: "+address+" gender: "+gender+" age "+age;
		}
		public Date getDate_Method()
		{
			return Date;
		}
	}

