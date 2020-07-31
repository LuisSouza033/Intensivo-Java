public class CastDemo {
    public static void main(String[] args) {
        double x, y, d;
        long l;
        int i;
        byte b;
        char ch;

        l = 100123285L; // atribuindo valor ao long
        d = l; // transformando o long num valor double

        d = 100123285.0;
        // l = d; ERRO! double não pode ser transformado num long de forma automática!!!

        l = (long) d; // forma correta

        x = 10.0; // double ( números fracionados )
        y = 3.0; // double ( números fracionados )

        i = (int) (x / y); // o (int) tem que estar presente para que o programa entenda que o resultado tem que ser um valor inteiro, que não seja fracionado.
        System.out.println("Result : " + i);

        // Essas conversões são chamadas de CAST!!!

        i = 100; // valor inteiro que será convertido para byte
        b = (byte) i;
        System.out.println("V/1. alue of b: " + b);

        i = 257;
        b = (byte)i;
        System.out.println("2. Value of b: " + b); // o valor resultado daqui será 1 porque o byte suporta somente de -128 até 127
        // pelo valor declarado ser positivo, o número será 1 por conta disso, da mesma forma que se fosse -257, o valor resultado seria -1

        b = 88;
        ch = (char)b; // deve-se digitar (char) pois não é feita a conversão automática, portanto, deve-se fazer o cast explicito
        System.out.println("CH = "+ ch); // resultado é X mas está correto, pois segundo a tabela ASCII:  88 = X


    }
}
