package Pessoas;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private GregorianCalendar dataNascimento;


    public PessoaFisica() {}


    public PessoaFisica(String cpf, GregorianCalendar dataNascimento, String nome) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.setNome(nome);
    }


    
    public String toString(){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        String dataNascimentoEmTexto = formatador.format(this.getdataNascimento().getTime());
        return "Pessoa Fisica:\n\nNome: " + this.getNome() + "\nCPF: " + this.getcpf() + "\nData de Nascimento: " + dataNascimentoEmTexto + "\n\n";
    }

    public boolean equals(PessoaFisica p){
        if (this.getcpf().equals(p)) {
            System.out.println("Pessoas iguais!");
            return true;
        } else {
            System.out.println("Pessoas diferentes!");
            return false;
        }
    }


    
    public String getcpf() {
        return this.cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public GregorianCalendar getdataNascimento() {
        return this.dataNascimento;
    }

    public void setdataNascimento(GregorianCalendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    @Override
    public boolean validarDocumento() {
        if (this.getcpf().length() == 14) {
            System.out.println("CPF valido!");
            return true;
        } else {
            System.out.println("CPF invalido!");
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

        if (this.getdataNascimento().get(GregorianCalendar.YEAR) < anoAtual) {
             idade = anoAtual - this.getdataNascimento().get(GregorianCalendar.YEAR);
            if (mesAtual < this.getdataNascimento().get(GregorianCalendar.MONTH)) {
                idade--;

            }else if(mesAtual == this.getdataNascimento().get(GregorianCalendar.MONTH)){
            if(diaAtual < this.getdataNascimento().get(GregorianCalendar.DAY_OF_MONTH)){
                idade--;

            }

            if(idade < 18){
                System.out.println("Menor de idade!");
                idade = 0;
            }
        }
        } else {
            System.out.println("Data de Nascimento invalida!");
        }
        return idade;
    }
    
}
