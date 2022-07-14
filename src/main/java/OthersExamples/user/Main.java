package OthersExamples.user;

public class Main {
    public static void main(String[] args) {
        User userA = new User("Fernando", "Vedovatto");
        User userB = new User("Joao", "Silva");

        System.out.println(userA);
        System.out.println(userB);
        System.out.println(userA.equals(userB));
    }
}
