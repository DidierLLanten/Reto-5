package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_1 {
    //Trabajador
    private String lider;
    private String cargo;
    private Integer cantidadProyectos;

    public Requerimiento_1() {
        this.lider = "Ninguno";
        this.cargo = "Sin cargo";
        this.cantidadProyectos = 0;
    }

    public Requerimiento_1(String lider, String cargo, Integer cantidadProyectos) {
        this.lider = lider;
        this.cargo = cargo;
        this.cantidadProyectos = cantidadProyectos;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getCantidadProyectos() {
        return cantidadProyectos;
    }

    public void setCantidadProyectos(Integer cantidadProyectos) {
        this.cantidadProyectos = cantidadProyectos;
    }

    @Override
    public String toString() {
        return lider + " " + cargo + " " + cantidadProyectos;
    }
}