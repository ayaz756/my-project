package Hospital;

	import javax.swing.JOptionPane;
	public class Demo
	{
		public static void main(String args[])
		{
			int arraysize=10;
			int arr=0;
			int in=-1,uni=-1,mit=-1;
			int xy=-1,pan=-1;
			Date[] New_Date;
			Time[] New_Time;
			int num;
			Patient[] New_Patient;
			Patient[] New_Indoor;
			Patient[] New_Outdoor;
			Doctor[] New_Doctor;
			New_Date=new Date[arraysize];
			New_Time=new Time[arraysize];
			New_Patient=new Patient[arraysize];
			New_Indoor= new Indoor_Patient[arraysize];
			New_Outdoor= new Outdoor_Patient[arraysize];
			New_Doctor= new Doctor[arraysize];
			New_Patient[arr+(in++)]=new Patient("Ayesha","37405-6666531-0","roomno1, first floor, E11, Rwp","0333-6666666",'F',30);
			New_Patient[arr+(in++)]=new Patient("Uzma","37405-6666531-0","roomno2, first floor, E11, Rwp","0333-6666666",'F',30);
			New_Patient[arr+(in++)]=new Patient("Malaika","37405-6666531-0","roomno3, first floor, E11, Rwp","0333-6666666",'F',30);
			New_Doctor[arr+(in++)]=new Doctor("Nimra","surgical","Cardiovascular/Thoracic Surgery","33333-7777777-1","0333-xxxxxxx",'f');
			New_Doctor[arr+(in++)]=new Doctor("Hira","ENT","Ent Surgeon","33333-7777777-1","0333-xxxxxxx",'f');
			New_Doctor[arr+(in++)]=new Doctor("Fatima","physio Therapist","Clinical electrophysiology","33333-7777777-1","0333-xxxxxxx",'f');
			do{
				System.out.println("__________WELCOME TO HOSPITAL MANAGEMENT SYSTEM________");
				System.out.println("1-	Add an indoor patient");
				System.out.println("2-	Add an outdoor patient");
				System.out.println("3-	See the list of all Doctors");
				System.out.println("4-	Search a doctor by name or department");
				System.out.println("5-	See the list of all indoor patients");
				System.out.println("6-	See the list of all appointments on a certain day");
				System.out.println("7-	See the list of appointments of a certain doctor");
				System.out.println("8-	Change the date or time of appointment of a certain patient");
				System.out.println("9-	Exit");
				String no=JOptionPane.showInputDialog("Enter no.");
				num= Integer.parseInt(no);
				if(num==1)
				{
					String a=JOptionPane.showInputDialog("Enter wardno ");
					int h= Integer.parseInt(a);
					String b=JOptionPane.showInputDialog("Enter bedno ");
					int i= Integer.parseInt(b);
					String c=JOptionPane.showInputDialog("Enter Roomno ");
					int j= Integer.parseInt(c);
					String d=JOptionPane.showInputDialog("Enter fee ");
					int k= Integer.parseInt(d);
					String e=JOptionPane.showInputDialog("Enter Day ");
					int l= Integer.parseInt(e);
					New_Date[xy++].setDay_Method(l);
					String f=JOptionPane.showInputDialog("Enter month ");
					New_Date[xy++].setmonth_Method(f);
					String g=JOptionPane.showInputDialog("Enter year ");
					int m= Integer.parseInt(g);
					New_Date[xy++].setyear(m);
					New_Patient[uni++]=new Indoor_Patient(h,i,j,d,New_Date[xy],New_Doctor[0],"Ayesha","37405-6666531-0","roomno1, first floor, E11, Rwp","0333-6666666",'F',30);
				}
				else{	if(num==2)
						{
							String n=JOptionPane.showInputDialog("Enter fee  ");
							int o= Integer.parseInt(n);
							String p=JOptionPane.showInputDialog("Enter Day ");
							int q= Integer.parseInt(p);
							New_Date[xy++].setDay_Method(q);
							String r=JOptionPane.showInputDialog("Enter month ");
							New_Date[xy++].setmonth_Method(r);
							String s=JOptionPane.showInputDialog("Enter year ");
							int t= Integer.parseInt(s);
							New_Date[xy++].setyear(t);
							String u=JOptionPane.showInputDialog("Enter hours ");
							int v= Integer.parseInt(u);
							New_Time[pan++].setHours_Method(v);
							String w=JOptionPane.showInputDialog("Enter mins ");
							New_Time[pan++].setMins_Method(w);
							String x=JOptionPane.showInputDialog("Enter am/pm ");
							New_Time[pan++].setampm_Method(x);
							New_Patient[mit++]=new Outdoor_Patient(o,New_Time[pan],New_Date[xy],New_Doctor[1],"Uzma","37405-6666531-0","roomno2, first floor, E11, Rwp","0333-6666666",'F',30);
						}
						else{ 	if(num==3)
								{
									for (int j=0; j <New_Doctor.length; j++)
										JOptionPane.showMessageDialog(null,"Doctors are"+New_Doctor[j]," Output ",JOptionPane.WARNING_MESSAGE);
								}
								else{	if(num==4)
										{
											String y=JOptionPane.showInputDialog("Do you want to search by name(y/n)");
											if (y=="y")
											{
												String z=JOptionPane.showInputDialog("enter doctor's name");
												for (int j=0; j <New_Doctor.length; j++)
												{
													if(New_Doctor[j].getName_Method()==z)
														JOptionPane.showMessageDialog(null,"Doctors is"+New_Doctor[j]," Output ",JOptionPane.WARNING_MESSAGE);	
												}
											}
											else 
											{
												String a1=JOptionPane.showInputDialog("enter doctor's department");
												for (int j=0; j<New_Doctor.length; j++)
												{
													if(New_Doctor[j].getDepartment_Method()==a1)
														JOptionPane.showMessageDialog(null,"Doctors is"+New_Doctor[j]," Output ",JOptionPane.WARNING_MESSAGE);
												}
											}
										}
										else{	if(num==5)
												{
													for(int j=0; j<New_Indoor.length;j++)
													{
														if(New_Indoor[j] instanceof Patient)
															JOptionPane.showMessageDialog(null," Indoor Patients are "+New_Indoor[j],"Output",JOptionPane.WARNING_MESSAGE);
													}
												}
												else{	if(num==6)
														{
															Date New_dat=new Date();
															String b1=JOptionPane.showInputDialog("Enter Day ");
															int c1= Integer.parseInt(b1);
															New_Date[xy++].setDay_Method(c1);
															String d1=JOptionPane.showInputDialog("Enter month ");
															New_Date[xy++].setmonth_Method(d1);
															String e1=JOptionPane.showInputDialog("Enter year ");
															int f1= Integer.parseInt(e1);
															New_Date[xy++].setyear(f1);
															New_dat.setDate();
															for (int j=0; j <New_Outdoor.length; j++)
															{
																if(New_Outdoor[j].getDate_Method()==New_dat)
																	JOptionPane.showMessageDialog(null,"Appointments are"+New_Outdoor[j].getTime_Method(),"Ouput",JOptionPane.WARNING_MESSAGE);
															}
														}
														else{	if(num==7)
																{
																	String h1=JOptionPane.showInputDialog("enter doctor's name");
																	for (int j=0; j <New_Outdoor.length; j++)
																	{
																		if(New_Outdoor[j].getDoctorName_Method()==h1)
																			JOptionPane.showMessageDialog(null," Appointments are : "+New_Outdoor[j].getDate_Method()," Output",JOptionPane.WARNING_MESSAGE);
																	}
																}
																else{	if(num==8)
																		{	
																			String i1=JOptionPane.showInputDialog("Enter name of the patient ");
																			for (int j=0; j <New_Outdoor.length; j++)
																			{   
																				if(New_Outdoor[j].getname_Method()==i1)
																				{
																					String j1=JOptionPane.showInputDialog("Do you want to change date(y/n) ");
																					if (j1=="d")
																					{
																						String k1=JOptionPane.showInputDialog("Enter Day ");
																						int l1= Integer.parseInt(k1);
																						New_Date[xy++].setDay_Method(l1);
																						String m1=JOptionPane.showInputDialog("Enter month ");
																						New_Date[xy++].setmonth_Method(m1);
																						String n1=JOptionPane.showInputDialog("Enter year ");
																						int o1= Integer.parseInt(n1);
																						New_Date[xy++].setyear(01);
																						New_Outdoor[j].setDate_Method(New_Date[xy]);
																					}
																					else
																					{
																						String p1=JOptionPane.showInputDialog("Enter hours ");
																						int q1= Integer.parseInt(p1);
																						New_Time[pan++].setHours_Method(q1);
																						String r1=JOptionPane.showInputDialog("Enter mins ");
																						New_Time[pan++].setMins_Method(r1);
																						String s1=JOptionPane.showInputDialog("Enter am/pm ");
																						New_Time[pan++].setampm_Method(s1);
																						New_Outdoor[j].setTime_Method(New_Time[pan]);
																					}
																				}
																			}	
																		}
																}
														}
												}
										}
								}
						}
				}
	}while(num!=9);
		}
	}

