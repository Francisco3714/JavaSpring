package InversionOfControl;

public class JefeEmpleado implements Empleados {

    private CreacionInformes InformeNuevo;

    public JefeEmpleado(CreacionInformes informeNuevo) {
        InformeNuevo = informeNuevo;
    }

    // getTarea para mostrar que realiza la clase
    public String getTareas() {
        return "Soy quien gestiono las ordenes relativas a mis empleados de seccion";
    }

    @Override
    public String getInformes() {
        return "Informe presentado pór el jefe con algunos arreglos" + InformeNuevo.getInformes();
    }
}