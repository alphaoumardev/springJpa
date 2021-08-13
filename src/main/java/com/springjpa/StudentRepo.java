/*
  Created by:oumar
  Project:spring-jpa
  Name:StudentRepo
  Date: 8/13/2021
  Time: 8:15 PM
*/
package com.springjpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long>
{

}
