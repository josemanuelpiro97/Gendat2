import BaseDeDatos.BaseDeDatos;
import IU.VistaIngresar;
import IU.VistaPrincipal;
import BaseDeDatos.Usuario;
import java.util.ArrayList;

public class Gendat{

    public static void main(String[] arg){
        //base de dato de trabajo
        BaseDeDatos baseDeDatos = new BaseDeDatos();

        //Creacion de vistas
        VistaPrincipal vistaPrincipal = new VistaPrincipal(baseDeDatos);

    }

}
