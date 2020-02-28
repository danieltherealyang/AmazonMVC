package Amazon.Components;
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 

public class Consumer 
{
	public String ctitle;
	public String cdescript;
	public int cprice;
	public int ctarrif;
	
	public Consumer(String title, String descript, int price, int tarrif)
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
				new Consumer("TYLER1 Trademark Alpha Shirt","highest quality TYler1 brandend shirt, availbe in all sizes",10, 20)
				
				
				
		};
		
		
		
		
		
		
		
		return con;
	
	}
		
		
}
