public class ContaPoupança extends Conta{
    private Double juros;
    public ContaPoupança(Integer numero, String titular, Double saldo, Double juros){
        super(numero, titular, saldo); // o super serve para utiliazr a herança da super class Conta
        this.juros = juros;
    }
    public Double getJuros(){
        return juros;
    }
    public void setJuros(double juros){
        this.juros = juros;
    }
    public void atualizaSaldo(){
        saldo += saldo*juros; // porque eu consigo acessar esse método sem nenhum problema? Porque estou utilizandodo uma variável que está como protected, se fosse private, não conseguiria.
    }
    @Override
    public void saque(double valor){
        saldo -= valor;
    }
}
