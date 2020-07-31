public class ContaEmpresa extends Conta{

    private Double limiteEmprestimo;

    public ContaEmpresa(Integer numero, String nome, Double saldo, Double limiteEmprestimo){
        super(numero,nome,saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public Double getLimiteEmprestimo(){
        return limiteEmprestimo;
    }
    public void setLimiteEmprestimo(double limiteEmprestimo){
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public void emprestimo(double valor){
        if(valor <= limiteEmprestimo){
            saldo += valor - 10.0;
        }
    }
    @Override
    public void saque(double valor){
        super.saque(valor);
        saldo -= 2.0;
    }

}
