import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.10/samples
 */
plugins {
    id("com.gradlehero.themepark-conventions")
    application
    base
    kotlin("jvm")
    `java-library`
    `maven-publish`
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.12.0")
    api("com.fasterxml.jackson.core:jackson-databind:2.13.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
}


