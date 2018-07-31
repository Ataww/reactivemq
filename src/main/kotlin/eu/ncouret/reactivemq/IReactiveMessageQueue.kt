package eu.ncouret.reactivemq

import java.time.Instant
import java.util.*

/**
 *
 * @author ncouret
 */
interface IReactiveMessageQueue<E>: Queue<Message<E>> {

    fun offerMessage(e: E, expiration: Instant): Boolean

    fun pollMessage(): E

    fun peekMessage(): E
}