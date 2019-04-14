/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author band
 */
public class Ventana extends javax.swing.JFrame {

    DefaultListModel modeloLista;
    
    DefaultTreeModel nav;
    
    DefaultMutableTreeNode nroot;
    DefaultMutableTreeNode nr2;
    
    Contenedor cn;
    
    String a;
    public Ventana() {
        initComponents();
        a="";
        modeloLista = new DefaultListModel();
        jList.setModel(modeloLista);
        jList.setCellRenderer(new ListaRender());
        
        nav = (DefaultTreeModel) jtree.getModel();
         
        //estilos
        this.getContentPane().setBackground(Color.WHITE);
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagen/icono.png")).getImage());
        this.setLocationRelativeTo(Ventana.this);
        EventoClick();
        Raiz();
        estilo();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        poupMenu = new javax.swing.JPopupMenu();
        popupAbrir = new javax.swing.JMenuItem();
        popupCrear = new javax.swing.JMenuItem();
        popupEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtruta = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        cant = new javax.swing.JTextField();
        cantdetalle = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        popupAbrir.setText("Abrir");
        popupAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupAbrirActionPerformed(evt);
            }
        });
        poupMenu.add(popupAbrir);

        popupCrear.setText("Crear");
        popupCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupCrearActionPerformed(evt);
            }
        });
        poupMenu.add(popupCrear);

        popupEliminar.setText("Eliminar");
        popupEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupEliminarActionPerformed(evt);
            }
        });
        poupMenu.add(popupEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Este Equipo");

        jPanel1.setBackground(java.awt.Color.white);

        jTextField2.setText("Buscar acceso rapido");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/abajo.png"))); // NOI18N
        jButton5.setBorder(null);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/adelante.png"))); // NOI18N
        jButton4.setBorder(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cargar.png"))); // NOI18N
        jButton2.setBorder(null);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/arriba.png"))); // NOI18N
        jButton6.setBorder(null);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/atras.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/buscar.png"))); // NOI18N
        jButton1.setBorder(null);

        txtruta.setEditable(true);
        txtruta.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton3)
                .addGap(14, 14, 14)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtruta, 0, 619, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtruta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportView(jtree);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/iconogrande.png"))); // NOI18N
        jButton7.setBorder(null);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/iconolista.png"))); // NOI18N
        jButton8.setBorder(null);

        cant.setEditable(false);
        cant.setBorder(null);

        cantdetalle.setEditable(false);
        cantdetalle.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantdetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantdetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(cant)
        );

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jList.setComponentPopupMenu(poupMenu);
        jScrollPane3.setViewportView(jList);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Equipo");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Vista");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void popupAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupAbrirActionPerformed
        String rut = "";
        String prueba = "";
        rut = jList.getSelectedValue();
        prueba = (String) txtruta.getSelectedItem();
        File archivo = new File(prueba + "\\" + rut);
        if (archivo.exists()) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(archivo);
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Este archivo no se puede abrir");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este archivo no existe");
        }
    }//GEN-LAST:event_popupAbrirActionPerformed

    private void popupCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupCrearActionPerformed
        String nombre = JOptionPane.showInputDialog(null, "Nombre de la carpeta");
        String prueba = "", dire = "",rut;
        cn = new Contenedor();
        cn.setNombre(nombre);

        prueba = (String) txtruta.getSelectedItem();
        dire = prueba + "\\" + nombre;
        File carpeta = new File(dire);
        carpeta.mkdir();
        TreePath parentPath = jtree.getSelectionPath();
        if (parentPath != null) {
            DefaultMutableTreeNode parentNode = null;
            parentNode = (DefaultMutableTreeNode) (parentPath.getLastPathComponent());
            System.out.println(parentPath.getLastPathComponent());
            DefaultMutableTreeNode nuevo = new DefaultMutableTreeNode(cn);

            nav.insertNodeInto(nuevo, parentNode, parentNode.getChildCount());
            

        } else {
            JOptionPane.showMessageDialog(this, "seleccione un nodo");
        }
        modeloLista.addElement(nombre);
    }//GEN-LAST:event_popupCrearActionPerformed

    private void popupEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupEliminarActionPerformed
        String nomb = "", prueba = "", dire = "";
        int ubi;
        if (jList.isSelectionEmpty()) {

        } else {
            TreePath parent = jtree.getSelectionPath();

            nomb = jList.getSelectedValue().toString();
            prueba = (String) txtruta.getSelectedItem();
            dire = prueba + "\\" + nomb;

            System.out.println(dire);
            File archivo = new File(dire);

            ubi = jList.getSelectedIndex();
            modeloLista.remove(ubi);
            System.out.println(ubi + "");

            if (archivo.isDirectory()) {
                DefaultMutableTreeNode aux = (DefaultMutableTreeNode) parent.getLastPathComponent();

                for (int i = 0; i < aux.getChildCount(); i++) {
                    if (aux.getChildAt(i).toString().equals(nomb)) {
                        nav.removeNodeFromParent((MutableTreeNode) aux.getChildAt(i));
                    }
                }

            }

            archivo.delete();

        }
    }//GEN-LAST:event_popupEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cant;
    private javax.swing.JTextField cantdetalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JList<String> jList;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTree jtree;
    private javax.swing.JMenuItem popupAbrir;
    private javax.swing.JMenuItem popupCrear;
    private javax.swing.JMenuItem popupEliminar;
    private javax.swing.JPopupMenu poupMenu;
    private javax.swing.JComboBox<String> txtruta;
    // End of variables declaration//GEN-END:variables
    
    public void estilo() {
        DefaultTreeCellRenderer render = (DefaultTreeCellRenderer) jtree.getCellRenderer();
        render.setLeafIcon(new ImageIcon(this.getClass().getResource("../Imagen/carpeta.png")));
        render.setOpenIcon(new ImageIcon(this.getClass().getResource("../Imagen/carpeta.png")));
        render.setClosedIcon(new ImageIcon(this.getClass().getResource("../Imagen/carpeta.png")));
    }
    
    
    public void Raiz() {

        cn = new Contenedor("","Raiz");
        nroot = new DefaultMutableTreeNode(cn);
        
        cn = new Contenedor("","Este Equipo");
        nr2 = new DefaultMutableTreeNode(cn);
        nroot.add(nr2);
        
        nav.setRoot(nroot); //Le agrego el nodo raiz al arbol
        
         for(int i=0;i<File.listRoots().length;i++){
            DefaultMutableTreeNode hijo=new DefaultMutableTreeNode(File.listRoots()[i]);
            nr2.add(hijo);
        }  
         EventoClickList();

    }
    
    
    public void EventoClick(){
        jtree.addTreeSelectionListener(new TreeSelectionListener(){
            
        @Override
        public void valueChanged(TreeSelectionEvent e) {
            DefaultMutableTreeNode sel=(DefaultMutableTreeNode)jtree.getLastSelectedPathComponent();
            //impresion de ruta
            a=obtenerRuta(sel);
            txtruta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{a}));
            try{
                System.out.println(jtree.getLastSelectedPathComponent());
                for(int i=0;i<sel.getChildCount();i++){
                    DefaultMutableTreeNode nieto=(DefaultMutableTreeNode)sel.getChildAt(i);
                    try{
                    agregarHijos(nieto);
                    }catch(NullPointerException npe){
                //
                    }
                }
            }catch(NullPointerException npe){
                //
            }
            
            //Evento desplegar en jList
            int cont = 0;
            File archivo = new File(a);
            File[] archivos = archivo.listFiles();
            String salida;
            if (archivos != null) {
                modeloLista.removeAllElements();
                for (int i = 0; i < archivos.length; i++) {
                    cont++;
                    if (archivos[i].exists()) {
                        salida = archivos[i].getName();
                        modeloLista.addElement(salida);
                    } else {
                        JOptionPane.showMessageDialog(null, "error");
                        break;
                    }
                }
                //impresion de cantidad de elementos de la parte
                cant.setText("" + cont);
                if (cont != 1) {
                    cantdetalle.setText("Elementos");
                } else {
                    cantdetalle.setText("Elemento");
                }
            }
        }
   
        });
    }
    
    
    public String obtenerRuta(DefaultMutableTreeNode p){
        String ruta="";
        if((p.getParent()+"").equals("Este Equipo")){
            ruta=p.clone().toString();
        }else{
            for(int i=1;i<p.getPath().length-1;i++){
                ruta=ruta+p.getPath()[i+1]+"\\";
            }
        }
        return ruta;
    }
    
 
    public void agregarHijos(DefaultMutableTreeNode padre) throws NullPointerException{
        int j = 0;
        DefaultMutableTreeNode aux = null;
        
        if(padre!=nr2){
            String rut=obtenerRuta(padre);
            File fpadre=new File(rut);
            File[] fnietos = fpadre.listFiles();
            
            if (fnietos != null) {
                for (int i = 0; i < fnietos.length; i++) {
                    cn = new Contenedor(rut,fnietos[i].getName());
                    // creando un nodo con cada cosa del directorio
                    aux = new DefaultMutableTreeNode(cn);
                    // si encontramos un directorio volvemos a hacer lo mismo con sus hijos
                    if (fnietos[i].isDirectory()) {
                        // inserta el nodo hijo 
                        nav.insertNodeInto(aux, padre, j);
                        j++;
                    }
                }
            }
        }
    }
    
    
    public void EventoClickList(){
        //Listar por doble click en en el archivo dentro de jtalist
        jList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                int cont = 0;
                String rut = "";
                String prueba = "";
                String total = "";
                JList list = (JList) evt.getSource();

                if (evt.getClickCount() == 2) {
                    try {
                        rut = jList.getSelectedValue().toString();
                        prueba = (String) txtruta.getSelectedItem();
                        File archivo = new File((String) txtruta.getSelectedItem() + "\\" + rut);
                        total = (String) txtruta.getSelectedItem() + "\\" + rut;
                        if (archivo.exists()) {
                            if (archivo.isDirectory()) {
                                File arch = new File(total);
                                File[] archs = arch.listFiles();
                                String salida;
                                if (archs != null) {
                                    modeloLista.removeAllElements();
                                    for (int i = 0; i < archs.length; i++) {
                                        cont++;
                                        if (archs[i].exists()) {
                                            salida = archs[i].getName();
                                            modeloLista.addElement(salida);
                                            txtruta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{total}));
                                        } else {
                                            JOptionPane.showMessageDialog(null, "error");
                                            break;
                                        }
                                    }
                                    //Impresion del contador de archivos
                                    cant.setText("" + cont);
                                    if (cont != 1) {
                                        cantdetalle.setText("Elementos");
                                    } else {
                                        cantdetalle.setText("Elemento");
                                    }
                                }
                            } else {
                                if (Desktop.isDesktopSupported()) {
                                    File file = new File(total);
                                    Desktop.getDesktop().open(file);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Este archivo no se puede abrir");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Este archivo no existe");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    int index = list.locationToIndex(evt.getPoint());
                }
                //}

            }
        });
    }

}
