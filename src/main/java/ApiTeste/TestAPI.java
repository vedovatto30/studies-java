package ApiTeste;

public class TestAPI {
    public static void main(String[] args) {

        try {
            System.out.println(Class.forName(Calculator.class.getName()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}