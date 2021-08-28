package heaper;
import java.text.SimpleDateFormat;  
import java.util.Date;  


import java.io.*;

import java.util.*;

public class practice {
	public static void main(String args[]) throws IOException
	{
BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
HashMap<String,Integer>mp=new HashMap<>();
mp.put("Chennai Beach",1);
mp.put("Chennai Fort",2);
mp.put("Chennai Park",3);
mp.put("Chennai Egmore",4);
mp.put("Chetpet",5);
mp.put("Nungambakkam",6);
mp.put("Kodambakkam",7);
mp.put("Mambalam",8);
mp.put("Saidapet",9);
mp.put("Guindy",10);
mp.put("St. Thomas Mount",11);
mp.put("Pazhavanthagal",12);
mp.put("Meenambakkam",13);
mp.put("Trisulam",14);
mp.put("Pallavaram",15);
mp.put("Chromepet",16);
mp.put("Tambaram Sanatorium",17);
mp.put("Tambaram",18);
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
Date date = new Date();  
System.out.println(formatter.format(date));  
String source=rd.readLine();
String destination=rd.readLine();
int nos=Math.abs(mp.get(source)-mp.get(destination));
System.out.println(source);
System.out.println(destination); 
System.out.println(nos+" "+"Stops");
int age=Integer.parseInt(rd.readLine());
double cost=costCalculation(age,nos);
System.out.println(cost);
}
	public static double costCalculation(int age,int nos)
	{
		if(age<=3)
		{
			return 0;
		}
		double cost=0;
		if(nos<=5)
		{
			cost=10;
		}
		else if(nos>5 && nos!=17)
		{
			cost=10;
			nos=nos-5;
			if(nos%5==0)
			{
				int effective=nos/5;
				cost+=effective*5;
			}
			else
			{
				int effective=(nos/5)+1;
				cost+=effective*5;
				
			}
		}
		else
		{
			cost+=20;
		}
		if(age<=10)
		{
			return 0.75*cost;
		}
		return cost;
		
	}

}
	


