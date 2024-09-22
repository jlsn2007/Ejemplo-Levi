package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.frmMenu;
import vista.frmalquequieroir;
import vista.panelinicial;


public class ctrlalquequieroir implements MouseListener{
    
    frmMenu vistaa;
    panelinicial panel;
    frmalquequieroir vistaotrofrm;

    
    public ctrlalquequieroir (frmalquequieroir Vistaotrofrm, frmMenu Vistaa, panelinicial Panel){
        

        this.vistaotrofrm = Vistaotrofrm;
        this.vistaa = Vistaa;
        this.panel = Panel;
        
        panel.btniralfrm.addMouseListener(this);
        vistaa.jpContenedor.addMouseListener(this);
        vistaotrofrm.btniralmenu.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vistaotrofrm.btniralmenu){
            System.out.println("Se dio click en el botón para volver al frmmenu");
            vista.frmMenu.initfrmmenu();
            vistaotrofrm.dispose();
            vistaa.setVisible(true);
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
