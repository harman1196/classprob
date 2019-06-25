package week08;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c=new Circle(5);
		// R1
		double expctradius=5;
		double actradius=c.getRadius();
		
		if(expctradius==actradius){
			System.out.println("R1 is working");
		}
		else{
			System.out.println("r1 is not working");
			System.out.println("expected"+5);
			System.out.println("actual"+ actradius);
		}

		//R2
		double expctarea=Math.PI*5*5;
		double actarea=c.getArea();
		
		if(expctarea==actarea){
			System.out.println("R2 is working");
		}
		else{
			System.out.println("r2 is not working");
			System.out.println("expected"+expctarea);
			System.out.println("actual"+ actarea);
		}
		//R3
		double expctcircumfrence=Math.PI*2*5;
		double actcircumfrence=c.getCircumfrence();
		
		if(expctcircumfrence==actcircumfrence){
			System.out.println("R3 is working");
		}
		else{
			System.out.println("r3 is not working");
			System.out.println("expected"+expctcircumfrence);
			System.out.println("actual"+ actcircumfrence);
		}
		
		//R4
		double expctdiameter=10;
		double actdiameter=c.getDiameter();
		
		if(expctdiameter==actdiameter){
			System.out.println("R4 is working");
		}
		else{
			System.out.println("r4 is not working");
			System.out.println("expected"+expctdiameter);
			System.out.println("actual"+ actdiameter);
		}
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
