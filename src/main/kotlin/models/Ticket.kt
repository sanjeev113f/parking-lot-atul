package models

import java.time.LocalDateTime

data class Ticket(val id: Int, val spotNumber: Int, val entryDateTime: LocalDateTime)
