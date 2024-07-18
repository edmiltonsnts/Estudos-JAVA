public class MinhaClasse {
  public static void main(String[] args) {
    String primeiroNome = "José";
    String segundoNome = " Edmilton";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.err.println(nomeCompleto);
    

  }
  

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
  return "Resultado do método é " + primeiroNome.concat(segundoNome);
    
  }
}
