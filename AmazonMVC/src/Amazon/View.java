package Amazon;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

import Amazon.Components.*;

public class View extends JPanel {
	//Components
	Buttons myButtons = new Buttons();
	ProductPanels myPanels = new ProductPanels();
	private JButton Logo = myButtons.AmazonLogo();
	private JButton TodaysDeals = myButtons.TodaysDeals();
	private JButton FindaGift = myButtons.FindaGift();
	private JButton CustomerService = myButtons.CustomerService();
	private JButton Registry = myButtons.Registry();
	private JButton NewReleases = myButtons.NewReleases();
	private JButton Books = myButtons.Books();
	private JButton BestSellers = myButtons.BestSellers();
	private JTextField SearchBar = new JTextField(70);
	private JButton SearchButton = new JButton();
	private JLabel SearchLabel = new JLabel("Search");
	private JPanel panel = new JPanel() {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(new Color(35, 47, 63));
			g.fillRect(0, 0, 1000, 120);
		}
	};
	private JPanel ProductPanel;
	private JScrollPane scrollPane;
	private Model m_model;
	private JFrame m_frame;

	View(Model model, JFrame frame) {
		m_model = model;
		m_frame = frame;
		//Search Button
		ImageIcon icon = new ImageIcon(View.class.getResource("/Amazon/icon/Search.png"));
		Image image = icon.getImage();
		Image smallicon = image.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(smallicon);
		SearchButton.setIcon(icon);
		SearchLabel.setForeground(Color.white);
		//SearchBar
		SearchBar.setMinimumSize(SearchBar.getPreferredSize());
		SearchBar.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()== KeyEvent.VK_ENTER) {
					SearchButton.doClick();
				}
			}
		});
		ProductPanel = myPanels.AllProducts();
		scrollPane = new JScrollPane(ProductPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(1000,880));
		panel.setPreferredSize(new Dimension(1000,1000));
		panel.add(Logo, BorderLayout.NORTH);
		panel.add(SearchLabel);
		panel.add(SearchBar, BorderLayout.NORTH);
		panel.add(SearchButton);
		panel.add(TodaysDeals);
		panel.add(BestSellers);
		panel.add(FindaGift);
		panel.add(CustomerService);
		panel.add(Registry);
		panel.add(NewReleases);
		panel.add(Books);
		panel.add(scrollPane, BorderLayout.SOUTH);

		m_frame.getContentPane().setPreferredSize(new Dimension(1000,1000));
		m_frame.setVisible(true);
		m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m_frame.getContentPane().add(panel);
		m_frame.pack();
	}

	void addLogoListener(ActionListener logoListener) {
		Logo.addActionListener(logoListener);
	}

	void addSearchButtonListener(ActionListener searchListener) {
		SearchButton.addActionListener(searchListener);
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
	
	void addCustomerServiceListener(ActionListener csListener) {
		CustomerService.addActionListener(csListener);
	}

	void addRegistryListener(ActionListener regListener) {
		Registry.addActionListener(regListener);
	}

	void addNewReleasesListener(ActionListener nrListener) {
		NewReleases.addActionListener(nrListener);
	}

	void addBooksListener(ActionListener bListener) {
		Books.addActionListener(bListener);
	}
}
