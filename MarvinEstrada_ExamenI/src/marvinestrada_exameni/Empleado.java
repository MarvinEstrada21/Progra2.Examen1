package marvinestrada_exameni;
public class Empleado extends Persona{
    private String empleo;

    public Empleado() {
        super();
    }

    public Empleado(String empleo, String nombre, int edad, long id, long id_boleto, String departamento, double dinero) {
        super(nombre, edad, id, id_boleto, departamento, dinero);
        this.empleo = empleo;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "empleo=" + empleo + '}';
    }
}
