package Hotel.controller;

import Hotel.model.Quarto;
import Hotel.model.TipoQuarto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarQuarto {

    private List<Quarto> ListaQuartos = new ArrayList<>();
    private List<TipoQuarto> ListaCategoriaQuarrto = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void MenuQuarto() {
        // Espaço para o menu futuro
    }

    public void cadastrarTipoQuarto() {
        System.out.println("===========================");
        System.out.println("Cadastro de Tipos de quarto");
        System.out.println("===========================");

        System.out.println("Quantas categorias deseja adicionar?");
        int numCat = Integer.parseInt(sc.nextLine());
        int tempId = 1; // Começando o ID em 1 para facilitar

        for (int i = 0; i < numCat; i++) {
            System.out.println("== " + (i + 1) + " ==");
            System.out.println("Nome da categoria: ");
            String tempTipo = sc.nextLine();

            System.out.println("Valor da Categoria: ");
            double tempValor = Double.parseDouble(sc.nextLine());

            ListaCategoriaQuarrto.add(new TipoQuarto(tempId++, tempTipo, tempValor));
        }
    }

  public void cadastrarQuarto() {
        System.out.println("===========================");
        System.out.println("    Cadastro de Quartos    ");
        System.out.println("===========================");

        System.out.println("Quantos quartos deseja adicionar?");
        int numQua = Integer.parseInt(sc.nextLine());
        int tempId = 101; 
        for (int i = 0; i < numQua; i++) {
            System.out.println("======================================");
            System.out.println("\nCadastro do Quarto " + (i + 1));
            System.out.println("======================================");
    

            TipoQuarto tempCateg = null;

            while (tempCateg == null) {
                System.out.println("\n Categorias disponíveis: ");
                if (ListaCategoriaQuarrto.isEmpty()) {/*isEmpty é para ver
                se tem alguma coisa dentro da litsa*/
                    System.out.println("Nenhuma categoria encontrada!!! ");
                    System.out.println("Escolha a Opcao 2!!");
                } else {
                    for (TipoQuarto categoria : ListaCategoriaQuarrto) {
                        System.out.println(categoria.toString());
                    }
                }

                System.out.println("\nO que deseja fazer?");
                System.out.println("1- Vincular a uma categoria existente");
                System.out.println("2- Cadastrar uma nova categoria");
                int op = Integer.parseInt(sc.nextLine());

                if (op == 1) {
                    if (ListaCategoriaQuarrto.isEmpty()) {
                        System.out.println("Erro: Não há categorias! Escolha a opção 2!!!!.");
                    } else {
                        System.out.println("Digite o ID da categoria desejada:");
                        int idBuscado = Integer.parseInt(sc.nextLine());

                        for (TipoQuarto categotia : ListaCategoriaQuarrto) {
                            if (categotia.getId() == idBuscado) {
                                tempCateg = categotia; // Vínculo encontrado!
                                break;
                            }
                        }

                        if (tempCateg == null) {
                            System.out.println("ID não encontrado. Tente novamente.");
                        }
                    }
                } else if (op == 2) {
                    // Chama o seu outro método
                    cadastrarTipoQuarto();
                    System.out.println("Categorias atualizadas! Agora selecione a desejada.");
                } else {
                    System.out.println("Opção inválida!");
                }
            }
            Quarto novoQuarto = new Quarto(tempId++, tempCateg);
            ListaQuartos.add(novoQuarto);
            System.out.println("Seu novo quarto " + tempId + "foi cadastrado com sucesso!!!!!");
        }
    }

    //listar todos os quartos
    public void listarQuartos() {
        System.out.println("===========================");
        System.out.println("    Lista de Quartos    ");
        System.out.println("===========================");

        if (ListaQuartos.isEmpty()) {
            System.out.println("Nenhum quarto cadastrado!");
        } else {
            for (Quarto quarto : ListaQuartos) {
                System.out.println(quarto.toString());
            }
        }
    }

    //listar quartos por categoria
    public void listarQuartosPorCategoria() {
        System.out.println("===========================");
        System.out.println("    Quartos por Categoria    ");
        System.out.println("===========================");

        if (ListaCategoriaQuarrto.isEmpty()) {
            System.out.println("Nenhuma categoria cadastrada!");
            return;
        }

        for (TipoQuarto categoria : ListaCategoriaQuarrto) {
            System.out.println("\nCategoria: " + categoria.getCategoriaQuarto());//aqui eu chamo todas as categorias
            boolean encontrou = false;//e determino como false

            for (Quarto quarto : ListaQuartos) {//esse for vai percorrer a lista de quartos e comparar o id da categoria do quarto com o id da categoria atual do for externo
                if (quarto.getTipoQuarto().getId() == categoria.getId()) {//se encontrar, ele imprime o quarto e determina encontrou como true
                    System.out.println(quarto.toString());
                    encontrou = true;
                }
            }

            if (!encontrou) {
                System.out.println("Nenhum quarto encontrado para esta categoria.");//se, ao final do for interno, encontrou ainda for false, significa que não tem nenhum quarto com aquela categoria, e ele imprime a mensagem
            }
        }
    }
}