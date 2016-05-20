/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

import java.util.ArrayList;

/**
 *
 * @author wolos
 */
public class Lista {
    private ArrayList<No> lista;
    
    
    Lista(){
        lista = new ArrayList();
    }
    
    
    public void inserir(No no){
        lista.add(no);
        crescente();
    
    }
    
    public void remover(No no){
        lista.remove(no);
        
    }
    
    
    public boolean existeNo(No no){
        if(lista.contains(no))
            return true;
        return false;
    }
    
    
    public No getNo(int indice){
        return lista.get(indice);
    }
    
    //ordena a lista de forma crescente
    private void crescente(){
        No aux = new No(0);
        if(!lista.isEmpty())
            for(int i = 0; i < lista.size() - 1; i ++)
                for(int j = i; j < lista.size() - 1; j++)
                    if((lista.get(j).getValor()) > (lista.get((j+1)).getValor())){
                        aux = lista.get(j);
                        lista.set(j, lista.get(j+1));
                        lista.set(j+1,aux);
                    }
    }
 
    
    public boolean listaVazia(){
        if(lista.isEmpty())
            return true;
        return false;
    
    }
    
    
    public int getTamanho(){
        return lista.size();
    
    }
    
    
    
    public void limpaLista(){
        lista.clear();
    }
    
    
    
    
    
}
