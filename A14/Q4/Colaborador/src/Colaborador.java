import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.GregorianCalendar;

public class Colaborador{
    private String CPF;
    private String nome;
    private char sexo;
    private double salarioBruto;
    private GregorianCalendar dataAdmissao;

    public Colaborador() {}

    public Colaborador(String CPF, String nome, char sexo, double salarioBruto, GregorianCalendar dataAdmissao) {
        this.CPF = CPF;
        this.nome = nome;
        this.sexo = sexo;
        this.salarioBruto = salarioBruto;
        this.dataAdmissao = dataAdmissao;
    }

    public boolean validaCPF(){
        return this.getCPF().length() == 14 ?  true : false;
    }

    public boolean validaDataAdmissao(){
        GregorianCalendar cal = new GregorianCalendar();
        return this.getDataAdmissao().get(GregorianCalendar.YEAR) >= 1990 && this.getDataAdmissao().get(GregorianCalendar.YEAR) <= cal.get(GregorianCalendar.YEAR) ? true : false;
    }

    public boolean trabalhaMaisTempo(Colaborador Colaborador){
        return this.getDataAdmissao().get(GregorianCalendar.YEAR) >= Colaborador.getDataAdmissao().get(GregorianCalendar.YEAR) ? true : false;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public GregorianCalendar getDataAdmissao() {
        return this.dataAdmissao;
    }

    public String getDataAdmissaoTexto(){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String dataEmTexto = formatador.format(this.getDataAdmissao().getTime());
        return dataEmTexto;
    }

    public void setDataAdmissao(GregorianCalendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }



}
