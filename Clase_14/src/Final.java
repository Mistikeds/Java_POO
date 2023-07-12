public class Final extends Examen implements Comparable{
    private Double notaOral;
    private String descripcionOral;

    public Final(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcionOral) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }

    @Override
    public Boolean aprobado() {
        return getNota()>=4 && notaOral>=4;
    }

    @Override
    public int compareTo(Object obj) {
        Final objetoFinal = (Final) obj;
        if(promedio() > objetoFinal.promedio()){
            return 1;
        } else if (promedio() < objetoFinal.promedio()) {
            return -1;
        }else {
            return 0;
        }
    }

    public Double promedio(){
        return (getNota() + notaOral)/2;
    }
}