package test;

import org.junit.Assert;
import org.junit.Test;

public class SampleTset {
	@Test
	public void testplus(){
		SampleCalculator cal = new SampleCalculator();
		int res = cal.plus(3, 5);
		
		Assert.assertEquals(8, res);
	}
	
	@Test
	public void testminus(){
		SampleCalculator cal = new SampleCalculator();
		int res = cal.minus(5, 2);
		Assert.assertEquals(3, res);
	}

}
