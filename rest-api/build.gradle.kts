plugins {
    id("java")
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    id("application")
}

group = "pwani.hello"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-hateoas")

    implementation(project(":greeting-lib"))

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

application {
    mainClass = "pwani.hello.Main"
}

tasks.test {
    useJUnitPlatform()
}