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
public class listasDobles {
    private NODO cabi;
    private NODO cabu;
   

	public listasDobles(){
            cabi=null;
            cabu=null;
	}
	

	public void insertarInicio(String dato){
            NODO neo = new NODO(dato);
            if(cabi==null){
                cabi=neo;
                cabu=neo;
            }
            else{
		neo.sgte=cabi;
		cabi.ante=neo;
		cabi=neo;
            }
	}
        
        
        public void insertarFinal(String dato){
            NODO neo =  new NODO(dato);
            if(cabi==null){
                cabi=neo;
                cabu=neo;
            }
            else{
                neo.ante=cabu;
                cabu.sgte=neo;
                cabu=neo;
            }
        }
        
        public void insertar_antes_X(String dato, String X){
            NODO neo = new NODO(dato);
            NODO p=cabi;
            while(p!=null && p.dato!=X){
                p=p.sgte;
            }
            if(p.dato==X){
                neo.sgte=p;
                NODO q=p.ante;
                p.ante=neo;
                if(cabi==p){
                    cabi=neo;
                    neo.ante=null;
                }else{
                    q.sgte=neo;
                    neo.ante=q;
                }
            }else{
                System.out.println("El elemento " + X + " no se encuentra en la lista\n");
            }
            
        }
		

	public void mostrarLista(){
            NODO p;
            int ctdor=1;
            if(cabi!=null){
                p=cabi;
                while (p!=null){
                    System.out.print(p.dato+"->");
                    //System.out.print((((ctdor%5!=0)&&(p!=null))?" ->":"\n"));
                    p=p.sgte;
                    ctdor=ctdor+1;
                }
                System.out.println("");
            }
            else{
                System.out.println("Lista vaciaaa...");
            }
	}
        
	public void eliminarNodo (String dato){
            NODO actual;
            boolean encontrado = false;
            actual=cabi;
            if(actual!=null){
                while ((actual != null) && (!encontrado)){
                    encontrado = (actual.dato == dato);
                    if (!encontrado){
                    actual = actual.sgte;
                    }
                }
                if (actual != null){
                    if (actual == cabi){
                        cabi = actual.sgte;
                        if (actual.sgte != null){
                        actual.sgte.ante = null;
                        }
                    }
                    else 
                        if (actual.sgte != null){
                        actual.ante.sgte = actual.sgte;
                        actual.sgte.ante = actual.ante;
                        }
                        else{
                            actual.ante.sgte = null;
                        }
                        actual= null;
                }	
            }
            else{
                System.out.println("Lista vaciaaa...");
            }
	}
        
        public void eliminarInicio(){
            NODO Q;
            Q=cabi;
            if(Q.sgte!=null){
                cabi=Q.sgte;
                cabi.ante=null;
            }else{
                cabi=null;
                cabu=null;
            }
        }
        
        public void eliminarFinal(){
            NODO Q;
            Q=cabu;
            if(Q.ante!=null){
                cabu=Q.ante;
                cabu.sgte=null;
            }else{
                cabi=null;
                cabu=null;
            } 
        }
        
        public boolean vacio(){
            if(cabi==null && cabu==null){
                return true;
            }else
                return false;
        }
        
        public String muestraFinal(){
            return cabu.dato;
        }
        
        public String muestraInicio(){
            return cabi.dato;
        }
}
