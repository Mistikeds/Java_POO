public class Parcial extends Examen{
    private Integer unidades;
    private Integer cantidadReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer unidades, Integer cantidadReintentos) {
        super(alumno, titulo, enunciado, nota);
        this.unidades = unidades;
        this.cantidadReintentos = cantidadReintentos;
    }

    @Override
    public Boolean aprobado() {
        return getNota()>=4;
    }

    public Boolean esRecuperable(){
        Boolean recuperable = false;

        if(aprobado()){
            recuperable = false;
        } else if (unidades<=3) {
            recuperable = cantidadReintentos < 3;
        } else if (unidades >3) {
            recuperable = cantidadReintentos < 2;
        }
        return recuperable;
    }
}