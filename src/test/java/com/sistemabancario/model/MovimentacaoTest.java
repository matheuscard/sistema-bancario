package com.sistemabancario.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Manoel Campos da Silva Filho
 */
public class MovimentacaoTest {
    
    @Test
    public void setTipoCreditoMaisuculo() {
        Movimentacao instancia = new Movimentacao();
        final char esperado = 'C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
        instancia.setConfirmada(true);
    }

    @Test
    public void setTipoDebito() {
        Movimentacao instancia = new Movimentacao();
        final char esperado = 'D';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test
    public void setTipoCreditoMinusculo() {
        Movimentacao instancia = new Movimentacao();
        final char esperado = 'c';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test
    public void setTipoInvalido() {
        Movimentacao instancia = new Movimentacao();
        final char invalido = 'x';
        try {
            instancia.setTipo(invalido);
        }catch(IllegalArgumentException e){
        }

        final char obtido = instancia.getTipo();
        assertNotEquals(invalido, obtido);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTipoInvalidoExcecao() {
        Movimentacao instancia = new Movimentacao();
        final char invalido = 'x';
        instancia.setTipo(invalido);
    }
    
    @Test
    public void setValorNegativo() {
        Movimentacao instancia = new Movimentacao();
        final double invalido = -100;
        try{
            
            instancia.setValor(invalido);
        
        }catch(IllegalArgumentException e){}
        
        
        final double obtido = instancia.getValor();
        assertNotEquals(invalido,obtido);
    }
    @Test
    public void setValorPositivo() {
        Movimentacao instancia = new Movimentacao();
        final double esperado = 100;    
        instancia.setValor(esperado);       
        final double obtido = instancia.getValor();
        assertEquals(esperado,obtido,0.0001);
    }

}