package edu.igo.strings;

public class StringDriver {

	public static void main(String[] args) {
		String name="mark";
		int amount=12;
		String customer="honda";
		StringBuilder sb = new StringBuilder();
		 sb.append("insert into incoming_orders ");
		 sb.append("(part_name, quantity, customer) values (");
		 sb.append("'").append(name).append("', ");
		 sb.append("'").append(amount).append("', ");
		 sb.append("'").append(customer).append("') ");
		 System.out.println(sb);
	}
}
