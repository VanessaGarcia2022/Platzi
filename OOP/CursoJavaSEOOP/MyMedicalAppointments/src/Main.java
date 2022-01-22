import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // showMenu();
        Doctor myDoctor = new Doctor("Vanessa", "vanessa@gmail.com", "Traumatologia");
        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);

        // Agregar cita al doctor
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        // imprimir: esto solo imprimela direccion en memoria de los objetos de las lista
        // System.out.println((myDoctor.getAvailableAppointments()));
        
        // imprimir las citas
        /*
        - Uso de la clase estatica Doctor.AvailableAppointment como tipo de dato.
        - Variable aviableAppointment ( de tipo Doctor.AvailableAppointment )
        - La variable recorre la coleccion de objetos que entrega el metodo myDoctor.getAvailableAppointments()
        - se imprime la fecha (aviableAppointment.getDate()) y la hora (aviableAppointment.getTime()) guardadas
        en cada objeto de la coleccion
         */
        for (Doctor.AvailableAppointment aviableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(aviableAppointment.getDate() + " : " + aviableAppointment.getTime());
        }

        Patient patient = new Patient("Angelica", "Angelica@gmail.com");
        System.out.println(patient);

    }

}
