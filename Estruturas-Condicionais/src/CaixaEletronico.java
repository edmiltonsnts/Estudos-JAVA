public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.00;
    double valorSaque = 17.00;

    if (valorSaque < saldo) 
    saldo = saldo - valorSaque;

    System.out.println( "Seu saldo atual e " + "R$" + saldo);
    
  }
}
