import java.util.ArrayList;

public class OperacaoColaborador {
        public static void validarColaboradores(ArrayList<Colaborador> arr){
            for (Colaborador colaborador : arr) {

                if (!colaborador.validaCPF()) {
                    System.out.println(colaborador.getNome() + " tem o CPF invalido!");
                    System.out.println("Digite um CPF valido, ele deve ter 14 caracteres");

                } else if(!colaborador.validaDataAdmissao()){
                    System.out.println(colaborador.getNome() + " tem a data de admissão invalida!");
                    System.out.println("Digite a data de admissão correta, ela deve ser >= 1990 e <= ano atual");

                }else{
                    System.out.println(colaborador.getNome() + " e um colaborador valido!");
                }
            }
        }

        public static void buscarCPF(ArrayList<Colaborador> arr, String cpf){
            int count = 0;
            if (cpf.length() == 14) {
                for (Colaborador colaborador : arr) {
                    if(colaborador.getCPF().equals(cpf)){
                        count++;
                    }
                }
                if(count > 0){
                    System.out.println("Ha " + count + " colaborador(s) com o CPF recebido!");
                }else{
                    System.out.println("Não ha colaborador com o CPF recebido!");
                }
            } else {
                System.out.println("O CPF recebido e invalido!");
            }

        }

        public static void colaboradorTrabalhaAMaisTempo(ArrayList<Colaborador> arr){
                Colaborador maisTempo = arr.get(0);
                for (Colaborador colaborador : arr) {
                    if(colaborador.trabalhaMaisTempo(maisTempo)){
                        if (colaborador.validaDataAdmissao()) {
                            maisTempo = colaborador;
                        }else{
                            System.out.println(colaborador.getNome() + " tem a data de admissao invalida!");
                        }
                        
                    }
                }
                 System.out.println(maisTempo.getNome() + " e o colaborador que trabalha a mais tempo, desde " + maisTempo.getDataAdmissaoTexto());


        }
            
}

