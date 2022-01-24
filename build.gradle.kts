plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.31" 
    id("java-library")
}

repositories {
    mavenCentral()
    maven {
        name = "WPILib"
        setUrl("https://frcmaven.wpi.edu/artifactory/release")
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom")) 
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") 
    testImplementation("org.jetbrains.kotlin:kotlin-test") 
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    
    compileOnly(group: "edu.wpi.first.shuffleboard", name: "api", version: "2022.2.1")
}

tasks.register("installPlugin", Copy) {
    from(tasks.named("jar")) // dependsOn() maybe
    into("${System.getProperty("user.home")}/Shuffleboard/plugins")
    description = "Builds the plugin JAR and installs it in the Shuffleboard plugins directory."
    group = "Shuffleboard Plugin"
}
