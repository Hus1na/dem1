package datatype;

import java.util.Scanner;

public class practice_scanner {
	
	public static void main(String args []) {
		
	Scanner sc =new Scanner(System.in);
	float Stax = 0.03f;
	
	System.out.println("Pencil Qty");
	int pencilQ = sc.nextInt();
	System.out.println("Pencil Price");
	double pencilP = sc.nextDouble();
	double totalpencilesP = pencilQ * pencilP;
	
	System.out.println("box Qty");
	int boxQ = sc.nextInt();
	System.out.println("box Price");
	double boxP = sc.nextDouble();
	double totalboxesP = boxQ * boxP;
	
	double subtotal = (totalpencilesP + totalboxesP);
	
	double TotalTax =(subtotal*Stax);
	
	double TOTALaf = (subtotal+ TotalTax);
	

	System.out.println("              BUSINESS  NAME                     ");
	System.out.println("              11 Main Street                     ");
	System.out.println("           City Name, State, NY                  ");
	System.out.println("               123-412-1235                      ");
	System.out.println("*************************************************");
	System.out.println("  *  Item      Qty              Price");
	System.out.println("                                                  ");
	
	System.out.println("  *  Pencil "+"\t"  + pencilQ +   "\t\t" +  "$"+totalpencilesP);
	
	System.out.println("  *  Box "+"\t"  + boxQ +   "\t\t" +  "$"+totalboxesP);
		
		
  System.out.println("---------------------------------------------------------------");
		
  
  
  
  
  

      System.out.printf("                           stotal =$ %.2f", +   subtotal       );	

      System.out.println();
  	System.out.printf("                              Sales Tax = $ %.2f" ,TotalTax);
  	System.out.println();
  	System.out.printf("                                  TOTAL = $ %.2f" , TOTALaf);
		System.out.println();
	System.out.println("..................Thank YOU..............................");	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
