package org.curse.tdd.coursera.dev.pilha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest {

    @Test //esse é o nome do método relacionado ao ambiente de teste
    void estaVazia() {
        Pilha pi = new Pilha();
        assertTrue(pi.estaVazia());
        assertEquals(0, pi.tamanho());
    }
    @Test
    public void empilhar(){
        Pilha pi = new Pilha();
        pi.empilhar("primeiro");
        assertFalse(pi.estaVazia());
        assertEquals(1, pi.tamanho());
        assertEquals("primeiro", pi.topo());
    }
}