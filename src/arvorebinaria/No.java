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
    private No filhoEsq;
    private No filhoDir;
    
    
    
    No (int valor){
        this.filhoEsq = null;
        this.filhoDir = null;
        this.valor = valor;
        
    }
    
    
    
    public int getValor(){
        return valor;
    }
    
    public No filhoEsq(){
        return filhoEsq;
    }
    
    public void inserirValor(int valor){
        this.valor = valor;
    }

    
    public void inserirFilhoEsq(int valor){
        this.filhoEsq = new No(valor);
    }
    
    public void inserirFilhoDir(int valor){
        this.filhoDir = new No(valor);
    }
    
   
}
