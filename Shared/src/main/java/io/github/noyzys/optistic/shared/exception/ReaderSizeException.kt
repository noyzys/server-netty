package io.github.noyzys.optistic.shared.exception

/**
 * @author: NoyZys on 09:26, 30.09.2020
 **/
class ReaderSizeException(message: String) : RuntimeException() {

    override val cause: Throwable?
        get() = super.cause

    override val message: String?
        get() = super.message
}