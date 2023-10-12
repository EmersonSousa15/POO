public class App {
    public static void main(String[] args) throws Exception {
        Item i1 = new Item(45, "Forno microondas", 355.00, 1);
        Item i2 = new Item(80, "Cisulador de ar", 125.00, 2);
        Item i3 = new Item(82, "Televisao 14'", 470.00, 1);

        Item[] compra1 = {i1, i2, i3}; 
        Item[] compra2 = new Item[3];
        CupomFiscal cf1 = new CupomFiscal("MC ELETRODOMETICOS", "01.111.111/0001-19", 1100.00, null, "00.879.197/0001-80", 1100.00, 25.00, compra1);
        CupomFiscal cf2 = new CupomFiscal("MC ELETRONICOS", "01.111.111/0001-19", 1100.00, null, "00.879.197/0001-80", 1100.00, 25.00, compra1);
        CupomFiscal cf3 = new CupomFiscal("MC MOVEIS", "01.111.111/0001-19", 1100.00, null, "00.879.197/0001-80", 1100.00, 25.00, compra1);

        CupomFiscal cf4 = new CupomFiscal("MC MOVEIS", "01.111.111/0001-19", 1100.00, null, "00.879.197/0001-80", 1100.00, 25.00, compra2);

        CupomFiscal[] cupons = {cf1, cf4, cf3};
        Impressora impressora = new Impressora();
        

        impressora.imprimirNota(cf1);
        impressora.imprimirNotas(cupons);
    }
}
