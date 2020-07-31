public class OverloadDemo {
    public static void main(String[] args) {
        Overload objeto = new Overload();
        objeto.ovlDemo();// no parameters informed
        objeto.ovlDemo(10); // one parameter informed
        System.out.println("Result: "+ objeto.ovlDemo(10,56)); // two parameters informed
        System.out.println("Result: " + objeto.ovlDemo(15.9,98.7)); // two parameters informed


    }
}
