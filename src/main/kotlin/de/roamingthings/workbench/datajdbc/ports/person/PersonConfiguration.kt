package de.roamingthings.workbench.datajdbc.ports.person

import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.relational.core.mapping.event.BeforeSaveEvent
import java.util.UUID.randomUUID


@Configuration
class PersonConfiguration {

    @Bean
    fun idSetting(): ApplicationListener<*> {

        return ApplicationListener<BeforeSaveEvent> { event ->

            val entity = event.getEntity()
            if (entity is Person) {
                entity.id = randomUUID().toString()
            }
        }
    }
}