package de.roamingthings.workbench.datajdbc.ports.person

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    lateinit var personRepository: PersonRepository

    @Test
    fun `it should find a persisted entity`() {
        val persistedPerson = aPersistedPerson()

        val person = personRepository.findById(persistedPerson.id!!)

        assertThat(person.isPresent).isTrue()
        assertThat(person.get().lastName).isEqualTo(LAST_NAME)
    }

    private fun aPersistedPerson(): Person =
            personRepository.save(aPersonWithoutId())
}