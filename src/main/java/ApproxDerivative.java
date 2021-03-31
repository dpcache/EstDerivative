import java.lang.Math; 

public class ApproxDerivative {
	
	static int X = 1;
	
    public static void main(String[] args) {
    
		double h = 0.5;
		double knownfdx = convertKnownf(h, X);
	
		System.out.println("h		x		Approx. f'(x):			Known f'(x):				Abs. Error:");
		
    	for (int i = 0; i < 30; i++) {
    		
    		double Approxf = convertApproxf(h, X);
    		int exp = i+1;
    	
    		//Determine the error
    		double absError = knownfdx-Approxf;
    		
    		//Output Result
    		System.out.println("2^-"+exp + "		" + 
    				X + "		" +  Approxf + "		"+ knownfdx +
    				"			"+  String.format("%.12f",absError) );

    	     h = h/2;
    	}
    	
    }
    
    //Calculate Approx. f'(x) using the finite difference formula.
    static double convertApproxf(double H, int X) {
    	
    	double xh = H + X;
    	double fxh = Math.sin(xh);
    	double fx = Math.sin(X);
    	double result = (fxh - fx) / H;
 
    	return result;
    }
    
    //Calculate Known f'(x) using cos(x)
    static double convertKnownf(double h, int X) {
    	double result =  Math.cos(X);
    	
    	return result;
    }
    
}
