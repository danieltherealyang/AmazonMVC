package Amazon.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Products {
    public JPanel Tyler1Shirt(ActionListener buttonListener) {
        JPanel Tyler1Shirt = new JPanel();
        Tyler1Shirt.setSize(300, 300);
        JButton Shirt = new JButton();
        ImageIcon shirtPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Shirt.jpg"));
        Image image = shirtPic.getImage();
        Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
        shirtPic = new ImageIcon(scaled);
        Shirt.setIcon(shirtPic);
        Shirt.addActionListener(buttonListener);

        JLabel Description = new JLabel("TYLER1 Trademark Alpha Shirt");
        JLabel Price = new JLabel("$20.00");
        Tyler1Shirt.setLayout(new BoxLayout(Tyler1Shirt,BoxLayout.Y_AXIS));
        Tyler1Shirt.add(Shirt);
        Tyler1Shirt.add(Description);
        Tyler1Shirt.add(Price);
        Tyler1Shirt.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1Shirt;
    }
    
    public JPanel Tyler1ShirtDescription(ActionListener Back) {
    	JPanel Tyler1ShirtDescription = new JPanel();
    	Tyler1ShirtDescription.setSize(1000, 880);
    	
    	JLabel Shirt = new JLabel();
    	ImageIcon shirtPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Shirt.jpg"));
        Image image = shirtPic.getImage();
        Image scaled = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        shirtPic = new ImageIcon(scaled);
        Shirt.setIcon(shirtPic);
        
        JLabel ProductName = new JLabel("TYLER1 Trademark Alpha Shirt");
        JLabel ProductSize = new JLabel("Size: Adult Large");
        JLabel ProductCondition = new JLabel("Condition: 100% New");
        JLabel P1 = new JLabel("Machine Wash");
        JLabel P2 = new JLabel("No Tag");
        JLabel P3 = new JLabel("Guaranteed to make you alpha");
        JLabel Price = new JLabel("$20.00");
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(Back);
        
        Tyler1ShirtDescription.setLayout(new BoxLayout(Tyler1ShirtDescription,BoxLayout.Y_AXIS));
        Tyler1ShirtDescription.add(ProductName);
        Tyler1ShirtDescription.add(Shirt);
        Tyler1ShirtDescription.add(ProductSize);
        Tyler1ShirtDescription.add(ProductCondition);
        Tyler1ShirtDescription.add(P1);
        Tyler1ShirtDescription.add(P2);
        Tyler1ShirtDescription.add(P3);
        Tyler1ShirtDescription.add(Price);
        Tyler1ShirtDescription.add(goBack);
        
        Tyler1ShirtDescription.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1ShirtDescription;
    }

    public JPanel Tyler1Mug() {
        JPanel Tyler1Mug = new JPanel();
        Tyler1Mug.setSize(300, 300);
        JButton Mug = new JButton();
        ImageIcon mugPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Mug.jpg"));
        Image image = mugPic.getImage();
        Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
        mugPic = new ImageIcon(scaled);
        Mug.setIcon(mugPic);

        JLabel Description = new JLabel("TYLER1 Trademark Mug");
        JLabel Price = new JLabel("$10.00");
        Tyler1Mug.setLayout(new BoxLayout(Tyler1Mug, BoxLayout.Y_AXIS));
        Tyler1Mug.add(Mug);
        Tyler1Mug.add(Description);
        Tyler1Mug.add(Price);
        Tyler1Mug.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1Mug;
    }
    
    public JPanel Tyler1BloodRush() {
    	JPanel Tyler1BloodRush = new JPanel();
    	Tyler1BloodRush.setSize(300,300);
    	JButton BloodRush = new JButton();
    	ImageIcon bloodRushPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Bloodrush.jpg"));
    	Image image = bloodRushPic.getImage();
    	Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
    	bloodRushPic = new ImageIcon(scaled);
    	BloodRush.setIcon(bloodRushPic);
    	
    	JLabel Description = new JLabel("loltyler1 BLOODRUSH");
    	JLabel Price = new JLabel("$15.00");
    	Tyler1BloodRush.setLayout(new BoxLayout(Tyler1BloodRush, BoxLayout.Y_AXIS));
    	Tyler1BloodRush.add(BloodRush);
    	Tyler1BloodRush.add(Description);
    	Tyler1BloodRush.add(Price);
    	Tyler1BloodRush.setBorder(BorderFactory.createLineBorder(Color.black));
    	return Tyler1BloodRush;
    }
    
    public JPanel getProduct(ActionListener ButtonListener, String picPath, String description, String price) {
    	JPanel product = new JPanel();
    	product.setSize(300, 300);
    	JButton productButton = new JButton();
    	productButton.addActionListener(ButtonListener);
    	ImageIcon productIcon = new ImageIcon(Products.class.getResource(picPath));
    	Image image = productIcon.getImage();
    	Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
    	productIcon = new ImageIcon(scaled);
    	
    	JLabel Description = new JLabel(description);
    	JLabel Price = new JLabel(price);
    	product.setLayout(new BoxLayout(product, BoxLayout.Y_AXIS));
    	product.add(productButton);
    	product.add(Description);
    	product.add(Price);
    	return product;
    }
}
