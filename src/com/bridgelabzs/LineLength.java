package com.bridgelabzs;
import java.util.*;
public class LineLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LineLength line = new LineLength();	
	double length = line.lengthOfLine();
	System.out.println(length);

	}
	
	public double lengthOfLine() {
		Scanner input =new Scanner(System.in);
		System.out.println("x1= ");
		
		
	int x1 = input.nextInt();
	System.out.println("x2= ");
	int x2 = input.nextInt();
	System.out.println("y1= ");
	int y1 = input.nextInt(); 
	System.out.println("y2= ");
	int y2 = input.nextInt();
	double length =Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	return length;		
		
	}

	}


