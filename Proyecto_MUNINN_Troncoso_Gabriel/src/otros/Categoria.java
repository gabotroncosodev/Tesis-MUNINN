
package otros;
public class Categoria {

public Categoria()
{
// constructor
}

private int id_categoria;
private String nombre_categoria;
private String descripcion_categoria;

    /**
     * @return the id_categoria
     */
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     * @param id_categoria the id_categoria to set
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
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
     * @return the descripcion_categoria
     */
    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    /**
     * @param descripcion_categoria the descripcion_categoria to set
     */
    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }

}
