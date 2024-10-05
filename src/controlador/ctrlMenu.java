package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.frmMenu;
import vista.frmalotroquequieroir;
import vista.frmalquequieroir;
import vista.panelinicial;
import vista.panelsecundario;


public class ctrlMenu implements MouseListener {
    
    frmMenu vistaa;
    frmalquequieroir vistaotrofrm;
    frmalotroquequieroir vistaalotrofrm;
    panelsecundario secpanel;
    panelinicial panel;
    
    public ctrlMenu(frmMenu Vista, panelinicial Panel, frmalquequieroir Vistaotrofrm, frmalotroquequieroir Vistaalotrofrm, panelsecundario sPanel){
        
        this.vistaa = Vista;
        this.panel = Panel;
        this.vistaotrofrm = Vistaotrofrm;
        this.vistaalotrofrm = Vistaalotrofrm;
        this.secpanel = sPanel;
        
        vistaa.btnprincipal.addMouseListener(this);
        vistaa.btnSecundario.addMouseListener(this);
        vistaotrofrm.btniralmenu.addMouseListener(this);
        panel.btniralfrm.addMouseListener(this);
        vistaalotrofrm.btnregresarcalen.addMouseListener(this);
        secpanel.btniralotrofrm.addMouseListener(this);
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
        
        if(e.getSource() == vistaa.btnSecundario){
            panelsecundario objsecundario = new panelsecundario();
            
            vistaa.jpContenedor.removeAll();
            vistaa.jpContenedor.add(objsecundario);
            vistaa.jpContenedor.revalidate();
            vistaa.jpContenedor.repaint();
        }
        
        if(e.getSource() == secpanel.btniralotrofrm){
            
            vista.frmalotroquequieroir.initfrmalotroquequieroir();
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
