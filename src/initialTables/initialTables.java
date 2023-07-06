package initialTables;


import java.sql.*;
import Graphics.*;



public class initialTables {
	   private static final String DB_URL = "jdbc:mysql://localhost/";
	   private static final int port = 3306;
	   private static final String USER = "root";
	   private static final String PASS = "";
	  

	  
       
	   public static void main(String[] args) throws ClassNotFoundException, SQLException {
		   initialTables init = new initialTables();  
		   init.initialTables();
		   
		   
		   Connection con = getConnection();
		   init.createStuffTable(con);
		   init.createPayrollDataTable(con);
		   init.createPayrollTable(con);
		   first_window first=new first_window();
		   
		  
		                       // Close the ResultSet                 4 
	      
			
		  
	   }
	   
	   public void initialTables() throws SQLException, ClassNotFoundException {
	        Connection conn = getInitialConnection();
	        Statement stmt = conn.createStatement();
	        stmt.execute("CREATE DATABASE IF NOT EXISTS proswpiko_uoc");

	        
	      
	        stmt.close();
	        conn.close();
	    }
	   public static Connection getConnection() throws SQLException, ClassNotFoundException {
	        
		  // Class.forName("com.mysql.jdbc.Driver");
		           String url = new String("jdbc:mysql://localhost");
				   String databaseName = new String("proswpiko_uoc");
				   String username = new String("root");
				   String password = new String(""); 
				  
				return  DriverManager.getConnection( url + ":" + port + "/" + databaseName + "?characterEncoding=UTF-8", username, password);	  
	   }
	   
	   public static Connection getInitialConnection() throws SQLException, ClassNotFoundException {
	    		 Class.forName("com.mysql.cj.jdbc.Driver");
		    	return DriverManager.getConnection(DB_URL, USER, PASS);
		       
	    	}
	   
