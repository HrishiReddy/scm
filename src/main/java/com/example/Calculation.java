package com.example;

public class Calculation {
	public static void main(String[] args)
	{
		 System.out.println("Hello world");
		 System.out.println("Calculation");
		 System.out.println("testing");
		//http://d1a090e86773.ngrok.io

	

	

	}

	public Calculation() {
		
	}
	 public static int findMax(int arr[]){  
		 System.out.println("Finding Maximum in an array");
	        int max=arr[0];  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;  
	    }  

}
