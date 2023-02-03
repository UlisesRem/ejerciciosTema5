public class Main {
    public static void main(String[] args) {
        //Instancia de objetos
        CocheData lobo = new CocheData("Lobo", "Ford", 2020, 4, "negro");
        CocheData tsuru = new CocheData("tsuru", "missan", 1980, 4, "blanco");
        CocheCRUDImplements addNew = new CocheCRUDImplements();
        addNew.saveCar(lobo);
        addNew.saveCar(tsuru);

        System.out.println(addNew.findCar());

    }
}