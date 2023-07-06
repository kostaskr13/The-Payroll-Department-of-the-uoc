package Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Change_symv extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Change_symv() {
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 774);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKids = new JLabel("\u03A0\u03B1\u03B9\u03B4\u03B9\u03B1:");//ayto edo not visible
		lblKids.setFont(new Font("Arial", Font.BOLD, 16));
		lblKids.setBounds(357, 453, 59, 48);
		contentPane.add(lblKids);
		lblKids.setVisible(false);
		
		JComboBox comboBox_3 = new JComboBox();//ayto edo not visible
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"}));
		comboBox_3.setBounds(416, 467, 59, 34);
		contentPane.add(comboBox_3);
		comboBox_3.setVisible(false);
		
		JLabel lblKidsAgeseg = new JLabel("\u0397\u03BB\u03B9\u03BA\u03B9\u03B5\u03C2 \u03A0\u03B1\u03B9\u03B4\u03B9\u03C9\u03BD(\u03C0.\u03C7 9,14,19,21):");//ayto edo not visible
		lblKidsAgeseg.setFont(new Font("Arial", Font.BOLD, 16));
		lblKidsAgeseg.setBounds(339, 499, 240, 48);
		contentPane.add(lblKidsAgeseg);
		lblKidsAgeseg.setVisible(false);
		
		textField_6 = new JTextField();//ayto edo not visible
		textField_6.setColumns(10);
		textField_6.setBounds(361, 544, 188, 34);
		contentPane.add(textField_6);
		textField_6.setVisible(false);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u03A0\u03B1\u03BD\u03C4\u03C1\u03B5\u03BC\u03B5\u03BD\u03BF\u03C2");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				{
					lblKids.setVisible(true);
					comboBox_3.setVisible(true);
					lblKidsAgeseg.setVisible(true);
					textField_6.setVisible(true);
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(12, 665, 188, 34);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblName = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1:");
		lblName.setFont(new Font("Arial", Font.BOLD, 16));
		lblName.setBounds(12, 23, 61, 48);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(71, 31, 172, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMaritalStatus = new JLabel("\u0397\u03BB\u03B9\u03BA\u03B9\u03B1:");
		lblMaritalStatus.setFont(new Font("Arial", Font.BOLD, 16));
		lblMaritalStatus.setBounds(12, 84, 59, 48);
		contentPane.add(lblMaritalStatus);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61"}));
		comboBox.setBounds(67, 92, 59, 34);
		contentPane.add(comboBox);
		
		JLabel lblKatprosopikoy = new JLabel("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03B9\u03B1 \u03C0\u03C1\u03C9\u03C3\u03BF\u03C0\u03B9\u03BA\u03BF\u03C5:");
		lblKatprosopikoy.setFont(new Font("Arial", Font.BOLD, 16));
		lblKatprosopikoy.setBounds(12, 135, 198, 48);
		contentPane.add(lblKatprosopikoy);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"dioikitikos", "didaktikos"}));
		comboBox_1.setBounds(206, 143, 120, 34);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2022", "2021", "2020", "2019", "2018", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970"}));
		comboBox_2.setBounds(182, 202, 90, 34);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("\\");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel.setBounds(273, 199, 18, 48);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_2_1.setBounds(284, 202, 41, 34);
		contentPane.add(comboBox_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("\\");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel_1.setBounds(326, 199, 18, 48);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2_1_1.setBounds(337, 202, 41, 34);
		contentPane.add(comboBox_2_1_1);
		
		JLabel lblHmeromhniaEnar = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03B9\u03B1 \u0395\u03BD\u03B1\u03C1\u03BE\u03B7\u03C2:");
		lblHmeromhniaEnar.setFont(new Font("Arial", Font.BOLD, 16));
		lblHmeromhniaEnar.setBounds(12, 192, 172, 48);
		contentPane.add(lblHmeromhniaEnar);
		
		JLabel lblDepartment = new JLabel("\u03A4\u03BC\u03B7\u03BC\u03B1:");
		lblDepartment.setFont(new Font("Arial", Font.BOLD, 16));
		lblDepartment.setBounds(13, 331, 59, 48);
		contentPane.add(lblDepartment);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(70, 340, 172, 34);
		contentPane.add(textField_1);
		
		JLabel lblAdress = new JLabel("\u0394\u03B9\u03B5\u03C5\u03B8\u03C5\u03BD\u03C3\u03B7:");
		lblAdress.setFont(new Font("Arial", Font.BOLD, 16));
		lblAdress.setBounds(12, 392, 90, 48);
		contentPane.add(lblAdress);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 401, 225, 34);
		contentPane.add(textField_2);
		
		JLabel lblPhoneNumber = new JLabel("\u03A4\u03B7\u03BB\u03B5\u03C6\u03C9\u03BD\u03BF:");
		lblPhoneNumber.setFont(new Font("Arial", Font.BOLD, 16));
		lblPhoneNumber.setBounds(10, 453, 90, 48);
		contentPane.add(lblPhoneNumber);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(97, 462, 188, 34);
		contentPane.add(textField_3);
		
		JLabel lblIban = new JLabel("IBAN:");
		lblIban.setFont(new Font("Arial", Font.BOLD, 16));
		lblIban.setBounds(12, 504, 50, 48);
		contentPane.add(lblIban);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(59, 513, 225, 34);
		contentPane.add(textField_4);
		
		JLabel lblBank = new JLabel("\u03A4\u03C1\u03B1\u03C0\u03B5\u03B6\u03B1:");
		lblBank.setFont(new Font("Arial", Font.BOLD, 16));
		lblBank.setBounds(12, 557, 73, 48);
		contentPane.add(lblBank);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(87, 565, 225, 34);
		contentPane.add(textField_5);
		
		JLabel lblMisthos = new JLabel("\u039C\u03B9\u03C3\u03B8\u03BF\u03C2:");
		lblMisthos.setFont(new Font("Arial", Font.BOLD, 16));
		lblMisthos.setBounds(12, 608, 61, 48);
		contentPane.add(lblMisthos);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(74, 617, 130, 34);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_2 = new JLabel("$");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(209, 617, 10, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEndDate = new JLabel("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03B9\u03B1 \u039B\u03B7\u03BE\u03B7\u03C2:");
		lblEndDate.setFont(new Font("Arial", Font.BOLD, 16));
		lblEndDate.setBounds(12, 253, 158, 48);
		contentPane.add(lblEndDate);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] {"2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970"}));
		comboBox_2_2.setBounds(162, 261, 90, 34);
		contentPane.add(comboBox_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("\\");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel_3.setBounds(252, 258, 18, 48);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_2_1_2 = new JComboBox();
		comboBox_2_1_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_2_1_2.setBounds(264, 261, 41, 34);
		contentPane.add(comboBox_2_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("\\");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel_1_1.setBounds(308, 258, 18, 48);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox comboBox_2_1_1_1 = new JComboBox();
		comboBox_2_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2_1_1_1.setBounds(321, 261, 41, 34);
		contentPane.add(comboBox_2_1_1_1);
		
		btnNewButton = new JButton("allagh sumvasis");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(255, 0, 51), 3, true));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		//btnNewButton.setIcon(new ImageIcon(Change_symv.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		btnNewButton.setForeground(new Color(0, 255, 255));
		btnNewButton.setBackground(new Color(255, 228, 196));
		btnNewButton.setBounds(332, 591, 259, 110);
		contentPane.add(btnNewButton);
	}

}
