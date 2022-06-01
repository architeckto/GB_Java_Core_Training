package lesson1;

public abstract class Athletes {
    private String name;
    private String specialization;

    public Athletes(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Athletes() {

    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String toString(){
        return getSpecialization() + " " + getName();
    }
}
