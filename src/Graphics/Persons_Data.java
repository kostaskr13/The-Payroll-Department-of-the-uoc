package Graphics;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import initialTables.initialTables;

import javax.swing.ImageIcon;

public class Persons_Data extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private  Connection con;
	String getName;
	String get_Data;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Persons_Data() {
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 148);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(56, 23, 256, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		  
	
		
		JLabel lblName = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1:");
		lblName.setFont(new Font("Arial", Font.BOLD, 16));
		lblName.setBounds(0, 26, 57, 41);
		contentPane.add(lblName);
		
		
		
		JButton btnNewButton = new JButton("\u0394\u0395\u0399\u039E\u0395");
	//	btnNewButton.setIcon(new ImageIcon(Persons_Data.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnNewButton.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(315, 23, 210, 49);
		contentPane.add(btnNewButton);
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
					 getName=textField.getText();
					try {
						 get_Data=PersonData(getName) ;
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				    JOptionPane.showMessageDialog(f,get_Data,"Stoixeia Ypaliloy",JOptionPane.INFORMATION_MESSAGE);  
			}
		});
		
		
	}
	
	
	public String  PersonData(String s) throws ClassNotFoundException, SQLException {
		this.con = initialTables.getConnection();
	    String monimos;
	   
       ResultSet rs;
       ResultSet rs1;
     
       Statement stmt;
     
       stmt = con.createStatement();     // Create a Statement object      
     
    	 rs = stmt.executeQuery("SELECT * FROM stuff F where name='"+getName+"' ");  
      
    	 System.out.println(getName);
  
         
         String[] pluss = new String[50];
         StringBuffer results = new StringBuffer();
         String separator = ", ";
         String separator1 = "\n";
         int k=1;
         String separator2 = "stuff_id";
         
         while (rs.next()) {  
        	 
        
        	 
         	for (int i=1;i<14;i++) {
         		
         		if(i==1) {
                	 results.append("stuff_id");
                	}
         		else if(i==2) {
         
               	 results.append("name");
         		}
         		else if(i==3) {
               	 results.append("married");
         		}
         		else if(i==4) {
         			
               	 results.append("kids");
         		}
         		else if(i==5) {
               	 results.append("kidsAge");
         			
         		}else if(i==6) {
               	 results.append("stuffType");
         			
         		}
         		else if(i==7) {
               	 results.append("employType");
         		}
         		else if(i==8) {
               	 results.append("Start date");
         			
         		}
         		else if(i==9) {
               	 results.append("dueDate");
         			
         		}else if(i==10) {
               	 results.append("address");
         			
         		}
         		else if(i==11) {
               	 results.append("phone");
         		}
         		else if(i==12) {
               	 results.append("bank_id");
         		}
         		else if(i==13) {
               	 results.append("bank_Name");
         		}
         	
             pluss[i] = rs.getString(i);
            
             results.append(" : ").append(pluss[i]);
         	 results.append(separator1);


         	}
         	  results.append(separator1);
         	  
          k++;
          int i=1;
                                           // Print the column value
         }
         System.out.println(results);
         
         rs.close(); 
         return results.toString();
		
		
	}
		
}
