package Graphics;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class Change_salary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Change_salary() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 644);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWages = new JLabel("\u039C\u03B9\u03C3\u03B8\u03BF\u03C2:");
		lblWages.setBorder(new LineBorder(new Color(0, 120, 215), 2));
		lblWages.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblWages.setBounds(12, 13, 104, 64);
		contentPane.add(lblWages);
		
		JLabel lblMonimosDikoitikos = new JLabel("\u039C\u03BF\u03BD\u03B9\u03BC\u03BF\u03C2 \u0394\u03B9\u03BF\u03B9\u03BA\u03B7\u03C4\u03B9\u03BA\u03BF\u03C2:");
		lblMonimosDikoitikos.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblMonimosDikoitikos.setBounds(12, 100, 196, 36);
		contentPane.add(lblMonimosDikoitikos);
		
		JLabel lblMonimosDidaktikos = new JLabel("\u039C\u03BF\u03BD\u03B9\u03BC\u03BF\u03C2 \u0394\u03B9\u03B4\u03B1\u03BA\u03C4\u03B9\u03BA\u03BF\u03C2:");
		lblMonimosDidaktikos.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblMonimosDidaktikos.setBounds(12, 149, 196, 36);
		contentPane.add(lblMonimosDidaktikos);
		
		JLabel lblSymvasioyxosDidaktikos = new JLabel("\u03A3\u03C5\u03BC\u03B2\u03B1\u03C3\u03B9\u03BF\u03C5\u03C7\u03BF\u03C2 \u0394\u03B9\u03BF\u03B9\u03BA\u03B7\u03C4\u03B9\u03BA\u03BF\u03C2:");
		lblSymvasioyxosDidaktikos.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblSymvasioyxosDidaktikos.setBounds(12, 198, 235, 36);
		contentPane.add(lblSymvasioyxosDidaktikos);
		
		JLabel lblSymvasioyxosDidaktikos_2 = new JLabel("\u03A3\u03C5\u03BC\u03B2\u03B1\u03C3\u03B9\u03BF\u03C5\u03C7\u03BF\u03C2 \u0394\u03B9\u03B4\u03B1\u03BA\u03C4\u03B9\u03BA\u03BF\u03C2:");
		lblSymvasioyxosDidaktikos_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblSymvasioyxosDidaktikos_2.setBounds(12, 247, 245, 36);
		contentPane.add(lblSymvasioyxosDidaktikos_2);
		
		JLabel lblAllowances = new JLabel("\u0395\u03C0\u03B9\u03B4\u03BF\u03BC\u03B1\u03C4\u03B1:");
		lblAllowances.setBorder(new LineBorder(SystemColor.textHighlight, 2));
		lblAllowances.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblAllowances.setBounds(12, 296, 160, 64);
		contentPane.add(lblAllowances);
		
		JLabel lblLibraryAllowance = new JLabel("\u0395\u03C0\u03B9\u03B4\u03BF\u03BC\u03B1\u03C4\u03B1 \u03B2\u03B9\u03BB\u03B2\u03B9\u03BF\u03B8\u03B7\u03BA\u03B7\u03C2:");
		lblLibraryAllowance.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblLibraryAllowance.setBounds(12, 362, 214, 36);
		contentPane.add(lblLibraryAllowance);
		
		JLabel lblResearchAllowance = new JLabel("\u0395\u03C0\u03B9\u03B4\u03BF\u03BC\u03B1 \u0395\u03C1\u03B5\u03C5\u03BD\u03B1\u03C2:");
		lblResearchAllowance.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblResearchAllowance.setBounds(12, 411, 160, 36);
		contentPane.add(lblResearchAllowance);
		
		textField = new JTextField();
		textField.setBounds(205, 99, 137, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 144, 137, 41);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(250, 198, 137, 41);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(255, 247, 137, 41);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(225, 362, 137, 41);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(173, 410, 137, 41);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("\u0391\u039B\u039B\u0391\u0393\u0397");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 153, 153), new Color(255, 153, 204), new Color(255, 153, 255), new Color(255, 204, 153)));
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setBounds(12, 459, 368, 124);
		contentPane.add(btnNewButton);
	}
}
