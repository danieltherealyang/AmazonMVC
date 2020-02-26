package Amazon.Components;

import javax.swing.*;
import java.awt.*;

public class ProductPanels {
    public JPanel AllProducts() {
        JPanel AllProductsPanel = new JPanel(new GridLayout(0,3));
        AllProductsPanel.setSize(new Dimension(1000,880));
        AllProductsPanel.setLayout(new CardLayout());
        Products products = new Products();
        AllProductsPanel.add(products.Tyler1Shirt());
        AllProductsPanel.add(products.Tyler1Mug());
        AllProductsPanel.add(products.Tyler1BloodRush());
        return AllProductsPanel;
    }
}
