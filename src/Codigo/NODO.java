/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author usuario
 */
public class NODO {
    String dato;
    NODO sgte;
    NODO ante;
    public NODO(){
    }
    
    public NODO(String dato){
        this.dato=dato;
        this.sgte=null;
        this.ante=null;
    }
}
