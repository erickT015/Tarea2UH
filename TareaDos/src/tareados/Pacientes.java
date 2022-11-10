
package tareados;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Pacientes {

   private String nombreP;
   private LinkedList<Medicinas> contenido;

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public LinkedList<Medicinas> getContenido() {
        return contenido;
    }

    public void setContenido(LinkedList<Medicinas> contenido) {
        this.contenido = contenido;
    }

    public Pacientes(String nombreP, LinkedList<Medicinas> contenido) {
        this.nombreP = nombreP;
        this.contenido = new LinkedList<Medicinas>();
    }
    
   
   public  LinkedList<Medicinas> agregarMedicinas (Medicinas medicine){
String selector = "s";
        do {
            String medicam = JOptionPane.showInputDialog("Ingrese el nombre del medicamento");
            contenido.get(0).setNombreM(medicam);
            int cantidadM=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de "+medicam+" que va agregar"));
            contenido.get(0).setCantidad(cantidadM);
            selector = JOptionPane.showInputDialog("Desea ingresar otro medicamento s - n");
        } while (selector.equals("s"));
        return contenido;
        
   }
   
   public void BuscarMedicinas (Medicinas medicine){
       String concatenar="";
         for (int a = 0; a < contenido.size(); a++) {
                    concatenar+="\n";
                    concatenar+=a+" - "+contenido.get(a);

                }
         JOptionPane.showMessageDialog(null, concatenar);
   }
   
   public void EliminarDatos (Medicinas medicine){
       String concatenar="";
         for (int a = 0; a < contenido.size(); a++) {
                    concatenar+="\n";
                    concatenar+=a+" - "+contenido.get(a);

                }
         JOptionPane.showMessageDialog(null, concatenar);
         int numero=Integer.parseInt(JOptionPane.showInputDialog("Que numero de la lista desea eliminar?"));
         contenido.remove(numero);
   }
}



       /*for( int a=0; a< contenido.size();a++){
           if(contenido.get(a).getNombreM().equals(medicine.getNombreM())){
               int nuevaCantidad= contenido.get(a).getCantidad()+medicine.getCantidad();
               contenido.get(a).setCantidad(nuevaCantidad);
               break;
           }else if(!contenido.get(a).getNombreM().equals(medicine.getNombreM())){
               contenido.add(medicine);
           }
       }*/