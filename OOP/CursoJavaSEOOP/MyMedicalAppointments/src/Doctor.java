public class Doctor {
    // atributes
    static int id; // autoincrement
    String name;
    String speciality;

    // constructor
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }
    // Behaviour
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
