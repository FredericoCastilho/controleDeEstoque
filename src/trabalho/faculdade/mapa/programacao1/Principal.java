package trabalho.faculdade.mapa.programacao1;


import java.util.Locale;
import java.util.Scanner;

public class Principal {

    //Construtor
    public Principal(){

    }

    public static void main(String[] args){

        Menu menu = new Menu();
        MetodosProduto produto1 = new MetodosProduto();

        Scanner scan = new Scanner(System.in);


        String respMenuPrincipal;
        String respMenuProdutos;
        String respMenuMovimentacao;
        String respMenuReajustePreco;



        boolean rodandoMenuPrincipal = true;
        boolean rodandoMenuProdutos;
        boolean rodandoMenuMovimantacao;
        boolean rodandoMenuReajustePreco;
        boolean rodando;


        while (rodandoMenuPrincipal) {

            respMenuPrincipal=menu.menuPrincipal();
            rodandoMenuProdutos = true;
            rodandoMenuMovimantacao = true;
            rodandoMenuReajustePreco = true;
            switch (respMenuPrincipal){
                case "1":
                    while (rodandoMenuProdutos) {
                        respMenuProdutos = menu.menuProdutos();
                        switch (respMenuProdutos){
                            case "1":
                                int i = 0;
                                String confirma;
                                System.out.println("====CADASTRANDO PRODUTO====");

                                System.out.println("Digite a quantidade de produtos que deseja cadastrar");
                                int quant = scan.nextInt(); scan.nextLine();
                                rodando = true;
                                while (rodando){
                                    System.out.println("CONFIRMA A SOLICITAÇÃO PARA O CADASTRAMENTO DE "+quant+" PRODUTO(S)?(S/N)");
                                    System.out.println("| [1] PARA SIM |");
                                    System.out.println("| [2] PARA NÃO |");
                                    confirma =  scan.nextLine().toUpperCase(Locale.ROOT).strip();
                                    switch (confirma){
                                        case "1":
                                            for(int cont = 0; cont <quant;cont++) {
                                                produto1.cadastrandoProdutos(i);
                                                i++;
                                            }

                                            rodando=false;
                                            break;
                                        case "2":
                                            rodando =false;
                                            break;
                                        default:
                                            System.out.println("Opção Inválida\nTente Novamente!");
                                            System.out.println("=======================================");
                                            break;
                                    }
                                }

                                rodandoMenuProdutos = true;
                                break;
                            case "2":
                                produto1.alterando();
                                rodandoMenuProdutos = true;
                                break;
                            case "3":
                                produto1.consultando();
                                rodandoMenuProdutos = true;
                                break;
                            case "4":
                                produto1.excluindo();
                                rodandoMenuProdutos = true;
                                break;
                            case "0":
                                rodandoMenuProdutos = false;
                                break;
                            default:
                                System.out.println("Opção inválida!\nTente Novamente!");
                                System.out.println("========================================");
                                break;
                        }

                    }
                    break;

                case "2":

                    while (rodandoMenuMovimantacao){
                        respMenuMovimentacao = menu.menuMovimentacao();
                        switch (respMenuMovimentacao){
                            case "1":
                                produto1.entradaProduto();
                                break;
                            case "2":
                                produto1.saidaProduto();
                                break;
                            case "0":
                                rodandoMenuMovimantacao = false;
                                break;
                            default:
                                System.out.println("Opção inválida!\nTente Novamente!");
                                System.out.println("========================================");
                                break;
                        }

                    }
                    rodandoMenuPrincipal = true;
                    break;
                case "3":

                    while (rodandoMenuReajustePreco){
                        respMenuReajustePreco = menu.menuReajustandoPreco();
                        switch (respMenuReajustePreco){
                            case "1":
                                produto1.reajustandoUmProduto();
                                break;
                            case "2":
                                produto1.reajustandoTodosProdutos();
                                break;
                            case "0":
                                rodandoMenuReajustePreco = false;
                                break;
                            default:
                                System.out.println("Opção inválida!\nTente Novamente!");
                                System.out.println("========================================");
                                break;
                        }
                    }

                    rodandoMenuPrincipal = true;
                    break;
                case "4":
                    produto1.listagemDeProdutos();
                    rodandoMenuPrincipal = true;
                    break;
                case "0":
                    rodandoMenuPrincipal = false;
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção Inválida!\nTente novamente!");
                    System.out.println("========================================");
                    break;
            }

        }



    }
}
