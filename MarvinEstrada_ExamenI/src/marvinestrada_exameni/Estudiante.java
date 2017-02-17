package marvinestrada_exameni;
public class Estudiante extends Persona{
    private String carrera;

    public Estudiante() {
        super();
    }

    public Estudiante(String carrera, String nombre, int edad, long id, String id_boleto, String departamento, double dinero) {
        super(nombre, edad, id, id_boleto, departamento, dinero);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }
}