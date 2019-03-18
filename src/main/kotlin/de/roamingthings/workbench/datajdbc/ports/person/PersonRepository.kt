package de.roamingthings.workbench.datajdbc.ports.person

import org.springframework.data.repository.CrudRepository

interface PersonRepository: CrudRepository<Person, String>
