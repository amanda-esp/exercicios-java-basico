import java.util.Scanner;

public class TributosProdutos
{
    static Scanner sc = new Scanner(System.in);
		 
	public static void main(String[] args) {
		int opc;
		double preco,somaValor=0,somaTributos=0;
		do{
		     menu();
		     opc = sc.nextInt();
		     switch(opc){
		         case 1 -> {
		            System.out.println("Digite o preço do produto de alimentação:");
		            preco = sc.nextFloat();
		            double valor = Alimentacao.getTributoProduto(preco);
		            somaValor += preco;
		            somaTributos += valor;
		            System.out.printf("Valor do tributo: R$%.2f\n\n",valor);
		         }
		         case 2 -> {
		            System.out.println("Digite o preço do produto de saúde:");
		            preco = sc.nextFloat();
		            double valor = Saude.getTributoProduto(preco);
		            somaValor += preco;
		            somaTributos += valor;
		            System.out.printf("Valor do tributo: R$%.2f\n\n",valor);
		         }
		         case 3 -> {
		            System.out.println("Digite o preço do produto de vestuário:");
		            preco = sc.nextFloat();
		            double valor = Vestuario.getTributoProduto(preco);
		            somaValor += preco;
		            somaTributos += valor;
		            System.out.printf("Valor do tributo: R$%.2f\n\n",valor);
		         }
		         case 4 -> {
		            System.out.println("Digite o preço do produto de cultura:");
		            preco = sc.nextFloat();
		            double valor = Cultura.getTributoProduto(preco);
		            somaValor += preco;
		            somaTributos += valor;
		            System.out.printf("Valor do tributo: R$%.2f\n\n",valor);
		         }
		         case 5 -> {
		             System.out.printf("Total venda: R$%.2f\n",somaValor);
		             System.out.printf("Total tributos: R$%.2f\n\n", somaTributos);
		         }
		         case 6 -> System.out.println("Encerrando o programa...");
		         default -> System.out.println("Opção inválida");
		     }
		 }while (opc != 6);
	}
	
	public static void menu(){
	    System.out.println("=================================");
	    System.out.println("                MENU");
	    System.out.println("=================================");
	    System.out.println("1 - Adicionar produto Alimentação");
	    System.out.println("2 - Adicionar produto Saúde e Bem-Estar");
	    System.out.println("3 - Adicionar produto Vestuário");
	    System.out.println("4 - Adicionar produto Cultura");
	    System.out.println("5 - Calcular Valor Total Tributos");
	    System.out.println("6 - Sair");
	    
	}
}
