
public class CupomFiscal{
    private String nomeLoja;
    private String cnpj;
    private Double totalPago;
    private String cpfConsumidor;
    private String cnpjConsumidor;
    private double dinheiroRecebido;
    private double troco;
    private Item[] itens;


    public CupomFiscal() {}

    public CupomFiscal(String nomeLoja, String cnpj, Double totalPago, String cpfConsumidor, String cnpjConsumidor, double dinheiroRecebido, double troco, Item[] itens) {
        this.nomeLoja = nomeLoja;
        this.cnpj = cnpj;
        this.totalPago = totalPago;
        this.cpfConsumidor = cpfConsumidor;
        this.cnpjConsumidor = cnpjConsumidor;
        this.dinheiroRecebido = dinheiroRecebido;
        this.troco = troco;
        this.itens = itens;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Double getTotalPago() {
        return this.totalPago;
    }

    public void setTotalPago(Double totalPago) {
        this.totalPago = totalPago;
    }

    public String getCpfConsumidor() {
        return this.cpfConsumidor;
    }

    public void setCpfConsumidor(String cpfConsumidor) {
        this.cpfConsumidor = cpfConsumidor;
    }

    public String getCnpjConsumidor() {
        return this.cnpjConsumidor;
    }

    public void setCnpjConsumidor(String cnpjConsumidor) {
        this.cnpjConsumidor = cnpjConsumidor;
    }

    public double getDinheiroRecebido() {
        return this.dinheiroRecebido;
    }

    public void setDinheiroRecebido(double dinheiroRecebido) {
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public double getTroco() {
        return this.troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public Item[] getItens() {
        return this.itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

}