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
public class ArvoreBinaria {
    
    private Lista direita;
    private Lista esquerda;
    private No raiz;
    
    
    ArvoreBinaria(){
        this.direita = new Lista();
        this.esquerda = new Lista();
        this.raiz = new No(0);
    }
    
    
    public void inserir(int valor){
        No novo = new No(valor);
        if(esquerda.listaVazia()){
            esquerda.inserir(novo);
        }
        else{
            direita.inserir(novo);
        }
        
        
        balanciamento();
                
    }
    
    private void inserirEsquerda(int valor){
        No aux = new No(valor);
        esquerda.inserir(aux);

    }
    
     private void inserirDireita(int valor){
        No aux = new No(valor);
        direita.inserir(aux);

    }
    
    
    
    
    private void balanciamento(){
        Lista listaAuxiliar = new Lista();
        int soma = 0;
        int maior = 0;
        int media = 0;
        
        
        
        //INSERIR TUDO EM UMA LISTA SO!
        if(!direita.listaVazia()) //se a lista nao tiver vazia
            for(int i = 0; i < direita.getTamanho(); i++){
                listaAuxiliar.inserir(direita.getNo(i));
                soma = soma + (direita.getNo(i).getValor());
                if(direita.getNo(i).getValor() > maior)
                    maior = direita.getNo(i).getValor();
                
                
            }
        
        if(!esquerda.listaVazia()) //se a lista nao tiver vazia
            for(int i = 0; i < esquerda.getTamanho(); i++){
                listaAuxiliar.inserir(esquerda.getNo(i));
                soma = soma + (esquerda.getNo(i).getValor());
                if(esquerda.getNo(i).getValor() > maior)
                    maior = esquerda.getNo(i).getValor();
                
                
            }
        
        
        // atulaizar o valor do no RAIZ com a media dos valores
        // trata com media ponderada
        //Trata media!
        //media simples
        media = soma/(listaAuxiliar.getTamanho()) ;
        
        
        
        
        System.out.println(media + ", " + soma+ ", " + maior);
        
                
        
        
        
        
        this.raiz.inserirValor(media);
        
        
        
        //esvazia as listas
        direita.limpaLista();
        esquerda.limpaLista();
        
        
        // refaz a arvore e insere os valores
        for(int i = 0; i < listaAuxiliar.getTamanho(); i++){
           if(listaAuxiliar.getNo(i).getValor() > raiz.getValor()){
               direita.inserir(listaAuxiliar.getNo(i));
           }
           else{
               esquerda.inserir(listaAuxiliar.getNo(i));
           
           }
           
 
        }
        listaAuxiliar.limpaLista();
        
       

    }
    
    
    
    
    public void printArvore(){
        System.out.print("Arvore Esquerda: ");
        for(int i = 0; i < esquerda.getTamanho(); i++)
            System.out.print(esquerda.getNo(i).getValor() + ", ");
        
        System.out.println("");
        System.out.print("Arvore Direita: ");
        for(int i = 0; i < direita.getTamanho(); i++)
            System.out.print(direita.getNo(i).getValor() + ", ");

    
    }
    
    
 
}
