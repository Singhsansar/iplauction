package screens;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Auctionhandeling.Getplayers;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.FlowLayout;

public class AuctionDisplay extends JFrame {
	static JFrame jframe_timer = new JFrame();

	private static JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void enter_auction(ArrayList<String> arr) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				AuctionDisplay frame = new AuctionDisplay();
		frame.setVisible(true);
		frame.setTitle("Auction Screen ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 782, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Next Player");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				jframe_timer.dispose();
				frame.dispose();
				Getplayers.get_next();
			}
		});
		btnNewButton.setBounds(630, 507, 115, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(297, 263, 81, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAge.setBounds(295, 295, 155, 42);
		contentPane.add(lblAge);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setForeground(Color.WHITE);
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCountry.setBounds(297, 329, 97, 42);
		contentPane.add(lblCountry);
		
		JLabel lblSpecializatin = new JLabel("Specializatin:");
		lblSpecializatin.setForeground(Color.WHITE);
		lblSpecializatin.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSpecializatin.setBounds(33, 353, 155, 42);
		contentPane.add(lblSpecializatin);
		
		JLabel lblBatting = new JLabel("Batting:");
		lblBatting.setForeground(Color.WHITE);
		lblBatting.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBatting.setBounds(33, 382, 155, 42);
		contentPane.add(lblBatting);
		
		JLabel lblBownling = new JLabel("Bowling:");
		lblBownling.setForeground(Color.WHITE);
		lblBownling.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBownling.setBounds(33, 421, 155, 42);
		contentPane.add(lblBownling);
		
		JLabel lblCua = new JLabel("Matches played:");
		lblCua.setForeground(Color.WHITE);
		lblCua.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua.setBounds(515, 382, 155, 42);
		contentPane.add(lblCua);
		
		JLabel lblBaseprice = new JLabel("Baseprice:");
		lblBaseprice.setForeground(Color.WHITE);
		lblBaseprice.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBaseprice.setBounds(515, 421, 155, 42);
		contentPane.add(lblBaseprice);
		
		JLabel lblCua_1 = new JLabel("C/U/A:");
		lblCua_1.setForeground(Color.WHITE);
		lblCua_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_1.setBounds(515, 353, 155, 42);
		contentPane.add(lblCua_1);
		
		JLabel lblNewLabel_1 = new JLabel(arr.get(0).toString());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(370, 271, 242, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCua_2 = new JLabel(arr.get(1).toString());
		lblCua_2.setForeground(Color.WHITE);
		lblCua_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2.setBounds(370, 295, 155, 42);
		contentPane.add(lblCua_2);
		
		JLabel lblCua_2_1 = new JLabel(arr.get(2).toString());
		lblCua_2_1.setForeground(Color.WHITE);
		lblCua_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1.setBounds(380, 329, 155, 42);
		contentPane.add(lblCua_2_1);
		
		JLabel lblCua_2_1_1 = new JLabel(arr.get(3).toString());
		lblCua_2_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1.setBounds(154, 353, 155, 42);
		contentPane.add(lblCua_2_1_1);
		
		JLabel lblCua_2_1_1_1 = new JLabel(arr.get(4).toString());
		lblCua_2_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1.setBounds(154, 382, 155, 42);
		contentPane.add(lblCua_2_1_1_1);
		
		JLabel lblCua_2_1_1_1_1 = new JLabel(arr.get(5).toString());
		lblCua_2_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1.setBounds(135, 421, 280, 42);
		contentPane.add(lblCua_2_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1 = new JLabel(arr.get(8).toString());
		lblCua_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1.setBounds(667, 382, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1_1 = new JLabel(arr.get(7).toString());
		lblCua_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1_1.setBounds(641, 421, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1_1);
		
		JLabel lblCua_2_1_1_1_1_1_1_1 = new JLabel(arr.get(6).toString());
		lblCua_2_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblCua_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCua_2_1_1_1_1_1_1_1.setBounds(590, 353, 155, 42);
		contentPane.add(lblCua_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AuctionDisplay.class.getResource("/assests/images.png")));
		lblNewLabel_2.setBounds(10, 10, 758, 545);
		contentPane.add(lblNewLabel_2);
		count_down();
	

		//Getplayers.get_next();
			}
			
		});
	}
	public static void count_down()
	    {

	        
	        JLabel jLabel = new JLabel();
	        jframe_timer.setLayout(new FlowLayout());
	        jframe_timer.setBounds(500, 300, 400, 100);
	        jframe_timer.add(jLabel);
	        jframe_timer.setVisible(true);
	        Timer timer = new Timer();
	        timer.scheduleAtFixedRate(new TimerTask() {
	            int i = 30;
	            public void run() {
	                jLabel.setText("Time left: " + i);
	                //jLabel.setForeground(Color.WHITE);
	        		jLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
	        		jLabel.setBounds(515, 47, 132, 26);
	                i--;
	                if (i < 0) {
	                    timer.cancel();
	                    jLabel.setText("Time Over");
	                    try {
	                        // Delay for 1 seonds
	                        Thread.sleep(3000);   
	                      }
	                      catch (InterruptedException ex)
	                      {
	                          ex.printStackTrace();
	                      }
	                    jLabel.setText("Player Reamined unsold");
	                    try {
	                        // Delay for 1 seonds
	                        Thread.sleep(2000);   
	                      }
	                      catch (InterruptedException ex)
	                      {
	                          ex.printStackTrace();
	                      }
	                    jframe_timer.dispose();
	                }
	            }
	        }, 0, 1000);
			
	    }
	
	 
	
}