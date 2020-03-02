package Amazon.Components;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

public class Products {
   
	Consumer t = new Consumer();
	
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
    	Consumer[] arr = t.Consumerdata();
    	JPanel Tyler1ShirtDescription = new JPanel();
    	Tyler1ShirtDescription.setSize(1000, 880);
    	
    	JLabel Shirt = new JLabel();
    	ImageIcon shirtPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Shirt.jpg"));
        Image image = shirtPic.getImage();
        Image scaled = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        shirtPic = new ImageIcon(scaled);
        Shirt.setIcon(shirtPic);
       
        JLabel ProductName = new JLabel(arr[0].ctitle);
        //JLabel ProductSize = new JLabel("null");
        JLabel ProductCondition = new JLabel(arr[0].cdescript);
        
        JLabel P3 = new JLabel(arr[0].ctarrif);
        JLabel Price = new JLabel(arr[0].cprice);
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(Back);
        
        Tyler1ShirtDescription.setLayout(new BoxLayout(Tyler1ShirtDescription,BoxLayout.Y_AXIS));
        Tyler1ShirtDescription.add(ProductName);
        Tyler1ShirtDescription.add(Shirt);
        //Tyler1ShirtDescription.add(ProductSize);
        Tyler1ShirtDescription.add(ProductCondition);
       
        Tyler1ShirtDescription.add(P3);
        Tyler1ShirtDescription.add(Price);
        Tyler1ShirtDescription.add(goBack);
        
