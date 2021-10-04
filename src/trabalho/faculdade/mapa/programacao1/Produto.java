package trabalho.faculdade.mapa.programacao1;

public class Produto {


    //Construtor
    public Produto(){

    }
    private String nome;
    private float precoUnitario;
    private String unidadeMedida;
    private int quantidadeEstoque;

    private String respConsultaNome;
    private float precoUnitarioAlterado;


    boolean retornandoCadastro = false;

    private boolean retornandoSaidaProduto = false;
    private boolean retornandoAlteracao = false;
    private boolean retornandoConsulta = false;
    private boolean retornandoExclusao = false;
    private boolean retornandoEntradaProduto = false;
    private boolean retornandoReajusteTodosPrecos = false;
    private boolean retornandoReajustePrecoUmProduto = false;

    private String confirmaCadastro;


    private String respExcluiProduto;
    private String confirmaExclusao;



    private String confirmaAlteracao;
    private String respAlteraNomeProduto;

    private String confirmaEntradaProduto;
    private String respMovimentacaoProduto;

    private String respReajusteProduto;

    private int quantSaidaProduto;
    private String confirmaSaidaProduto;

    private int quantEntradaProduto;

    public float getPrecoUnitarioAlterado() {
        return precoUnitarioAlterado;
    }

    public void setPrecoUnitarioAlterado(float precoUnitarioAlterado) {
        this.precoUnitarioAlterado = precoUnitarioAlterado;
    }

    public int getQuantEntradaProduto() {
        return quantEntradaProduto;
    }

    public void setQuantEntradaProduto(int quantEntradaProduto) {
        this.quantEntradaProduto = quantEntradaProduto;
    }

    public int getQuantSaidaProduto() {
        return quantSaidaProduto;
    }

    public void setQuantSaidaProduto(int quantSaidaProduto) {
        this.quantSaidaProduto = quantSaidaProduto;
    }

    public String getConfirmaSaidaProduto() {
        return confirmaSaidaProduto;
    }

    public void setConfirmaSaidaProduto(String confirmaSaidaProduto) {
        this.confirmaSaidaProduto = confirmaSaidaProduto;
    }

    public String getConfirmaCadastro() { return confirmaCadastro; }

    public void setConfirmaCadastro(String confirmaCadastro) { this.confirmaCadastro = confirmaCadastro; }

    public String getRespConsultaNome() { return respConsultaNome; }

    public void setRespConsultaNome(String respConsultaNome) { this.respConsultaNome = respConsultaNome; }

    public boolean isRetornandoAlteracao() { return retornandoAlteracao; }

    public void setRetornandoAlteracao(boolean retornandoAlteracao) { this.retornandoAlteracao = retornandoAlteracao; }

    public boolean isRetornandoConsulta() { return retornandoConsulta; }

    public void setRetornandoConsulta(boolean retornandoConsulta) { this.retornandoConsulta = retornandoConsulta; }

    public boolean isRetornandoExclusao() { return retornandoExclusao; }

    public void setRetornandoExclusao(boolean retornandoExclusao) { this.retornandoExclusao = retornandoExclusao; }

    public boolean isRetornandoEntradaProduto() { return retornandoEntradaProduto; }

    public void setRetornandoEntradaProduto(boolean retornandoEntradaProduto) { this.retornandoEntradaProduto = retornandoEntradaProduto; }

    public boolean isRetornandoReajusteTodosPrecos() { return retornandoReajusteTodosPrecos; }

    public void setRetornandoReajusteTodosPrecos(boolean retornandoReajusteTodosPrecos) { this.retornandoReajusteTodosPrecos = retornandoReajusteTodosPrecos; }

    public boolean isRetornandoReajustePrecoUmProduto() { return retornandoReajustePrecoUmProduto; }

    public void setRetornandoReajustePrecoUmProduto(boolean retornandoReajustePrecoUmProduto) { this.retornandoReajustePrecoUmProduto = retornandoReajustePrecoUmProduto; }

    public String getRespExcluiProduto() { return respExcluiProduto; }

    public void setRespExcluiProduto(String respExcluiProduto) { this.respExcluiProduto = respExcluiProduto; }

    public String getConfirmaExclusao() { return confirmaExclusao; }

    public void setConfirmaExclusao(String confirmaExclusao) { this.confirmaExclusao = confirmaExclusao; }

    public String getConfirmaAlteracao() { return confirmaAlteracao; }

    public void setConfirmaAlteracao(String conirmaAlteracao) { this.confirmaAlteracao = conirmaAlteracao; }

    public String getRespAlteraNomeProduto() { return respAlteraNomeProduto; }

    public void setRespAlteraNomeProduto(String respAlteraNomeProduto) { this.respAlteraNomeProduto = respAlteraNomeProduto; }

    public String getConfirmaEntradaProduto() { return confirmaEntradaProduto; }

    public void setConfirmaEntradaProduto(String confirmaEntradaProduto) { this.confirmaEntradaProduto = confirmaEntradaProduto; }

    public String getRespMovimentacaoProduto() { return respMovimentacaoProduto; }

    public void setRespMovimentacaoProduto(String respMovimentacaoProduto) { this.respMovimentacaoProduto = respMovimentacaoProduto; }

    public String getRespReajusteProduto() { return respReajusteProduto; }

    public void setRespReajusteProduto(String respReajusteProduto) { this.respReajusteProduto = respReajusteProduto; }

    public boolean isRetornandoSaidaProduto() {
        return retornandoSaidaProduto;
    }

    public void setRetornandoSaidaProduto(boolean retornandoSaidaProduto) { this.retornandoSaidaProduto = retornandoSaidaProduto; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { this.nome = nome; }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) { this.precoUnitario = precoUnitario; }

    public String getUnidadeMedida() { return unidadeMedida; }

    public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

}
