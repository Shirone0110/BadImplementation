package packaged;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoneyTest
{
	Money a;
	Money b;
	Money c;
	
	@BeforeEach
	void setUp() throws Exception
	{
		a = new Money1("a", 10.0);
		b = new Money2("b", (float)20.0);
		c = new Money3("c", (int)30.0);
		a.hours = 5;
		b.hours = 5;
		c.hours = 5;
	}

	@Test
	void testPay()
	{
		assertEquals(50.0, a.pay());
		assertEquals(100.0, b.pay());
		assertEquals(1200.0, c.pay());
		a.hours = 50;
		assertEquals(550.0, a.pay());
		c.hours = 50;
		assertEquals(1200.0, c.pay());
	}

}
