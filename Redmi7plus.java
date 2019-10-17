package com.offline.mobilesale;

import org.springframework.stereotype.Component;

@Component
public class Redmi7plus implements mobiledetails
{
	
		String Colour;
		String Rom;
		double price;
	    Redmi7plus(String c1,String c2,double c3){
		Colour=c1;
	    Rom=c2;
	    price=c3;
	    System.out.println("Colour="+Colour);
	    System.out.println("Rom="+Rom);
	    System.out.println("Mobile Price="+price);
	}
		int battery=3700;
		String s1="SNapdragon";	
		String s2="oreo";
		String s3="OctaCore";
	    String s4="1.9Ghz"	;
	    String s5="CB1901";
	    String s6="Dualsim";
	    String s7="3G&4G available";		
	   public void run()
	 {
		 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 System.out.println("3GB RAM||8Mp Camera||Externalstroage upto 300gb");
		 System.out.println("Exynos 6900 proccessor||Quad HD+Display");
		 System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");  
		 
	 }
}


