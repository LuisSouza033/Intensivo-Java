public class Modifiers {
    private int alpha; // o private faz com que somente a classe que criou esse atributo consegue fazer alteração neste objeto
    public int beta; // todos podem acessar e fazer alterações neste objeto
    int gamma; // este é o default, acesso padrão.

    void setAlpha(int a)
    {
        alpha = a;
    }
    int getAlpha()
    {
        return alpha;
    }
}
