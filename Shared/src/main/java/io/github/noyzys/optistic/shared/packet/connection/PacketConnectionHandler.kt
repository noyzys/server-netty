package io.github.noyzys.optistic.shared.packet.connection

import io.github.noyzys.optistic.server.AbstractServerDriver
import io.github.noyzys.optistic.shared.packet.AbstractPacket
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.SimpleChannelInboundHandler
import io.netty.channel.epoll.Epoll
import io.netty.channel.epoll.EpollEventLoopGroup
import io.netty.channel.nio.NioEventLoopGroup
import java.net.SocketAddress
import java.util.concurrent.LinkedBlockingDeque
import java.util.concurrent.LinkedBlockingQueue

/**
 * @author: NoyZys on 10:16, 30.09.2020
 **/
class PacketConnectionHandler(
        val serverDriver: AbstractServerDriver,
        val address: SocketAddress
) : SimpleChannelInboundHandler<AbstractPacket>() {

    companion object {
        private const val READ_TIMEOUT = 30
        private const val WRITE_TIMEOUT = 0
        private const val COMPRESSION_THRESHOLD = -1
    }

    val eventLoop = if (Epoll.isAvailable()) {
        EpollEventLoopGroup()
    } else NioEventLoopGroup()

    override fun channelRead0(p0: ChannelHandlerContext?, p1: AbstractPacket?) {
        TODO("Not yet implemented")
    }
}
