import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    base
    kotlin("jvm") version "2.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

defaultTasks("generateDescriptions")

tasks.register<Copy>("generateDescriptions") {
    group = "Theme Park"
    description = "Generates ride descriptions including token substitution"
    println("Running generate Descriptions tasks...")
    from(fileTree(layout.projectDirectory.dir("descriptions")).files)
    into(layout.buildDirectory.dir("descriptions"))
    filter<ReplaceTokens>("tokens" to mapOf("THEME_PARK_NAME" to "Six Flags"))
}

tasks.register<Zip>("zipDescriptions") {
    group = "Theme Park"
    description = "Zip generated descriptions"
    from(layout.buildDirectory.dir("descriptions"))
    destinationDirectory.set(layout.buildDirectory.dir("zips-here"))
    archiveFileName.set("reusable-name.zip")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}