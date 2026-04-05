package pe.edu.tecsup.lab03.entities;

public class StudentEntity {

    private int id;
    private String name;
    private String email;

    public StudentEntity() {}

    public StudentEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }
}