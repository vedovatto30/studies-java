package interfac.exemplo;

public interface SerVivo { //vamos criar apenas assinatura dos metodos, e não o corpo
    public void mover(); //cada ser vivo tem o seu modo de mover, mas sera obrigado a utilizar o metodo mover
    public void comer(int massa); //metodo comer
    public void info(); //metodo info
}
