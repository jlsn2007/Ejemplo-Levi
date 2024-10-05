package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.frmMenu;
import vista.frmalotroquequieroir;
import vista.panelsecundario;

public class ctrlalotroquequieroir implements MouseListener{
    
    frmMenu vistaa;
    panelsecundario spanel;
    frmalotroquequieroir vistaalotrofrm;
    
    public ctrlalotroquequieroir (frmalotroquequieroir Vistaalotrofrm, frmMenu Vistaa, panelsecundario sPanel){
        

        this.vistaalotrofrm = Vistaalotrofrm;
        this.vistaa = Vistaa;
        this.spanel = sPanel;
        
        spanel.btniralotrofrm.addMouseListener(this);
        vistaa.jpContenedor.addMouseListener(this);
        vistaalotrofrm.btnregresarcalen.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vistaalotrofrm.btnregresarcalen){
            System.out.println("Se dio click en el botón para volver al frmmenu");
            vistaalotrofrm.dispose();
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
