package Graphics;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class Avarage_salary extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Avarage_salary() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 157);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setFont(new Font("Arial", Font.BOLD, 22));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrom = new JLabel("\u0391\u03A0\u039F:");
		lblFrom.setFont(new Font("Arial", Font.BOLD, 26));
		lblFrom.setBounds(0, 0, 83, 46);
		contentPane.add(lblFrom);
		
		JLabel lblTo = new JLabel("\u039C\u0395\u03A7\u03A1\u0399:");
		lblTo.setFont(new Font("Arial", Font.BOLD, 26));
		lblTo.setBounds(0, 48, 94, 46);
		contentPane.add(lblTo);
		
		JButton btnNewButton = new JButton("\u0394\u0395\u0399\u039E\u0395");
	//	btnNewButton.setIcon(new ImageIcon(Avarage_salary.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setAlignmentY(0.0f);
		btnNewButton.setBounds(291, 10, 245, 94);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990"}));
		comboBox_2.setBounds(77, 10, 90, 34);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel = new JLabel("\\");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel.setBounds(167, 7, 18, 48);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_2_1.setBounds(197, 58, 41, 34);
		contentPane.add(comboBox_2_1);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] {"2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990"}));
		comboBox_2_2.setBounds(95, 58, 90, 34);
		contentPane.add(comboBox_2_2);
		
		JLabel lblNewLabel_1 = new JLabel("\\");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel_1.setBounds(184, 55, 18, 48);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_2_1_1.setBounds(179, 10, 41, 34);
		contentPane.add(comboBox_2_1_1);
	}
}
