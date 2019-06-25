package week08;



public class Circle {
	
	    // properties
	   private double radius ;
	   
	   // Constructors
	   public Circle(int radius){
		   this.radius=radius;
	   }
	   // class function
	   public double getArea(){
		   double area= Math.PI*this.radius*this.radius;
		   System.out.println("area:"+area);
		   return area;
	   }
	   public double getCircumfrence(){
		   double circumfrence= Math.PI*2*this.radius;
		   System.out.println("circumfrence:"+ circumfrence);
		   return circumfrence;
	   }
	   public double getDiameter(){
		   double diameter= 2*this.radius;
		   System.out.println("diameter:"+ diameter);
		   return diameter;
	   }
	
	 
        // getters setters
	 
	   public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
	   
}
