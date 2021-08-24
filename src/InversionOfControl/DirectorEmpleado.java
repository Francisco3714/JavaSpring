package InversionOfControl;

public class DirectorEmpleado implements Empleados {
    // Creacion de campo tipo CreacionInforme (Interfaz)
    // Encapsulacion
    private CreacionInformes InformeNuevo;

    // Creacion de constructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes informenuevo) {
        this.InformeNuevo = informenuevo;
    }

    // getTarea para mostrar que realiza la clase
    public String getTareas() {
        return "Soy quien gestiono la plantilla de la empresa";
    }

    @Override
    public String getInformes() {
        return "Informe creado por el director: " + InformeNuevo.getInformes();
    }
}
