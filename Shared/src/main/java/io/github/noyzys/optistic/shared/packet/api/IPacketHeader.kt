package io.github.noyzys.optistic.shared.packet.api

import io.netty.buffer.ByteBuf

/**
 * @author: NoyZys on 10:21, 30.09.2020
 **/
interface IPacketHeader {

    val isLengthVariable: Boolean
    val lengthSize: Int

    fun getLengthSize(length: Int): Int
    fun readLength(input: ByteBuf, available: Int): Int
    fun writeLength(output: ByteBuf, length: Int)
    fun readPacketId(input: ByteBuf): Int
    fun writePacketId(output: ByteBuf, packetId: Int)
}
