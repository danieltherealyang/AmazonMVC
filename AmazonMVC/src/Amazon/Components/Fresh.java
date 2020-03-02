package Amazon.Components;

public class Fresh
{
	public String ftitle;
	public String fdescript;
	public String fprice;
	public String fexp;
	
	
	public Fresh(String title, String descript, String price,String exp)
	{
		ftitle=title;
		fdescript=descript;
		fprice=price;
		fexp=exp;
	
	}
	
	public Fresh() {
		
	}
	
	public String Key()
	{
		return ftitle;
		
	}

	
	public static Fresh[] Freshdata()
	{
		Fresh[] fo= {
				new Fresh("loltyler1 BLOODRUSH","Size 5lb, Lemon-Flavored, 24g Protein, 0g Sugar","$15","NEVER EXPIRES-NUCLEAR WARFARE PROOF"),
				
				
				
		};
		
		return fo;
	
	}
		
		
}
