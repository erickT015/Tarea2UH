
package tareados;


public class Medicinas {
   private String nombreM;
   private int cantidad;

    public Medicinas(String nombreM, int cantidad) {
        this.nombreM = nombreM;
        this.cantidad = cantidad;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Medicinas{" + "nombreM=" + nombreM + ", cantidad=" + cantidad + '}';
    }
   
   
   
}
