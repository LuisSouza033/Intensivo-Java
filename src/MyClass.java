public class MyClass {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            if(i==4){
                // break; interrompe o laço de repetição!
                continue; // Pula a iteração informada, ou seja, vai do 0 a 3, pula o 4 ( valor informado ) e vai pro 5 em diante.
            }
            System.out.println(i);
        }
    }
}
