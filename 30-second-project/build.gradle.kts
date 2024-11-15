plugins {
    base
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

println("This is the 30 second project")
println("result of 5 + 2 is ${5 + 2}")

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.register<Copy>("copyMessage") {
    from("important-task.txt")
    into(layout.buildDirectory)
}

tasks.test {
    useJUnitPlatform()
}