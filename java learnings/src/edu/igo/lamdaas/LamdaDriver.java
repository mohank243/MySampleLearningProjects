package edu.igo.lamdaas;
interface Interf{
	public String add(int a,int b);
}
public class LamdaDriver {

	public static void main(String[] args) {
		Interf i = (a,b)-> {return ("The add is "+(a+b));};
		System.out.println(i.add(40, 50));
		
	}
	/*public static void m1() {
		System.out.println("Hello");
	}
	()->System.out.println("Hello");*/
	/*public void m1(int i) {
		System.out.println(i*i);
	}
	(i)->System.out.println(i*i);*/
	/*public String m1(int i,int j) {
		return ""+i+j;
	}
	(i,j)->""+i+j;*/
}
