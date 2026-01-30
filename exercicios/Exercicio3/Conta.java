public class Conta{
    private float valorConta;
    private final float valorChequeEspecial;
    private float valorDisponivelCheque;
    
    public Conta(float valorConta){
        this.valorConta = valorConta;
        if(valorConta <= 500)
            this.valorChequeEspecial = 50;
        else
            this.valorChequeEspecial = valorConta*0.5F;
        
        valorDisponivelCheque = valorChequeEspecial;
    }
    
    
    public float getValorConta(){
        return this.valorConta;
    }
    
    public void set(float valorConta){
        this.valorConta = valorConta;
    }
    
    public float getValorChequeEspecial() {
        return this.valorChequeEspecial;
    }
    
    public void deposito(float valorDeposito){
        this.valorConta += valorDeposito;
        if(valorDisponivelCheque > 0 && valorDeposito >= valorChequeEspecial)
            valorDisponivelCheque = 0;
        else
            valorDisponivelCheque = valorChequeEspecial + valorConta;
    }
    
    public void saque(float valorSaque){
        if(valorConta >= 0){
            if(valorSaque > valorConta+valorChequeEspecial)
                System.out.printf("Valor do saque não pode ser maior que o saldo (R$%.2f) e valor do cheque especial (R$%.2f)\n\n",valorConta,valorChequeEspecial);
            else if (valorSaque > valorConta && valorSaque < valorDisponivelCheque+valorConta) {
                this.valorConta -= valorSaque;
                this.valorDisponivelCheque = valorChequeEspecial + valorConta;
                System.out.printf("Atenção! Você está utilizando o cheque especial\nValor disponível do cheque especial: %.2f\n\n",valorDisponivelCheque);
            } else
                this.valorConta -= valorSaque;
        } else {
            if(valorSaque > valorChequeEspecial){
                System.out.println("Seu saldo está negativo e o valor do saque é maior que o valor do cheque especial");
            } else {
                this.valorConta -= valorSaque;
                this.valorDisponivelCheque = valorChequeEspecial + valorConta;
                System.out.printf("Atenção! Você está utilizando o cheque especial\nValor disponível do cheque especial: %.2f\n\n",valorDisponivelCheque);
            }
        }
    }
    
    public String usoChequeEspecial(){
        if(valorDisponivelCheque < valorChequeEspecial){
            return "O cheque especial está em uso\nValor em uso: R$" + (valorChequeEspecial - valorDisponivelCheque) + "\nValor disponível: " + valorDisponivelCheque + "\n";
        }
        else
            return "O cheque especial não está em uso" ;
    }
}
