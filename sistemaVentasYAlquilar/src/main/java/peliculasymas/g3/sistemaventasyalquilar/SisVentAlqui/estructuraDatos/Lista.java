/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.estructuraDatos;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class Lista<E> {
    
    private  Nodo list;
    private int size;
    
    public Lista(){
        list = null;
        size=0;
    }
    
    public void listaVacia(){
        
        if(list==null){
            System.out.println("Lista Vacia");
        }
        else{
            System.out.println("Lista tiene datos");
        }
    }
    
    
    
    
    public void addNodoInicio(E dato){
        
        Nodo nuevo = new Nodo(dato);
        nuevo.sgte = list;
        list= nuevo;
        size++;
    }
    
    
    public void addNodoFinal(E dato){
        Nodo fin;
        Nodo nuevo = new Nodo(dato);
        nuevo.sgte=null;
        
        
        
        if(list==null){
            list=nuevo;
        }
        
        else{
            fin = list;
            while(fin.sgte!=null){
            
               fin = fin.sgte;    
                          
            } 
            
            fin.sgte=nuevo;
        }
                                     
        size++;
    }
    
    public E eliminarNodo(E dato){
        
        E respuesta = null;
        Nodo encontrar;
        encontrar = list;
        
        
        
        while(encontrar.sgte!=null){    
            
                if(encontrar.dato.equals(dato)){
                   respuesta = dato; 
                   
                   encontrar.sgte=encontrar.sgte.sgte;
                }
                else{
                    respuesta = null;
                }
            
               encontrar = encontrar.sgte;                             
        }
        
        return respuesta;
    }
    
    
    public int size(){
        return size;
    }
    
    public E devolverPosicion(int pos){
        Nodo nod = null;
        E devolver = null;
        int posNod=0;
        Nodo actual = list;
        
        if(list==null){
            
            JOptionPane.showMessageDialog(null,"Lista vacia");
                    
        }
        else{
            while(actual!=null){
                    
                if(pos==posNod){
                    devolver =  (E) actual.dato;
                }
                
             posNod++;       
            actual=actual.sgte;
        }
            
        }
        return devolver;
    }
    
    public void mostrar(){
        Nodo actual = list;
        
        while(actual!=null){
            
            System.out.println(actual.dato);
            actual=actual.sgte;
        }
    }
    
    public static void main(String args[]){
        
        
        
        
        
        
        
        
    }
}

