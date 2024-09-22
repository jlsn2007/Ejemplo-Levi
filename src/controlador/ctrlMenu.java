package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.frmMenu;
import vista.frmalquequieroir;
import vista.panelinicial;


public class ctrlMenu implements MouseListener {
    
    frmMenu vistaa;
    frmalquequieroir vistaotrofrm;
    panelinicial panel;
    
    public ctrlMenu(frmMenu Vista, panelinicial Panel, frmalquequieroir Vistaotrofrm){
        
        this.vistaa = Vista;
        this.panel = Panel;
        this.vistaotrofrm = Vistaotrofrm;
        
        vistaa.btnprincipal.addMouseListener(this);
        vistaotrofrm.btniralmenu.addMouseListener(this);
        panel.btniralfrm.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vistaa.btnprincipal){
            panelinicial objinicial = new panelinicial();
            
            vistaa.jpContenedor.removeAll();
            vistaa.jpContenedor.add(objinicial);
            vistaa.jpContenedor.revalidate();
            vistaa.jpContenedor.repaint();
        }
        
        if(e.getSource() == panel.btniralfrm){
            vista.frmalquequieroir.initfrmalquequieroir();
            vistaa.dispose();
         
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
