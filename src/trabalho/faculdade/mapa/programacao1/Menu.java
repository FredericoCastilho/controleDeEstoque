package trabalho.faculdade.mapa.programacao1;



import java.util.Locale;
import java.util.Scanner;

public class Menu extends Principal {

    //Construtor
    public Menu(){

    }

    private String respMenuPrincipal;
    private String respMenuCadastrandoProdutos;
    private  String respMenuMovimentacao;
    private  String respMenuReajustePreco;

    Scanner scan = new Scanner(System.in);


    //Getters e Setters atributos classe Menu
    public String getRespMenuPrincipal() {
        return respMenuPrincipal;
    }

    public void setRespMenuPrincipal(String respMenuPrincipal) {
        this.respMenuPrincipal = respMenuPrincipal;
    }

    public String getRespMenuCadastrandoProdutos() {
        return respMenuCadastrandoProdutos;
    }

    public void setRespMenuCadastrandoProdutos(String respMenuCadastrandoProdutos) { this.respMenuCadastrandoProdutos = respMenuCadastrandoProdutos; }

    public String getRespMenuMovimentacao() { return respMenuMovimentacao; }

    public void setRespMenuMovimentacao(String respMenuMovimentacao) { this.respMenuMovimentacao = respMenuMovimentacao; }

    public String getRespMenuReajustePreco() { return respMenuReajustePreco; }

    public void setRespMenuReajustePreco(String respMenuReajustePreco) { this.respMenuReajustePreco = respMenuReajustePreco; }

    public String  menuPrincipal() {

        System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\n" +
                "   SISTEMA DE CONTROLE DE ESTOQUE");
        System.out.println("========MENU PRINCIPAL======");
        System.out.println("| [1] CADASTRO DE PRODUTOS |");
        System.out.println("| [2] MOVIMENTAÇÃO         |");
        System.out.println("| [3] REAJUSTE DE PREÇOS   |");
        System.out.println("| [4] RELATÓRIOS           |");
        System.out.println("| [0] FINALIZAR            |");
        System.out.println("============================");
        System.out.print("OPÇÃO:");
        setRespMenuPrincipal(scan.nextLine().toUpperCase(Locale.ROOT).strip());
        return getRespMenuPrincipal();
    }

    public String menuProdutos() {


        System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\n" +
                "   SISTEMA DE CONTROLE DE ESTOQUE");
        System.out.println("====CADASTRO DE PRODUTOS====");
        System.out.println("| [1] INCLUSÃO             |");
        System.out.println("| [2] ALTERAÇÃO            |");
        System.out.println("| [3] CONSULTA             |");
        System.out.println("| [4] EXCLUSÃO             |");
        System.out.println("| [0] RETORNAR             |");
        System.out.println("============================");
        System.out.print("OPÇÃO:");
        setRespMenuCadastrandoProdutos(scan.nextLine().toUpperCase(Locale.ROOT).strip());
        return getRespMenuCadastrandoProdutos();
    }

    public String menuMovimentacao(){


        System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\n" +
                "   SISTEMA DE CONTROLE DE ESTOQUE");
        System.out.println("=============MOVIMENTAÇÃO============");
        System.out.println("| [1] ENTRADA DO PRODUTO            |");
        System.out.println("| [2] SAÍDA DO PRODUTO              |");
        System.out.println("| [0] RETORNAR                      |");
        System.out.println("=====================================");
        System.out.print("OPÇÃO:");
        setRespMenuMovimentacao(scan.nextLine().toUpperCase(Locale.ROOT).strip());
        return getRespMenuMovimentacao();
    }

    public String menuReajustandoPreco(){
        System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.\n" +
                "   SISTEMA DE CONTROLE DE ESTOQUE");
        System.out.println("=================REAJUSTE DE PREÇO=================");
        System.out.println("| [1] REAJUSTAR PREÇO POR PRODUTO                 |");
        System.out.println("| [2] REAJUSTAR PREÇOS DOS PRODUTOS CONJUNTAMENTE |");
        System.out.println("| [0] RETORNAR                                    |");
        System.out.println("===================================================");
        System.out.print("OPÇÃO:");
        setRespMenuReajustePreco(scan.nextLine().toUpperCase(Locale.ROOT).strip());
        return getRespMenuReajustePreco();
    }

}
