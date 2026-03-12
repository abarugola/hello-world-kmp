package org.example.hello_world_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform