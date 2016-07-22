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
         for (int i = 0; i < palavra.length(); i++) {
        	 System.out.println(palavra.charAt(i));
         }
     }
}
