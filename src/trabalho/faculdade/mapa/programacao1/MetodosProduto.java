package trabalho.faculdade.mapa.programacao1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class MetodosProduto extends Produto {

    //Construtor
    public MetodosProduto(){

    }

    Scanner scan = new Scanner(System.in);
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private Produto produto = new Produto();

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void cadastrandoProdutos(int i){
        produto = new Produto();

        
        boolean retornandoCadastro = false;
        System.out.println("==Produto "+(i+1)+"==");
        System.out.print("Digite o nome do produto:");
        produto.setNome(scan.nextLine());produto.setNome(produto.getNome().toUpperCase().strip());

        for(Produto produto : listaProdutos){
            if(this.produto.getNome().equals(produto.getNome())){
                while (this.produto.getNome().equals(produto.getNome())){
                    System.out.println("Erro!\nJá se encontra cadastrado um produto com esse nome!\nTente Novamente!");
                    System.out.println("==========================================================");
                    System.out.print("Digite o nome do produto:");
                    produto.setNome(scan.nextLine());produto.setNome(produto.getNome().toUpperCase().strip());

                }
            }
        }

        System.out.print("Digite a unidade de medida do produto:");
        produto.setUnidadeMedida(scan.nextLine());
        produto.setUnidadeMedida(produto.getUnidadeMedida().toUpperCase().strip());


        boolean rodando1 = true;
        while (rodando1){
            System.out.print("Digite o preço do(a) " + produto.getUnidadeMedida() + " do produto:R$");
            Scanner scanPreco = new Scanner(System.in);
            try{
                produto.setPrecoUnitario(scanPreco.nextFloat());

                if (produto.getPrecoUnitario()<=0){
                    System.out.println("Erro!\nO preço do produto dever maior que zero(0)!\nTente novamente!");
                    System.out.println("====================================================================");
                    System.out.print("Digite o preço do(a) " + produto.getUnidadeMedida() + " do produto:R$");
                    produto.setPrecoUnitario(scanPreco.nextFloat());
                }

            }catch (InputMismatchException e){
                System.out.println("Erro!\nO valor digitado NÃO foi um número!");
            }
            if(produto.getPrecoUnitario()>0){
                rodando1 = false;
            }
        }

        boolean rodandoQuant = true;
        while (rodandoQuant){
            System.out.print("Digite a quantidade em " + produto.getUnidadeMedida() + "(s) do produto que será armazenado em estoque:");
            Scanner scanQuant1 = new Scanner(System.in);
            try {
                produto.setQuantidadeEstoque(scanQuant1.nextInt());
                if (produto.getQuantidadeEstoque()<=0){
                    System.out.println("Erro!\nA quantidade do produto que será armazena em estoque tem que ser maior que zero(0)!\nTente novamente!");
                    System.out.println("====================================================================");
                    System.out.print("Digite a quantidade em " + produto.getUnidadeMedida() + "(s) do produto que será armazenado em estoque:");
                    produto.setQuantidadeEstoque(scanQuant1.nextInt());

                }

            }catch (InputMismatchException e){
                System.out.println("Erro!\nO valor digitado NÃO foi um número!");
            }
            if (produto.getQuantidadeEstoque()>0){
                rodandoQuant = false;
            }

        }

        boolean rodando=true;
        while (rodando){
            System.out.println("CONFIRMA CADASTRO DO PRODUTO?(S/N)");
            System.out.println("| [1] PARA SIM |");
            System.out.println("| [2] PARA NÃO |");
            setConfirmaCadastro(scan.nextLine().toUpperCase(Locale.ROOT).strip());
            switch (getConfirmaCadastro()){
                case "1":

                    listaProdutos.add(produto);
                    retornandoCadastro = true;
                    System.out.println("Cadastro efetuado com Sucesso!");
                    System.out.println("===============================");
                    rodando =false;
                    break;
                case "2":
                    rodando = false;
                    retornandoCadastro =true;
                    break;
                default:
                    System.out.println("Opção Inválida\nTente Novamente!");
                    System.out.println("=======================================");
                    break;
            }

        }
        if (!retornandoCadastro){
            System.out.println("Cadastro NÃO efetuado!");
            return;
        }

    }

    public void consultando(){

        setRetornandoConsulta(false);

        System.out.println("========CONSULTANDO PRODUTO========");
        if(listaProdutos.size()==0){
            System.out.println("Erro!\nLista de Produtos no momento se encontra vazia!");
            System.out.println("=====================================================");
            return;
        }
        System.out.println("Digite o nome do produto que deseja consultar:");
        setRespConsultaNome(scan.nextLine());
        setRespConsultaNome(getRespConsultaNome().toUpperCase().strip());



        for (Produto produto : listaProdutos) {
            if (getRespConsultaNome().equals(produto.getNome())) {
                System.out.println("Produto Encontrado!");
                System.out.println("==Produto==");
                System.out.println("Nome:" + produto.getNome());
                System.out.println("Unidade de Medida:" + produto.getUnidadeMedida());
                System.out.println("Preço Unitário do(a) " + produto.getUnidadeMedida() + ":R$" + produto.getPrecoUnitario());
                System.out.println("Quantidade:" + produto.getQuantidadeEstoque() + " " + produto.getUnidadeMedida() + "(s)");
                System.out.println("===========================");
                setRetornandoConsulta(true);

            }

        }



        if(!isRetornandoConsulta()){
            System.out.println("Produto NÃO encontrado!");
            return;
        }
    }


    public void alterando(){


        setRetornandoAlteracao(false);
        if(listaProdutos.size()==0){
            System.out.println("Erro!\nLista de Produtos no momento se encontra vazia!");
            System.out.println("=====================================================");
            return;
        }
        System.out.println("===========ALTERANDO PRODUTO===========");
        System.out.println("Digite o nome do produto:");
        setRespAlteraNomeProduto(scan.nextLine());
        setRespAlteraNomeProduto(getRespAlteraNomeProduto().toUpperCase(Locale.ROOT).strip());


        for (Produto produto : listaProdutos){
            if(getRespAlteraNomeProduto().equalsIgnoreCase(produto.getNome())){
                System.out.println("Produto Encontrado");
                System.out.println("==Produto==");
                System.out.println("Nome:"+produto.getNome());
                System.out.println("Unidade de Medida:"+produto.getUnidadeMedida());
                System.out.println("Preço Unitário do(a) "+produto.getUnidadeMedida()+":R$"+produto.getPrecoUnitario());
                System.out.println("Quantidade:"+produto.getQuantidadeEstoque()+" "+produto.getUnidadeMedida()+"(s)");

                System.out.println("===========ALTERANDO PRODUTO===========");
                System.out.println("Nome:"+produto.getNome());

                System.out.print("Digite a unidade de medida do produto:");
                produto.setUnidadeMedida(scan.nextLine());
                produto.setUnidadeMedida(produto.getUnidadeMedida().toUpperCase().strip());

                boolean rodandoAltPreco = true;

                while (rodandoAltPreco){
                    Scanner scanAlterando = new Scanner(System.in);
                    System.out.print("Digite o preço do(a) "+produto.getUnidadeMedida()+" do produto:R$");
                    try{
                        produto.setPrecoUnitarioAlterado(scanAlterando.nextFloat());
                        if (produto.getPrecoUnitarioAlterado()<=0){
                            System.out.println("Erro!\nO preço do produto dever maior que zero(0)!\nTente novamente!");
                            System.out.println("====================================================================");
                            System.out.print("Digite o preço do(a) " + produto.getUnidadeMedida() + " do produto:R$");
                            produto.setPrecoUnitarioAlterado(scanAlterando.nextFloat());
                        }

                    }catch (InputMismatchException e){
                        System.out.println("Erro!\nO valor digitado NÃO foi um número!");
                    }
                    if (produto.getPrecoUnitarioAlterado()>0){

                        rodandoAltPreco = false;
                    }
                }


                boolean rodando =true;
                while (rodando){
                    System.out.println("CONFIRMA ALTERAÇÃO DOS DADOS DO PRODUTO?(S/N)");
                    System.out.println("| [1] PARA SIM |");
                    System.out.println("| [2] PARA NÃO |");
                    setConfirmaAlteracao(scan.nextLine());
                    switch (getConfirmaAlteracao()){
                        case "1":
                            produto.setPrecoUnitario(produto.getPrecoUnitarioAlterado());
                            produto.setUnidadeMedida(produto.getUnidadeMedida());
                            produto.setQuantidadeEstoque(produto.getQuantidadeEstoque());
                            setRetornandoAlteracao(true);
                            System.out.println("Alteração efetuada com Sucesso!");
                            System.out.println("===============================");
                            rodando=false;
                            break;
                        case "2":
                            setRetornandoAlteracao(true);
                            rodando = false;
                            break;
                        default:
                            System.out.println("Opção Inválida\nTente Novamente!");
                            System.out.println("=======================================");
                            break;
                    }

                }

            }

        }
        if (!isRetornandoAlteracao()){
            System.out.println("Produto NÃO encontrado!\n");
            System.out.println("========================");
        }
    }


    public void excluindo(){

        setRetornandoExclusao(false);
        boolean retornando = false;

        if (listaProdutos.size()==0){
            System.out.println("Erro!\nLista de Produtos no momento se encontra vazia!");
            System.out.println("=====================================================");
            return;
        }
        System.out.println("=====EXCLUINDO PRODUTO=====");
        System.out.println("Digite o nome do produto:");
        setRespExcluiProduto(scan.nextLine());
        setRespExcluiProduto(getRespExcluiProduto().toUpperCase(Locale.ROOT).strip());



        for (Produto produto : listaProdutos){
            if(getRespExcluiProduto().equals(produto.getNome())) {

                System.out.println("Produto Encontrado");
                System.out.println("==================");
                System.out.println("==Produto==");
                System.out.println("Nome:" + produto.getNome());
                System.out.println("Unidade de Medida:" + produto.getUnidadeMedida());
                System.out.println("Preço Unitário do(a) " + produto.getUnidadeMedida() + ":R$" + produto.getPrecoUnitario());
                System.out.println("Quantidade:" + produto.getQuantidadeEstoque() + " " + produto.getUnidadeMedida() + "(s)");
                System.out.println("========================");
                boolean rodando=true;
                while (rodando){

                    System.out.println("CONFIRMA A EXCLUSÃO DO PRODUTO?(S/N)");
                    System.out.println("| [1] PARA SIM |");
                    System.out.println("| [2] PARA NÃO |");
                    setConfirmaExclusao(scan.nextLine().toUpperCase(Locale.ROOT).strip());

                    switch (getConfirmaExclusao()) {
                        case "1":

                            setRetornandoExclusao(true);
                            retornando = removendo(getRespExcluiProduto());
                            if(retornando){
                                System.out.println("Exclusão efetuada com Sucesso!");
                                System.out.println("==============================");
                                rodando = false;
                                return;
                            }else {
                                continue;
                            }

                        case "2":
                            if (retornando==false){
                                setRetornandoExclusao(true);
                                rodando = false;
                                break;
                            }
                        default:
                            System.out.println("Opção Inválida\nTente Novamente!");
                            System.out.println("=======================================");
                            break;
                    }


                }
            }



        }
        if(!isRetornandoExclusao()){
            System.out.println("Produto NÃO encontrado!\n");
            System.out.println("========================");
        }

    }

    public boolean removendo(String nome){

        System.out.println(nome);
        for (Produto produto : listaProdutos){
            if (nome.equals(produto.getNome())){
                listaProdutos.remove(produto);
                return true;
            }
        }
        return false;
    }

    public  void entradaProduto(){


        setRetornandoEntradaProduto(false);
        String quantEntradaProduto;
        if (listaProdutos.size()==0){
            System.out.println("Erro!\nLista de Produtos no momento se encontra vazia!");
            System.out.println("=====================================================");
            return;
        }
        System.out.println("===========MOVIMENTAÇÃO============");
        System.out.println("========ENTRADA DE PRODUTOS========");
        System.out.println("Digite o nome do produto:");
        setRespMovimentacaoProduto(scan.nextLine());
        setRespMovimentacaoProduto(getRespMovimentacaoProduto().toUpperCase(Locale.ROOT).strip());



        for (Produto produto : listaProdutos){
            if(getRespMovimentacaoProduto().equals(produto.getNome())) {

                System.out.println("Produto Encontrado");
                System.out.println("==================");
                System.out.println("==Produto==");
                System.out.println("Nome:" + produto.getNome());
                System.out.println("Unidade de Medida:" + produto.getUnidadeMedida());
                System.out.println("Preço Unitário do(a) " + produto.getUnidadeMedida() + ":R$" + produto.getPrecoUnitario());
                System.out.println("Quantidade em estoque:"+produto.getQuantidadeEstoque()+" "+produto.getUnidadeMedida()+"(s)");
                System.out.println("========================");
                System.out.println("Digite a quantidade do produto que deseja dar entrada no estoque:");

                quantEntradaProduto = scan.nextLine().toUpperCase(Locale.ROOT).strip();
                setQuantEntradaProduto(Integer.parseInt(quantEntradaProduto));
                //produto.setQuantidadeEstoque(scan.nextInt()); scan.nextLine();

                boolean rodando = true;
                while (rodando){
                    System.out.println("CONFIRMA ENTRADA DO PRODUTO?(S/N)");
                    System.out.println("| [1] PARA SIM |");
                    System.out.println("| [2] PARA NÃO |");
                    setConfirmaEntradaProduto(scan.nextLine().toUpperCase(Locale.ROOT).strip());

                    switch (getConfirmaEntradaProduto()) {
                        case "1":

                            produto.setQuantidadeEstoque(produto.getQuantidadeEstoque()+getQuantEntradaProduto());
                            setRetornandoEntradaProduto(true);
                            System.out.println("Entrada do produto em estoque efetuada com Sucesso!");
                            System.out.println("===================================================");
                            rodando = false;
                            return;
                        case "2":
                            setRetornandoEntradaProduto(true);
                            rodando = false;
                            break;
                        default:
                            System.out.println("Opção Inválida\nTente Novamente!");
                            System.out.println("=======================================");
                            break;
                    }

                }

            }



        }
        if(!isRetornandoEntradaProduto()){
            System.out.println("Produto NÃO encontrado!\n");
            System.out.println("========================");
        }

    }


    public void saidaProduto(){


        setRetornandoSaidaProduto(false);
        String quantSaidaProduto;

        if (listaProdutos.size()==0){
            System.out.println("Erro!\nLista de Produtos no momento se encontra vazia!");
            System.out.println("=====================================================");
            return;
        }
        System.out.println("=========MOVIMENTAÇÃO DE PRODUTOS==========");
        System.out.println("===========SAÍDA DE PRODUTOS===============");
        System.out.println("Digite o nome do produto:");
        setRespMovimentacaoProduto(scan.nextLine());
        setRespMovimentacaoProduto(getRespMovimentacaoProduto().toUpperCase().strip());

        setRetornandoSaidaProduto(false);
        for (Produto produto : listaProdutos){
            if(getRespMovimentacaoProduto().equals(produto.getNome())) {

                System.out.println("Produto Encontrado");
                System.out.println("==================");
                System.out.println("==Produto==");
                System.out.println("Nome:" + produto.getNome());
                System.out.println("Unidade de Medida:" + produto.getUnidadeMedida());
                System.out.println("Preço Unitário do(a) " + produto.getUnidadeMedida() + ":R$" + produto.getPrecoUnitario());
                System.out.println("Quantidade em estoque:"+produto.getQuantidadeEstoque()+" "+produto.getUnidadeMedida()+"(s)");
                System.out.println("========================");
                System.out.println("Digite a quantidade do produto que deseja dar saída no estoque:");
                quantSaidaProduto = scan.nextLine().toUpperCase(Locale.ROOT).strip();
                setQuantSaidaProduto(Integer.parseInt(quantSaidaProduto));

                while (getQuantSaidaProduto()<0){

                        System.out.println("Erro!\nNumeração Inválida!\nTente Novamente!");
                        System.out.println("============================================");
                        System.out.println("Digite a quantidade do produto que deseja dar saída no estoque:");
                        quantSaidaProduto = scan.nextLine().toUpperCase(Locale.ROOT).strip();
                        setQuantSaidaProduto(Integer.parseInt(quantSaidaProduto));
                }
                boolean rodando = true;
                while (rodando){
                    System.out.println("CONFIRMA SAÍDA DO PRODUTO?(S/N)");
                    System.out.println("| [1] PARA SIM |");
                    System.out.println("| [2] PARA NÃO |");
                    setConfirmaSaidaProduto(scan.nextLine().toUpperCase(Locale.ROOT).strip());


                    switch (getConfirmaSaidaProduto()) {
                        case "1":
                            if(produto.getQuantidadeEstoque()<=0){
                                System.out.println("No momento não há como efetuar a saída do produto!\nEstoque se encontra vazio");
                                System.out.println("==============================================================");
                                return;
                            }

                            if(getQuantSaidaProduto()>produto.getQuantidadeEstoque()){
                                System.out.println("No momento não há como efetuar a saída do produto!\n" +
                                        "A quantidade que deseja retirar é maior que a quantidade do produto em estoque!");
                                System.out.println("====================================================================");
                                setRetornandoSaidaProduto(true);
                                break;
                            }

                            produto.setQuantidadeEstoque(produto.getQuantidadeEstoque()-getQuantSaidaProduto());
                            setRetornandoSaidaProduto(true);
                            System.out.println("Entrada do produto em estoque efetuada com Sucesso!");
                            System.out.println("===================================================");
                            rodando = false;
                            return;
                        case "2":
                            setRetornandoSaidaProduto(true);
                            rodando = false;
                            break;
                        default:
                            System.out.println("Opção Inválida\nTente Novamente!");
                            System.out.println("=======================================");
                            break;
                    }

                }

            }

        }
        if(!isRetornandoSaidaProduto()){
            System.out.println("Produto NÃO encontrado!\n");
            System.out.println("========================");
        }

    }


    public void reajustandoUmProduto(){

        float percentPrecoReajusteUmProduto=0;
        float valorReajusteProduto=0;
        int respConfirmaReajusteProduto;

        setRetornandoReajustePrecoUmProduto(false);

        if(listaProdutos.size()==0){
            System.out.println("Erro!\nLista de Produtos no momento se encontra vazia!");
            System.out.println("=====================================================");
            return;
        }

        System.out.println("=========REAJUSTANDO PERCENTUAL DE PREÇO========");
        System.out.println("Digite o nome do produto:");
        setRespReajusteProduto(scan.nextLine());
        setRespReajusteProduto(getRespReajusteProduto().toUpperCase().strip());

        for (Produto produto : listaProdutos) {
            if (getRespReajusteProduto().equals(produto.getNome())) {

                setRetornandoReajustePrecoUmProduto(true);
                System.out.println("==================");
                System.out.println("==Produto " + (listaProdutos.size() + 1) + "==");
                System.out.println("Nome:" + produto.getNome());
                System.out.println("Preço Unitário do(a) " + produto.getUnidadeMedida() + ":R$" + produto.getPrecoUnitario());
                System.out.println("========================");
                System.out.println("Digite o percentual de reajuste do preço do produto:");
                percentPrecoReajusteUmProduto = scan.nextFloat();
                do {
                    if (percentPrecoReajusteUmProduto<(-100)){
                        System.out.println("Erro!\nImpossível subtrair a porcentagem desejada!\nTente novamente!");
                        System.out.println("Digite o percentual de reajuste do preço do produto:");
                        percentPrecoReajusteUmProduto = scan.nextFloat();
                    }
                }while (percentPrecoReajusteUmProduto<(-100));


                do {
                    System.out.println("CONFIRMA O REAJUSTE DO PREÇO EM " + percentPrecoReajusteUmProduto + "%?(S/N)");
                    System.out.println("| [1] PARA SIM |");
                    System.out.println("| [2] PARA NÃO |");
                    respConfirmaReajusteProduto = scan.nextInt(); scan.nextLine();
                    switch (respConfirmaReajusteProduto) {
                        case 1:
                            percentPrecoReajusteUmProduto = percentPrecoReajusteUmProduto / 100;
                            valorReajusteProduto = produto.getPrecoUnitario() * percentPrecoReajusteUmProduto;
                            if (valorReajusteProduto < 0) {
                                valorReajusteProduto = valorReajusteProduto * (-1);
                                produto.setPrecoUnitario(produto.getPrecoUnitario() - valorReajusteProduto);

                            } else if (valorReajusteProduto >= 0) {
                                produto.setPrecoUnitario(produto.getPrecoUnitario() + (valorReajusteProduto));
                            }
                            setRetornandoReajustePrecoUmProduto(true);
                            System.out.println("Reajuste realizado com sucesso!");
                            System.out.println("===============================");
                            break;
                        case 2:
                            setRetornandoReajustePrecoUmProduto(true);
                            return;
                        default:
                            System.out.println("Opção Inválida\nTente Novamente!");
                            System.out.println("=======================================");
                            break;
                    }

                }while (respConfirmaReajusteProduto!=1 && respConfirmaReajusteProduto!=2);



            }
        }
        if (!isRetornandoReajustePrecoUmProduto()) {
            System.out.println("Produto NÃO encontrado!\n");
            System.out.println("========================");
        }
    }


    public void reajustandoTodosProdutos(){


        setRetornandoReajusteTodosPrecos(false);
        float percentPrecoReajuste;
        float valorReajuste;
        int respConfirmaReajuste;

        if(listaProdutos.size()==0){
            System.out.println("Erro!\nLista de Produto no momento se encontra vazia!");
            System.out.println("=====================================================");
            return;
        }

        System.out.println("=========REAJUSTANDO PERCENTUAL DE PREÇO========");

        System.out.println("Digite o percentual de reajuste do preço dos produtos:");
        percentPrecoReajuste = scan.nextFloat();

        do {
            if (percentPrecoReajuste<(-100)){
                System.out.println("Erro!\nImpossível subtrair a porcentagem desejada!\nTente novamente!");
                System.out.println("Digite o percentual de reajuste do preço dos produtos:");
                percentPrecoReajuste = scan.nextFloat();
            }
        }while (percentPrecoReajuste<(-100));
        do {
            System.out.println("CONFIRMA O REAJUSTE DO PREÇO EM "+percentPrecoReajuste+"%?(S/N)");
            System.out.println("| [1] PARA SIM |");
            System.out.println("| [2] PARA NÃO |");
            respConfirmaReajuste = scan.nextInt();scan.nextLine();
            switch (respConfirmaReajuste){
                case 1:
                    percentPrecoReajuste = percentPrecoReajuste/100;
                    for (Produto produto : listaProdutos){
                        valorReajuste = produto.getPrecoUnitario()*percentPrecoReajuste;
                        if(valorReajuste<0){
                            valorReajuste = valorReajuste*(-1);
                            produto.setPrecoUnitario(produto.getPrecoUnitario() - valorReajuste);
                        }
                        else if (valorReajuste>=0){
                            produto.setPrecoUnitario(produto.getPrecoUnitario() + (valorReajuste));
                        }
                    }

                    setRetornandoReajusteTodosPrecos(true);
                    System.out.println("Reajuste realizado com sucesso!");
                    System.out.println("===============================");
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Opção Inválida\nTente Novamente!");
                    System.out.println("=======================================");
                    break;
            }

        }while (respConfirmaReajuste!=1 && respConfirmaReajuste!=2);

    }


    public void listagemDeProdutos(){

        if(listaProdutos.size()==0){
            System.out.println("Erro!\nA lista de produtos se encontra vazia no momento!");
            System.out.println("========================================================");
            return;
        }
        System.out.println("=====LISTAGEM DE PRODUTOS=====");

        int i = 0;
        for (Produto produtos : listaProdutos) {
            System.out.println("==Produto "+(i+1)+"==");
            System.out.println("Nome:"+produtos.getNome());
            System.out.println("Unidade de Medida:"+produtos.getUnidadeMedida());
            System.out.println("Preço Unitário do(a) "+produtos.getUnidadeMedida()+":R$"+produtos.getPrecoUnitario());
            System.out.println("Quantidade em estoque:"+produtos.getQuantidadeEstoque()+" "+produtos.getUnidadeMedida()+"(s)");
            System.out.println("==========================");
            i++;
        }

    }



}

