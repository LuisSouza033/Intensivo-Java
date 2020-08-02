public class TestaAnimal {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.setNome("Tobi");
        animal.setIdade(5);
        ((Cachorro)animal).correr(); // downcasting
        animal.emitirSom();

        Animal animal2 = new Cavalo();
        animal2.setNome("Faisca");
        animal2.setIdade(8);
        ((Cavalo)animal2).correr();
        animal2.emitirSom();

        Animal animal3 = new Preguica();
        animal3.setNome("Cansado");
        animal3.setIdade(4);
        ((Preguica)animal3).subirArvore();
        animal3.emitirSom();
    }
}
