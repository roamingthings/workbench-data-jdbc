package de.roamingthings.workbench.datajdbc.ports.person

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class Person(
        val id: String
) {
    constructor(
            id: String,
            lastName: String
    ) : this(id) {
        this.lastName = lastName
    }

    @NotBlank
    @Size(max = 255)
    lateinit var lastName: String
}
