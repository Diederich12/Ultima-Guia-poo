 abstract public class Empleado {
    private String nombre;
    private String numeroIdentificacion;
    private String cargo;

    public Empleado(String nombre, String numeroIdentificacion, String cargo){
        this.nombre= nombre;
        this.numeroIdentificacion= numeroIdentificacion;
        this.cargo= cargo;
    }
    public String getNombre (){
        return nombre;
    }

    public String getnumeroIdentificacion(){
        return numeroIdentificacion;
    }
    public String getCargo(){
        return cargo;
    }
    

    public void setCargo(String cargo){
        this.cargo= cargo;
        
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
        
    }
    public void setnumeroIdentificacion(String numeroIdentificacion){
        this.numeroIdentificacion= numeroIdentificacion;
        
    }
    public abstract double calcularSalario();
}



