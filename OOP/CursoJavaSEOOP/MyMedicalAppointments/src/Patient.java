public class Patient extends User{
    // attributes
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    // constructor
    Patient(String name, String email){
        super(name, email);
    }

    // getter and setters
    /*
    permiten leer y escribir específicamente los valores de las variables miembro
    - publico porque dese ser un metodo accesible cuando se importa la clase
     */

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public String getHeight() {
        return height + " mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // generados automaticamente
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: "+birthday+".\nWeight: "+getWeight()+"\nHeight: "+getHeight()+"\nBlood: "+blood+".";
    }
}
