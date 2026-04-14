package Hotel.model;
import Hotel.model.Quarto;
import java.util.ArrayList;
import java.util.List;

public class Hospede {
    private String nomeHospede;
    private int diaOcupacao;
    private double gastoExtra;//valor gasto com produtos
    private double valorIncial;//gasto inicial, dia de ocupação * valor da diária
    private double valorFinal;
    private Quarto quarto;

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public double getGastoExtra() {
        return gastoExtra;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public int getDiaOcupacao() {
        return diaOcupacao;
    }

    public void setDiaOcupacao(int diaOcupacao) {
        this.diaOcupacao = diaOcupacao;
    }

    public double getValorIncial() {
        return valorIncial;
    }

    public void setValorIncial(double valorIncial) {
        this.valorIncial = valorIncial;
    }

    public void setGastoExtra(double gastoExtra) {
        this.gastoExtra = gastoExtra;
    }


   public void hospedarQuarto(Quarto quarto){
        this.quarto = quarto;
    }
    //construtor
    public Hospede(String nomeHospede, int diaOcupacao, Quarto quarto, double gastoExtra, double valorIncial, double valorFinal) {
         this.quarto = quarto;
        this.nomeHospede = nomeHospede;
        this.diaOcupacao = diaOcupacao;
        this.gastoExtra = gastoExtra;
        this.valorIncial = valorIncial;
        this.valorFinal = valorFinal;
    }

//default

    public Hospede() {
        this(null,0,null,0,0,0);
    }
    
    public void gastoExtra(double valor){
        gastoExtra+=valor;
        gastoFinal(gastoExtra);
    }

    public void gastoIncial(int diaOcupacao){

       valorIncial = (quarto.calcularValorInicial(diaOcupacao));
    }

    public void gastoFinal(double  gastoExtra){
        this.gastoExtra = gastoExtra;
        valorFinal = valorIncial + gastoExtra;

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nome completo").append(nomeHospede).append("\n");
        sb.append("Dias de Hospedagem").append(diaOcupacao).append("\n");
        sb.append(quarto).append("\n");
        sb.append("Valor Inicial (Sem extras): ").append(valorIncial).append("\n");
        sb.append("Valor Gasto com extras: ").append(gastoExtra).append("\n");
        sb.append("Valor final: ").append(valorFinal).append("\n");
        return sb.toString();
    }
}
