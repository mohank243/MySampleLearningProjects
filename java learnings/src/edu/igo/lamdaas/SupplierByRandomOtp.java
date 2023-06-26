package edu.igo.lamdaas;

import java.util.function.Supplier;

public class SupplierByRandomOtp {

	//Supplier is a functional Interface which is used to perform some operation without accepting any input and only return the Object
	//It has Method named get()
	//public <R> get();
	
	public static void main(String[] args) {
		Supplier<String> s = ()-> {
			String otp = "";
			int i = 0;
			while( i<6 ) {
				otp = otp + (int)(Math.random()*10);
				i++;
			}
			return otp;
			
		};
		System.out.println(s.get());
	}
	
}
