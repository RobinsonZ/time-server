package org.team1540.timeclock.backend.data

data class SimpleEmail(val to: String, val subject: String, val text: String)

data class Session(val start: String, val end: String)