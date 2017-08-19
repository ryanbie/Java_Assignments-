package bie_ryan_hw5p1.java;

import java.util.Scanner;
import java.lang.StringBuilder;

public class bie_ryan_hw5p1
{
    public static void main(String[] args)
    {
        User object = new User(15, "Bill", "m", "\"Caveat emptor\"");
        Scanner input = new Scanner(System.in);
        int i = 0;
        StringBuilder name;
        System.out.println("Welcome to DataMiningRUs " + object.getUsername() + "! This is the social network you can trust!");
        object.addFriend("Ted");
        object.addFriend("Socrates");
        object.addFriend("Napoleon");
        object.printFriends();
        object.deleteFriend("Socrates");
        object.printFriends();
        object.printBio();  
    }
}

class User extends bie_ryan_hw5p1
{
    String userName;
    String userGender;
    String userMotto;
    int userAge;
    String userFriends[];
    
    int location;
    
    public User(int Age, String Name, String Gender, String Motto)
   {
       userAge = Age;
       userName = Name;
       userGender = Gender;
       userMotto = Motto;
       userFriends = new String[10];
       
       location = 0;
   }
   
   public void addFriend(String friendName)
   {
       if(location < 10)
       {
           userFriends[location] = friendName;
           System.out.println(userName + " has added friend " + userFriends[location]);
           location++;
       }
       else
       {
           System.out.println("Sorry, there is no space left to add a new friend.");
       }
   }
   
   public void deleteFriend(String f)
   {
       int flag = 0;
       int i = 0;
       int index = 0;
       while(flag == 0)
       {
           if(f.equals(userFriends[i]))
           {
               flag = 1;
               index = i;
           }
           i++;
       }
       
       if(flag == 1)
       {
           System.out.println("User " + userName + " deleting friend " + userFriends[index] + ". Tough luck " + userFriends[index]);
           for(i = index ; i < location-1; i++)
           {
                userFriends[i] = userFriends[i+1];
           }
           location = location - 1;
       }
       else
       {
           System.out.print("Sorry, that friend cannot be found on the list.");
       }
   }
   
   public void printFriends()
   {
       System.out.println("All friends of user " + userName + ": ");
       for(int i = 0; i < location; i++)
       {           
    	   System.out.println("friend" + ": " + userFriends[i]);
       }
   }
   
   public void printBio()
   {
       System.out.println("Bio for user " + userName + ": ");
       System.out.println("name: " + userName);
       System.out.println("age: " + userAge);
       System.out.println("gender: " + userGender);
       System.out.println("motto: " + userMotto);
   }
   public String getUsername(){
	   return userName;
   }
}