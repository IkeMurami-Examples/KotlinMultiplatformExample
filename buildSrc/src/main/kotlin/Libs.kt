object Libs {

    object Project {
        // Здесь перечисляем наши модули и библиотеки
        const val my_library = ":my-library"

        const val shared_library = ":src:shared"
        const val android_target_application = ":src:android"
        const val web_target_application = ":src:web"
    }

    object Gradle {
        private const val ver_gradle = "4.2.0"
        const val andoid_tools_build = "com.android.tools.build:gradle:$ver_gradle"

        private const val ver_kotlin_gradle = "1.5.30"
        const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$ver_kotlin_gradle"
    }

    object Kotlin {
        // Фиксируем версию котлина
        private const val ver_kotlin = "1.4.32"
        const val stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$ver_kotlin"
        const val stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$ver_kotlin"
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$ver_kotlin"
    }

    object AndroidX {
        // androidx-зависимости
        private const val ver_appcompat = "1.2.0"
        const val appcompat = "androidx.appcompat:appcompat:$ver_appcompat"

        private const val ver_core_ktx = "1.3.2"
        const val coreKtx = "androidx.core:core-ktx:$ver_core_ktx"

        private const val ver_multidex = "2.0.1"
        const val multidex = "androidx.multidex:multidex:$ver_multidex"

        private const val ver_constraintlayout = "2.1.3"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:$ver_constraintlayout"

        private const val ver_core = "1.3.2"
        const val coreX = "androidx.core:core:$ver_core"
    }

    object Material {
        private const val ver_material = "1.3.0-beta01"
        const val material = "com.google.android.material:material:$ver_material"

    }

    object Rx {
        // Rx-зависимости
    }

    object Coroutines {
        private const val ver_core = "1.4.3"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$ver_core"
        const val rx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:$ver_core"
        const val rx3 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx3:$ver_core"
    }

    object Gson {
        private const val ver_gson = "2.8.6"
        const val gson = "com.google.code.gson:gson:$ver_gson"
    }

    object SpringBoot {
        private const val ver_spring_boot = "2.6.4"
        const val jdbc = "org.springframework.boot:spring-boot-starter-data-jdbc:$ver_spring_boot"
        const val web = "org.springframework.boot:spring-boot-starter-web:$ver_spring_boot"
        const val security = "org.springframework.boot:spring-boot-starter-security:$ver_spring_boot"

        private const val ver_spring_swagger = "1.6.0"
        const val openapi_data_rest = "org.springdoc:springdoc-openapi-data-rest:$ver_spring_swagger"
        const val openapi_ui = "org.springdoc:springdoc-openapi-ui:$ver_spring_swagger"
        const val openapi_kotlin = "org.springdoc:springdoc-openapi-kotlin:$ver_spring_swagger"
    }

    object Apache {
        private const val ver_httpclient = "3.1"
        const val httpclient = "commons-httpclient:commons-httpclient:$ver_httpclient"
    }

    object Jackson {
        private const val ver_jackson_xml_kotlin = "2.13.1"
        const val kotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:$ver_jackson_xml_kotlin"
    }

    object Database {
        private const val ver_h2_database = "1.4.200"
        const val h2 = "com.h2database:h2:$ver_h2_database"

        private const val ver_hibernate = "5.6.5.Final"
        const val hibernate = "org.hibernate:hibernate-core:$ver_hibernate"
    }

    object Test {

    }
}