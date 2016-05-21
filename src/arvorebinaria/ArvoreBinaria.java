/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author dario.lwoloszin
 */
public class ArvoreBinaria {
    private No raiz;
    private int valor;
    
    ArvoreBinaria(){
        raiz = null;
    }
    
    public No inserirNoRaiz(int valor){
        if(raiz == null)
            raiz = new No(valor);
        return raiz;
    
    }
   
    public No inserirEsquerda(No no, int valor){
            if(no.filhoEsq()== null)
                no.inserirFilhoEsq(valor);
        return no.filhoEsq();
  
    }
    

    
    
    
    
   
    
    
    
}
    
   
   
    
   
    
    
    
    
    
    
    
    
    