package edu.igo.methodreference;
@FunctionalInterface
interface Parser {
	String parse(String str);
}


class StringCoverter {
	public static String covert(String str) {
		if(str.length()>3) {
			return str.toUpperCase();
		}
		else
			return str.toLowerCase();
	}
}

class Printer{
	
	public void print(String str ,Parser p) {
		String parse = p.parse(str);
		
		System.out.println(parse);
	}
}
public class StringParserDriver {

	public static void main(String[] args) {
		String str1 = "Mohan";
		Printer printer = new Printer();
		printer.print(str1, str->StringCoverter.covert(str));
		
	}
}
