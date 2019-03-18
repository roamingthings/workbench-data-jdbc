package de.roamingthings.workbench.datajdbc.ports.person

const val LAST_NAME = "Tester"

fun aPersonWithoutId(): Person =
        Person(lastName = LAST_NAME)
