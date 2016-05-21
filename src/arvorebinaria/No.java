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
    private char nome;
    
    
    
    No (int valor, char nome){
        this.filhoEsq = null;
        this.filhoDir = null;
        this.valor = valor;
        this.nome = nome;
        
    }
    
    public char getNome(){
    return nome;
    }
    
    
    public int getValor(){
        return valor;
    }
    
    public No filhoEsq(){
        return filhoEsq;
    }
    
    public No filhoDir(){
        return filhoDir;
    }
    
    
    public void inserirValor(int valor){
        this.valor = valor;
    }

    
    public void inserirFilhoEsq(int valor, char nome){
        this.filhoEsq = new No(valor,nome);
    }
    
    public void inserirFilhoDir(int valor, char nome){
        this.filhoDir = new No(valor, nome);
    }
    
    public void removerFilhoEsq(){
        this.filhoEsq = null;
        
    }
    
    public void removerFilhoDir(){
        this.filhoEsq = null;
        
    }
    
    
    
   
}
