package pupr.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	public int addPassport(Passport passport) {
		int result=0;
		try 
			(PreparedStatement insertNewPassport = connection.prepareStatement("INSERT INTO TSA.Passport"
				+ "(passport_no, sur_name, given_name, nationality, dob, photo, "
				+ " sex, place_of_birth, date_of_issue, date_of_expiration) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?)")){
			insertNewPassport.setString(1, passport.getPassportNo());
			insertNewPassport.setString(2, passport.getSurName());
			insertNewPassport.setString(3, passport.getName());
			insertNewPassport.setString(4, passport.getNationality());
			 insertNewPassport.setString(5, passport.getDobString());
			insertNewPassport.setString(6, passport.getPhoto());
			insertNewPassport.setString(7, passport.getSex());
			insertNewPassport.setString(8, passport.getPlaceOfBirth());
			insertNewPassport.setString(9, passport.getDateOfIssue());
			insertNewPassport.setString(10,passport.getDateOfExpiration());
			result = insertNewPassport.executeUpdate();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Insert problems: " + ex.getMessage());
		}
		
		return result;
	}
	public int modifyPassport(Passport passport) {
	    int result = 0;
	    try {
	        // Aquí actualizamos el pasaporte que tiene el número especificado
	        String sql = "UPDATE TSA.Passport SET "
	                   + "sur_name=?, given_name=?, nationality=?, dob=?, photo=?, "
	                   + "sex=?, place_of_birth=?, date_of_issue=?, date_of_expiration=? "
	                   + "WHERE passport_no=?";
	        
	        // Preparamos la consulta SQL
	        PreparedStatement updatePassport = connection.prepareStatement(sql);
	        
	        // Establecemos los nuevos valores
	        updatePassport.setString(1, passport.getSurName());
	        updatePassport.setString(2, passport.getName());
	        updatePassport.setString(3, passport.getNationality());
	        updatePassport.setString(4, passport.getDobString());
	        updatePassport.setString(5, passport.getPhoto());
	        updatePassport.setString(6, passport.getSex());
	        updatePassport.setString(7, passport.getPlaceOfBirth());
	        updatePassport.setString(8, passport.getDateOfIssue());
	        updatePassport.setString(9, passport.getDateOfExpiration());
	        updatePassport.setString(10, passport.getPassportNo()); // Este es el número que se usará para identificar el pasaporte a modificar
	        
	        // Ejecutamos la consulta
	        result = updatePassport.executeUpdate();
	        
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "Update problems: " + ex.getMessage());
	    }
	    
	    return result;
	}

	
	public List<Passport> getAllPassports() {
		List<Passport> results = null;
		
		try(PreparedStatement selectAllAuthors = connection.prepareStatement("SELECT * FROM tsa.Passport")) {
			try(ResultSet resultSet = selectAllAuthors.executeQuery()) {
				results = new ArrayList<Passport>();
				
				while(resultSet.next()) {
					results.add(new Passport(resultSet.getString("passport_no"),
						                    resultSet.getString("sur_name"),
					            			resultSet.getString("given_name"),
					            			resultSet.getString("nationality"),
					            			resultSet.getString("dob"),
					            			resultSet.getString("photo"),
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
	
	public Passport getAPassportsByno_pass(String passNo) {
		Passport results = null;
		
		try(PreparedStatement selectPassbyNo = connection.prepareStatement("SELECT * FROM tsa.Passport WHERE passport_no = ? ")) {
			selectPassbyNo.setString(1, passNo);
			try(ResultSet resultSet = selectPassbyNo.executeQuery()) {
				
				
				while(resultSet.next()) {
					results= new Passport(resultSet.getString("passport_no"),
						                    resultSet.getString("given_name"),
					            			resultSet.getString("sur_name"),
					            			resultSet.getString("nationality"),
					            			resultSet.getString("dob"),
					            			resultSet.getString("photo"),
					            			resultSet.getString("sex"),
					            			resultSet.getString("place_of_birth"),
					            			resultSet.getString("date_of_issue"),
					            			resultSet.getString("date_of_expiration"));
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
			Passport a= new Passport("P12345", "Victor", "Mejia", "RD",
	            		"1995-10-06", "ruta/a/foto.jpg", "M", "San Juan",
	                    "2020-01-01", "2030-01-01");
	            int result = connection.addPassport(a);

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
     

