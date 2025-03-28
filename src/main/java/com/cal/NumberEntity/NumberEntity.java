package com.cal.NumberEntity;



import jakarta.persistence.*;

@Entity
@Table(name = "numbers")
public class NumberEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;

    public NumberEntity() {}

    public NumberEntity(int number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
