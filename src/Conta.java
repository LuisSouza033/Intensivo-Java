public class Conta {
    private Integer numero;
    private String titular;
    protected double saldo;

    public Conta(Integer numero, String titular, Double saldo)
    {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    // daqui
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    // até aqui foi criado utilizando botão direito, generate, getter and setter e selecionando as opções. O que foi excluído foi o Set do Saldo para
    // que fosse feito os métodos de saque e depósito
    public void saque(double valor){
        saldo -= valor + 5.0; // R$5,00 é a taxa para saque!!!
    }
    public void deposito(double valor){
        saldo += valor;
    }
}
