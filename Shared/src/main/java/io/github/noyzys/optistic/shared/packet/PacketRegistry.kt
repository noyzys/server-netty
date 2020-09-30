package io.github.noyzys.optistic.shared.packet

import java.lang.reflect.Constructor

/**
 * @author: NoyZys on 09:50, 30.09.2020
 **/
object PacketRegistry {

    private val clazzCacheMap = HashMap<Class<out AbstractPacket>, Constructor<out AbstractPacket>>()
    private val packetIdsMap = HashMap<Class<out AbstractPacket>, Int>()
    private val packetsMap = HashMap<Int, Class<out AbstractPacket>>()

    fun createPacket(clazz: Class<out AbstractPacket>)
            = clazzCacheMap[clazz]?.newInstance()

    fun findPacketById(packetId: Int) = packetsMap[packetId]
    fun findPacketById(clazz: Class<out AbstractPacket>): Int {
        val identifier = packetIdsMap.getOrDefault(clazz, -1)
        require(identifier != -1) { clazz.simpleName + " is not registered" }
        return identifier
    }

    fun getPacketId(packetInfo: Int) = packetInfo and 0x7ffffff

    fun registerPacket(clazz: Class<out AbstractPacket>, packetId: Int) {
        packetIdsMap[clazz] = packetId
        packetsMap[packetId] = clazz
        clazzCacheMap[clazz] = clazz.getDeclaredConstructor()
    }
}