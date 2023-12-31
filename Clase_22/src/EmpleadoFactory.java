public class EmpleadoFactory {
    public static final String CLAVE_EMP_RD = "EMP-RD";
    public static final String CLAVE_EMP_PH = "EMP-PH";
    private static EmpleadoFactory instance=new EmpleadoFactory();
    private EmpleadoFactory(){};

    public static EmpleadoFactory getInstance(){
        return instance;
    }
    public Empleado crearEmpleado(String codigo){
        switch (codigo){
            case CLAVE_EMP_RD:
                return new EmpleadoRelacionDependencia("Pepito","Morales",1,1000.0);
            case CLAVE_EMP_PH:
                return new EmpleadoContratado("Juan","Perez",1,7.0,0.14);
        }
        return null;
    }
}
