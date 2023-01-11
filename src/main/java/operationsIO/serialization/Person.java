package operationsIO.serialization;

import java.io.Serializable;

// serializable oznacza ze ta klasa moze byc serializowana
public class Person implements Serializable {

    private String name;
    private String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
