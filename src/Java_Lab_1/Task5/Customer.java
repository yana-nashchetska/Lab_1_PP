package Java_Lab_1.Task5;

public class Customer {
    private String name;
    private String surname;

    public Customer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return
                " \n name='" + name + '\'' +
                ",\n surname='" + surname + '\'';
    }
}
