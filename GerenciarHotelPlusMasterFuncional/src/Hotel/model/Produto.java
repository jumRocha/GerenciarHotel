package Hotel.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nomeProduto;
    private double preco;
    private List<CategoriaProduto> categoria = new ArrayList<>();

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<CategoriaProduto> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<CategoriaProduto> categoria) {
        this.categoria = categoria;
    }
}
