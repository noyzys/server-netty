package io.github.noyzys.optistic.shared.packet

import io.netty.buffer.ByteBuf

/**
 * @author: NoyZys on 09:12, 30.09.2020
 **/
abstract class AbstractPacket(clazz: Class<out AbstractPacket>) {
    val packetId = PacketRegistry.getPacketId(PacketRegistry.findPacketById(clazz))

    abstract fun read(byteBuf: ByteBuf)
}