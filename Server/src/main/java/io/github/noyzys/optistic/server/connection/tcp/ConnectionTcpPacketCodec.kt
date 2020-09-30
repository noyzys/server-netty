package io.github.noyzys.optistic.server.connection.tcp

import io.github.noyzys.optistic.shared.packet.AbstractPacket
import io.github.noyzys.optistic.shared.packet.connection.PacketConnectionHandler
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageCodec

/**
 * @author: NoyZys on 10:35, 30.09.2020
 **/
class ConnectionTcpPacketCodec(
        private val packetConnectionHandler: PacketConnectionHandler
) : ByteToMessageCodec<AbstractPacket>() {

    private val packetProtocol = packetConnectionHandler.

    override fun encode(p0: ChannelHandlerContext?, p1: AbstractPacket?, p2: ByteBuf?) {
        TODO("Not yet implemented")
    }

    override fun decode(p0: ChannelHandlerContext?, p1: ByteBuf?, p2: MutableList<Any>?) {
        TODO("Not yet implemented")
    }
}