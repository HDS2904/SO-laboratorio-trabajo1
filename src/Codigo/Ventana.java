package Codigo;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;


public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        arbol(); //acciones que pueden ejecutarse en otra clase , recomendable
        estilo(); // nose porque pero no reconoce la carpeta imagen para cargarlas, pueden comentarla sino
    }
    
    public void estilo(){
        DefaultTreeCellRenderer render=(DefaultTreeCellRenderer)jtree.getCellRenderer();
        render.setLeafIcon(new ImageIcon(this.getClass().getResource("../Imagen/archivo.png")));
        render.setOpenIcon(new ImageIcon(this.getClass().getResource("../Imagen/carpeta.png")));
        render.setClosedIcon(new ImageIcon(this.getClass().getResource("../Imagen/carpeta.png")));
    }
    
    public void arbol(){
        DefaultTreeModel arbol = (DefaultTreeModel) jtree.getModel();
	DefaultMutableTreeNode nodo = new DefaultMutableTreeNode("PC");

	arbol.setRoot(nodo); //Le agrego el nodo raiz al arbol
        
        //bucle para interactur con los archivos c,d,e,etc
        for(int i=0;i<File.listRoots().length;i++){
            DefaultMutableTreeNode hijo=new DefaultMutableTreeNode(File.listRoots()[i]);
            String a = ""+File.listRoots()[i];
            Cargar(arbol, hijo, a); //lleno el subarbol c,d,e,etc respectivamente
            arbol.insertNodeInto(hijo, nodo, i);// cargo a la raiz principal PC los subarboles
        }
        
    }
    
    public void Cargar(DefaultTreeModel arbol,DefaultMutableTreeNode padre, String ruta){
        DefaultMutableTreeNode aux = null;

		File archivo = new File(ruta); // puntero al directorio de la ruta
		File[] archivos = archivo.listFiles(); // lista todos los archivos de la ruta
                
		// recorre lo que hay en la ruta
		if (archivos != null) {
			for (int i = 0; i < archivos.length; i++) {

				// creando un nodo con cada cosa del directorio
				aux = new DefaultMutableTreeNode(archivos[i].getName());
				// inserta el nodo hijo 
				arbol.insertNodeInto(aux, padre, i);

				// si encontramos un directorio volvemos a hacer lo mismo con sus hijos
				if (archivos[i].isDirectory()) {
					try {
						// llamando recursivamente de nuevo a ésta misma función
						Cargar(arbol, aux,archivos[i].getAbsolutePath() + "/");
						
					} catch (Exception e) {
						System.out.println(e.getMessage()); // por si acaso le he puesto un try xD
					}
				}

			}

		}
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtree = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jtree);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
    
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

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jtree;
    // End of variables declaration//GEN-END:variables
}
