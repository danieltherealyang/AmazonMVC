package Amazon.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductPanels {
    public JPanel AllProducts() {
        JPanel AllProductsPanel = new JPanel();
        AllProductsPanel.setSize(new Dimension(1000,880));
        
        CardLayout cardLayout = new CardLayout();
        AllProductsPanel.setLayout(cardLayout);
        
        Products products = new Products();
        
        JPanel mainCard = new JPanel(new GridLayout(0,3));
        mainCard.add(products.Tyler1Shirt(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "shirt");
        	}
        }));
        mainCard.add(products.Tyler1Mug(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "mug");
        	}
        }));
        
        mainCard.add(products.Tyler1BloodRush(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "bloodrush");
        	}
        }));
        
        JPanel Tyler1ShirtDescription = products.Tyler1ShirtDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "main");
        	}
        });
        
        JPanel Tyler1MugDescription = products.Tyler1MugDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "main");
        	}
        });
        
        JPanel Tyler1BloodRushDescription = products.Tyler1BloodRushDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "main");
        	}
        });
        
        AllProductsPanel.add(mainCard, "main");
        AllProductsPanel.add(Tyler1ShirtDescription, "shirt");
        AllProductsPanel.add(Tyler1MugDescription, "mug");
        AllProductsPanel.add(Tyler1BloodRushDescription, "bloodrush");
        cardLayout.show(AllProductsPanel, "main");
        return AllProductsPanel;
    }
    
    public JPanel TodaysDeals() {
    	JPanel TodaysDealsPanel = new JPanel();
    	TodaysDealsPanel.setSize(new Dimension(1000,880));
        
        CardLayout cardLayout = new CardLayout();
        TodaysDealsPanel.setLayout(cardLayout);
        
        Products products = new Products();
        JPanel mainCard = new JPanel(new GridLayout(0,3));
        mainCard.add(products.Tyler1Shirt(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(TodaysDealsPanel, "shirt");
        	}
        }));
        
        JPanel Tyler1ShirtDescription = products.Tyler1ShirtDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(TodaysDealsPanel, "main");
        	}
        });
        
        TodaysDealsPanel.add(mainCard, "main");
        TodaysDealsPanel.add(Tyler1ShirtDescription, "shirt");
        return TodaysDealsPanel;
    }
}
