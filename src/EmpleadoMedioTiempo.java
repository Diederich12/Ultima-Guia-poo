public class EmpleadoMedioTiempo extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadasPorSemana;
    
    public EmpleadoMedioTiempo(String nombre, String numeroIdentificacion, String cargo, double salarioPorHora, int horasTrabajadasPorSemana){
        super(nombre, numeroIdentificacion, cargo);
        this.salarioPorHora= salarioPorHora;
        this.horasTrabajadasPorSemana= horasTrabajadasPorSemana;
    }

    @Override
    public double calcularSalario(){
        return salarioPorHora *horasTrabajadasPorSemana*4; // SalarioMensual
    }


}
