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
        
        mainCard.add(products.Tyler1Mug());
        mainCard.add(products.Tyler1BloodRush());
        
        JPanel Tyler1ShirtDescription = products.Tyler1ShirtDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "main");
        	}
        });
        
        AllProductsPanel.add(mainCard, "main");
        AllProductsPanel.add(Tyler1ShirtDescription, "shirt");
        cardLayout.show(AllProductsPanel, "main");
        return AllProductsPanel;
    }
    
}