        Tyler1ShirtDescription.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1ShirtDescription;
    }

    public JPanel Tyler1Mug(ActionListener buttonListener) {
        JPanel Tyler1Mug = new JPanel();
        Tyler1Mug.setSize(300, 300);
        JButton Mug = new JButton();
        ImageIcon mugPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Mug.jpg"));
        Image image = mugPic.getImage();
        Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
        mugPic = new ImageIcon(scaled);
        Mug.setIcon(mugPic);
        Mug.addActionListener(buttonListener);

        JLabel Description = new JLabel("TYLER1 Trademark Mug");
        JLabel Price = new JLabel("$10.00");
        Tyler1Mug.setLayout(new BoxLayout(Tyler1Mug, BoxLayout.Y_AXIS));
        Tyler1Mug.add(Mug);
        Tyler1Mug.add(Description);
        Tyler1Mug.add(Price);
        Tyler1Mug.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1Mug;
    }
    
    public JPanel Tyler1MugDescription(ActionListener Back) {
    	JPanel Tyler1MugDescription = new JPanel();
    	Tyler1MugDescription.setSize(1000, 880);
    	
    	JLabel Mug = new JLabel();
    	ImageIcon mugPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Mug.jpg"));
        Image image = mugPic.getImage();
        Image scaled = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        mugPic = new ImageIcon(scaled);
        Mug.setIcon(mugPic);
        
        JLabel ProductName = new JLabel("TYLER1 Trademark Mug");
        JLabel ProductSize = new JLabel("Size: Child Sized");
        JLabel ProductCondition = new JLabel("Condition: Alpha");
        JLabel P1 = new JLabel("Crack-Proof");
        JLabel P2 = new JLabel("Ceramic");
        JLabel P3 = new JLabel("Dishwasher Safe");
        JLabel Price = new JLabel("$10.00");
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(Back);
        
        Tyler1MugDescription.setLayout(new BoxLayout(Tyler1MugDescription,BoxLayout.Y_AXIS));
        Tyler1MugDescription.add(ProductName);
        Tyler1MugDescription.add(Mug);
        Tyler1MugDescription.add(ProductSize);
        Tyler1MugDescription.add(ProductCondition);
        Tyler1MugDescription.add(P1);
        Tyler1MugDescription.add(P2);
        Tyler1MugDescription.add(P3);
        Tyler1MugDescription.add(Price);
        Tyler1MugDescription.add(goBack);
        
        Tyler1MugDescription.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1MugDescription;
    }
    
    public JPanel Tyler1BloodRush(ActionListener buttonListener) {
    	JPanel Tyler1BloodRush = new JPanel();
    	Tyler1BloodRush.setSize(300,300);
    	JButton BloodRush = new JButton();
    	ImageIcon bloodRushPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Bloodrush.jpg"));
    	Image image = bloodRushPic.getImage();
    	Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
    	bloodRushPic = new ImageIcon(scaled);
    	BloodRush.setIcon(bloodRushPic);
    	BloodRush.addActionListener(buttonListener);
    	
    	JLabel Description = new JLabel("loltyler1 BLOODRUSH");
    	JLabel Price = new JLabel("$15.00");
    	Tyler1BloodRush.setLayout(new BoxLayout(Tyler1BloodRush, BoxLayout.Y_AXIS));
    	Tyler1BloodRush.add(BloodRush);
    	Tyler1BloodRush.add(Description);
    	Tyler1BloodRush.add(Price);
    	Tyler1BloodRush.setBorder(BorderFactory.createLineBorder(Color.black));
    	return Tyler1BloodRush;
    }
    
    public JPanel Tyler1BloodRushDescription(ActionListener Back) {
    	JPanel Tyler1BloodRushDescription = new JPanel();
    	Tyler1BloodRushDescription.setSize(1000, 880);
    	
    	JLabel BloodRush = new JLabel();
    	ImageIcon bloodRushPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Bloodrush.jpg"));
        Image image = bloodRushPic.getImage();
        Image scaled = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        bloodRushPic = new ImageIcon(scaled);
        BloodRush.setIcon(bloodRushPic);
        
        JLabel ProductName = new JLabel("loltyler1 BLOODRUSH");
        JLabel ProductSize = new JLabel("Size: 5 lb");
        JLabel P1 = new JLabel("Lemon-Flavored");
        JLabel P2 = new JLabel("24g Protein");
        JLabel P3 = new JLabel("0g Sugar");
        JLabel Price = new JLabel("$15.00");
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(Back);
        
        Tyler1BloodRushDescription.setLayout(new BoxLayout(Tyler1BloodRushDescription,BoxLayout.Y_AXIS));
        Tyler1BloodRushDescription.add(ProductName);
        Tyler1BloodRushDescription.add(BloodRush);
        Tyler1BloodRushDescription.add(ProductSize);
        Tyler1BloodRushDescription.add(P1);
        Tyler1BloodRushDescription.add(P2);
        Tyler1BloodRushDescription.add(P3);
        Tyler1BloodRushDescription.add(Price);
        Tyler1BloodRushDescription.add(goBack);
        
        Tyler1BloodRushDescription.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1BloodRushDescription;
    }
    
    public JPanel Tyler1FunkoPop(ActionListener buttonListener) {
    	JPanel Tyler1FunkoPop = new JPanel();
    	Tyler1FunkoPop.setSize(300,300);
    	JButton FunkoPop = new JButton();
    	ImageIcon FunkoPopPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_FunkoPop.jpg"));
    	Image image = FunkoPopPic.getImage();
    	Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
    	FunkoPopPic = new ImageIcon(scaled);
    	FunkoPop.setIcon(FunkoPopPic);
    	FunkoPop.addActionListener(buttonListener);
    	
    	JLabel Description = new JLabel("Tyler1 FunkoPop");
    	JLabel Price = new JLabel("$18.00");
    	Tyler1FunkoPop.setLayout(new BoxLayout(Tyler1FunkoPop, BoxLayout.Y_AXIS));
    	Tyler1FunkoPop.add(FunkoPop);
    	Tyler1FunkoPop.add(Description);
    	Tyler1FunkoPop.add(Price);
    	Tyler1FunkoPop.setBorder(BorderFactory.createLineBorder(Color.black));
    	return Tyler1FunkoPop;
    }
    
    public JPanel Tyler1FunkoPopDescription(ActionListener Back) {
    	JPanel Tyler1FunkoPopDescription = new JPanel();
    	Tyler1FunkoPopDescription.setSize(1000, 880);
    	
    	JLabel FunkoPop = new JLabel();
    	ImageIcon FunkoPopPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Bloodrush.jpg"));
        Image image = FunkoPopPic.getImage();
        Image scaled = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        FunkoPopPic = new ImageIcon(scaled);
        FunkoPop.setIcon(FunkoPopPic);
        
        JLabel ProductName = new JLabel("Tyler1 FunkoPop");
        JLabel ProductSize = new JLabel("Size: Alpha sized");
        JLabel P1 = new JLabel("Bobble");
        JLabel P2 = new JLabel("Plastic");
        JLabel P3 = new JLabel("Lead-free paint");
        JLabel Price = new JLabel("$18.00");
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(Back);
        
        Tyler1FunkoPopDescription.setLayout(new BoxLayout(Tyler1FunkoPopDescription,BoxLayout.Y_AXIS));
        Tyler1FunkoPopDescription.add(ProductName);
        Tyler1FunkoPopDescription.add(FunkoPop);
        Tyler1FunkoPopDescription.add(ProductSize);
        Tyler1FunkoPopDescription.add(P1);
        Tyler1FunkoPopDescription.add(P2);
        Tyler1FunkoPopDescription.add(P3);
        Tyler1FunkoPopDescription.add(Price);
        Tyler1FunkoPopDescription.add(goBack);
        
        Tyler1FunkoPopDescription.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1FunkoPopDescription;
    }
    
    /*
    public JPanel general(ActionListener Back) {
    	Consumer[] arr = t.Consumerdata();
    	JPanel Tyler1ShirtDescription = new JPanel();
    	Tyler1ShirtDescription.setSize(1000, 880);
    	
    	JLabel Shirt = new JLabel();
    	ImageIcon shirtPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Shirt.jpg"));
        Image image = shirtPic.getImage();
        Image scaled = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        shirtPic = new ImageIcon(scaled);
        Shirt.setIcon(shirtPic);
       
        JLabel ProductName = new JLabel(arr[0].ctitle);
        //JLabel ProductSize = new JLabel("null");
        JLabel ProductCondition = new JLabel(arr[0].cdescript);
        
        JLabel P3 = new JLabel(arr[0].ctarrif);
        JLabel Price = new JLabel(arr[0].cprice);
        JButton goBack = new JButton("Go Back");
        goBack.addActionListener(Back);
        
        //generalTyler1ShirtDescription.setLayout(new BoxLayout(Tyler1ShirtDescription,BoxLayout.Y_AXIS));
        Tyler1ShirtDescription.add(ProductName);
        Tyler1ShirtDescription.add(Shirt);
        //Tyler1ShirtDescription.add(ProductSize);
        Tyler1ShirtDescription.add(ProductCondition);
       
        Tyler1ShirtDescription.add(P3);
        Tyler1ShirtDescription.add(Price);
        Tyler1ShirtDescription.add(goBack);
        
        Tyler1ShirtDescription.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1ShirtDescription;
    }
   */ 
    
    
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
