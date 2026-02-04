import java.util.Scanner;

public class TributosProdutos
{
    //variáveis
    static Scanner sc = new Scanner(System.in);
    static double valor=0,preco,somaValor=0,somaTributos=0;
    
    //menu
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
    
    //calcula e retorna valor do tributo
    static void imprimirValor(int opcao){
        System.out.println("Digite o preço do produto :");
		preco = sc.nextFloat();
		switch (opcao){
		    case 1 -> valor = Alimentacao.getTributoProduto(preco);
		    case 2 -> valor = Saude.getTributoProduto(preco);
		    case 3 -> valor = Vestuario.getTributoProduto(preco);
		    case 4 -> valor = Cultura.getTributoProduto(preco);
		}
	    somaValor += preco;
        somaTributos += valor;
        System.out.printf("Valor do tributo: R$%.2f\n\n",valor);
		
    }
	
	//main
	public static void main(String[] args) {
		int opc;
		
		do{
		     menu();
		     opc = sc.nextInt();
		     switch(opc){
		         case 1, 2, 3, 4 -> {
		             imprimirValor(opc);
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
	
}
