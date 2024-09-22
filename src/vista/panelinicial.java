package vista;

import controlador.ctrlMenu;

public class panelinicial extends javax.swing.JPanel {


    public panelinicial() {
        initComponents();
        
        panelinicial panel = this;
        frmMenu vista = new frmMenu();
        frmalquequieroir vista2 = new frmalquequieroir();
        
        ctrlMenu controlador = new ctrlMenu(vista, panel, vista2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btniralfrm = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 102, 0));

        btniralfrm.setText("ir al frm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(btniralfrm)
                .addContainerGap(327, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btniralfrm)
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btniralfrm;
    // End of variables declaration//GEN-END:variables
}
