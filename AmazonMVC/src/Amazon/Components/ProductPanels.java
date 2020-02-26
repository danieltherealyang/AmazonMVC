package Amazon.Components;

import javax.swing.*;
import java.awt.*;

public class ProductPanels {
    public JPanel AllProducts() {
        Products products = new Products();
        JPanel AllProductsPanel = new JPanel(new GridLayout(0,3));
        AllProductsPanel.setSize(new Dimension(1000,880));
        AllProductsPanel.add(products.Tyler1Shirt());
        AllProductsPanel.add(products.Tyler1Mug());
        return AllProductsPanel;
    }
}
