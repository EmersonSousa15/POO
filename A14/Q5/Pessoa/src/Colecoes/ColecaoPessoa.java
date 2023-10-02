package Colecoes;
import java.util.ArrayList;

import Pessoas.Pessoa;

public class ColecaoPessoa implements Colecao {
    private ArrayList<Pessoa> dados = new ArrayList<Pessoa>(100);
    private int posicaoCorrente = 0;

    private boolean testeIndice(int i){
        return i >= 0 && i <= this.dados.size() ? true : false;
    }

    @Override
    public boolean inserir(Pessoa p) {
        if (posicaoCorrente <= dados.size()) {
            dados.add(p);
            System.out.println("Inserido com sucesso!");
            this.posicaoCorrente++;
            return true;
        } else {
            System.out.println("Não inserido!");
            return false;
        }
    }

    @Override
    public boolean remover() {
        dados.clear();
        this.posicaoCorrente = 0;
        return true;
    }

    @Override
    public boolean remover(int i) {
        if (this.testeIndice(i)) {
            dados.remove(i);
            this.posicaoCorrente--;
            System.out.println("Removido com sucesso!");
            return true;
        } else {
            System.out.println("Não removido!");
            return false;
        }
    }

    @Override
    public void atualizar(int i, Pessoa p) {
        if (this.testeIndice(i)) {
            dados.add(i, p);
            System.out.println("Atualizado com sucesso!");
        } else {
            System.out.println("Não atualizado!");
        }
    }

    @Override
    public boolean pesquisar(Pessoa p) {
        boolean aux = false;
        for (Pessoa pes : dados) {
            if (pes.equals(p)) {
                aux = true;
                break;
            }
        }

        if (aux) {
            System.out.println("Encontrada com sucesso!");
            return aux;
        } else {
            System.out.println("Não encontrada!");
            return aux;
        }
    }

    @Override
    public boolean colecaoEstaVazia() {
        return this.posicaoCorrente > 0 ? false: true;
    }

    @Override
    public void imprimirDadosColecao() {
        if(!this.colecaoEstaVazia()){
            for (Pessoa pessoa : dados) {
                System.out.println(pessoa.toString());
            }
        }else{
            System.out.println("A colecao esta vazia!");

        }
        
    }

    @Override
    public Pessoa retornarObjeto(int i) {
        if (testeIndice(i)) {
            System.out.println("Obejto encontrado com sucesso!");
            return dados.get(i);    
        } else {
            System.out.println("Objeto não encontrado!");
            return null;
        }
    }
    
}
