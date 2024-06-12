
import java.util.Scanner;


public class ContaBancaria {            
    public void dadosConta(){
        System.out.println("Olá, informe sua conta");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:"); 
        String nome = sc.nextLine();

        System.out.println("Olá,informe o numero da agencia:"); 
        String agencia = sc.nextLine(); 
        System.out.println("Informe o número da conta:"); 
        int conta = sc.nextInt();
        System.out.println("Informe o seu saldo:"); 
        double saldo = sc.nextDouble();
        
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " ,conta "+ conta + " e o seu saldo "+ saldo +" ja está disponivel para saque");

  
  
        sc.close(); //Encerra o programa
    }
}
