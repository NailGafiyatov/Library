package com.Nail.Library.dao;

import com.Nail.Library.models.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();

        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
//        person.setEmail(resultSet.getString("email"));
        person.setYearOfBirthday(resultSet.getInt("yearOfBirthday"));

        return person;
    }
}
