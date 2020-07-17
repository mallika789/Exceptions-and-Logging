package epamassignment5;

public class InterestCal {
	public double Simple_Interest(double p,double r,double t){
 	   return (p*r*t)/100;
    }
    public double Compound_Interest(double p,double r,double t){
 	   return (p*Math.pow(1+(r/100),t));
    }
}
