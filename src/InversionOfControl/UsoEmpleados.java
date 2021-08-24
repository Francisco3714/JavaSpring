package InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * UsoEmpleados
 */
public class UsoEmpleados {

    public static void main(String[] args) {
        // Cargando el archivo Xml ↓
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Estamos pidiendo el bean ↓
        Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
        // Terminamos de utilizar ↓
        System.out.println(Juan.getTareas());
        // Mostramos en consola el informe ↓
        System.out.println(Juan.getInformes());
        // Cerramos el archivo XML ↓
        contexto.close();
    }
}