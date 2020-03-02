package Amazon.Components;
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 

public class Consumer 
{
	public String ctitle;
	public String cdescript;
	public String cprice;
	public String ctarrif;
	
	public Consumer(String title, String descript, String price, String tarrif)
	{
		ctitle=title;
		cdescript=descript;
		cprice=price;
		ctarrif=tarrif;
		//picture//
	}
	
	public Consumer() {
	}

	
	public String Key()
	{
		return ctitle;
		
	}

	
	public static Consumer[] Consumerdata()
	{
		Consumer[] con= {
				new Consumer("Title: TYLER1 Trademark Alpha Shirt","Description :highest quality TYLER1 brandend shirt, all sizes. Made in Wuhan, best bats","Tarriff:10 for limited time cuz China", "Price:20")
				
				
				
		};
		
		return con;
	
	}
		
		
}
