
package test;


import domain.*;

public class TestIntanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jose", 5000);
        determinarTipo(empleado);
        
        empleado = new Gerente("Contabilidad", "Fermin", 10000);
//        determinarTipo(empleado);
    }
    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo egerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            
        }else if(empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
//                        Gerente gerente = (Gerente)empleado;
//            System.out.println("gerente = " + gerente.getDepartamento());
                System.out.println("empleado = " + empleado.obtenerDetalles());
        }else if(empleado instanceof Object){
            System.out.println("Es de tipo object");
            empleado.toString();
        }
    }
}
