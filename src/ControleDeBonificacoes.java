public class ControleDeBonificacoes {
    private double totalDeBonificacoes;
    public void registra(Funcionario funcionario){
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }
    double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
}
