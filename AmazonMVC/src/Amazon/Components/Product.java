package Amazon.Components;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Product {
	
	JPanel productDescription = null;
	
	int identifier;
	String title;
	String description;
	String imagePath;
	double price;
	double tariff;
	ArrayList<String> tags;
	
	public Product(int id, String title_, String desc, String imgPath, double price_, double tariff_, ArrayList<String> tags_) {
		identifier=id;
		title = title_;
		description=desc;
		imagePath=imgPath;
		price = price_;
		tariff = tariff_;
		tags = tags_;
	}
	
	public JPanel general(ActionListener Back) {
    	productDescription = new JPanel();
    	productDescription.setSize(1000, 880);
    	
    	JLabel Image = new JLabel();
    	ImageIcon imgPic = new ImageIcon(Products.class.getResource(imagePath));
        Image image = imgPic.getImage();
        Image scaled = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        imgPic = new ImageIcon(scaled);
        Image.setIcon(imgPic);
       
        JLabel ProductName = new JLabel(title);
        
        JLabel Tariff = new JLabel("Tariff: "+tariff+"%");
        JLabel Price = new JLabel("Price: "+tariff+"%");
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(Back);
        
        //generalTyler1ShirtDescription.setLayout(new BoxLayout(Tyler1ShirtDescription,BoxLayout.Y_AXIS));
        productDescription.add(ProductName);
        productDescription.add(Image);
        //Tyler1ShirtDescription.add(ProductSize);
       
        productDescription.add(Tariff);
        productDescription.add(Price);
        productDescription.add(goBack);
        
        productDescription.setBorder(BorderFactory.createLineBorder(Color.black));
        return productDescription;
	}
	
	public JPanel getProduct(ActionListener ButtonListener) {
    	JPanel product = new JPanel();
    	product.setSize(300, 300);
    	JButton productButton = new JButton();
    	productButton.addActionListener(ButtonListener);
    	ImageIcon productIcon = new ImageIcon(Products.class.getResource(imagePath));
    	Image image = productIcon.getImage();
    	Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
    	productIcon = new ImageIcon(scaled);
    	
    	JLabel Description = new JLabel(description);
    	JLabel Price = new JLabel(Double.toString(price));
    	product.setLayout(new BoxLayout(product, BoxLayout.Y_AXIS));
    	product.add(productButton);
    	product.add(Description);
    	product.add(Price);
    	return product;
    }
}
