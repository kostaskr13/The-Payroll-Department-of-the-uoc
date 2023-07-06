package Graphics;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

import Graphics.recruitment;
import initialTables.initialTables;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class first_window extends initialTables{

	private JFrame frame;

	private  Connection con;
	
	String [] array=new String[3];
	String katast=new String();
	String synolMistou=new String();
	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public first_window() throws ClassNotFoundException, SQLException {
		this.con=con; 
		initialize();
		recruitment frame = new recruitment();
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	
	private void initialize() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(224, 255, 255));
		 
	//	JLabel background=new JLabel(new ImageIcon(this.getClass().getResource("/personal.png")));
		//frame.add(background);
		frame.setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("/backround.jpeg"))));
		frame.getContentPane().setLayout(new FlowLayout()); 
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JButton btnNewButton = new JButton("\u03A0\u03C1\u03BF\u03C3\u03BB\u03B7\u03C8\u03B7");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 recruitment obj=new recruitment();
			 obj.setVisible(true);
			}
		});
		btnNewButton.setBounds(39, 159, 257, 70);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JButton btnNeaSymbash = new JButton("\u039D\u03B5\u03B1 \u03A3\u03C5\u03BC\u03B2\u03B1\u03C3\u03B7");
		btnNeaSymbash.setBorder(new LineBorder(new Color(255, 255, 0), 3, true));
		btnNeaSymbash.setBackground(SystemColor.textHighlight);
		btnNeaSymbash.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNeaSymbash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				symbash obj2=new symbash();
				obj2.setVisible(true);
			}
		});
		btnNeaSymbash.setBounds(39, 257, 257, 70);
		frame.getContentPane().add(btnNeaSymbash);
		
		JButton btnAllaghStoixeion = new JButton("\u0391\u03BB\u03BB\u03B1\u03B3\u03B7 \u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03B9\u03C9\u03BD \u03A0\u03C1\u03BF\u03C3\u03C9\u03C0\u03B9\u03BA\u03BF\u03C5");
		btnAllaghStoixeion.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnAllaghStoixeion.setBackground(SystemColor.textHighlight);
		btnAllaghStoixeion.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAllaghStoixeion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Change_data obj6=new Change_data();
				obj6.setVisible(true);
			}
		});
		btnAllaghStoixeion.setBounds(39, 449, 214, 57);
		frame.getContentPane().add(btnAllaghStoixeion);
		
		JButton btnMetabolhMisuodosias = new JButton("\u039C\u03B5\u03C4\u03B1\u03B2\u03BF\u03BB\u03B7 \u039C\u03B9\u03C3\u03B8\u03BF\u03B4\u03BF\u03C3\u03B9\u03B1\u03C2");
		btnMetabolhMisuodosias.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnMetabolhMisuodosias.setBackground(SystemColor.textHighlight);
		btnMetabolhMisuodosias.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMetabolhMisuodosias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Change_salary obj5=new Change_salary();
				obj5.setVisible(true);
			}
		});
		btnMetabolhMisuodosias.setBounds(39, 540, 214, 57);
		frame.getContentPane().add(btnMetabolhMisuodosias);
		
		JButton btnApolyshsyntaksh = new JButton("\u0391\u03C0\u03BF\u03BB\u03C5\u03C3\u03B7/\u03A3\u03C5\u03BD\u03C4\u03B1\u03BE\u03B7");
		btnApolyshsyntaksh.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnApolyshsyntaksh.setBackground(SystemColor.textHighlight);
		btnApolyshsyntaksh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnApolyshsyntaksh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fire_person obj5=new Fire_person();
				obj5.setVisible(true);
			}
		});
		btnApolyshsyntaksh.setBounds(39, 640, 214, 57);
		frame.getContentPane().add(btnApolyshsyntaksh);
		
		JButton btnNewButton_1 = new JButton("\u039A\u03B1\u03C4\u03B1\u03C3\u03C4\u03B1\u03C3\u03B7 \u039C\u03B9\u03C3\u03B8\u03BF\u03B4\u03BF\u03C3\u03B9\u03B1\u03C2");
		btnNewButton_1.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(632, 172, 466, 57);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("\u03A3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03BF \u03A5\u03C8\u03BF\u03C2 \u039C\u03B9\u03C3\u03B8\u03BF\u03C5");
		btnNewButton_1_2.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1_2.setBackground(SystemColor.textHighlight);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_2.setBounds(632, 330, 466, 57);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1 = new JButton("\u039C\u03B5\u03B3\u03B9\u03C3\u03C4\u03BF\u03C2 \u039C\u03B9\u03C3\u03B8\u03BF\u03C2");
		btnNewButton_1_1.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(632, 242, 142, 57);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("\u039C\u03B5\u03C3\u03BF\u03C2 \u039C\u03B9\u03C3\u03B8\u03BF\u03C2");
		btnNewButton_1_1_1.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1_1_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_1.setBounds(794, 242, 142, 57);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("\u0395\u03BB\u03B1\u03C7\u03B9\u03C3\u03C4\u03BF\u03C2 \u039C\u03B9\u03C3\u03B8\u03BF\u03C2");
		btnNewButton_1_1_2.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1_1_2.setBackground(SystemColor.textHighlight);
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_2.setBounds(957, 242, 142, 57);
		frame.getContentPane().add(btnNewButton_1_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"m.dioikitiko", "m.didaktiko","s.dioikitiko", "s.didaktiko"}));
		comboBox.setBounds(752, 72, 177, 38);
		frame.getContentPane().add(comboBox);
		
		
		
		
		
		
		
		JButton btnNewButton_2 = new JButton("\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03B9\u03B1 \u03A5\u03C0\u03B1\u03BB\u03BB\u03B7\u03BB\u03BF\u03C5");
		btnNewButton_2.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_2.setBackground(SystemColor.textHighlight);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persons_Data obj4=new Persons_Data();
				obj4.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(645, 628, 452, 70);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\u039C\u03B5\u03C3\u03B7 \u0391\u03C5\u03BE\u03B7\u03C3\u03B7 \u039C\u03B9\u03C3\u03B8\u03C9\u03BD \u03BA \u0395\u03C0\u03B9\u03B4\u03C9\u03BC\u03B1\u03C4\u03C9\u03BD");
		btnNewButton_2_1.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_2_1.setBackground(SystemColor.textHighlight);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avarage_salary obj3=new Avarage_salary();
				obj3.setVisible(true);
				
			}
		});
		btnNewButton_2_1.setBounds(645, 529, 452, 70);
		frame.getContentPane().add(btnNewButton_2_1);
		frame.setBounds(100, 100, 1144, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JButton btnNewButton_1_2_1 = new JButton("\u039A\u03B1\u03C4\u03B1\u03B2\u03BF\u03BB\u03B7 \u03BC\u03B9\u03C3\u03B8\u03BF\u03B4\u03BF\u03C3\u03B9\u03B1\u03C2!!!");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2_1.setForeground(Color.RED);
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2_1.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1_2_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1_2_1.setBounds(632, 422, 466, 57);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		
		JLabel lblFoto = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/UoC_logo.png")).getImage();
		lblFoto.setIcon(new ImageIcon(img));
		lblFoto.setBounds(39, 4, 124, 124);
		frame.getContentPane().add(lblFoto);
		
		JLabel lblFoto2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/settings.png")).getImage();
		lblFoto2.setIcon(new ImageIcon(img2));
		lblFoto2.setBounds(39, 340, 90, 90);
		frame.getContentPane().add(lblFoto2);
		
		JLabel lblFoto3 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/personal.png")).getImage();
		lblFoto3.setIcon(new ImageIcon(img3));
		lblFoto3.setBounds(645, 41, 95, 95);
		frame.getContentPane().add(lblFoto3);
		
		String depa= department1(comboBox);
		 array=minMaxAvg("m.dioikitiko" );
		 array[0]=minMaxAvg("m.dioikitiko" )[0];
		 array[1]=minMaxAvg("m.dioikitiko" )[1];
		 array[2]=minMaxAvg("m.dioikitiko" )[2];
		 katast=katastasi("m.dioikitiko");
		 synolMistou=sunolikosYpsosMisthou("m.dioikitiko");
		 comboBox.addItemListener(new ItemListener() {
           public void itemStateChanged(ItemEvent event) {
               if (event.getStateChange() == ItemEvent.SELECTED) {
                   String selected = (String) event.getItem();
                   try {
					 array=minMaxAvg(selected );
					 array[0]=minMaxAvg(selected )[0];
					 array[1]=minMaxAvg(selected )[1];
					 array[2]=minMaxAvg(selected )[2]; 
					 katast=katastasi(selected);
					 synolMistou=sunolikosYpsosMisthou(selected);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                   
               }
           }
       });
		
		
	   
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
				    JOptionPane.showMessageDialog(f,katast,"katastash misuodosias",JOptionPane.INFORMATION_MESSAGE);  
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(645, 628, 452, 70);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_2_1.setBounds(645, 529, 452, 70);
		frame.getContentPane().add(btnNewButton_2_1);
		frame.setBounds(100, 100, 1164, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
				    JOptionPane.showMessageDialog(f,synolMistou,"Synoliko ipsos misuoy",JOptionPane.INFORMATION_MESSAGE);  
			}
		});
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
				    JOptionPane.showMessageDialog(f,String.valueOf(array[0]),"Max Salary",JOptionPane.INFORMATION_MESSAGE);  
			}
		});
		
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
				    JOptionPane.showMessageDialog(f,String.valueOf(array[2]),"Avarage Salary",JOptionPane.INFORMATION_MESSAGE);  
			}
		});
		
		
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
				    JOptionPane.showMessageDialog(f,String.valueOf(array[1]),"Min Salary",JOptionPane.INFORMATION_MESSAGE);  
			}
		});
	}
	public String department1(JComboBox comboBox) {
		
		String department=comboBox.getSelectedItem().toString();
		return department;
	}
	public String[] minMaxAvg(String s) throws ClassNotFoundException, SQLException {
		this.con = getConnection();
	    String monimos;
	   
       ResultSet rs;
       ResultSet rs1;
     
       Statement stmt;
     
       stmt = con.createStatement();     // Create a Statement object      
       if(s=="m.dioikitiko") {
       	 rs = stmt.executeQuery("SELECT P.salary FROM payroll P,stuff F where F.stuffType='monimos' and employType='dioikitikos' and F.stuff_id=P.stuff_id  ");  
       }
       else if(s=="m.didaktiko") {
       	rs = stmt.executeQuery("SELECT P.salary FROM payroll P,stuff F where F.stuffType='monimos' and employType='didaktikos' and F.stuff_id=P.stuff_id  "); 
       }
       else if(s=="s.dioikitiko") {
       	rs = stmt.executeQuery("SELECT P.salary FROM payroll P,stuff F where F.stuffType='symvasiouxos' and employType='dioikitikos' and F.stuff_id=P.stuff_id  "); 
       }
       else  {
       	rs = stmt.executeQuery("SELECT P.salary FROM payroll P,stuff F where F.stuffType='symvasiouxos' and employType='didaktikos' and F.stuff_id=P.stuff_id  "); 
       }
      
       int i=0;
       int[] theNumbers = new int[50];
       while (rs.next()) {               // Position the cursor                 3 
       monimos = rs.getString(1);             // Retrieve only the first column value
       int foo = Integer.parseInt(monimos);
        
        theNumbers[i]=foo;
        		i++;
                                         // Print the column value
       }
       String [] arr=new String[3];
       int sum=0;
       int min=theNumbers[0];
       int max=theNumbers[0];
       
       for (int k=0;k<i;k++) {
       	sum=sum+theNumbers[k];
       	if(theNumbers[k]<min){
               min=theNumbers[k];
               
             }else if(theNumbers[k]>max) {
           	  max=theNumbers[k];
           	  
             }
       }
       int mesos_oros=(sum/i);
       String smax=Integer.toString(max);
       String smin=Integer.toString(min);
       String avg=Integer.toString(mesos_oros);
      
       arr[0]=smax;
       arr[1]=smin;
       arr[2]=avg;
       
       
       
       System.out.println(mesos_oros);
       
       rs.close(); 
       return arr;
		
		
	}
	
	public String  katastasi(String s) throws ClassNotFoundException, SQLException {
		this.con = getConnection();
	    String monimos;
	   
       ResultSet rs;
       ResultSet rs1;
     
       Statement stmt;
     
       stmt = con.createStatement();     // Create a Statement object      
       if(s=="m.dioikitiko") {
       	 rs = stmt.executeQuery("SELECT F.name ,F.bankName, D.payDate, D.payCheck FROM payroll_data D,stuff F where F.stuffType='monimos' and F.employType='dioikitikos' and F.stuff_id=D.stuff_id ");  
      
       
       }
       else if(s=="m.didaktiko") {
      	 rs = stmt.executeQuery("SELECT F.name ,F.bankName, D.payDate, D.payCheck FROM payroll_data D,stuff F where F.stuffType='monimos' and F.employType='didaktikos' and F.stuff_id=D.stuff_id ");  
       }
       else if(s=="s.dioikitiko") {
      	 rs = stmt.executeQuery("SELECT F.name ,F.bankName, D.payDate, D.payCheck FROM payroll_data D,stuff F where F.stuffType='symvasiouxos' and F.employType='dioikitikos' and F.stuff_id=D.stuff_id ");  
       }
       else  {
      	 rs = stmt.executeQuery("SELECT F.name ,F.bankName, D.payDate, D.payCheck FROM payroll_data D,stuff F where F.stuffType='symvasiouxos' and F.employType='didaktikos' and F.stuff_id=D.stuff_id ");  
       }
      
       
       String[] pluss = new String[50];
       StringBuffer results = new StringBuffer();
       String separator = ", ";
       String separator1 = "\n";
       int k=1;
       while (rs.next()) {  
       	 results.append(k).append(". ");// Position the cursor        
       	for (int i=1;i<5;i++) {
           pluss[i] = rs.getString(i);
          
           results.append(pluss[i]).append(separator);

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
	
	
	
	
	public String  sunolikosYpsosMisthou(String s) throws ClassNotFoundException, SQLException {
		this.con = getConnection();
	    String monimos;
	   
       ResultSet rs;
       ResultSet rs1;
     
       Statement stmt;
     
       stmt = con.createStatement();     // Create a Statement object      
       if(s=="m.dioikitiko") {
       	 rs = stmt.executeQuery("SELECT  D.payCheck FROM payroll_data D,stuff F where F.stuffType='monimos' and F.employType='dioikitikos' and F.stuff_id=D.stuff_id ");  
      
       
       }
       else if(s=="m.didaktiko") {
      	 rs = stmt.executeQuery("SELECT  D.payCheck FROM payroll_data D,stuff F where F.stuffType='monimos' and F.employType='didaktikos' and F.stuff_id=D.stuff_id ");  
       }
       else if(s=="s.dioikitiko") {
      	 rs = stmt.executeQuery("SELECT  D.payCheck FROM payroll_data D,stuff F where F.stuffType='symvasiouxos' and F.employType='dioikitikos' and F.stuff_id=D.stuff_id ");  
       }
       else  {
      	 rs = stmt.executeQuery("SELECT  D.payCheck FROM payroll_data D,stuff F where F.stuffType='symvasiouxos' and F.employType='didaktikos' and F.stuff_id=D.stuff_id ");  
       }
      
       
       int i=0;
       int[] theNumbers = new int[100];
       while (rs.next()) {               // Position the cursor                 3 
       monimos = rs.getString(1);             // Retrieve only the first column value
       int foo = Integer.parseInt(monimos);
        
        theNumbers[i]=foo;
        		i++;
                                         // Print the column value
       }
       int sum=0;
       for (int k=0;k<i;k++) {
       	sum=sum+theNumbers[k];
       	
       }
     
       String synMisthou=Integer.toString(sum);
       System.out.println(synMisthou);
       
       rs.close(); 
       return synMisthou;
		
		
	}
		
	}

