import java.util.ArrayList;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws Exception {
        GregorianCalendar cal = new GregorianCalendar(2005, 5, 8);
        Colaborador c1 = new Colaborador("111.111.111-11", "Emerson", 'M', 2000, cal);

        GregorianCalendar cal1 = new GregorianCalendar(1989, 5, 8);
        Colaborador c2 = new Colaborador("000.000.000-00", "Antonia", 'F', 2000, cal1);

        GregorianCalendar cal2 = new GregorianCalendar(2024, 5, 8);
        Colaborador c3 = new Colaborador("222.222.222-22", "Sebastião", 'M', 2000, cal2);
        System.out.println(c1.validaDataAdmissao());
        System.out.println(c1.validaCPF());

        OperacaoColaborador opCol = new OperacaoColaborador();
        ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();
        colaboradores.add(0, c1);
        colaboradores.add(1, c2);
        colaboradores.add(2, c3);

        opCol.buscarCPF(colaboradores, "111.111.111-11");
        opCol.colaboradorTrabalhaAMaisTempo(colaboradores);
        opCol.validarColaboradores(colaboradores);
    }
}
