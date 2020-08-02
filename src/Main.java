public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Luís");
        gerente.setSalario(5000.0);
        System.out.println(gerente.getBonificacao());

        Funcionario func = new Gerente();//polimorfismo, gerente também é um funcionario
        func.setNome("Jorge");
        func.setSalario(4500.0);
        func.getBonificacao(); // Executa da classe gerente por conta do polimorfismo.

        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente gerente1 = new Gerente();
        gerente1.setSalario(5000.0);
        controle.registra(gerente1);

        Funcionario func1 = new Funcionario();
        func.setSalario(2000.0);
        controle.registra(func1);
        System.out.println(controle.getTotalDeBonificacoes());

    }
}
