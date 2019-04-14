/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author usuario
 */
public class ListaRender extends JLabel implements ListCellRenderer{
    final static ImageIcon logoBloc = new ImageIcon("src/Imagen/blocDeNotas.jpg");
    final static ImageIcon zip = new ImageIcon("src/Imagen/zip.png");
    final static ImageIcon excel = new ImageIcon("src/Imagen/xlsx.png");
    final static ImageIcon pdf = new ImageIcon("src/Imagen/pdf.png");
    final static ImageIcon word = new ImageIcon("src/Imagen/docx.png");
    final static ImageIcon ejecutable = new ImageIcon("src/Imagen/exe.png");
    final static ImageIcon point = new ImageIcon("src/Imagen/pptx.png");
    final static ImageIcon rar = new ImageIcon("src/Imagen/zip.png");
    final static ImageIcon imagen = new ImageIcon("src/Imagen/iconogrande.png");
    final static ImageIcon carpeta = new ImageIcon("src/Imagen/carpeta.png");
    final static ImageIcon archivo = new ImageIcon("src/Imagen/archivo.png");
    //final static ImageIcon logoBloc = new ImageIcon("src/Imagen/blocDeNotas.jpg");
    //final static ImageIcon logoBloc = new ImageIcon("src/Imagen/blocDeNotas.jpg");
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String valor= value.toString();
        setText(valor);
        
        
        if (valor.matches(".*\\.txt$")) {
            setIcon(logoBloc);
        }else if (valor.matches(".*\\.zip$")) {
            setIcon(zip);
        }else if (valor.matches(".*\\.exe$")) {
            setIcon(ejecutable);
        }else if (valor.matches(".*\\.pdf$")) {
            setIcon(pdf);
        }else if (valor.matches(".*\\.docx$")) {
            setIcon(word);
        }else if (valor.matches(".*\\.xlsx$")) {
            setIcon(excel);
        }else if (valor.matches(".*\\.pptx")) {
            setIcon(point);
        }else if (valor.matches(".*\\.rar")) {
            setIcon(rar);
        }else if (valor.matches(".*\\.jpg")) {
            setIcon(imagen);
        }else if (valor.matches(".*\\.png")) {
            setIcon(imagen);
        }else if (valor.matches(".*\\.doc$")) {
            setIcon(word);
        }else if (valor.matches(".*\\.ppt$")) {
            setIcon(point);
        }else if (valor.matches(".*\\.xls$")) {
            setIcon(excel);
        }else if (valor.matches(".*\\.[\\S\\S\\S]{3,4}")) {
            setIcon(archivo);
        }else{
            setIcon(carpeta);
        }
               
        if(isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        }else{
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return this;
        
    }
    
}
