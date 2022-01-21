public class Doctor {
    // atributes
    static int id; // autoincrement
    String name;
    String speciality;

    // constructor
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");

    }
    Doctor(String name, String speciality){
        id++;
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.name = name;
        this.speciality = speciality;
    }
    // Behaviour
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
