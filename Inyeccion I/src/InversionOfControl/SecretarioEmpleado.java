package InversionOfControl;

public class SecretarioEmpleado implements Empleados {
    // Inyeccion de campos
    private String email;
    private String nombreEmpresa;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
