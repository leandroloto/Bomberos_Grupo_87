
package bomberos_grupo_87.Entidades;


public class Brigada {
    
    private int codBrigada;
    private String nombre_br;
    private Especialidad especialidad;
    private boolean libre;
    private Cuartel cuartel;
    private boolean estado;

    public Brigada(int codBrigada, String nombre_br, Especialidad especialidad, boolean libre, Cuartel cuartel, boolean estado) {
        this.codBrigada = codBrigada;
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
        this.estado=estado;
    }

    public Brigada(String nombre_br, Especialidad especialidad, boolean libre, Cuartel cuartel,boolean estado) {
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
        this.estado = estado;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

   

    @Override
    public String toString() {
        return "Brigada" + codBrigada + ", Nombre: " + nombre_br + ", Especialidad: " + especialidad;
    }
    
    
}
