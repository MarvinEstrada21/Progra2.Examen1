package marvinestrada_exameni;
public class Politico extends Persona{
    private String partido;

    public Politico() {
        super();
    }

    public Politico(String partido, String nombre, int edad, long id, String id_boleto, String departamento, double dinero) {
        super(nombre, edad, id, id_boleto, departamento, dinero);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return super.toString() + "Politico{" + "partido=" + partido + '}';
    }
}