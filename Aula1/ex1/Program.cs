import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      String frase = scan.nextLine();
      String[] palavras = frase.split(" ");
      
      for (int i = 0; i < palavras.length; i++){
        if (i != palavras.length - 1) {
          System.out.println(palavras[i]);
        }else {
          imprimirPalavra(palavras[i]);
        }
      }
      
  }
  
  
  public static void imprimirPalavra(String palavra){
    char[] characteres = palavra.toCharArray();
    
     for (char character : characteres) {
        System.out.println(character);
      }
  }
  
  
  
}
