package InversionOfControl;

public class SecretarioEmpleado implements Empleados {

    private CreacionInformes InformeNuevo;

    public void setInformeNuevo(CreacionInformes informenuevo) {
        InformeNuevo = informenuevo;
    }

    // getTarea para mostrar que realiza la clase
    public String getTareas() {
        return "Soy quien gestiono la agenda de los jefes";
    }

    public String getInformes() {
        return "Informe entregado por el secretario" + InformeNuevo.getInformes();
    }
}
