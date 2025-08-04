package com.obi.theinvite

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform