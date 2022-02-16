package packaged;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompanyTest
{
	Company comp = new Company();
	
	@BeforeEach
	void setUp() throws Exception
	{
		comp.addMoney("Chan", 10.5, "Hourly");
		comp.addMoney("Lucas", 7.25, "Contract");
		comp.addMoney("Hehe", 80.0, "Salary");
		comp.monies.get(0).hours = 10;
		comp.monies.get(1).hours = 30;
		comp.monies.get(2).hours = 20;
	}

	@Test
	void testPay()
	{
		ArrayList<Double> ans = new ArrayList<Double>();
		ans.add(105.0);
		ans.add(7.25 * 30);
		ans.add(3200.0);
		assertEquals(ans, comp.pay());
	}

	@Test
	void testAddMoney()
	{
		ArrayList<Money> ans = new ArrayList<Money>();
		ans.add(new Money1("Chan", 10.5));
		ans.add(new Money2("Lucas", (float)7.25));
		ans.add(new Money3("Hehe", (int)80.0));
		assertEquals(ans, comp.monies);
	}

}
