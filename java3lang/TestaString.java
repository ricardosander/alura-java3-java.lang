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
         
         String palavra = "Alura";
         for (int i = palavra.length() - 1; i >= 0; i--) {
        	 System.out.print(palavra.charAt(i));
         }
         System.out.println();
         palavra = "Socorram-me, subi no ônibus em Marrocos";
         for (int i = palavra.length() - 1; i >= 0; i--) {
        	 System.out.print(palavra.charAt(i));
         }
         System.out.println();
         palavra = "anotaram a data da maratona";
         for (int i = palavra.length() - 1; i >= 0; i--) {
        	 System.out.print(palavra.charAt(i));
         }
     }
}
