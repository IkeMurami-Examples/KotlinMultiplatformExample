import org.gradle.api.JavaVersion


fun getBuildNumber(): Int {
    var buildNumber = 1

    if (System.getenv("VERSION_CODE") != null) {
        buildNumber = System.getenv("VERSION_CODE") as Int
    }

    return buildNumber
}


object Versions {
    // Java Version
    val java_version = JavaVersion.VERSION_11  // JavaVersion.VERSION_15
    val jvm_version = java_version.toString()

    // App Version
    private const val VERSION_MAJOR = 1
    private const val VERSION_MINOR = 0
    private const val VERSION_PATCH = 0

    var build_number = getBuildNumber()
    const val version_number = "${VERSION_MAJOR}.${VERSION_MINOR}.${VERSION_PATCH}"
}