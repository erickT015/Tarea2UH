
package tareados;

import java.util.LinkedList;
import java.util.Locale;
import javax.swing.JOptionPane;


public class TareaDos {

    public static void main(String[] args) {
        
        String  nombre=" ";

        LinkedList <Pacientes> lista_pacientes = new LinkedList<Pacientes>();
        String selec="S";
        do{
            nombre=JOptionPane.showInputDialog("Ingrese el nombre del pacientes");
            Pacientes pacientes = new Pacientes(nombre, new LinkedList<>());
            lista_pacientes.get(0).setNombreP(nombre);
            String[] opcionesMenu = {"Ingresar", "Mostrar", "Eliminar", "Salir"};
        String selector = "s";
        int seleccion;
        do{
            seleccion = JOptionPane.showOptionDialog(null, "seleccione una opcion ", "MENU", 0, JOptionPane.QUESTION_MESSAGE, null, opcionesMenu, "Ingresar");
        switch (seleccion) {
            case 0:
               pacientes.agregarMedicinas(new LinkedList<>());
                break;
            case 1:
              pacientes.BuscarMedicinas(pacientes.getContenido(a));
                break;
            case 2:
                pacientes.EliminarDatos(pacientes.getContenido(pacientes.EliminarDatos(medicine)));
                break;
            case 3:
                System.out.println("gracias por tocar la opcioon salir");
                break;
            default:
        }
        }while(seleccion!=3);
            
             selec=JOptionPane.showInputDialog("Desea agregar mas pacientes_? S-N").toUpperCase(Locale.ITALY);
        }while(selec.equals("S"));
    }

}
