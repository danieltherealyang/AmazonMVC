package Amazon.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductPanels {
    protected static final Container NewReleasesPanel = null;
	protected static final Container TodaysDeals = null;

	//List of all products to appear on home page
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
        
        mainCard.add(products.Tyler1Bag(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "bag");
        	}
        }));
        	
        mainCard.add(products.Tyler1FunkoPop(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "funkopop");
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
        

        JPanel Tyler1BagDescription = products.Tyler1BagDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "main");
        	}
        });
        

        JPanel Tyler1FunkoPopDescription = products.Tyler1FunkoPopDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(AllProductsPanel, "main");
        	}
        });
        
        AllProductsPanel.add(mainCard, "main");
        AllProductsPanel.add(Tyler1ShirtDescription, "shirt");
        AllProductsPanel.add(Tyler1MugDescription, "mug");
        AllProductsPanel.add(Tyler1BloodRushDescription, "bloodrush");
        AllProductsPanel.add(Tyler1BagDescription, "bag");
        AllProductsPanel.add(Tyler1FunkoPopDescription, "funkopop");
        cardLayout.show(AllProductsPanel, "main");
        return AllProductsPanel;
       }
    //Functionality for Todays deals
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
        
        mainCard.add(products.Tyler1BloodRush(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(TodaysDeals, "bloodrush");
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
    //Functionality for Best Sellers
    public JPanel BestSellers() {
    	JPanel BestSellersPanel = new JPanel();
    	BestSellersPanel.setSize(new Dimension(1000,880));
    	
    	CardLayout cardLayout = new CardLayout();
        BestSellersPanel.setLayout(cardLayout);
        
        Products products = new Products();
        JPanel mainCard = new JPanel(new GridLayout(0,3));
        mainCard.add(products.Tyler1Mug(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(BestSellersPanel, "mug");
        	}
        }));
        
        mainCard.add(products.Tyler1FunkoPop(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(BestSellersPanel, "funkopop");
        	}
        }));
        
        JPanel Tyler1MugDescription = products.Tyler1MugDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(BestSellersPanel, "main");
        	}
        });
        
        JPanel Tyler1FunkoPopDescription = products.Tyler1FunkoPopDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(BestSellersPanel, "main");
        	}
        });
        
        BestSellersPanel.add(mainCard, "main");
        BestSellersPanel.add(Tyler1MugDescription, "shirt");
        BestSellersPanel.add(Tyler1FunkoPopDescription, "funkopop");
        return BestSellersPanel;
    }

  /*  
    // Added functionality for Registry, product page instead of other
    public JPanel Registry() {
    	JPanel Registry = new JPanel();
    	Registry.setSize(new Dimension(1000,880));
        
        CardLayout cardLayout = new CardLayout();
        Registry.setLayout(cardLayout);
        System.out.println("Entered here 1");
        Products products = new Products();
        JPanel mainCard = new JPanel(new GridLayout(0,3));
        mainCard.add(products.Tyler1Shirt(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(Registry, "shirt");
        	}
        }));
        
        JPanel Tyler1ShirtDescription = products.Tyler1ShirtDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(Registry, "main");
        	}
        });
        
        Registry.add(mainCard, "main");
        Registry.add(Tyler1ShirtDescription, "shirt");
        return Registry;
    }
    */
    // Added functionality for New Releases
    public JPanel NewReleases() {
    	JPanel NewReleases = new JPanel();
    	NewReleases.setSize(new Dimension(1000,880));
        
        CardLayout cardLayout = new CardLayout();
        NewReleases.setLayout(cardLayout);
        //System.out.println("Entered here 1");
        Products products = new Products();
        JPanel mainCard = new JPanel(new GridLayout(0,3));
        mainCard.add(products.Tyler1Shirt(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(NewReleases, "mug");
        	}
        }));
        
        mainCard.add(products.Tyler1FunkoPop(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(NewReleasesPanel, "funkopop");
        	}
        }));
        
        JPanel Tyler1ShirtDescription = products.Tyler1ShirtDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(NewReleases, "main");
        	}
        });
        
        mainCard.add(products.Tyler1BloodRush(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(NewReleasesPanel, "bloodrush");
        	}
        }));
        
        NewReleases.add(mainCard, "main");
        NewReleases.add(Tyler1ShirtDescription, "shirt");
        return NewReleases;
    }

