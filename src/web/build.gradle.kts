import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm")
    kotlin("plugin.spring") version "1.6.21"
}

group = "com.ikemurami.service"
version = "0.0.1-SNAPSHOT"

java {
    sourceSets {
        named("main") {
            java.srcDirs("kotlin")
            resources.srcDirs("resources")
        }

    }
    sourceCompatibility = Versions.java_version
}


dependencies {
    // Подключаем нашу библиотеку
    implementation(project(Libs.Project.shared_library))

    // Kotlin
    implementation(Libs.Kotlin.reflect)
    implementation(Libs.Kotlin.stdlib_jdk8)

    // SpringBoot Web
    implementation(Libs.SpringBoot.jdbc)
    implementation(Libs.SpringBoot.web)
    implementation(Libs.SpringBoot.security)

    // XML Data Parser
    implementation(Libs.Jackson.kotlin)

    // Swagger
    implementation(Libs.SpringBoot.openapi_data_rest)
    implementation(Libs.SpringBoot.openapi_ui)
    implementation(Libs.SpringBoot.openapi_kotlin)

    // HTTP Server/Client
    implementation(Libs.Apache.httpclient)

    // Database
    runtimeOnly(Libs.Database.h2)
    implementation(Libs.Database.hibernate)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = Versions.jvm_version
    }
}