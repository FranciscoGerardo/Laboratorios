package edu.utvt.feing.students.models.bean;

import java.io.Serial;
import java.io.Serializable;

public class Address implements Serializable {
    @Serial
    private static final long serialVersionUID = 2757878754L;
    private Long id;
    private String street;
    private String city;
    private String state;
    private String postalCode;

    public Address(){
        //TODO
    }
}
