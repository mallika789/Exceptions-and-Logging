package epamassignment5;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ApplicationLogger {

	private static final Logger LOGGER = LogManager.getLogger(ApplicationLogger.class);
	public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	char choice=sc.next().charAt(0);
    	LOGGER.debug("Enter h for house construction and i for finding Interest");
    	if(choice=='h'){
    		LOGGER.debug("The required area of the house : ");
    		double ft=sc.nextInt();
    		LOGGER.debug("**These are different types of houses we provide**");
    		LOGGER.debug("1.Standard Material");
    		LOGGER.debug("2.Above Standard Material");
    		LOGGER.debug("3.High Standard Material");
    		LOGGER.debug("4.High Standard Material and fully Automated features");
    		LOGGER.debug("**Mention a type of House you want to have**");
    		sc.nextLine();
    		int n=sc.nextInt();
    		MaterialsRequired ob=new MaterialsRequired();
    		double res;
    		switch(n){
 	    		case 1:res=ob.std_materials(ft);
 	          		break;
 	    		case 2:res=ob.Abv_std_materials(ft);
 	          		break;
 	    		case 3:res=ob.High_std_materials(ft);
 	          		break;
 	    		case 4:res=ob.High_Auto_std_materials(ft);
 	          		break;
 	    		default:LOGGER.debug("please Enter valid option!!!!");
	           		return;
    		}
    		LOGGER.debug(res);
    	}
    	else if(choice=='i'){
    		double p,r,t;
    		LOGGER.debug("Enter Principal");
    		p = sc.nextFloat();
    		LOGGER.debug("Enter RateofInterest");
            r = sc.nextFloat();
        	LOGGER.debug("Enter years");
        	t = sc.nextFloat();
            LOGGER.debug("Type s for SimpleInterest and c for CompoundInterest");
            char ch = sc.next().charAt(0);
            InterestCal obi=new InterestCal();
            double interest=0;
            switch(ch){
	    		case 1:interest=obi.Simple_Interest(p,r,t);
	    		    break;
	    		case 2:interest=obi.Compound_Interest(p,r,t);
	          		break;
	          	default:LOGGER.debug("No such option is available");
	          		break;
            }
            LOGGER.debug(interest);
    	}
    	else{
    		LOGGER.debug(" sorry, you have entered an invalid input");
    	}

    }

}
