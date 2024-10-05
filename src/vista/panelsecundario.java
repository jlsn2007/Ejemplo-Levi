package vista;

import controlador.ctrlMenu;


public class panelsecundario extends javax.swing.JPanel {


    public panelsecundario() {
        initComponents();
        
        panelsecundario panel2 = (this);
        panelinicial panel = new panelinicial();
        frmMenu vista = new frmMenu();
        frmalquequieroir vista2 = new frmalquequieroir();
        frmalotroquequieroir vista3 = new frmalotroquequieroir();
        
        ctrlMenu controlador = new ctrlMenu(vista, panel, vista2, vista3, panel2);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btniralotrofrm = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));

        btniralotrofrm.setText("ir al otro frm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(btniralotrofrm)
                .addGap(360, 360, 360))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btniralotrofrm)
                .addContainerGap(215, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btniralotrofrm;
    // End of variables declaration//GEN-END:variables
}
