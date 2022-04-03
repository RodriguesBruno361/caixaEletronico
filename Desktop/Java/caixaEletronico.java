import java.util.Scanner;

public class caixaEletronico {

  public static void main(String[] args) {
    //Varíaveis
    int saldo = 1000;
    int retirar, depositar;
    int escolha;
    Scanner teclado = new Scanner(System.in);

    //Entradas e Processamento
    //Laço while para o menu
    while (true) {
      System.out.println("*********Sistema de caixa eletrônico*********");
      System.out.println("Escolha 1 para Sacar");
      System.out.println("Escolha 2 para Depositar");
      System.out.println("Escolha 3 para Consultar Saldo");
      System.out.println("Escolha 4 para Sair");
      System.out.print("Escolha a opçao que você deseja realizar: ");

      escolha = teclado.nextInt();

      //Switch case para a escolha
      switch (escolha) {
        case 1:
          System.out.println("Digite a quantia que vai ser retirada: ");
          retirar = teclado.nextInt();

          if (saldo >= retirar) {
            retirar = saldo - retirar;
            System.out.println("Por favor retire o seu dinheiro");
          } else {
            System.out.println("Saldo insuficiente!");
          }
          System.out.println("");
          break;
        case 2:
          System.out.println("Digite a quantia que vai ser depositada: ");
          depositar = teclado.nextInt();
          saldo = saldo + depositar;
          System.out.println("");
          break;
        case 3:
          System.out.println("Saldo: " + saldo);
          System.out.println("");
          break;
        case 4:
          System.exit(0);
      }
    }
  }
}
