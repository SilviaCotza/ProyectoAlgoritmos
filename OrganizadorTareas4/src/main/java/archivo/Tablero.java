
package archivo;


public class Tablero {
    private String nombreTablero;
    private String nombreListaTareas;
    private String nombreTarea;
    private String descripcionTarea;
    private String comentarios;
    private String listaActividades;
    private String actividades;

    public Tablero(String nombreTablero, String nombreListaTareas, String nombreTarea, String descripcionTarea, String comentarios,String listaActividades, String actividades) {
        this.nombreTablero = nombreTablero;
        this.nombreListaTareas = nombreListaTareas;
        this.nombreTarea = nombreTarea;
        this.descripcionTarea = descripcionTarea;
        this.comentarios = comentarios;
        this.listaActividades = listaActividades;
        this.actividades = actividades;
    }

    public String getNombreTablero() {
        return nombreTablero;
    }

    public void setNombreTablero(String nombreTablero) {
        this.nombreTablero = nombreTablero;
    }

    public String getNombreListaTareas() {
        return nombreListaTareas;
    }

    public void setNombreListaTareas(String nombreListaTareas) {
        this.nombreListaTareas = nombreListaTareas;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(String listaActividades) {
        this.listaActividades = listaActividades;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }


    
}
