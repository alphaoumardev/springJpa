/*
  Created by:oumar
  Project:spring-jpa
  Name:Student
  Date: 8/13/2021
  Time: 7:24 PM
*/
package com.springjpa;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name="Student")
@Table(name = "student", uniqueConstraints={@UniqueConstraint(name = "Unique_email",columnNames = "Email")})
public class Student
{
    @Id
    @SequenceGenerator(name="sequence", sequenceName="sequence",allocationSize = 1)
    @GeneratedValue(strategy=SEQUENCE, generator="")
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private int age;

    public  Student(){}
    public  Student( String name, String lastname, String email, int age) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
