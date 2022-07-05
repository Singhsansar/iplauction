package screens;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Auctionhandeling.Getplayers;
import Auctionhandeling.Teamplayerhandeling;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TeamHome extends JFrame {

	private static JPanel contentPane;
	static String ID=" ";

	static TeamHome frame = new TeamHome();
	public static void Team_home() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
		frame.setVisible(true);
		frame.setTitle("TeamHomepage");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 924, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// JButton btnNewButton = new JButton("Avaliable Balance");
		// btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		// btnNewButton.setBackground(Color.ORANGE);
		// btnNewButton.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent e) 
		// 	{

			
		// 	}
		// });
		// btnNewButton.setBounds(106, 401, 220, 38);
		// contentPane.add(btnNewButton);
		
		JButton btnEnterAuction = new JButton("Enter Auction");
		btnEnterAuction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				AuctionDisplayteam.set_entering_team_id(ID);
				Getplayers.get_same_team("abc");
			}
		});
		btnEnterAuction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnterAuction.setBackground(Color.ORANGE);
		btnEnterAuction.setBounds(367, 401, 220, 38);
		contentPane.add(btnEnterAuction);
		
		JButton btnMyplayers = new JButton("My_Players");
		btnMyplayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dispose_frame();
				Teamplayerhandeling.getplayer();
			}
		});
		btnMyplayers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMyplayers.setBackground(Color.ORANGE);
		btnMyplayers.setBounds(626, 401, 220, 38);
		contentPane.add(btnMyplayers);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome"+ ID +", Best of luck");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(310, 242, 317, 55);
		contentPane.add(lblNewLabel_1);

		JButton btnLogout = new JButton("Logout");
					btnLogout.setForeground(Color.WHITE);
					btnLogout.setFont(new Font("Tahoma", Font.BOLD, 20));
					btnLogout.setBackground(Color.ORANGE);
					btnLogout.setBounds(106, 401, 220, 38);
					contentPane.add(btnLogout);
					btnLogout.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							playerlist.dispose_frame();
							Registerteam.dispose_frame();
							Adminhomepage.dispose_frame();
							popup.popup_close();
							dispose_frame();
							Biddingpopup.dispose_frame();
							AuctionDisplayteam.dispose_frame();
							Signup.dispose_frame();
							Login.login();
						
						}
					});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TeamHome.class.getResource("/assests/admin.png")));
		lblNewLabel.setBounds(10, 10, 900, 536);
		contentPane.add(lblNewLabel);
				
			}
		});
	}

	public static void dispose_frame()
	{
		frame.dispose();
	}
	public static void set_teamid( String id)
	{
		ID=id;
		
	}
	
}
