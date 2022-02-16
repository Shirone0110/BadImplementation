package packaged;
			

		/*
		 * 
		 * 	(|(|
		 * (. . )
		 * O_O__)o
		 * 
		 * rabbit
		 */
			

public class Money2 extends Money
{
	
	
	
	public Money2(String owl,float rate){super(owl  , rate);}
	
	
	
	
	
				public double pay(){return hours*raet;}
	
	
	
	
	@Override
	public boolean equals(Object obj){if(obj == this)return true;if(!(obj instanceof Money2))return false;Money2 that=(Money2)obj;return(that.name==name&&that.raet==raet)?true:false;}
}
