public class ModifiersDemo {
    public static void main(String[] args) {
        Modifiers ob = new Modifiers();
        // ob.alpha = 10; ERROR! NÃO É POSSÍVEL ACESSAR UM ATRIBUTO PRIVATE
        // encapsulamento do atributo ALPHA! //
        ob.setAlpha(150);
        System.out.println("Valor de Alpha: "+ob.getAlpha());

        ob.beta = 88;
        ob.gamma = 150;

        System.out.println("Valor de Beta: " + ob.beta);
        System.out.println("Valor de Gamma: " + ob.gamma);
    }
}
