package java3lang;

public class TestaInteger {

	public static void main(String[] args) {

		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1 == x2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");//Cai aqui, pois são referencias objetos diferentes.
		}
		
		if (x1.equals(x2)) {
			System.out.println("São iguais");//Cai aqui.
		} else {
			System.out.println("São diferentes");
		}
		
		System.out.println(Integer.parseInt("123"));
//		System.out.println(Integer.parseInt("1b"));//java.lang.NumberFormatException
	}
}
