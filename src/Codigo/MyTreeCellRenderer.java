/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class MyTreeCellRenderer extends DefaultTreeCellRenderer{
    final static ImageIcon descarga = new ImageIcon("src/Imagen/arbol/descarga.png");
    final static ImageIcon disc = new ImageIcon("src/Imagen/arbol/disc.png");
    final static ImageIcon disd = new ImageIcon("src/Imagen/arbol/disd.png");
    final static ImageIcon documento = new ImageIcon("src/Imagen/arbol/documento.png");
    final static ImageIcon drive = new ImageIcon("src/Imagen/arbol/drive.png");
    final static ImageIcon equipo = new ImageIcon("src/Imagen/arbol/equipo.png");
    final static ImageIcon escritorio = new ImageIcon("src/Imagen/arbol/escritorio.png");
    final static ImageIcon fav = new ImageIcon("src/Imagen/arbol/fav.png");
    final static ImageIcon imagenes = new ImageIcon("src/Imagen/arbol/imagenes.png");
    final static ImageIcon musica = new ImageIcon("src/Imagen/arbol/musica.png");
    final static ImageIcon objeto = new ImageIcon("src/Imagen/arbol/objeto.png");
    final static ImageIcon red = new ImageIcon("src/Imagen/arbol/red.png");
    final static ImageIcon video = new ImageIcon("src/Imagen/arbol/video.png");
    
    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus){
        super.getTreeCellRendererComponent(tree, value, selected,expanded, leaf, row, hasFocus);
        
        String valor= value.toString();
        setText(valor);
        
        if (valor.matches("\\.")) 
             setIcon(null);
        else if (valor.matches("Acceso rápico")) 
             setIcon(fav);
        else if (valor.matches("Escritorio")) 
            setIcon(escritorio);
        else if (valor.matches("Descargas")) 
             setIcon(descarga);
        else if (valor.matches("Documentos")) 
             setIcon(documento);
        else if (valor.matches("Imagenes")) 
             setIcon(imagenes);
        else if (valor.matches("Música")) 
             setIcon(musica);
        else if (valor.matches("Vídeos")) 
             setIcon(video);
        else if (valor.matches("OneDrive")) 
             setIcon(drive);
        else if (valor.matches("Este Equipo")) 
            setIcon(equipo);
        else if (valor.matches("C\\:.")) 
            setIcon(disc);
        else if (valor.matches("D\\:.")) 
             setIcon(disd);
        else if (valor.matches("E\\:.")) 
             setIcon(disd);
        else if (valor.matches("Red")) 
             setIcon(red);
        
        return this;
    }
    
}
    
    

