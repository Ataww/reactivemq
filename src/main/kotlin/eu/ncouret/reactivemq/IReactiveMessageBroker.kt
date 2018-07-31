package eu.ncouret.reactivemq

import reactor.core.publisher.Flux

interface IReactiveMessageBroker<E> {

    fun subscribe(queue: String): Flux<Message<E>>

    fun publish(queueName: String, message: Message<E>): Boolean

    fun addQueue(name: String, timeout: Int = 45): IReactiveMessageQueue<E>

    fun addQueue(queue: IReactiveMessageQueue<E>): Boolean
}