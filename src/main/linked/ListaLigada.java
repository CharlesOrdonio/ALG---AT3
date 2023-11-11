package linked;

import list.EstruturaElementar;

public class No{
    int num;
    No proximo;

    public No (int num){
        this.num = num;
        this.proximo = null;
    }
}

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {
        this.cabeca = cabeca;

    }

    @Override
    public boolean buscaElemento(int valor) {
        No num = cabeca;

        while (num != null){

            if(num == valor){
                return true;
            }
            num = num.proximo;
        }
        return false;
    }

    @Override
    public int buscaIndice(int indice) {
        Node num = cabeca;
        int endereco = 0;

    
        while (num != null) {
            if (endereco == indice) {
                return num;
            }
            num = num.proximo;
            endereco++;
        }
        return false
    }

    @Override
    public int minimo() {
        No num = cabeca;
        int menor = num.valor;

        while (num != null) {
            if (num.valor < menor) {
                menor = num.valor;
            }
            num = num.proximo;
        }
        return menor;
    }

    @Override
    public int maximo() {
       No num = cabeca;
        int maior = num.valor;

        while (num != null) {
            if (num.valor > maior) {
                maior = num.valor;
            }
            num = num.proximo;
        }
        return menor;
    }

    @Override
    public int predecessor(int valor) {
        No num = cabeca;
        No predecessor = null;

        while (num != null) {
            if (num.valor == valor) {
                if (predecessor != null) {
                    return predecessor.valor;
                } 
                else {
                    return false
                }
        }
        predecessor = num;
        num = num.proximo;
        }
    }

    @Override
    public int sucessor(int valor) {
        No num = cabeca;
        No sucessor = null;

        while (num != null) {
            if (num.valor == valor) {
                if (sucessor != null) {
                    return sucessor.valor;
                } 
                else {
                    return false
                }
        }
        num = num.proximo;
        sucessor = num.proximo;
        }
    }

    @Override
    public void insereElemento(int valor) {
        No novoNo = new No(valor);

        if (cabeca == null) {
            cabeca = novoNo;
            return;
        }

        No ultimo = cabeca;
        while (ultimo.proximo != null) {
            ultimo = ultimo.proximo;
        }

        ultimo.proximo = novoNo;
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
       No novoNo = new No(valor);

        if (buscaIndice == 0) {
            novoNo.proximo = cabeca;
            cabeca = novoNo;
            return;
        }

        No num = cabeca;
        No ultimo = null;
        int endereco = 0;

        while (num != null && num < endereco) {
            ultimo = num;
            num = num.proximo;
            endereco++;
        }

        if (ultimo != null) {
            ultimo.proximo = novoNo;
            novoNo.proximo = num;
        }

        else {
            cabeca = novoNo;
        }
    }

    @Override
    public void insereInicio(int valor) {
        if (this.cabeca == null){
            this.cabeca = new No(valor);
        }
        else {
            No novoNo = new No(valor);
            novoNo.setProximo(this.cabeca);
            this.cabeca = novoNo;
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
        if (cabeca.valor == valor) {
            cabeca = cabeca.proximo;
            return;
        }

        No num = cabeca;
        No ultimo = null;

        while (num != null && endereco != valor) {
            ultimo = num;
            num = num.proximo;
        }

        if (num != null) {
            ultimo.proximo = num.proximo;
        }
    }

    @Override
    public void removeIndice(int indice) {
        if (indice == 0) {
            cabeca = cabeca.proximo;
            return;
        }

        No num = cabeca;
        No ultimo = null;
        int endereco = 0;

        while (num != null && endereco < indice) {
            proximo = num;
            num = num.proximo;
            endereco++;
        }

        if (num != null) {
            ultimo.proximo = num.proximo;
        }
    }

    @Override
    public void removeInicio() {
       cabeca = cabeca.proximo;
    }

    @Override
    public void removeFim() {
        if (cabeca.proximo == null) {
            cabeca = null;
            return;
        }

        No penutimo = cabeca;
        while (penutimo.proximo.proximo != null) {
            penutimo = penutimo.proximo;
        }

        penutimo.proximo = null;
    }
    
}
