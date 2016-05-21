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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
       ArvoreBinaria arvore = new ArvoreBinaria();
       No raiz;
       
       
       raiz = arvore.inserirNoRaiz(10);
       No filho1 = arvore.inserirEsquerda(raiz, 20);
       No filho2 = arvore.inserirEsquerda(filho1, 30);
       No filho3 = arvore.inserirEsquerda(filho2, 40);
  
    }
    
}
