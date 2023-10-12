import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Impressora {
    private static String dataEHora(){
        GregorianCalendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(cal.getTime());
    }

    private static String consumidorCpfCnpj(CupomFiscal c){
        if (c.getCnpjConsumidor() != null) {
            return c.getCnpjConsumidor();
        } else {
            return c.getCpfConsumidor();
        }
    }

    public void imprimirNota(CupomFiscal cf) throws ImpressaoException, CupomFiscalException{
        if (cf == null || cf.getItens() == null || cf.getItens()[0] == null) {
            throw new CupomFiscalException("Cupom Fiscal inválido. Verifique os dados.");
        }

        try {
            int ac = 0;
            System.out.println("|------------------------------------------------|");
            System.out.println("|\t\t" + cf.getNomeLoja());
            System.out.println("| CNPJ: " + cf.getCnpj());
            System.out.println("| " + this.dataEHora());
            System.out.println("| - - - - - - - - - - - - - - - - - - - - - - -  ");
            System.out.println("| CNPJ/CPF: " + this.consumidorCpfCnpj(cf));
            System.out.println("| - - - - - - - - - - - - - - - - - - - - - - -  ");
            System.out.println("|\t\tCUPOM FISCAL\n|");
            System.out.println("| ITEM\t\tCODIGO\t\t\tDESCRICAO ");
            System.out.println("| \t\tQTXxUNIDADE\t\tVALOR(R$) ");
            System.out.println("| ---------------------------------------------  ");
            for (Item i : cf.getItens()) {
                ac++;
                System.out.println("| " + ac + "\t\t" + i.getCodigo() + " " + i.getNome()); 
                System.out.println("|\t\t" + i.getQuantidade() + "x" + i.getValorUnitario() + "\t\t\t " + i.calculoValorTotal() );
                
            }
            System.out.println("| TOTAL R$ \t\t\t\t" + cf.getTotalPago());
            System.out.println("| ");
            System.out.println("| VALOR RECEBIDO R$ \t\t\t" + cf.getTotalPago());
            System.out.println("| TROCO R$ \t\t\t\t" + cf.getTotalPago());
            System.out.println("|------------------------------------------------|"); 
        } catch (Exception e) {
            throw new ImpressaoException("Erro ao imprimir cupom fiscal: " + e.getMessage());
        }
        
    } 
    

    public void imprimirNotas(CupomFiscal[] c){
        int ac = 0;
        for (CupomFiscal cupomFiscal : c) {
            ac++;
            try {
                imprimirNota(cupomFiscal);
            } catch (ImpressaoException e) {
                System.out.println("Erro ao imprimir " + ac + "° cupom fiscal: " + e.getMessage());            
            } catch (CupomFiscalException e){
                System.out.println("O "+ ac + "° cupom Fiscal é inválido. Verifique os dados.");
            }finally{
                System.out.println(ac + "° cupom!");
            }
            System.out.println(" ");
            
        }
    }
}
