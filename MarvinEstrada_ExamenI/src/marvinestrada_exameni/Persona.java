package marvinestrada_exameni;
public class Persona {
    private String nombre;
    private int edad;
    private long id;
    private long id_boleto;
    private String departamento;
    private double dinero;

    public Persona() {
    }

    public Persona(String nombre, int edad, long id, long id_boleto, String departamento, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.id_boleto = id_boleto;
        this.departamento = departamento;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(long id_boleto) {
        this.id_boleto = id_boleto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return nombre;
    }
}