public class Overload {
    void ovlDemo()
    {
        System.out.println("No parameters!");
    }
    void ovlDemo(int a)
    {
        System.out.println("One parameter!");
    }
    int ovlDemo(int a, int b)
    {
        System.out.println("Two parameters!");
        return a + b;
    }
    double ovlDemo(double a, double b)
    {
        System.out.println("Two parameters!");
        return a + b;
    }
}
