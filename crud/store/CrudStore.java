
package crud.store;

// models
import Model.ConsultasPC;
import Model.Computadora;


import View.formPrincipal;
import View.formNewPc;
import Controller.ControladorPC;

/**
 *
 * @author alevante
 */
public class CrudStore {
   
    public static void main(String[] args) {
      /*  Computadora modPC = new Computadora();
        ConsultasPC modConsultas = new ConsultasPC();
        formPrincipal frm = new formPrincipal();
        formNewPc frmPC = new formNewPc();
        
        ControladorPC ctrlPC = new ControladorPC(modPC, modConsultas, frmPC);
        ctrlPC.iniciar();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);*/ 
        
        Computadora modPC = new Computadora();
        ConsultasPC modConsultas = new ConsultasPC();
        formPrincipal frmM = new formPrincipal();
        formNewPc formPC = new formNewPc();
        
        ControladorPC ctrlPC = new ControladorPC(modPC, modConsultas, formPC);
        ctrlPC.iniciar();
        frmM.setLocationRelativeTo(null);
        frmM.setVisible(true);
    }
    
}
