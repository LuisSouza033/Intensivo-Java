public class Gerente extends Funcionario{
    private int nroFuncGerenciados;

    @Override
    public double getBonificacao(){
        return super.getBonificacao()+1000;
    }
}
