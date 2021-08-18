package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_3 {
    // Proyecto
    private Integer id;
    private String city;
    private String classification;
    private Integer cost;
    
    public Requerimiento_3() {
        this.id = 0;
        this.city = "unknown";
        this.classification = "empty";
        this.cost = 0;
    }
    
    public Requerimiento_3(Integer id, String city, String classification, Integer cost) {
        this.id = id;
        this.city = city;
        this.classification = classification;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.id + " " + this.city + " " + this.classification + " " + this.cost;
    }
}
