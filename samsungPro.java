package com.offline.mobilesale;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
@Component
public class samsungPro implements mobiledetails

{
	String Colour;
	String Rom;
	double price;
    samsungPro(String c1,String c2,double c3){
	Colour=c1;
    Rom=c2;
    price=c3;
    System.out.println("Colour="+Colour);
    System.out.println("Rom="+Rom);
    System.out.println("Mobile Price="+price);
}
	int battery=3700;
	String s1="lithium$ion";	
	String s2="AndroidPieOxygen";
	String s3="OctaCore";
    String s4="2.8Ghz"	;
    String s5="GM1901";
    String s6="Dualsim";
    String s7="3G&4G available";
    
    
    @Autowired
    mobileproccessor cpu;
    
   public mobileproccessor getCpu() {
		return cpu;
	}

	public void setCpu(mobileproccessor cpu) {
		this.cpu = cpu;
	}

public void run()
 {
	 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	 System.out.println("6GB RAM||8Mp+12M Camera||Externalstroage upto 400gb");
	 System.out.println("Exynos 9810 proccessor||Quad HD+Display");
	 System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"); 
	 cpu.process();
	 
 }
}




