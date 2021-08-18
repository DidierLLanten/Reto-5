package utp.misiontic2022.c2.p17.reto4.modelo.vo;

public class Requerimiento_2 {
    // Material
    private Integer id;
    private String material;
    private Integer amount;
    private Integer unitaryPrice;
    private Integer totalPrice;

    public Requerimiento_2() {
        this.id = 0;
        this.material = "Unknown";
        this.amount = 0;
        this.unitaryPrice = 0;
        this.totalPrice = 0;
    }

    public Requerimiento_2(Integer id, String material, Integer amount, Integer unitaryPrice, Integer totalPrice) {
        this.id = id;
        this.material = material;
        this.amount = amount;
        this.unitaryPrice = unitaryPrice;
        this.totalPrice = totalPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmaterial() {
        return material;
    }

    public void setmaterial(String material) {
        this.material = material;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(Integer unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return this.id + " " + this.material + " " + this.amount + " " +this.unitaryPrice + " " +this.totalPrice ;
    }
}