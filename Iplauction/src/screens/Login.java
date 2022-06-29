package screens;
import databasehandling.CheckCredentials;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Auctionhandeling.Getplayers;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private static JPanel contentPane;
	private static JTextField textField;
	private static JPasswordField passwordField;
	public static void main(String[] args) {
		//login();
		//AuctionDisplay.enter_auction();
		Getplayers.getplayer();
	}
	public static void login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Login frame = new Login();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setBounds(100, 100, 879, 606);
				contentPane = new JPanel();
				contentPane.setBackground(Color.LIGHT_GRAY);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame.setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("Email:");
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel.setBounds(261, 306, 161, 48);
				contentPane.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Password:");
				lblNewLabel_1.setForeground(Color.WHITE);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				lblNewLabel_1.setBounds(261, 364, 109, 33);
				contentPane.add(lblNewLabel_1);
				
				textField = new JTextField();
				textField.setBounds(376, 315, 303, 40);
				contentPane.add(textField);
				textField.setColumns(10);
				
				passwordField = new JPasswordField(20);
				passwordField.setBounds(376, 364, 303, 40);
				contentPane.add(passwordField);
				
				JButton btnNewButton = new JButton("Login");
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						String email = textField.getText();
						String password = new String(passwordField.getPassword());
						//frame.dispose();
						CheckCredentials.validate(email, password);	
					}
				});
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
				btnNewButton.setBounds(443, 432, 161, 33);
				contentPane.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("Sign up");
				btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
				btnNewButton_1.setForeground(Color.BLACK);
				btnNewButton_1.setBackground(Color.GREEN);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						frame.dispose();
						Signup.Register(); //redirect to the Signup page
																	 
					}
				});
				btnNewButton_1.setBounds(472, 475, 109, 33);
				contentPane.add(btnNewButton_1);
				
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/assests/images.png")));
				lblNewLabel_2.setBounds(0, 0, 884, 569);
				contentPane.add(lblNewLabel_2);
					
			}
		});
	}

	
}

