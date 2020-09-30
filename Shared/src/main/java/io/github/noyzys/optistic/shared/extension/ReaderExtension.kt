package io.github.noyzys.optistic.shared.extension

import io.github.noyzys.optistic.shared.exception.ReaderSizeException
import io.netty.buffer.ByteBuf

/**
 * @author: NoyZys on 09:09, 30.09.2020
 **/

fun ByteBuf.read(): Int {
    var value = 0
    var size = 0
    var byte: Int

    while (readByte().toInt().let {
                byte = it
                return@let it
            } and 0x80 == 0x80) {

        value = value or (byte and 0x7F shl size++ * 7)

        if (size <= 5) continue
        throw ReaderSizeException("var Int too long... (length must be <= 5)")
    }

    return value or (byte and 0x7F shl size * 7)
}

fun Int.write(byteBuf: ByteBuf, toWrite: Int) {
    var temp = toWrite

    while (temp and 0x7F.inv() != 0) {
        byteBuf.writeByte((temp and 0x7F) or 0x80)
        temp = temp ushr 7
    }

    byteBuf.writeByte(temp)
}