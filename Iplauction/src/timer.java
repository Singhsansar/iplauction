
import javax.swing.*;
import java.text.*;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class timer extends JFrame {

	private JPanel contentPane;
	private JLabel lblTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timer frame = new timer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public timer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTime = new JLabel("11:39:00");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTime.setBounds(237, 188, 120, 50);
		contentPane.add(lblTime);
		
		JButton btnNewButton = new JButton("start");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Timer t = new Timer(1000, new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
					lblTime.setText(sdf.format(new java.util.Date()));
						
					}
				} );
				t.start();
			}
		});
		btnNewButton.setBounds(228, 248, 156, 37);
		contentPane.add(btnNewButton);
		
		
	}
	
}
