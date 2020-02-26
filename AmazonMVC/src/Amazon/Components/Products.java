package Amazon.Components;

import javax.swing.*;
import java.awt.*;

public class Products {
    public JPanel Tyler1Shirt() {
        JPanel Tyler1Shirt = new JPanel();
        Tyler1Shirt.setSize(300, 300);
        JButton Shirt = new JButton();
        ImageIcon shirtPic = new ImageIcon(Products.class.getResource("/Amazon/Components/products/Tyler1_Shirt.jpg"));
        Image image = shirtPic.getImage();
        Image scaled = image.getScaledInstance(200, 210, java.awt.Image.SCALE_SMOOTH);
        shirtPic = new ImageIcon(scaled);
        Shirt.setIcon(shirtPic);

        JLabel Description = new JLabel("TYLER1 Trademark Alpha Shirt");
        JLabel Price = new JLabel("$20.00");
        Tyler1Shirt.setLayout(new BoxLayout(Tyler1Shirt,BoxLayout.Y_AXIS));
        Tyler1Shirt.add(Shirt);
        Tyler1Shirt.add(Description);
        Tyler1Shirt.add(Price);
        Tyler1Shirt.setBorder(BorderFactory.createLineBorder(Color.black));
        return Tyler1Shirt;
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
}
