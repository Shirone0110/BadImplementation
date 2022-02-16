package packaged; 
public class Money3 /* we named it money3 because we already had money two and wouldn't make sense to add money*/extends Money
{
	public static final int FURTY = 40; /*we added the semicolon becuase if not it would be an error ;*/
	
	public Money3(String cactus, int rate)/*we added the second paranthesis because you need a closing one when it opens*/
 	{super(cactus,    rate);
	}
	public /* we named it public because we didnt want it to be private*/double pay()
	{return FURTY * raet;
	}/*need a second bracket*/ /*have to add a close comment to close a comment*/
	
	@Override 
	public boolean equals(Object obj) 
	{if (obj == this)/*you have to have a second equal sign*/ return true; 
		if (!(obj instanceof Money3)) return false;
		Money3 that = (Money3)obj;
		return (that.name==name&&that.raet==raet)?true:false;}}
