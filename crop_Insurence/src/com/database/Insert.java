package com.database;
import java.sql.*;
public class Insert {
		public  static String driver = "com.mysql.jdbc.Driver";
		public  static String url = "jdbc:mysql:///crop_insurance";
		public static String use = "root";
		public static String pwd = "";
		String INSERT_QU;

		public void Jdbc(String fName, String SName,String dob,String mobileNo,String gender,String district, String sdistrict, String village, String email,String password,String address) {
			System.out.println(1);
			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, use, pwd);
				// Statement st=con.createStatement();
				// int count=st.executeUpdate("");
				PreparedStatement st = con.prepareStatement("insert into registration_page(FName,SName,DOB,Mobile_no,gender,District,sub_district,village,Email,pass,Address)values(?,?,?,?,?,?,?,?,?,?,?)");
				if (st != null)
					System.out.println("conncetion");
				st.setString(1, fName);
				st.setString(2, SName);
				st.setString(3,  dob);
				st.setString(4, mobileNo);
				st.setString(5, gender);
				st.setString(6, district);
				st.setString(7, sdistrict);
				st.setString(8, village);
				st.setString(9, email);
				st.setString(10, password);
				st.setString(11, address);
				int rows = st.executeUpdate();
				if (rows == 0)
					System.out.println("0 rows");
				else {
					System.out.println("Inserted successfully");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}






