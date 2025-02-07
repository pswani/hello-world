plugins {
    id("java")
    id("org.springframework.boot") version "3.4.2"
	id("io.spring.dependency-management") version "1.1.7"
    id("application")
}

group = "pwani.hello"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-hateoas")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation(project(":greeting-lib"))

    }

application {
    mainClass = "pwani.hello.Main"
}

tasks.test {
    useJUnitPlatform()
}