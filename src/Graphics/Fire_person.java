package Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fire_person extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Fire_person() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 178);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(56, 23, 279, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1:");
		lblName.setFont(new Font("Arial", Font.BOLD, 16));
		lblName.setBounds(0, 26, 57, 41);
		contentPane.add(lblName);
		
		JButton btnNewButton = new JButton("\u0391\u03A0\u039F\u039B\u03A5\u03A3\u0397\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	//	btnNewButton.setIcon(new ImageIcon(Fire_person.class.getResource("/com/sun/javafx/scene/control/skin/modena/dialog-warning.png")));
		btnNewButton.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(347, 22, 210, 49);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("\u03A3\u03A5\u039D\u03A4\u0391\u039E\u0399\u0394\u039F\u03A4\u0399\u03A3\u0397");
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 255, 0), 3, true));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_1.setBounds(347, 80, 210, 38);
		contentPane.add(btnNewButton_1);
	}

}
