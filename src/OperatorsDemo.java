public class OperatorsDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2); // & é igual ao operador AND
        System.out.println(b1 | b2); // | é igual ao operador OR
        System.out.println(b1 ^ b2); // ^ é igual o excluisivo OR ( XOR )

        System.out.println(x > 3 &&  x < 10);// Operador AND ( && ) de curto circuito, verifica se precisa analisar a expressão como um todo
        System.out.println(x > 4 || x < 4); // Operador OR ( || ) de curto circuito
        System.out.println(x > 3 && x < 10);




    }
}
