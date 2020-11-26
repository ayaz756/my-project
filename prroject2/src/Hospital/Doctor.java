package Hospital;

public class Doctor {
		//hospital project
		private String Name;
		private String Department;
		private String Specialization;
		private String cnic;
		private String phoneNo;
		private char gender;
		public Doctor()
		{
			Name="Saira";
			Department="gynae";
			Specialization="Family Medicine";
			cnic="33333-1111111-1";
			phoneNo="03332-XXXXXXX";
			gender='F';
		}
		public Doctor(String D_Name,String D_Department,String D_Specialization,String D_cnic,String D_phoneNo,char D_gender)
		{
			Name=D_Name;
			Department=D_Department;
			Specialization=D_Specialization;
			cnic=D_cnic;
			phoneNo=D_phoneNo;
			gender=D_gender;
		}
		public String getName_Method()
		{
			return Name;
		}
		public void setName_Method(String D_Name)
		{
			Name=D_Name;
		}
		public String getDepartment_Method()
		{
			return Department;
		}
		public void setDepartment_Method(String D_Department)
		{
			Department=D_Department;
		}
		public String getSpecialization_Method()
		{
			return Specialization;
		}
		public void setSpecialization_Method(String D_Specialization)
		{
			Specialization=D_Specialization;
		}
		public String getcnic_Method()
		{
			return cnic;
		}
		public  setcnic_Method(String D_cnic)
		{
			cnic=D_cnic;
		}
		public String getphoneNo_Method()
		{
			return phoneNo;
		}
		public void setphoneNo_Method(String D_phoneNo)
		{
			phoneNo=D_phoneNo;
		}
		public char getgender_Method()
		{
			return gender;
		}
		public void setgender_Method(char D_gender)
		{
			gender=D_gender;
		}
		public String toString()
		{
			return "Doctor's Name: "+Name+" Departmant: " +Department+" Specialization "+Specialization+" cnic: "+cnic+" phoneNo "+phoneNo+ " gender: "+gender;
		}
		public void setDoctor_Method(Doctor Doctor)
		{
			Name=Doctor.Name;
			Department=Doctor.Department;
			Specialization=Doctor.Specialization;
			cnic=Doctor.cnic;
			phoneNo=Doctor.phoneNo;
			gender=Doctor.gender;
		}
	}