//Added functionality for books
public JPanel Books() {
	JPanel Books = new JPanel();
	Books.setSize(new Dimension(1000,880));
    
    CardLayout cardLayout = new CardLayout();
    Books.setLayout(cardLayout);
    //System.out.println("Entered here 1");
    Products products = new Products();
    JPanel mainCard = new JPanel(new GridLayout(0,3));
    mainCard.add(products.Tyler1Shirt(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		cardLayout.show(Books, "shirt");
    	}
    }));
    
    JPanel Tyler1ShirtDescription = products.Tyler1ShirtDescription(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		cardLayout.show(Books, "main");
    	}
    });
    
    Books.add(mainCard, "main");
    Books.add(Tyler1ShirtDescription, "mugs");
    return Books;
}
    
    public JPanel MyCart() {
    	JPanel MyCartPanel = new JPanel();
    	MyCartPanel.setSize(new Dimension(1000,880));
    	
    	CardLayout cardLayout = new CardLayout();
    	MyCartPanel.setLayout(cardLayout);
    	
    	Products cart = new Products();
    	
    	JPanel mainCard = new JPanel(new GridLayout(0,3));
    	
    	mainCard.add(cart.Tyler1Mug(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(MyCartPanel, "mug");
        	}
        }));
    	
    	mainCard.add(cart.Tyler1FunkoPop(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(MyCartPanel, "funkopop");
        	}
        }));
    	
    	JPanel Tyler1MugDescription = cart.Tyler1MugDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(MyCartPanel, "main");
        	}
        });
    	
    	JPanel Tyler1FunkoPopDescription = cart.Tyler1FunkoPopDescription(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cardLayout.show(MyCartPanel, "main");
        	}
        });
    	
    	MyCartPanel.add(mainCard, "main");
    	MyCartPanel.add(Tyler1MugDescription, "mug");
    	MyCartPanel.add(Tyler1FunkoPopDescription, "funkopop");
    	
    	return MyCartPanel;
    }

//Added functionality for Find a Gift

public JPanel FindaGift() {
	JPanel FindaGift = new JPanel();
	FindaGift.setSize(new Dimension(1000,880));
    
    CardLayout cardLayout = new CardLayout();
    FindaGift.setLayout(cardLayout);
    //System.out.println("Entered here 1");
    Products products = new Products();
    JPanel mainCard = new JPanel(new GridLayout(0,3));
    mainCard.add(products.Tyler1Shirt(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		cardLayout.show(FindaGift, "mug");
    	}
    }));
    
    mainCard.add(products.Tyler1Bag(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		cardLayout.show(FindaGift, "bag");
    	}
    }));
    
    mainCard.add(products.Tyler1FunkoPop(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		cardLayout.show(NewReleasesPanel, "funkopop");
    	}
    }));
    
    JPanel Tyler1ShirtDescription = products.Tyler1ShirtDescription(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		cardLayout.show(FindaGift, "main");
    	}
    });
    
    mainCard.add(products.Tyler1BloodRush(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		cardLayout.show(FindaGift, "bloodrush");
    	}
    }));
    
    FindaGift.add(mainCard, "main");
    FindaGift.add(Tyler1ShirtDescription, "shirt");
    return FindaGift;
}

//Added functionality for Customer Service

public JPanel CustomerService() {
	JPanel CustomerService = new JPanel();
	CustomerService.setSize(new Dimension(1000,880));
  
  CardLayout cardLayout = new CardLayout();
  CustomerService.setLayout(cardLayout);
  //System.out.println("Entered here 1");
  Products products = new Products();
  JPanel mainCard = new JPanel(new GridLayout(0,3));
   
  JLabel numbr = new JLabel ("If you have an issue, please contact us at cs@amazon.com or at Fox's house.");
  numbr.setVisible(true);
  numbr.setText("Please call us at 999-999-9991");
  mainCard.add(numbr);
  
  return CustomerService;
}

}




