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
    private int qtd;
    private int maior = 0;
    private int menor = 99999;
    private int soma = 0;
    
    ArvoreBinaria(){
        raiz = null;
    }
    
    public No inserirNoRaiz(int valor, char nome){
        if(raiz == null){
            raiz = new No(valor,nome);
            
            
            
        }
        return raiz;
    
    }
    
    
    
    
    
   
    public No inserirEsquerda(No no, int valor,char nome){
            if(no.filhoEsq()== null){
                no.inserirFilhoEsq(valor, nome);
                
                
            }
            
        return no.filhoEsq();
  
    }
    
    
    
    public No inserirDireita(No no, int valor, char nome){
            if(no.filhoDir()== null){
                no.inserirFilhoDir(valor, nome);
                
                
            }
            
        return no.filhoDir();
  
    }
    
    
    
void exibeEmOrdem (No no, boolean flag) {
    if(flag){//zera os valores para nao somar caso seja execultada novamente
        
        this.qtd = 0;
        this.soma = 0;
        flag = false;
    }
        
    if (no.filhoEsq() != null) {
        exibeEmOrdem (no.filhoEsq(),flag);
    }
        this.qtd += 1;
        soma += no.getValor();
        if(no.getValor() > maior)
            maior = no.getValor();

        if(no.getValor() < menor)
            menor = no.getValor();
        
	System.out.print (no.getNome() + ": " + no.getValor() + ", ");
    if (no.filhoDir() != null) {
        exibeEmOrdem (no.filhoDir(),flag);
    }
}

void exibePreOrdem (No no) {
    System.out.print (no.getNome() + ": " + no.getValor()+ ", ");
    if (no.filhoEsq() != null) {
        exibePreOrdem (no.filhoEsq());
    }
    if (no.filhoDir() != null) {
        exibePreOrdem (no.filhoDir());
    }
}

void exibePosOrdem (No no) {
    if (no.filhoEsq() != null) {
        exibePreOrdem (no.filhoEsq());
    }
    
    if (no.filhoDir() != null) {
        exibePreOrdem (no.filhoDir());
   }
        System.out.print (no.getNome() + ": " + no.getValor()+ ", ");
    
    
    
    
    
    
    
}




























public int getQtd(){
    return qtd;
}

public int getSoma(){
    return soma;
}

public int getMaior(){
    return maior;
}

public int getMenor(){
    return menor;
}









}

    
