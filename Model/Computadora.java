package Model;

/**
 *
 * @author alevante
 */
public class Computadora extends Producto {
    private String tarjeta_video;
    
    public Computadora(){};
    public Computadora(String tarjeta_video, int idProducto, String codigo_producto, String nombre, Double precio, int cantidad_actual, String procesador, String disco_duro, int memoria_ram, String sistema_operativo, String marca) {
        super(idProducto, codigo_producto, nombre, precio, cantidad_actual, procesador, disco_duro, memoria_ram, sistema_operativo, marca);
        this.tarjeta_video = tarjeta_video;
    }
    
 
    

    public String getTarjeta_video() {
        return tarjeta_video;
    }

    public void setTarjeta_video(String tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }
    
  
}
