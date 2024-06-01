public class EmpleadoTiempoCompleto  extends Empleado{
    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, String numeroIdentificacion, String cargo, double salarioAnual){
        super(nombre, numeroIdentificacion, cargo);
        this.salarioAnual= salarioAnual;


    }
    @Override 
        public double calcularSalario(){
            return salarioAnual / 12;
        }
}


