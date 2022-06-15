package ike.murami.shared

actual class Platform actual constructor() {
    actual val platform: String = "Web ${kotlin.KotlinVersion.CURRENT}"
}