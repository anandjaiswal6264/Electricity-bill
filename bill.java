import java.util.Scanner;

public class bill {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i ;
	int costumer;
	System.out.println("Enter the all  bill slips (All Users)in countting" );
	
	costumer= sc.nextInt ();
	
	for(i=1; i <= costumer ; i++) {
	int unit;
	float bill;
	System.out.println("" + i );
	System.out.println("enter the unit" );
	unit = sc.nextInt () ;
	
	if (unit <= 100) {
		bill = unit * 5;
		System.out.println( "RsElectricity bill " + bill );
		
	}
	
	else if (unit <= 300) {
		bill = (100 * 5) + ((unit - 100)*7);
		System.out.println("Rs Electricity bill is --->" + bill );
		}
	
	

	else if(unit <=500)  {
		bill = (100 * 5) + (200 * 7 )+  ((unit - 300)* 10);
		
		System.out.println(" Electricity bill " + bill );
		
	}

	else if(unit <= 1000) {
     bill = (100 * 5) + (200 * 7 ) + (200 * 10 ) + ((unit - 500) + 15 );
     
     System.out.println("Rs Electricity bill " + bill );
	}
	
	}
	
}
}
