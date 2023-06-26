package edu.igo.defaultandstatic;

public class Driver implements Interf,Interf2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Interf.super.m1();
	}
	public static void main(String[] args) {
		Driver d1 = new Driver();
		d1.m1();
	}
	
}
