package pupr.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import java.sql.SQLException;

public class MySQLConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/tsa"; 
	private static final  String USER = "root"; 
	private static final   String PASSWORD = "Mejia1243"; 
     
     private Connection connection =null;
   
	public MySQLConnection() {
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
	
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.print("fallo");
			System.exit(1);
		}	
		
	}
	public int addPassport(String passport_no, String name, String lastName,
			String nationaly, String date, String photo, String sex, String bornPlace,
			String date_issue,String dateExp) {
		int result=0;
		try 
			(PreparedStatement insertNewPassport = connection.prepareStatement("INSERT INTO TSA.Passport"
				+ "(passport_no, sur_name, given_name, nationality, dob, photo, "
				+ " sex, place_of_birth, date_of_issue, date_of_expiration) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?) ")){
			insertNewPassport.setString(1, passport_no);
			insertNewPassport.setString(2, name);
			insertNewPassport.setString(3, lastName);
			insertNewPassport.setString(4, nationaly);
			 insertNewPassport.setString(5, date);
			insertNewPassport.setString(6, photo);
			insertNewPassport.setString(7, sex);
			insertNewPassport.setString(8, bornPlace);
			insertNewPassport.setString(9, date_issue);
			insertNewPassport.setString(10,dateExp);
			result = insertNewPassport.executeUpdate();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Insert problems: " + ex.getMessage());
		}
		
		return result;
	}
	public int modifyPassport(String passport_no, String name, String lastName,
			String nationaly, LocalDate date, String photo, String sex, String bornPlace,String date_issue,String dateExp) {
		int result=0;
		try 
			(PreparedStatement insertNewPassport = connection.prepareStatement("UPDATE TSA.Passport SET "
				+ "(passport_no=? sur_name=? given_name=? nationality=? dob=?, photo=? "
				+ " sex=? place_of_birth=? date_of_issue=? date_of_expiration=?) ")){
			insertNewPassport.setString(1, passport_no);
			insertNewPassport.setString(2, name);
			insertNewPassport.setString(3, lastName);
			insertNewPassport.setString(4, nationaly);
			insertNewPassport.setDate(5, java.sql.Date.valueOf(date));
			insertNewPassport.setString(6, photo);
			insertNewPassport.setString(7, sex);
			insertNewPassport.setString(8, bornPlace);
			insertNewPassport.setString(9, date_issue);
			insertNewPassport.setString(10,dateExp);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Insert problems: " + ex.getMessage());
		}
		
		return result;
	}
	
	public List<Passport> getAllAuthors() {
		List<Passport> results = null;
		
		try(PreparedStatement selectAllAuthors = connection.prepareStatement("SELECT * FROM tsa.Passport")) {
			try(ResultSet resultSet = selectAllAuthors.executeQuery()) {
				results = new ArrayList<Passport>();
				
				while(resultSet.next()) {
					results.add(new Passport(resultSet.getString("passpor_no"),
						                    resultSet.getString("LastName"),
					            			resultSet.getString("sur_name"),
					            			resultSet.getString("nationality"),
					            			resultSet.getString("dob"),
					            			resultSet.getString("dob"),
					            			resultSet.getString("sex"),
					            			resultSet.getString("place_of_birth"),
					            			resultSet.getString("date_of_issue"),
					            			resultSet.getString("date_of_expiration")));
				}
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
			closeDB();
		}
		
		return results;
	}
	
	

	public void closeDB() {
		try {
			if(connection != null) {
				connection.close();
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void main (String [] args) {
		
		MySQLConnection connection =new MySQLConnection();
	
		 try {
	            int result = connection.addPassport("P123456789", "Victor", "Mejia", "RD",
	            		"1995-10-06", "ruta/a/foto.jpg", "M", "San Juan",
	                    "2020-01-01", "2030-01-01");

	            if (result > 0) {
	                System.out.println("Pasaporte agregado exitosamente.");
	            } else {
	                System.out.println("No se pudo agregar el pasaporte.");
	            }
	        } finally {
	            connection.closeDB(); // Cierra la conexión
	        }
	    }
	}
     

