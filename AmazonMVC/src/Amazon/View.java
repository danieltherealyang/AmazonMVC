package Amazon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {
	//Components
	private JButton Logo = new JButton();
	private JButton TodaysDeals = new JButton("Today's Deals");
	private JButton FindaGift = new JButton("Find a Gift");
	private JButton CustomerService = new JButton("Customer Service");
	private JButton Registry = new JButton("Registry");
	private JButton NewReleases = new JButton("New Releases");
	private JButton Books = new JButton("Books");
	private JButton BestSellers = new JButton("Best Seller");
	private JTextField SearchBar = new JTextField(60);
	private JButton Search = new JButton();
	private JLabel SearchLabel = new JLabel("Search");
	
	private Model m_model;
	
	View(Model model) {
		m_model = model;
		
		//Search Button
		ImageIcon icon = new ImageIcon(View.class.getResource("/Amazon/icon/Search.png"));
		Image image = icon.getImage();
		Image smallicon = image.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(smallicon);
		Search.setIcon(icon);
		
		JPanel panel = new JPanel();
		panel.setSize(1000,1000);
		panel.add(Logo, BorderLayout.NORTH);
		panel.add(SearchLabel);
		panel.add(SearchBar, BorderLayout.NORTH);
		panel.add(Search);
		panel.add(TodaysDeals);
		panel.add(BestSellers);
		panel.add(FindaGift);
		panel.add(CustomerService);
		panel.add(Registry);
		panel.add(NewReleases);
		panel.add(Books);
		this.setContentPane(panel);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(new Color(35, 47, 63));
		g.fillRect(0, 0, 1000, 120);
	}
	
	void addLogoListener(ActionListener logoListener) {
		Logo.addActionListener(logoListener);
	}
	
	void addTodaysDealsListener(ActionListener tdListener) {
		TodaysDeals.addActionListener(tdListener);
	}
	
	void addBestSellersListener(ActionListener bsListener) {
		BestSellers.addActionListener(bsListener);
	}
	
	void addFindaGiftListener(ActionListener fgListener) {
		FindaGift.addActionListener(fgListener);
	}
	
	void addCustomerServiceListener (ActionListener csListener) {
		CustomerService.addActionListener(csListener);
	}
}
