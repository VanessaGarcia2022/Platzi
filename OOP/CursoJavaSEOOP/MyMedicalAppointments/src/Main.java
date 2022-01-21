import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor(); // Doctor(): es el metodo constructor.
        myDoctor.name = "Ana Morita"; // asignar valor al atributo
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctorAn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);
        System.out.println("------------------------------\n");

        showMenu();
    }

}
