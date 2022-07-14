package orientadoObjetoNelioAlves.primeiro;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        double valorTotal = 1000.0;
        double entrada = 100.0;
        int parcelas = 10;

        try{ //o try vai tentar executar esse bloco abaixo, no qual podera criar uma excecão
            ExcecoesTryCatch f = new ExcecoesTryCatch(valorTotal, entrada, parcelas); //estancioando o financiamento
            System.out.println(f.prestacao());
        }catch (RuntimeException excessao){ // caso ocorra uma excessão vamos capturar ela Cath e apresentala
            System.out.println(excessao.getMessage()); //o get message vai pegar a messagem na excessao
        }
    }
}
