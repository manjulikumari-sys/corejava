package com.tnsif.interfacedemo;
// demo for nested interface

public interface Myinterface { // outer interface
	 void calculatearea();
	 
	 //nested interface
	 interface Myinnerinterface {
		int id=20;
		void print();
		 
	 }
}
