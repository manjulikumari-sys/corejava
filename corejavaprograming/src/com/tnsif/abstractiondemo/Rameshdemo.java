package com.tnsif.abstractiondemo;

public class Rameshdemo extends Mahindrademo {

	@Override
	public void AIIntegration() {
		System.out.println("welcome");
		
	}

	@Override
	public void Satyellitecomm() {
		System.out.println("hello world");
		
	}

	@Override
	public void Healthmonitoring() {
		System.out.println(" Good morning");
		
	}
	public static void main(String[] args) {
		Rameshdemo r=new Rameshdemo();
		r.AIIntegration();
		r.Healthmonitoring();
		r.Satyellitecomm();
		
	}

}
