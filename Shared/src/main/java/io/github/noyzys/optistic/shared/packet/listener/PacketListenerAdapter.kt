package io.github.noyzys.optistic.shared.packet.listener

/**
 * @author: NoyZys on 10:26, 30.09.2020
 **/
interface PacketListenerAdapter<out T> {

    fun listen(): T
}