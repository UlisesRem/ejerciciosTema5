public class CocheData {
    String modelo;
    String marca;
    int year;
    int llantas;
    String color;

    public CocheData() {
    }

    public CocheData(String modelo, String marca, int year, int llantas, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.year = year;
        this.llantas = llantas;
        this.color = color;
    }

    @Override
    public String toString() {
        return "CocheData{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", year=" + year +
                ", llantas=" + llantas +
                ", color='" + color + '\'' +
                '}';
    }
}