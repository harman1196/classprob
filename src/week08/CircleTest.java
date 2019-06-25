package week08;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testConstructer() {
		Circle c=new Circle(5);
		
		double expctradius=5;
		double actradius=c.getRadius();
		assertEquals(expctradius, actradius,0.01);	
		
	}

	@Test
	public void testAreaFunction() {
		Circle c=new Circle(5);
		double expctarea=Math.PI*5*5;
		double actarea=c.getArea();
		assertEquals(expctarea, actarea,0.01);	
	}

	@Test
	public void testCircumfrenceFunction() {
		Circle c=new Circle(5);
		double expctcircumfrence=Math.PI*2*5;
		double actcircumfrence=c.getCircumfrence();
		assertEquals(expctcircumfrence, actcircumfrence,0.01);		
	}

	@Test
	public void testDiameterFunction() {
		Circle c=new Circle(5);
		double expctdiameter=10;
		double actdiameter=c.getDiameter();
		assertEquals( expctdiameter, actdiameter,0.01);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
