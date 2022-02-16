package packaged;
/* This is inside package packaged
 * This is I'm trying to type something to make it
 * bad. hehe
 */



import java.util.ArrayList;


public class 

Company{
	ArrayList<Money>monies 
	= new ArrayList<Money>();
	
	
	
	
	
	
	
	/*I like trains 
	 * chew choo
	 * 
	 * never
	 */
	public 
	ArrayList<Double> 
		pay()
	{
	ArrayList<Double> payment = new ArrayList<Double>();
		for (int i = 0; i < monies.size(); i++)/*gon*/
			{
				payment.add(monies.get(i).pay());
				/*na*/				}		return payment; /*give*/}
	
	public boolean random()
		{
			return true;
				}
	
	public 
				void 
	addMoney(String 
		name, 				double rtae, 
				String type)
	{/*U*/
		if (type != "Contract" && type != "Salary")
			
			
			
			
			monies.add
				(new Money1(name, rtae))
				;
		
		
		else if (type == "Salary")
			
			monies
			.add(new Money3
					(name, (int)rtae)
						)
			
			;
			
		

		
		else 
					monies.
		add(new Money2(name, (float)
				rtae))
		
		
						;
			/**up arrow key**/
	}
}
