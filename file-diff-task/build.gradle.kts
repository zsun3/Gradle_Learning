/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.10/samples
 */
import com.gradlehero.FileDiffTask

import com.gradlehero.FileDiffPluginExtension

plugins {
    id("com.gradlehero.file-diff") version "0.1.0-SNAPSHOT"
}

repositories {
    mavenLocal()
}
// Syntax to use task from definition
//tasks.register<FileDiffTask>("fileDiff") {
//    file1.set(file("rollercoaster.jpg"))
//    file2.set(file("logflume.jpg"))
//}

//interface FileDiffPluginExtension {
//    val file1: RegularFileProperty
//    val file2: RegularFileProperty
//}
//
//class FileDiffPlugin : Plugin<Project> {
//    override fun apply(project: Project) {
//        val extension = project.extensions.create<FileDiffPluginExtension>("fileDiff")
//
//        project.tasks.register<FileDiffTask>("fileDiff") {
//            file1.set(extension.file1)
//            file2.set(extension.file2)
//        }
//    }
//}
//
//apply<FileDiffPlugin>()

configure<FileDiffPluginExtension> {
    file1.set(file("rollercoaster.jpg"))
    file2.set(file("logflume.jpg"))
}