plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

repositories {
    mavenCentral()
}


kotlin {
    // Configure Targets:
    // Full List: https://kotlinlang.org/docs/multiplatform-dsl-reference.html#targets
    jvm ()
    android {
        // publishLibraryVariants("release", "debug")
        // publishAllLibraryVariants()
    }

    // Подключаем исходный код для сборки через SourceSets
    sourceSets {
        val commonMain by getting {
            kotlin.srcDirs("commonMain")

            // resources.srcDir("res")
            dependencies {
                // Здесь мы можем определить зависимости модуля
            }
        }
        val androidMain by getting
        val jvmMain by getting {
            kotlin.srcDirs("jvmMain")
        }
    }
}

android {
    compileSdk = 31
    sourceSets {
        named("main") {
            java.srcDirs("androidMain/kotlin")
            manifest.srcFile("androidMain/AndroidManifest.xml")
        }
    }

    defaultConfig {
        minSdk = 21
        targetSdk = 31
    }
    // Вывести SourceSet:
    // println(sourceSets.forEach { println(it.name) })

    compileOptions {
        sourceCompatibility = Versions.java_version
        targetCompatibility = Versions.java_version
    }
}

dependencies {
}