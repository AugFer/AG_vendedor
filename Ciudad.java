public class Ciudad {
    private String nombre;
    private int id;

    public Ciudad(String nom, int id) {
        this.nombre = nom;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
