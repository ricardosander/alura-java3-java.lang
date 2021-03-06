package java3lang;

public class TestaString {

	 public static void main(String[] args) {
         String s = " fj11 ";
         s.replaceAll("1", "2");
         System.out.println(s);
         
         s = s.replaceAll("1", "2");
         System.out.println(s);

         System.out.println("Sem espaços " + s.trim());
         System.out.println(s + " contém fj? " + s.contains("fj"));
         System.out.println(s + " contém gj? " + s.contains("gj"));
         System.out.println("Está vazia? " + s.isEmpty());
         System.out.println("Quantos caracteres? " + s.length());
         
         TestaString.imprimeReverso("Alura");
         TestaString.imprimeReverso("Socorram-me, subi no ônibus em Marrocos");
         TestaString.imprimeReverso("anotaram a data da maratona");
         
         TestaString.inverteOrdemPalavras("Socorram-me, subi no ônibus em Marrocos");
         
         TestaString.converteStringNumero("2");
         TestaString.converteStringNumero("21");
         TestaString.converteStringNumero("123");
         TestaString.converteStringNumero("425");
     }
	 
	 public static void imprimeReverso(String palavra) {
		 
		 StringBuilder stringBuilder = new StringBuilder(palavra);
		 
		 System.out.println("String na ordem certa: " + palavra);
		 System.out.println("String invertida: " + stringBuilder.reverse());
         System.out.println("\n");
	 }
	 
	 public static void inverteOrdemPalavras(String palavra) {
		 
		 String[] palavras = palavra.split(" ");
		 for (int  i = palavras.length - 1; i >= 0; i--) {
			 System.out.print(palavras[i] + " ");
		 }
	 }
	 
	 public static void converteStringNumero(String numero) {
		 
		 int numeroConvertido = 0;
		 for (int i = 0; i < numero.length(); i++) {
			 numeroConvertido += (numero.charAt(numero.length() - i - 1) - '0') * (int) Math.pow(10, i);
		 }
		 System.out.println("Número original: " + numero);
		 System.out.println("Número convertido: " + numeroConvertido);
	 }
}
