package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    private No rabo;


    public ListaLigada() {

    }

    @Override
    public boolean buscaElemento(int valor) {
        No Atual = cabeca;
        while (Atual != null){
        if(Atual.getProximo() == valor){
            return Atual.getProximo();
        }
        for (int i = 0; valor != No Atual[i]; i++){
            if(valor == No[i]){
                System.out.println("O elemento está na lista na posição: ", i+1);
            }
            else{
                System.out.println("O elemento não esta na lista");
            }

            }
        }
    }

    @Override
    public int buscaIndice(int valor) {
        No Atual = cabeca;
        while (Atual != null){
        if(Atual.getProximo() == valor){
            return Atual.getProximo();
        }
        for (int i = 0; valor != No Atual[i]; i++){
            if(valor == [i]){
                System.out.println("A posição existe e ela tem como valor: ", No[i]+1);
            }
            else{
                System.out.println("A posição não existe");
            }

            }
        }    }

    @Override
    public int minimo() {
        
    }

    @Override
    public int maximo() {
       
    }

    @Override
    public int predecessor(int valor) {
        
    }

    @Override
    public int sucessor(int valor) {
        
    }

    @Override
    public void insereElemento(int valor) {
        
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
       
    }

    @Override
    public void insereInicio(int valor) {
        if (this.cabeca == null){
            this.cabeca = new No(valor);
        }
        else {
            No n = new No(valor);
            n.setProximo(this.cabeca);
            this.cabeca = n;
        }
        
    }

    @Override
    public void insereFim(int valor) {
        if(this.rabo == null){
            this.rabo = new No(valor);
        }
        else{
            No n = new No(valor);
            n.setProximo(this.rabo);
            n = this.rabo;
        }
        
    }

    @Override
    public void remove(int valor) {
        
    }

    @Override
    public void removeIndice(int indice) {
        
    }

    @Override
    public void removeInicio() {
       
    }

    @Override
    public void removeFim() {
        
    }
    
}

    
}
