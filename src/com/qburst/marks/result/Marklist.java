package com.qburst.marks.result;

import java.io.IOException;
import java.io.InputStreamReader;

public class Marklist {
    private int maths;
	private int science;
	private int social;
	public int total;
	public int average;
	public static void main(String args[]) throws IOException
	   {
	      InputStreamReader cin = null;

	      try {
	         cin = new InputStreamReader(System.in);
	         System.out.println("Enter characters, 'q' to quit.");
	         char[] c=null;
	         int i=0;
	         do {
	            c[i] = (char) cin.read();
	          //  System.out.print(c);
	            i++;
	         } while(c[i] != 'q');
	         System.out.print((c));
	      }finally {
	         if (cin != null) {
	            cin.close();
	         }
	         
	      }
	      
	   }
	

}
