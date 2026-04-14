package Hotel.model;

public class TipoQuarto {
    //somente para facilitar a criacao de tipos diferentes de quarto
    //mudar para enum
    private int id;
    private String categoriaQuarto;
    private double valorDiario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoriaQuarto() {
        return categoriaQuarto;
    }

    public void setCategoriaQuarto(String categoriaQuarto) {
        this.categoriaQuarto = categoriaQuarto;
    }

    public double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(double valorDiario) {
        this.valorDiario = valorDiario;
    }
    //adicionar o cadastro do tipo de quarto aqui.

    //construtor
    public TipoQuarto(int id, String categoriaQuarto, double valorDiario){
        this.id = id;
        this.categoriaQuarto = categoriaQuarto;
        this.valorDiario = valorDiario;
    }

    public TipoQuarto (){//default
        this(0,null,0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n");
        sb.append("Nome da Categoria: ").append(categoriaQuarto).append("\n");
        sb.append("Valor da diaria: ").append(valorDiario).append("\n");
        return super.toString();
    }
}
