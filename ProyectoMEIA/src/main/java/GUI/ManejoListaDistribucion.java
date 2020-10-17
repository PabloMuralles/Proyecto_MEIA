/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Management.Data;
import Management.ManejoArchivo;
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author derly
 */
public class ManejoListaDistribucion extends javax.swing.JFrame {

    /**
     * Creates new form ManejoListaDistribucion
     */
    public ManejoListaDistribucion() {
        initComponents();
        var dataUser = Data.getData();
        var user = dataUser.getUser();
        var strError = "";
        var objManejoArchivo = new ManejoArchivo();
        
        var listaMostrar = new DefaultListModel();
        File Archivo = new File("C:/MEIA/lista.txt");
        var lista = objManejoArchivo.LecturaCompleta(Archivo, strError);
        for (int i = 0; i < lista.size(); i++) {
            var splitAux = lista.get(i).split(Pattern.quote("|"));
            if(splitAux[1].equals(user) && splitAux[5].equals("1")){
               listaMostrar.addElement(splitAux[0] + "-" + splitAux[2]);
            }
        }

        Archivo = new File("C:/MEIA/bitacora_lista.txt");
        lista = objManejoArchivo.LecturaCompleta(Archivo, strError);
        for (int i = 0; i < lista.size(); i++) {
            var splitAux = lista.get(i).split(Pattern.quote("|"));
            if(splitAux[1].equals(user) && splitAux[5].equals("1")){
               listaMostrar.addElement(splitAux[0] + "-" + splitAux[2]);
            }
        }
        lListas.setModel(listaMostrar);
        listaMostrar = new DefaultListModel();
        Archivo = new File("C:/MEIA/contactos.txt");
        lista = objManejoArchivo.LecturaCompleta(Archivo, strError);
        for (int i = 0; i < lista.size(); i++) {
            var splitAux = lista.get(i).split(Pattern.quote("|"));
            if(splitAux[0].equals(user) && splitAux[4].equals("1")){
               listaMostrar.addElement(splitAux[1]);
            }
        }

        Archivo = new File("C:/MEIA/bitacora_contactos.txt");
        lista = objManejoArchivo.LecturaCompleta(Archivo, strError);
        for (int i = 0; i < lista.size(); i++) {
            var splitAux = lista.get(i).split(Pattern.quote("|"));
            if(splitAux[0].equals(user) && splitAux[4].equals("1")){
               listaMostrar.addElement(splitAux[1]);
            }
        }
        lContactoTotal.setModel(listaMostrar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lListas = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lContacto = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lContactoTotal = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Listas de distribucion:");

        lListas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lListas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lListasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lListas);

        jLabel6.setText("Contactos en lista seleccionada:");

        lContacto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lContactoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lContacto);

        lContactoTotal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lContactoTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lContactoTotalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lContactoTotal);

        jLabel3.setText("Contactos:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File Archivo = new File("C:/MEIA/usuario.txt");
        var objManejoArchivo = new ManejoArchivo();
        var strError = "";
        var dataUser = Data.getData();
        var user = dataUser.getUser();
        var ArchivoUser = objManejoArchivo.BuscarLinea(Archivo, user, strError, 0, 9);
        var split = ArchivoUser.split(Pattern.quote("|"));
        var sistema = new AplicacionMenu();
        sistema.L_Bienvenida.setText("BIENVENIDO:" + split[0]);
        sistema.Dato.setText(split[0]);
        sistema.Dato.setVisible(false);
        if(split[4].equals("1")){
            sistema.L_Rol.setText("Rol: Administrador");
        }else{
            sistema.L_Rol.setText("Rol: Usuario");
        }

        try
        {
            Image img = new ImageIcon(split[8]).getImage();
            Image newImg = img.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
            sistema.L_Image.setIcon(new ImageIcon(newImg));
        } catch(Exception ex){
            strError = ex.getMessage();
        }
        sistema.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lListasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lListasMouseClicked
        var seleccion = lListas.getSelectedValue();
        var strError = "";
        var dataUser = Data.getData();
        var user = dataUser.getUser();
        if (seleccion != null) {
            //METODO DESPLEGAR TODOS LOS USUARIOS CON NOMBRE LISTA EN LISTA_CONTACTO A lContactos
            lContacto.clearSelection();
            lContactoTotal.clearSelection();
        }
    }//GEN-LAST:event_lListasMouseClicked

    private void lContactoTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lContactoTotalMouseClicked
        var seleccionLista = lListas.getSelectedValue();
        var seleccionUsuario = lContactoTotal.getSelectedValue();
        var strError = "";
        var dataUser = Data.getData();
        var user = dataUser.getUser();
        if (seleccionLista != null && seleccionUsuario != null) {
            int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Desea agregar el contacto? ", "¿Insertar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (iRespuesta == 0) {
                //METODO INSERTAR EN LISTA_CONTACTO
                lContactoTotal.clearSelection();
            }
        }
    }//GEN-LAST:event_lContactoTotalMouseClicked

    private void lContactoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lContactoMouseClicked
        var seleccionLista = lListas.getSelectedValue();
        var seleccionUsuario = lContacto.getSelectedValue();
        var strError = "";
        var dataUser = Data.getData();
        var user = dataUser.getUser();
        if (seleccionLista != null && seleccionUsuario != null) {
            int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el contacto? ", "¿Eliminar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (iRespuesta == 0) {
                //METODO ELIMINAR EN LISTA_CONTACTO
                
                //ACTUALIZAR lContacto
                lContacto.clearSelection();
            }
        }
    }//GEN-LAST:event_lContactoMouseClicked

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
            java.util.logging.Logger.getLogger(ManejoListaDistribucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManejoListaDistribucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManejoListaDistribucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManejoListaDistribucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManejoListaDistribucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lContacto;
    private javax.swing.JList<String> lContactoTotal;
    private javax.swing.JList<String> lListas;
    // End of variables declaration//GEN-END:variables
}
