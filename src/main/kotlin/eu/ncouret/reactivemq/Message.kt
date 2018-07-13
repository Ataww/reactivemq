package eu.ncouret.reactivemq

import java.time.Instant

/**
 * Object containing the message going through a queue as well as metadata necessary to the queue.
 */
data class Message<out T>(val payload: T, val expiration: Instant = Instant.MAX)