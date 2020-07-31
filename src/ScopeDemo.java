public class ScopeDemo { // aqui tem o escopo principal
    public static void main(String[] args) { // aqui é iniciado outro escopo externo
        int x = 10;

        if(x==10){ // aqui é iniciado um escopo interno
            int y = 20; // por ser uma variável criada dentro do escopo interno só pode ser utilizada aqui!
            System.out.println("x and y: " + x+ " " + y);
            x = y * 2;
        }
         // y = 100; // ERROR ! coloquei como comentário pois não vai funcionar pois Y não está declarado no escopo externo!
        System.out.println("x is: " + x); // essa consigo acessar normalmente pois a variavel foi criada no escopo externo principal!
        }
}
