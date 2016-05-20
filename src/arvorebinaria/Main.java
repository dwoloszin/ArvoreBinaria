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
        
        arvore.inserir(1);
        arvore.inserir(10);
        arvore.inserir(3);
        arvore.inserir(2);
        arvore.inserir(8);
        arvore.inserir(98);
        
        
        
        arvore.printArvore();
        
        
        
    }
    
}
