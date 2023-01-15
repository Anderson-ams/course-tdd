package org.curse.tdd.coursera.dev.pilha;

public class Pilha {

    private Object elemento;
    private int quantidade;
    public boolean estaVazia(){
        if(elemento == null){
            return true;
        }
        return false;
    }

    public int tamanho() {
        return 1;
    }

    public void empilhar(Object elemento) {
        this.elemento = elemento;
        quantidade++;
    }

    public Object topo() {
        return elemento;
    }
}
