package Controller;

import java.awt.event.ActionEvent;
import Model.Computadora;
import View.formNewPc;
import View.formPrincipal;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Model.ConsultasPC;

/**
 *
 * @author alevante
 */
public class ControladorPC implements ActionListener {
    
    private Computadora modPC;
    private ConsultasPC modConsultas;
    private formNewPc formPC;
    private formPrincipal formM;
    
    public ControladorPC(Computadora modPC, ConsultasPC modConsultas, formNewPc formPC) {
        this.modPC = modPC;
        this.modConsultas = modConsultas;
        this.formPC = formPC;
        this.formPC.btnGuardar.addActionListener(this);
    }
    
    public void iniciar() {
        formPC.setTitle("Añadir Productos");
        formPC.setLocationRelativeTo(null);
        //formM.setLocationRelativeTo(null); 
        formPC.txtId.setVisible(false);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // boton guardar
        
        if (e.getSource() == formPC.btnGuardar  ) {
            modPC.setCodigo_producto(formPC.txtCodigoProducto.getText());
            modPC.setNombre(formPC.txtNombre.getText());
            modPC.setPrecio(Double.parseDouble(formPC.txtPrecio.getText()));
            modPC.setCantidad_actual(Integer.parseInt(formPC.txtCantidad.getText())); 
            modPC.setProcesador(formPC.txtProcesador.getText());
            modPC.setDisco_duro(formPC.txtDiscoDuro.getText());
            modPC.setMemoria_ram(Integer.parseInt(formPC.txtRam.getText()));
            modPC.setSistema_operativo(formPC.txtSO.getText());
            modPC.setMarca(formPC.txtMarca.getText());
            modPC.setTarjeta_video(formPC.txtTarjetaVideo.getText());
            
            
            if (modConsultas.registrarComputadora(modPC)) { 
                JOptionPane.showMessageDialog(null,"El Registro del producto de codigo: " +  formPC.txtCodigoProducto.getText() +  " realizado con éxito");      
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");        
            }
        }
             
        
    }
    
    public void limpiar() {
        formPC.txtCodigoProducto.setText(null);
        formPC.txtNombre.setText(null);

    }
    

}
