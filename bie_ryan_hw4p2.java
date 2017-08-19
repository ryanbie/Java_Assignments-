package bie_ryan_hw4p2;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
        
        
        Access[] a = new Access[10];
        
        
       a[0] = new Access(2, 30, 5, 0, "Unknown");
       a[1] = new Access(3, 25, 1, 0, "Unknown");
       a[2] = new Access(2, 45, 5, 1, "Unknown");
       a[3] = new Access(7, 30, 3, 1, "Unknown");
       a[4] = new Access(9, 55, 5, 0, "Unknown");
       a[5] = new Access(3, 30, 5, 0, "Unknown");
       a[6] = new Access(2, 35, 28, 0, "Unknown");
       a[7] = new Access(2, 30, 5, 0, "Unknown");
        
            
       LaptopAccess laptop = new LaptopAccess(4, 15, 5, 0, "unknown");
        
       MobileAccess mobile = new MobileAccess(9, 30, 34, 1, "known", "New York");
        
        for(int i=0; i<8; i++){
      
            String type = null;
            
            if (i==2){
                System.out.println("Printing access records: " + laptop.hours + ":" + laptop.minutes + ":" + laptop.seconds + " " + laptop.user_typee + laptop.getUserGPSLocation());       
                
            }
            
            if (i==4){
                 
            System.out.println("Printing access records: " + mobile.hours + ":" + mobile.minutes + ":" + mobile.seconds + " " + mobile.user_typee + mobile.getUserGPSLocation());
            System.out.println("Location: " + mobile.GPS_Location1);

            } 
            
            if (a[i].user_type == 0){
            	
            		type="Chat User";		
            
            } 
            
            else if
            (a[i].user_type==1)
            	{
            	
            	type="Post User" ;
            	
            	} 
            
            
            System.out.println("Printing access records: "+a[i].hours +":" +a[i].minutes +":" +a[i].seconds + " " +type + " " +a[i].getUserGPSLocation() );
            System.out.println("Access type?");
              
        }
        


        double result= getAverageTOD(a);
          
        	System.out.println("The average access time of day in hours past day start is:");
        	System.out.println(result);
  
           
     }

  		static double getAverageTOD(Access[] a) {

  			double average=0.0; 
  			for(int i=0; i<8; i++){
     
     
  			average=a[i].hours+(a[i].minutes/60)+ (a[i].seconds/3600)+average;
     
 }
 
  			return average/8;

     } 
  
 }

class Access {

    int hours;
    int minutes;
    int seconds;
    
    
    int user_type;
    String location = new String();
     
      
 public Access(int hours, int minutes, int seconds, int user_service, String location)
 {
       
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.user_type = user_service;
        this.location = location;    
        
 }
 
 public String getUserGPSLocation()
 {
      
     return "GPS location unknown.";
   
     
 } 
 public class LaptopAccess extends Access {
		
	    String user_typee = "null";
	    
	 public LaptopAccess(int hours, int min, int seconds, int user_type, String location)
	 {
	        
	        super(hours, min, seconds, user_type, "Laptops");
	        user_typee = "Chat Laptop user: ";
	 }
 @Override  
 public String getUserGPSLocation()
	 {
		 
		 return "GPS location unknown";
	     
	 } 
	 
	}
 
 
}

class LaptopAccess extends Access {
	
    String user_typee = "null";
    
 public LaptopAccess(int hours, int min, int seconds, int user_type, String location)
 {
        
        super(hours, min, seconds, user_type, "Laptops");
        user_typee = "Chat Laptop user: ";
 }
 @Override   
 public String getUserGPSLocation()
 {
	 
	 return "GPS location unknown";
     
 } 
 
}

class MobileAccess extends Access {
	
	public String GPS_Location1;   
    String user_typee = "null";
 
 public MobileAccess(int hours, int min, int seconds, int user_type, String location, String location1)
 {
     
     super(hours, min, seconds, user_type, "Known");
     GPS_Location1 = location1;
         user_typee = "Post Mobile user: ";
 
 }
 @Override
 public String getUserGPSLocation()
 {
     
     return "GPS available!";
     
 } 

}