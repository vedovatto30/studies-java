package devmycry;

public class Main {
    public static void main(String[] args) {

        Cadastro cadastro1 = new Cadastro();
        cadastro1.setId(01);
        cadastro1.setNome("Fernando");
        cadastro1.setIdade(33);
        cadastro1.setEmail("fernando@ibm.com");
        cadastro1.setStack("Java");

        System.out.println("Id :" + cadastro1.getId());
        System.out.println("Nome :" + cadastro1.getNome());
        System.out.println("Idade :" + cadastro1.getIdade());
        System.out.println("Email :" + cadastro1.getEmail());
        System.out.println("Stack :" + cadastro1.getStack());
    }
}
