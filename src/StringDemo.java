public class StringDemo {
    public static void main(String[] args) {
        String str = "abcde FGHIJ ABC abc DEFG     ";
        System.out.println("Comparação de strings: " + str.equals("abcde")); // comparar qual string é maior //
        System.out.println("Tamanho da string: " + str.length()); // tamanho string //
        System.out.println("Caractere do Indice: " + str.charAt(4)); // mostrar o que tem na posiçaõ 4 //
        System.out.println(str.toLowerCase()); // deixar tudo minúsculo //
        System.out.println(str.toUpperCase());// deixar tudo maísculo //
        System.out.println(str.trim()); // remover espaços canto da string//
        System.out.println(str.substring(2)); // cria uma sub-string a partir da posição número 2 //
        System.out.println(str.substring(2,9)); // cria uma sub-string da posição 2 até a posição anterior a informada (9) //
        System.out.println(str.replace('a','x')); // substitui onde tiver o primeiro caracter informado pelo //
        // _continuação ~~ segundo caracter informado //
        System.out.println(str.replace("abc", "y")); // troca o que foi informado primeiramente pelo que foi //
        // _continuação ~~ informado no segundo momento //
        System.out.println(str.indexOf("bc")); // primeiro lugar onde encontrou o valor informado //
        System.out.println(str.lastIndexOf("bc")); // último lugar onde foi encontrado o valor informado //

        String s = "Lasanha Churrasco Pudim";
        System.out.println("Frase completa: " + s);
        System.out.println("\nFrases Divididas em três partes: \n");
        String[] vect = s.split(" "); // o split divide uma string da forma como foi citado no 'regex', seja espaço ou letra //
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        // Até aqui foi visto algumas funções de strings //



    }
}
