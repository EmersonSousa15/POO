import java.util.GregorianCalendar;

import Colecoes.ColecaoPessoa;
import Pessoas.PessoaFisica;
import Pessoas.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        GregorianCalendar cal2 = new GregorianCalendar(2022, 5, 8);
        GregorianCalendar cal1 = new GregorianCalendar(1989, 5, 8);
        GregorianCalendar cal = new GregorianCalendar(2005, 5, 8);

        PessoaJuridica pj = new PessoaJuridica("XX.XXX.XXX/YYYY-ZZ", cal, "Sebastiao");
        PessoaFisica pf = new PessoaFisica("XXX.XXX.XXX-ZZ", cal2, "Emerson");
        PessoaFisica pf1 = new PessoaFisica("XXX.XjX.XXX-ZZ", cal2, "Emerson");


        System.out.println(pj.toString());
        System.out.println(pj.calcularIdade());
        pj.validarDocumento();
        
        System.out.println(" ");

        System.out.println(pf.toString());
        System.out.println(pf.calcularIdade());
        pf.validarDocumento();

        ColecaoPessoa col = new ColecaoPessoa();

        col.inserir(pf);
        col.inserir(pj);

        col.imprimirDadosColecao();

        col.remover();

        col.imprimirDadosColecao();

        col.inserir(pf);
        col.inserir(pj);

        col.imprimirDadosColecao();
        col.remover(0);
        col.imprimirDadosColecao();
        col.remover(0);
        col.imprimirDadosColecao();

        System.out.println(col.colecaoEstaVazia());

         col.inserir(pf);
         col.inserir(pj);
  
        col.pesquisar(pf1);

        System.out.println(col.retornarObjeto(0));

    }
}
