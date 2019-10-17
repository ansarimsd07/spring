package com.offline.mobilesale;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	
	public static void main(String[] args) {
	
		char c1='\0';
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("A.samsungPro");
		System.out.println("B.oneplus7");
		System.out.println("C.Redmi7plus");
		System.out.println("D.CLOSE");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Choose Which Mobile You Want Details:");
		do
		{
			
		 c1=sc.next().charAt(0);
		switch(c1)
		{
		case 'A':
		
		ApplicationContext factory =new AnnotationConfigApplicationContext(appconfig.class);
		samsungPro a=factory.getBean(samsungPro.class );
		a.run();
		
		System.out.println("*****************");
		System.out.println("2.Operating details");
		System.out.println("*****************"); 
		System.out.println("operating system="+a.s2);
		System.out.println("proccessor="+a.s3);
		System.out.println(a.s4);
		System.out.println("*****************");
		System.out.println("3.General");
		System.out.println("*****************");
		System.out.println("Model Number="+a.s5);
		System.out.println("Sim type="+a.s6);
		System.out.println("Network type="+a.s7); 
		
		System.out.println("----------------------------------------------------------------------------------------");
		break;
		
		case 'B':
		ApplicationContext factory1 =new AnnotationConfigApplicationContext(appconfig2.class);
		oneplus7 b=factory1.getBean(oneplus7.class );
		b.run();
		
		System.out.println("*****************");
		System.out.println("2.Operating details");
		System.out.println("*****************"); 
		System.out.println("operating system="+b.s2);
		System.out.println("proccessor="+b.s3);
		System.out.println(b.s4);
		System.out.println("*****************");
		System.out.println("3.General");
		System.out.println("*****************");
		System.out.println("Model Number="+b.s5);
		System.out.println("Sim type="+b.s6);
		System.out.println("Network type="+b.s7); 
		
		System.out.println("----------------------------------------------------------------------------------------");
		break;
 
		case 'C':
		ApplicationContext factory2 =new AnnotationConfigApplicationContext(appconfig1.class);
		Redmi7plus c=factory2.getBean(Redmi7plus.class );
		c.run();
		
		System.out.println("*****************");
		System.out.println("2.Operating details");
		System.out.println("*****************"); 
		System.out.println("operating system="+c.s2);
		System.out.println("proccessor="+c.s3);
		System.out.println(c.s4);
		System.out.println("*****************");
		System.out.println("3.General");
		System.out.println("*****************");
		System.out.println("Model Number="+c.s5);
		System.out.println("Sim type="+c.s6);
		System.out.println("Network type="+c.s7); 
		break; 
		}
		}while(c1!='D');
		System.out.println("THANK YOU!!!");

		}
	}