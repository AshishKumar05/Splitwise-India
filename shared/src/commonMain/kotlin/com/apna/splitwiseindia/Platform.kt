package com.apna.splitwiseindia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform