import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
    id("org.jlleitschuh.gradle.ktlint") version "10.2.1"
    id("org.jetbrains.dokka") version "1.6.10"
}

group = "me.aws-prep"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.dokkaHtml.configure {
    outputDirectory.set(projectDir.resolve("docs"))
}

application {
    mainClass.set("MainKt")
}
