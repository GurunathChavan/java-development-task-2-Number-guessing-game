import java.util.*;
import java.lang.Math;

class GuessingTheNumbergame {
 public static void main(String args[])
 {
	int number=(int)(Math.random()*100)+1;
	  
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Welcome to the Guessing the number game!!");
	 System.out.println("Let's start the game : ");
	 System.out.println("choose any number from 1 to 100");
	
	
	 int attempt=0;
	 
	 
	for(int i=0;i<=6;i++)
	{
		
		System.out.println("guess the number : ");
		 int guess=sc.nextInt();
		 attempt++;
		if(guess==number)
		   {
			   if(attempt==1){
				   System.out.println(" Wow! you won the game and you scored 100 points:");
			   break;
			   }
			   else if(attempt==2){
				   System.out.println(" Wow! you won the game and you scored 75 points:");
			   break;
			   }
			   else if(attempt==3){
					System.out.println(" Wow! you won the game and you scored 50 points:");
			   break;
			   }
			   else if(attempt==4){				   
				   System.out.println(" Wow! you won the game and you scored 25 points:");
			   break;
			   }
			   else{ 
			   System.out.println(" Wow! you won the game and you scored 10 points:");
			   break;
			   }

		   }
		else if(guess<number)
		{
			System.out.println("lower guessing try again");
			
		}
		 else
		 {
			 System.out.println("higher guessing try again");
			
		 }
		  
	
	  if( i==6)
	  {			  
		   System.out.println("out of trials, you lose!!");
	  }
 }
}
}