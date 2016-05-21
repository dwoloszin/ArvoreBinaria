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
       
       
       
       No A = arvore.inserirNoRaiz(10,'A');
       //arvore da equerda
       No B = arvore.inserirEsquerda(A, 20,'B');
       No D = arvore.inserirEsquerda(B, 40,'D');
       No E = arvore.inserirDireita(B, 50,'E');
       
       //arvore da direita
       No C = arvore.inserirDireita(A, 30,'C');
       No F = arvore.inserirEsquerda(C, 60,'F');
       No G = arvore.inserirDireita(C, 70,'G');
       
        System.out.print("Ordem visitada: 'ORDEM'    [");
        arvore.exibeEmOrdem(A,true);//sempre true
        System.out.print("]\n");
        
        System.out.print("Ordem visitada: 'PreOrdem' [");
        arvore.exibePreOrdem(A,true);//sempre true
        System.out.print("]\n");
        
        System.out.print("Ordem visitada: 'PosOrdem' [");
        arvore.exibePosOrdem(A,true);//sempre true
        System.out.print("]\n");

        
    
        
        System.out.println("\nQtd  : " + arvore.getQtd());
        System.out.println("Soma : " + arvore.getSoma());
        System.out.println("Maior: " + arvore.getMaior());
        System.out.println("Menor: " + arvore.getMenor());

        
        
    }
    
}
