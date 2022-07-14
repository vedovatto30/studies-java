package devmycry;

import java.util.Objects;

public class Cadastro {

    private Integer id;
    private String nome;
    private Integer idade;
    private String email;
    private String stack;

    //construtor



    public Cadastro(Integer id, String nome, Integer idade, String email, String stack) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.stack = stack;
    }

    public Cadastro() {

    }

    //metodo

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cadastro cadastro = (Cadastro) o;
        return id.equals(cadastro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", stack='" + stack + '\'' +
                '}';
    }


}
