public class Enumerations {
    /*
    - Sirve para crear una coleccion de constantes
    - Se deben escribir en mayusculas.
    - Usaremos enum cada vez que necesitemos representar un conjunto fijo de constantes.
     Por ejemplo los días de la semana.
     */

    /*
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }*/

    // internamente enum Day se convierte en lo siguiente
    /*
    class Day {
        public static final Day SUNDAY = new Day();
        public static final Day MONDAY= new Day();
        public static final Day TUESDAY= new Day();
        // etc...
    }
    */

    // enum con atributos metodos y contructores:
    public enum Day {
        MONDAY("Lunes","Lundí"),
        TUESDAY("Martes", "Mardí"),
        WEDNESDAY("Miercoles","Mercredi"),
        THURSDAY("Juees", "Jeudi"),
        FRIDAY("Viernes","vandredi" ),
        SATURDAY("sabado", "Samedi"),
        SUNDAY("Domingo", "dimanche");

        private final String spanish;
        private final String french;
        private Day(String s, String f) {
            spanish = s;
            french = f;
        }

        public String getSpanish() {
            return spanish;
        }
        public String getFrench() {
            return french;
        }
    }

    // crear referencias de enumerations
    public static void main(String[] args) {
        Day day = Day.TUESDAY;
        //other way to use switch case
        switch (day) {
            case MONDAY -> System.out.println("Mondays are good.");
            case FRIDAY -> System.out.println("Fridays are nice");
            case SATURDAY, SUNDAY -> System.out.println("Weekends are the best");
            default -> System.out.println("Midweek are so-so");
        }
        /*
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are good.");
                break;
            case FRIDAY:
                System.out.println("Fridays are nice");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are the best");
                break;
            default:
                System.out.println("Midweek are so-so");
                break;
         */

        // recorrer los valores de un enum
        for (Day d:Day.values()) {
            System.out.print(d +" ");
            System.out.print(d.getFrench() +" ");
            System.out.println(d.getSpanish());

        }

    }

}
