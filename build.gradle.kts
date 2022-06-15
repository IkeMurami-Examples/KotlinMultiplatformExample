import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Libs.Gradle.andoid_tools_build) {
            because("Это надо для сборки Android приложений и библиотек")
        }
        classpath(Libs.Gradle.kotlin_plugin)
    }

}

group = "ike.murami"
version = "1.0-SNAPSHOT"

// Установили настройки репозиториев для всех проектов в рантайме
allprojects {
    repositories {
        mavenCentral()
        google()
    }

    dependencies {  }

    // Все билдим с одной версией Java
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = Versions.jvm_version
    }
}


