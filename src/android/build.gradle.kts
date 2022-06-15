plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "ike.murami.android"

        minSdk = 21  // appcompat required to increase minSdk version to at least 14
        targetSdk = 31

        versionCode = 1
        versionName = "1.0"
    }

    sourceSets {
        named("main") {
            java.srcDirs("src/main/kotlin")
        }
        /*
        val commonMain by getting {
            dependencies {
                // there are dependencies for a multiplatform target
            }
        }
        */
    }

    compileOptions {
        sourceCompatibility = Versions.java_version
        targetCompatibility = Versions.java_version
    }

    kotlinOptions {
        jvmTarget = Versions.jvm_version
    }
}

dependencies {
    // Подключаем нашу библиотеку
    implementation(project(Libs.Project.shared_library))

    // Подключаем сторонние зависимости
    implementation(Libs.Material.material)
    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.constraintlayout)
}