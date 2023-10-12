public class Item {
    private int codigo;
    private String nome;
    private Double valorUnitario;
    private int quantidade;


    public Item() {}


    public Item(int codigo, String nome, Double valorUnitario, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calculoValorTotal(){
        try {
            double valorTotal = this.getQuantidade() * this.getValorUnitario();
            if (valorTotal > 0) {
                return valorTotal;
            } else {
                throw new ValorTotalException("Valor total inferior a zero!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao efetuar calculo: " + e);
            return 0;
        }
        
    }


    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorUnitario() {
        return this.valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
   
}
