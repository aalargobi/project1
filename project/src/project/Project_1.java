package project;
import java.io.*;
import java.util.*;


public class Project_1 
{

	   private Scanner x;
	   
	  
	    public void openFile()
	  {
	    	
	    try
	    
	    {
	      x = new Scanner (new File("C:/users/talla/words.txt")); // Open file                    

	    }
	    catch (Exception e)
	    {
	      System.out.println ("Couldnt find a file");
	    }
	    }
	    
	    
	      public void readFile() 
	  {
	    	  
	       // reading words from string, and I used split.  
	       String[] word = new String ("The software software testing testing and and maintenance class").toLowerCase().split(" ");
	      
	       HashSet<String> count = new HashSet<String>();

	       for (int i=0; i<word.length; i++) // for loop to check every repeated word.

	       if (!count.add(word[i])) 

	          System.out.println("repeated words is : "+word[i]);
	     
	    }

	 
	    public void closeFile()
	    {
	      x.close();
	    }
	    
	    
	    public static void main (String args[])
	      {
	        new Project_1();
	        Project_1 r = new Project_1();
	        r.openFile();
	        r.readFile();
	        r.closeFile();
	      }
	}


