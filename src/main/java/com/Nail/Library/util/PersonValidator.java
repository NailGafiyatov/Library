package com.Nail.Library.util;

import com.Nail.Library.dao.PersonDAO;
import com.Nail.Library.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class PersonValidator implements Validator {
    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Person person = (Person) o;

        if (personDAO.show(person.getName()).isPresent()) {
            errors.rejectValue("name", "", "This name is already taken");
        }
        //смотрим, есть ли человек с такими же ФИО в БД

        if (!Character.isUpperCase(person.getName().codePointAt(0)))errors.rejectValue("name", "", "Name chould start with a capital letter");
    }
}
