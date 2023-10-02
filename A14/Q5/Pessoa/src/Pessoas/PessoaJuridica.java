package Pessoas;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private GregorianCalendar dataCriacao;


    public PessoaJuridica() {}


    public PessoaJuridica(String cnpj, GregorianCalendar dataCriacao, String nome) {
        this.cnpj = cnpj;
        this.dataCriacao = dataCriacao;
        this.setNome(nome);
    }


    public String toString(){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        String dataCriacaoEmTexto = formatador.format(this.getdataCriacao().getTime());
        return "Pessoa Juridica:\n\nNome: " + this.getNome() + "\nCNPJ: " + this.getcnpj() + "\nData de Criacao: " + dataCriacaoEmTexto + "\n\n";
    }

    public boolean equals(PessoaJuridica p){
        if (this.getcnpj().equals(p)) {
            System.out.println("Pessoas iguais!");
            return true;
        } else {
            System.out.println("Pessoas diferentes!");
            return false;
        }
    }



    public String getcnpj() {
        return this.cnpj;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public GregorianCalendar getdataCriacao() {
        return this.dataCriacao;
    }

    public void setdataCriacao(GregorianCalendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }



    @Override
    public boolean validarDocumento() {
        if (this.getcnpj().length() == 18) {
            System.out.println("CNPJ valido!");
            return true;
        } else {
            System.out.println("CNPJ invalido!");
            return false;
        }
    }

    @Override
    public int calcularIdade() {
        int idade = 0;
        GregorianCalendar atual = new GregorianCalendar();
        int anoAtual = atual.get(Calendar.YEAR);
        int mesAtual = atual.get(Calendar.MONTH)+1;
        int diaAtual = atual.get(Calendar.DAY_OF_MONTH);

        if (this.getdataCriacao().get(GregorianCalendar.YEAR) < anoAtual) {
             idade = anoAtual - this.getdataCriacao().get(GregorianCalendar.YEAR);
            if (mesAtual < this.getdataCriacao().get(GregorianCalendar.MONTH)) {
                idade--;

            }else if(mesAtual == this.getdataCriacao().get(GregorianCalendar.MONTH)){
            if(diaAtual < this.getdataCriacao().get(GregorianCalendar.DAY_OF_MONTH)){
                idade--;

            }
        }
        } else {
            System.out.println("Data de Criacao invalida!");
        }
        return idade;
    }
    
}
