public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Empleado[] empleados= new Empleado[3];

        empleados[0] = new EmpleadoTiempoCompleto("Larios", "1919-727", "programador", 60000);
        empleados[1] = new EmpleadoMedioTiempo("Angel", "1236-223","profesor", 75.0, 20);
        empleados[2] = new EmpleadoMedioTiempo("Diederich", "1267-567","chef", 95.0, 20);

        // imprimir con foreach
        // for (Empleado empleado : empleados){
        //     System.out.println("Empleado: " + empleado.getNombre() + " Salario Mensual: $" + empleado.calcularSalario());
        // }

        // imprimir con for
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado: " + empleados[i].getNombre());
            System.out.println("Cargo: " + empleados[i].getCargo());
            System.out.println("Identificacion: " + empleados[i].getnumeroIdentificacion());
            System.out.println("Salario: $ " + empleados[i].calcularSalario());
            
        }

    }

    
    
}
