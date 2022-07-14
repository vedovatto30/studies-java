package orientadoObjetoNelioAlves.primeiro;

public class ExcecoesTryCatch {


    public Double valorTotal;
    public Double entrada;
    public Integer parcelas;

    public ExcecoesTryCatch( Double valorTotal, Double entrada, Integer parcelas){

        if (entrada < valorTotal * 0.2) {
            throw new RuntimeException(" A entrada deve ser pelo menso 20%");
        } else if (parcelas < 6) {
            throw new RuntimeException("O número minimo de parcelas deve ser 6");
        }

        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacao(){
        return (valorTotal - entrada) / parcelas;
    }
}
