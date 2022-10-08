plugins {
    java
    id("org.flywaydb.flyway") version "9.4.0"
}

group = "org.vk_edu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":model"))

    implementation("com.intellij:annotations:12.0")
    implementation("org.postgresql:postgresql:42.5.0")
    implementation("com.google.code.gson:gson:2.9.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

flyway {
    driver = "org.postgresql.Driver"
    url = "jdbc:postgresql://localhost:5432/VK_HW1"
    user = "postgres"
    password = "postgres"
    schemas = arrayOf("public")
    defaultSchema = "public"
}