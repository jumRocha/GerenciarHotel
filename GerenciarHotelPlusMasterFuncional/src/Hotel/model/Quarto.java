package Hotel.model;
import Hotel.model.TipoQuarto;

public class Quarto {//corpo do quarto
    private int numeroQuarto;
    private TipoQuarto tipoQuarto;//aqui eu pego a lista Hotel.model.TipoQuarto, e pego UM UNICO tipo
    private double valorInicial;

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public double calcularValorInicial(int dias){
        valorInicial = dias*tipoQuarto.getValorDiario();
        return valorInicial;
    }
    //Agora, eu preciso que, em gerenciar quarto, seja fornecido para cá
    //o dia e os extras, mesmo que os extras seja 0
    //acho que será algo assim: calcularValorHospedagem(dias, extras)

    //contrutor
    public Quarto(int numeroQuarto,TipoQuarto tipoQuarto ){
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
    }
    //Default
    public Quarto(){
        this(0, null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número do quarto: ").append(numeroQuarto).append("\n");

        if (tipoQuarto != null) {
            // Aqui você pega o nome e o valor direto do objeto tipoQuarto!
            sb.append("Categoria: ").append(tipoQuarto.getCategoriaQuarto()).append("\n");
            sb.append("Valor da diária: R$ ").append(tipoQuarto.getValorDiario()).append("\n");
        } else {
            sb.append("Quarto sem categoria definida.\n");
        }

        return sb.toString();
    }
}
