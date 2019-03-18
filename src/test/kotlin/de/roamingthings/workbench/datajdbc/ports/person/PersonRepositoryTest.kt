package de.roamingthings.workbench.datajdbc.ports.person

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    val personRepository: PersonRepository

    @Test
    fun `it should be great`() {
    }
}