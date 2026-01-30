import java.util.Scanner;


public class Exercicio3Main
{
    public static void menu(){
        System.out.println("1 - Consultar saldo\n2 - Consultar cheque especial\n3 - Depositar dinheiro\n4 - Sacar dinheiro\n5 - Pagar um boleto\n6 - Verificar se a conta está usando cheque especial.\n0 - Sair");
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta conta1 = new Conta(600);
		int opc;
		do{
		    menu();
		    opc = sc.nextInt();
		    switch(opc){
		        case 1:{
		            System.out.printf("O valor atual da sua conta é R$%.2f\n",conta1.getValorConta());
		            break;
		        }
		        case 2:{
		            System.out.printf("O valor atual da seu cheque especial é R$%.2f\n",conta1.getValorChequeEspecial());
		            break;
		        }
		        case 3:{
		            System.out.println("Digite o valor do depósito: ");
		            float valorDeposito = sc.nextFloat();
		            conta1.deposito(valorDeposito);
		            System.out.println("Valor depositado com sucesso!");
		            break;
		        }
		        case 4:{
		            System.out.println("Digite o valor do saque: ");
		            float valor = sc.nextFloat();
		            conta1.saque(valor);
		            System.out.println("Valor sacado com sucesso!");
		            break;
		        }
		        case 5:{
		            
		            break;
		        }
		        case 6:{
		            String retorno = conta1.usoChequeEspecial();
		            System.out.println(retorno);
		            break;
		        }
		        case 0:{
		            System.out.println("Saindo do programa...");
		            break;
		        }
		    }
		}while(opc != 0);
    }
}
