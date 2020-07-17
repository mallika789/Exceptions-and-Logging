package assignment5;

public class Interest_cal {
	public double Simple_Interest(double p,double r,double t){
 	   return (p*r*t)/100;
    }
    public double Compound_Interest(double p,double r,double t){
 	   return (p*Math.pow(1+(r/100),t));
    }
}
