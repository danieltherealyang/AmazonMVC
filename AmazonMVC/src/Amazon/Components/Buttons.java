package Amazon.Components;

import javax.swing.*;
import java.awt.*;

public class Buttons {
    public JButton AmazonLogo() {
        JButton Logo = new JButton();
        ImageIcon icon = new ImageIcon(Buttons.class.getResource("/Amazon/icon/logo.png"));
        Image image = icon.getImage();
        Image smallicon = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(smallicon);
        Logo.setIcon(icon);
        return Logo;
    }

    public JButton TodaysDeals() {
        JButton TodaysDeals = new JButton("Today's Deals");
        TodaysDeals.setOpaque(true);
        TodaysDeals.setBorderPainted(false);
        TodaysDeals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TodaysDeals.setBorderPainted(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                TodaysDeals.setBorderPainted(false);
            }
        });
        TodaysDeals.setBackground(new Color(35, 47, 63));
        TodaysDeals.setForeground(Color.white);
        return TodaysDeals;
    }

    public JButton FindaGift() {
        JButton FindaGift = new JButton("Find a Gift");
        FindaGift.setOpaque(true);
        FindaGift.setBorderPainted(false);
        FindaGift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FindaGift.setBorderPainted(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                FindaGift.setBorderPainted(false);
            }
        });
        FindaGift.setBackground(new Color(35, 47, 63));
        FindaGift.setForeground(Color.white);
        return FindaGift;
    }

    public JButton CustomerService() {
        JButton CustomerService = new JButton("Customer Service");
        CustomerService.setOpaque(true);
        CustomerService.setBorderPainted(false);
        CustomerService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CustomerService.setBorderPainted(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                CustomerService.setBorderPainted(false);
            }
        });
        CustomerService.setBackground(new Color(35, 47, 63));
        CustomerService.setForeground(Color.white);
        return CustomerService;
    }

    public JButton Registry() {
        JButton Registry = new JButton("Registry");
        Registry.setOpaque(true);
        Registry.setBorderPainted(false);
        Registry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Registry.setBorderPainted(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Registry.setBorderPainted(false);
            }
        });
        Registry.setBackground(new Color(35, 47, 63));
        Registry.setForeground(Color.white);
        return Registry;
    }

    public JButton NewReleases() {
        JButton NewReleases = new JButton("New Releases");
        NewReleases.setOpaque(true);
        NewReleases.setBorderPainted(false);
        NewReleases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewReleases.setBorderPainted(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewReleases.setBorderPainted(false);
            }
        });
        NewReleases.setBackground(new Color(35, 47, 63));
        NewReleases.setForeground(Color.white);
        return NewReleases;
    }

    public JButton MyCart() {
        JButton Cart = new JButton("Cart");
        Cart.setOpaque(true);
        Cart.setBorderPainted(false);
        Cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	Cart.setBorderPainted(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	Cart.setBorderPainted(false);
            }
        });
        Cart.setBackground(new Color(35, 47, 63));
        Cart.setForeground(Color.white);
        return Cart;
    }

    public JButton BestSellers() {
        JButton BestSellers = new JButton("Best Seller");
        BestSellers.setOpaque(true);
        BestSellers.setBorderPainted(false);
        BestSellers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BestSellers.setBorderPainted(true);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                BestSellers.setBorderPainted(false);
            }
        });
        BestSellers.setBackground(new Color(35, 47, 63));
        BestSellers.setForeground(Color.white);
        return BestSellers;
    }
}
