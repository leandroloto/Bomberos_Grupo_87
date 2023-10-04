
package bomberos_grupo_87.Entidades;


public class Brigada {
    
    private int codBrigada;
    private String nombre_br;
    private Especialidad especialidad;
    private boolean libre;
    private Cuartel cuartel;

    public Brigada(int codBrigada, String nombre_br, Especialidad especialidad, boolean libre, Cuartel cuartel) {
        this.codBrigada = codBrigada;
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
    }

    public Brigada(String nombre_br, Especialidad especialidad, boolean libre, Cuartel cuartel) {
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
    }

    public Brigada() {
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombre_br() {
        return nombre_br;
    }

    public void setNombre_br(String nombre_br) {
        this.nombre_br = nombre_br;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

   

    @Override
    public String toString() {
        return "Brigada" + codBrigada + ", Nombre: " + nombre_br + ", Especialidad: " + especialidad;
    }
    
    
}
