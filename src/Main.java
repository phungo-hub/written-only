import myPackage.Student;

public class Main extends Student {
    public Main(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Main main = new Main("Phu");
        main.setName("Trung");
        System.out.println(main.getName());
    }
}
