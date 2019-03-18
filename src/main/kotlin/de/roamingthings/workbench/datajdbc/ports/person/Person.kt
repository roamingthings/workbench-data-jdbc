package de.roamingthings.workbench.datajdbc.ports.person

import org.springframework.data.annotation.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class Person(
        @Id
        var id: String?
) {

    constructor(
            id: String? = null,
            lastName: String
    ) : this(id) {
        this.lastName = lastName
    }

    @NotBlank
    @Size(max = 255)
    lateinit var lastName: String
}
