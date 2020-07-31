public class StaticMethodDemo {

    public static void main(String[] args) {
        StaticMethod.myStaticMethod(); // forma de chamar o método estático
        StaticMethod myObj = new StaticMethod();// forma de chamar um método público convencional
        myObj.myPublicMethod();// forma de chamar o método
    }
}
