package org.example.hello_world_kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "hello-world-kmp",
    ) {
        App()
    }
}