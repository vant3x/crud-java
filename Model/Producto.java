package Model;

/**
 *
 * @author alevante
 */
public class Producto {
    
    private int idProducto;
    private String codigo_producto;
    private String nombre;
    private Double precio;
    private int cantidad_actual;
    private String procesador;
    private String disco_duro;
    private int memoria_ram;
    private String sistema_operativo;
    private String marca;
    
    public Producto() {
        super();
    }
    
    public Producto(int idProducto, String codigo_producto, String nombre, Double precio, int cantidad_actual, String procesador, String disco_duro, int memoria_ram, String sistema_operativo, String marca) {
        this.idProducto = idProducto;
        this.codigo_producto = codigo_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_actual = cantidad_actual;
        this.procesador = procesador;
        this.disco_duro = disco_duro;
        this.memoria_ram = memoria_ram;
        this.sistema_operativo = sistema_operativo;
        this.marca = marca;
    }
    
 
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(String disco_duro) {
        this.disco_duro = disco_duro;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
