/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espoch.pruebafinciclo.vista;


public class Vista extends javax.swing.JFrame {

   
    public Vista() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana = new javax.swing.JDesktopPane();
        lblSistema = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        jmAgregar = new javax.swing.JMenuItem();
        jmLista = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSistema.setText("Sistema de Gestion de Productos");

        ventana.setLayer(lblSistema, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventanaLayout = new javax.swing.GroupLayout(ventana);
        ventana.setLayout(ventanaLayout);
        ventanaLayout.setHorizontalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(lblSistema)
                .addGap(103, 103, 103))
        );
        ventanaLayout.setVerticalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(lblSistema)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        jmAgregar.setText("Agregar nuevo Producto");
        jmAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarActionPerformed(evt);
            }
        });
        Menu.add(jmAgregar);

        jmLista.setText("Lista de Productos");
        jmLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaActionPerformed(evt);
            }
        });
        Menu.add(jmLista);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        Menu.add(jmSalir);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MenuActionPerformed

    private void jmAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarActionPerformed
        // TODO add your handling code here:
        AgregarnuevoProducto verventana = new AgregarnuevoProducto();
        ventana.add(verventana);
        verventana.show();
    }//GEN-LAST:event_jmAgregarActionPerformed

    private void jmListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaActionPerformed
        // TODO add your handling code here:
        ListarProductos verventana = new ListarProductos();
        ventana.add(verventana);
        verventana.show();
    }//GEN-LAST:event_jmListaActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jmSalirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAgregar;
    private javax.swing.JMenuItem jmLista;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JDesktopPane ventana;
    // End of variables declaration//GEN-END:variables
}
