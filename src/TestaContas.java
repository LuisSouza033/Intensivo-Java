public class TestaContas {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1, "Luís Fernando Alves de Souza", 1000.0);
        conta1.saque(145.0);
        System.out.println("Seu saldo atual da conta Corrente é: R$ " + conta1.getSaldo());
        conta1.deposito(200.0);
        System.out.println("Seu saldo atual conta Corrente é: R$ " + conta1.getSaldo());

        Conta conta2 = new ContaPoupança(2, "José Augusto", 500.0, 0.5);
        conta2.saque(100.0);
        System.out.println("Seu saldo atual da conta Poupança é: R$ " + conta2.getSaldo());

        Conta conta3 = new ContaEmpresa(3, "Luis S.A", 100000.0, 15000.0);
        conta3.saque(200.0);
        System.out.println("O saldo atual da conta Empresarial é: R$" + conta3.getSaldo());

    }
}