	   public void createStuffTable(Connection con) throws SQLException, ClassNotFoundException {

	        Statement stmt = con.createStatement();

	        String query = "CREATE TABLE IF NOT EXISTS stuff "
	                + "(stuff_id INTEGER not NULL AUTO_INCREMENT, "
	                + "    name VARCHAR(30) not null ,"
	                + "    married VARCHAR(200) not null ,	"
	                + "    kids VARCHAR(255) ,"
	                + "    kidsAge VARCHAR(255) ,"
	                + "    stuffType VARCHAR(255) not null,"
	                + "    employType VARCHAR(255) not null,"
	                + "    date DATE not null,"
	                + "    dueDate DATE ,"
	                + "    address VARCHAR(255) not null,"
	                + "    phone VARCHAR(11) not null,"
	                + "    bank_id VARCHAR(50) not null unique,"
	                + "    bankName VARCHAR(50) not null,"
	                + " PRIMARY KEY ( stuff_id))";
	        stmt.execute(query);
	        
	        String insertIndiv = "INSERT IGNORE INTO stuff(name, married, kids, kidsAge, stuffType, employType,date,dueDate,address,phone,bank_id,bankName)"
	        		+ " VALUES ('Vlachogiannakis Ioannis', 'yes', '2', '2,3', 'monimos', 'dioikitikos','2020-10-10','2022-10-10','mesampelies','696969696','GR495458495','pakritia')";
	        stmt.executeUpdate(insertIndiv);
	        
	        insertIndiv = "INSERT IGNORE INTO stuff(name, married, kids, kidsAge, stuffType, employType,date,dueDate,address,phone,bank_id,bankName)"
	        		+ " VALUES ('Hiras Ioannis', 'no', '0', '0', 'monimos', 'dioikitikos','2023-5-10','2024-5-11','mesampelies','6976969696','GR45324223','ethniki')";
	        stmt.executeUpdate(insertIndiv);

	        insertIndiv = "INSERT IGNORE INTO stuff(name, married, kids, kidsAge, stuffType, employType,date,dueDate,address,phone,bank_id,bankName)"
	        		+ " VALUES ('Tzormpatzakis Odysseas', 'no', '0', '0', 'monimos', 'didaktikos','2017-10-10','2024-5-11','profiti ilia','6975462189','GR452653523','revolout')";
	        stmt.executeUpdate(insertIndiv);
	        
	        insertIndiv = "INSERT IGNORE INTO stuff(name, married, kids, kidsAge, stuffType, employType,date,dueDate,address,phone,bank_id,bankName)"
	        		+ " VALUES ('Fysarakis Christow', 'yes', '4', '10,10,8,2', 'symvasiouxos', 'dioikitikos','2020-10-10','2030-10-10','mesampelies','6945794330','GR78956213','ethniki')";
	        stmt.executeUpdate(insertIndiv);
	        
	        insertIndiv = "INSERT IGNORE INTO stuff(name, married, kids, kidsAge, stuffType, employType,date,dueDate,address,phone,bank_id,bankName)"
	        		+ " VALUES ('Ivanov Tony', 'yes', '1', '1', 'symvasiouxos', 'didaktikos','2020-10-10','2024-10-10','62 martyrwn 100','6945466330','GR7852210213','pakritia')";
	        stmt.executeUpdate(insertIndiv);
	        
	        insertIndiv = "INSERT IGNORE INTO stuff(name, married, kids, kidsAge, stuffType, employType,date,dueDate,address,phone,bank_id,bankName)"
	        		+ " VALUES ('Sampson Ioannis', 'no', '0', '0', 'monimos', 'didaktikos','2022-10-10','2030-10-10','deilina','6947894330','GR123465789','peireos')";
	        stmt.executeUpdate(insertIndiv);
			
	        stmt.close();
	    }
	   
	   
	   public void createPayrollDataTable(Connection con) throws SQLException, ClassNotFoundException {

	      
	        Statement stmt = con.createStatement();

	        String query = "CREATE TABLE IF NOT EXISTS payroll_data "
	                + "(payrollDate_id INTEGER not NULL AUTO_INCREMENT, "
	                + "    stuff_id INTEGER not NULL unique, "
	                + "    payDate DATE not null ,"//imerominia pliromis
	                + "    payCheck VARCHAR(32) ,"//sunoliko pliromis
	                + " PRIMARY KEY (payrollDate_id))";
	        
	        stmt.execute(query);
	        
	        String insertPay= "INSERT IGNORE INTO payroll_data(stuff_id,payDate, payCheck)"
	        		+ " VALUES ('1', '2020-10-10', '2000')";
	        stmt.executeUpdate(insertPay);
	        
	        insertPay = "INSERT IGNORE INTO payroll_data(stuff_id,payDate, payCheck)"
	        		+ " VALUES ('2', '2020-10-11', '1500')";
	        stmt.executeUpdate(insertPay);
	        
	        insertPay = "INSERT IGNORE INTO payroll_data(stuff_id,payDate, payCheck)"
	        		+ " VALUES ('3', '2020-10-12', '1500')";
	        stmt.executeUpdate(insertPay);
	        
	        insertPay = "INSERT IGNORE INTO payroll_data(stuff_id,payDate, payCheck)"
	        		+ " VALUES ('4', '2020-10-13', '1500')";
	        stmt.executeUpdate(insertPay);
	        
	        insertPay = "INSERT IGNORE INTO payroll_data(stuff_id,payDate, payCheck)"
	        		+ " VALUES ('5', '2020-10-14', '3500')";
	        stmt.executeUpdate(insertPay);
	        
	        
	        stmt.close();
	    }
	   
	   public void createPayrollTable(Connection con) throws SQLException, ClassNotFoundException {
	       
	        Statement stmt = con.createStatement();

	        String query = "CREATE TABLE IF NOT EXISTS payroll "
	                +  "(payroll_id INTEGER not NULL AUTO_INCREMENT, "
	                + "    stuff_id INTEGER not NULL unique, "
	                + "    salary VARCHAR(30) not null ,"//misthos xwris epidoma
	                + "    allowance VARCHAR(200)  ,	"//epidoma
	                + " PRIMARY KEY ( payroll_id))";
	        stmt.execute(query);
	        
	        String insertAllo = "INSERT IGNORE INTO payroll(stuff_id,salary, allowance)"
	        		+ " VALUES ('1', '1500', '500')";
	        stmt.executeUpdate(insertAllo);
	        
	        insertAllo = "INSERT IGNORE INTO payroll(stuff_id,salary, allowance)"
	        		+ " VALUES ('2', '1200', '300')";
	        stmt.executeUpdate(insertAllo);
	        
	        insertAllo = "INSERT IGNORE INTO payroll(stuff_id,salary, allowance)"
	        		+ " VALUES ('3', '1000', '500')";
	        stmt.executeUpdate(insertAllo);
	        
	        insertAllo = "INSERT IGNORE INTO payroll(stuff_id,salary, allowance)"
	        		+ " VALUES ('4', '1000', '500')";
	        stmt.executeUpdate(insertAllo);
	        
	        insertAllo = "INSERT IGNORE INTO payroll(stuff_id,salary, allowance)"
	        		+ " VALUES ('5', '1000', '2500')";
	        stmt.executeUpdate(insertAllo);
	        
	        stmt.close();
	    }
	   
	   

	   
	    	 
	}