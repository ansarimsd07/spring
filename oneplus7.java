package com.offline.mobilesale;

import org.springframework.stereotype.Component;

@Component
public class oneplus7 implements mobiledetails
{
	String Colour;
	String Rom;
	double price;
    oneplus7(String c1,String c2,double c3){
	Colour=c1;
    Rom=c2;
    price=c3;
    System.out.println("Colour="+Colour);
    System.out.println("Rom="+Rom);
    System.out.println("Mobile Price="+price);
}
	int battery=3700;
	String s1="lithium";	
	String s2="AndroidPie";
	String s3="OctaCore";
    String s4="3.8Ghz"	;
    String s5="HH733";
    String s6="Dualsim";
    String s7="3G&4G available";		
   public void run()
 {
	 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	 System.out.println("8GB RAM||12Mp Camera||Externalstroage upto 300gb");
	 System.out.println("Exynos 8120 proccessor||Quad HD+Display");
	 System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");  
	 
 }



	
   
}
