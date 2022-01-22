import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // atributes
    static int id; // autoincrement
    String name;
    String speciality;
    String address;

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

    // Coleccion de objetos de tipo AvailableAppointment
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Metodo para agregar elementos de la clase AvailableAppointment
    public void addAvailableAppointment(Date date, String time) {
        // le estoy diciendo que a la coleccion de objetos de tipo availableAppointments le agregue
        // una nueva instancia de la clase AvailableAppointment
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    //Metodo para retornar la coleccion de objetos de tipo AvailableAppointment
    // modificadorAcceso tipoRetorno nombreVaviable(){ retorno }
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }



    // Clases anidadas
    /*
    Esta clase es para manejar la disponibilidad y la asignación de citas
    - Como esta clase le pertenece o su logica solamente depende del doctor entonces por eso se hace
    una clase anidada dentro de la clase doctor.
    - Esta clase es estática, eso quiere decir que no se necesita una instancia de la clase interna
    (AvailableAppointment), pero si se requiere una instancia de la clase externa (Doctor)
     */
    public static  class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
