package io.github.noyzys.optistic.shared.packet.api

/**
 * @author: NoyZys on 10:19, 30.09.2020
 **/
interface IPacketEncryptor {

    fun getDecryptOutputSize(length: Int): Int
    fun getEncryptOutputSize(length: Int): Int

    fun decrypt(input: ByteArray, inputOffset: Int, inputLength: Int, output: ByteArray, outputOffset: Int): Int
    fun encrypt(input: ByteArray, inputOffset: Int, inputLength: Int, output: ByteArray, outputOffset: Int): Int
}