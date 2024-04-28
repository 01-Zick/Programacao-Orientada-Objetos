import java.util.*;

public class Main {
  
  public static final String USUARIO = "MeuNomeNaoEhZelda";
  public static final String SENHA = "meuNomeEHL1nk";
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean usuarioEstahAutenticado;
      
      do{
        String usuario = scan.nextLine();
        String senha = scan.nextLine();
        
        usuarioEstahAutenticado = validarUsuario(usuario, senha);
        
        if (!usuarioEstahAutenticado){
          
          System.out.println("Usuário e/ou senha inválidos!");
        }else {
          
          System.out.println("Seja bem vindo! " + USUARIO);
        }
        
      }while (!usuarioEstahAutenticado);
  }
  
  public static boolean validarUsuario(String usuario, String senha){
    
    if (!usuario.equalsIgnoreCase(USUARIO)){
      return false;
    }
    
    if (!senha.equals(SENHA)){
      return false;
    }
    return true;
  }
}