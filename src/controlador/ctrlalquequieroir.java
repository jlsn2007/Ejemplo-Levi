package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.frmMenu;
import vista.frmalotroquequieroir;
import vista.frmalquequieroir;
import vista.panelinicial;
import vista.panelsecundario;


public class ctrlalquequieroir implements MouseListener{
    
    frmMenu vistaa;
    panelinicial panel;
    frmalquequieroir vistaotrofrm;
    frmalotroquequieroir vistaalotrofrm;
    panelsecundario secpanel;
    
    public ctrlalquequieroir (frmalquequieroir Vistaotrofrm, frmMenu Vistaa, panelinicial Panel, frmalotroquequieroir Vistaalotrofrm, panelsecundario secPanel){
        

        this.vistaotrofrm = Vistaotrofrm;
        this.vistaa = Vistaa;
        this.panel = Panel;
        this.secpanel = secPanel;
        this.vistaalotrofrm = Vistaalotrofrm;
        
        panel.btniralfrm.addMouseListener(this);
        vistaa.jpContenedor.addMouseListener(this);
        vistaotrofrm.btniralmenu.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vistaotrofrm.btniralmenu){
            System.out.println("Se dio click en el botón para volver al frmmenu");
            vistaotrofrm.dispose();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
