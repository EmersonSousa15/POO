import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class Bilhete {
    private String mensagem;
    private int dia;
    private int mes;
    private int ano;


    public Bilhete() {}

     public Bilhete(String mensagem, int dia, int mes, int ano) {
        this.mensagem = mensagem;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public boolean equals(Bilhete Bilhete){
        if (Bilhete.getMensagem().equals(this.getMensagem()) && Bilhete.getDia() == this.getDia()  && Bilhete.getMes() == this.getMes()  && Bilhete.getAno() == this.getAno() ) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        GregorianCalendar data = new GregorianCalendar();
        data.set(this.getAno(), this.getMes(), this.getDia());
        String dataEmTexto = formatador.format(data.getTime());
        return this.mensagem + " - " + dataEmTexto;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
