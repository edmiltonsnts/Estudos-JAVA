public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.00;
    double valorSaque = 10.00;

    if (valorSaque < saldo) {
      saldo = saldo - valorSaque;
    System.out.println("Novo Saldo: " + saldo);

    }
    
    else
    System.out.println("Saldo Insuficiente");;
    
  }
}
