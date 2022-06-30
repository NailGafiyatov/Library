package com.Nail.Library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class Person {
    private int id;

    @NotEmpty(message = "ФИО не должно быть пустым")
    @Size(min = 2, max = 30, message = "ФИО должно содержать от 2 до 30 символов")
    private String fullName;

    @Min(value = 1900, message = "Год рождения должен быть не ранее 1900 и не позже 2022 ")
    private int yearOfBirthday;

    //Пустой конструктор для Спринга
    public Person() {

    }

    public Person(String fullName, int yearOfBirthday) {
        this.fullName = fullName;
        this.yearOfBirthday = yearOfBirthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }
}
