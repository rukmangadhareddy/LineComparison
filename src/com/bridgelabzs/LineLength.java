package com.bridgelabzs;

public class LineLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LineLength line = new LineLength();	
	double length = line.lengthOfLine();
	System.out.println(length);

	}
	public double lengthOfLine() {
	int x1 =10 ;
	int x2 = 20;
	int y1 = 10;
	int y2 = 20;
	double length =Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	return length;		
		
	}

	}


