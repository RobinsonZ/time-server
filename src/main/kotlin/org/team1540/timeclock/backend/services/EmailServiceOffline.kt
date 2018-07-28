package org.team1540.timeclock.backend.services

import mu.KotlinLogging
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service
import org.team1540.timeclock.backend.data.SimpleEmail
import org.team1540.timeclock.backend.interfaces.EmailService

@Service
@Profile("offline")
class EmailServiceOffline : EmailService {
    private val logger = KotlinLogging.logger {}
    override fun send(vararg emails: SimpleEmail) {
        logger.debug { "Sending emails: $emails" }
    }
}
