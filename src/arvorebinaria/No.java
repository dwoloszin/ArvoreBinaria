/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author wolos
 */
public class No {
    private int valor;
    private No anterior;
    private No proximo;
    
    
    
    No (int valor){
        this.anterior = null;
        this.proximo = null;
        this.valor = valor;
        
    }
    
    
    
    public int getValor(){
        return valor;
    }
    
    public No getAnterior(){
        return anterior;
    }
    
    public No getProximo(){
        return proximo;
    }
    
    public void inserirValor(int valor){
        this.valor = valor;
    }
    
    public void inserirProximo(No proximo){
        this.proximo = proximo;
    }
    
    public void inserirAnterior(No anterior){
        this.anterior = anterior;
    }
    
   
}
