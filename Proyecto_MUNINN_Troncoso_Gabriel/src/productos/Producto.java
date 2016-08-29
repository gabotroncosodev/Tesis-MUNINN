/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Gabriel
 */
public class Producto {

    
public Producto()
{
//constructor
}
private int id_Producto;
private String detalle_producto;
private int cantidad_bodega;
private int costo_unit_arr_producto;
private String marca_producto;
private int Costo_Producto;
private String ruta_foto;
private String nombre_categoria;

private int id_Categoria;

    /**
     * @return the id_Producto
     */
    public int getId_Producto() {
        return id_Producto;
    }

    /**
     * @param id_Producto the id_Producto to set
     */
    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    /**
     * @return the detalle_producto
     */
    public String getDetalle_producto() {
        return detalle_producto;
    }

    /**
     * @param detalle_producto the detalle_producto to set
     */
    public void setDetalle_producto(String detalle_producto) {
        this.detalle_producto = detalle_producto;
    }

    /**
     * @return the cantidad_bodega
     */
    public int getCantidad_bodega() {
        return cantidad_bodega;
    }

    /**
     * @param cantidad_bodega the cantidad_bodega to set
     */
    public void setCantidad_bodega(int cantidad_bodega) {
        this.cantidad_bodega = cantidad_bodega;
    }

    /**
     * @return the costo_unit_arr_producto
     */
    public int getCosto_unit_arr_producto() {
        return costo_unit_arr_producto;
    }

    /**
     * @param costo_unit_arr_producto the costo_unit_arr_producto to set
     */
    public void setCosto_unit_arr_producto(int costo_unit_arr_producto) {
        this.costo_unit_arr_producto = costo_unit_arr_producto;
    }

    /**
     * @return the marca_producto
     */
    public String getMarca_producto() {
        return marca_producto;
    }

    /**
     * @param marca_producto the marca_producto to set
     */
    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    /**
     * @return the Costo_Producto
     */
    public int getCosto_Producto() {
        return Costo_Producto;
    }

    /**
     * @param Costo_Producto the Costo_Producto to set
     */
    public void setCosto_Producto(int Costo_Producto) {
        this.Costo_Producto = Costo_Producto;
    }

    /**
     * @return the ruta_foto
     */
    public String getRuta_foto() {
        return ruta_foto;
    }

    /**
     * @param ruta_foto the ruta_foto to set
     */
    public void setRuta_foto(String ruta_foto) {
        this.ruta_foto = ruta_foto;
    }

    /**
     * @return the nombre_categoria
     */
    public String getNombre_categoria() {
        return nombre_categoria;
    }

    /**
     * @param nombre_categoria the nombre_categoria to set
     */
    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    /**
     * @return the id_Categoria
     */
    public int getId_Categoria() {
        return id_Categoria;
    }

    /**
     * @param id_Categoria the id_Categoria to set
     */
    public void setId_Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }

}
