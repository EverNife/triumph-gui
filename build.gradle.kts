plugins {
    id("java-library")
}

allprojects {
    repositories {
        mavenCentral()
        maven("https://hub.spigotmc.org/nexus/content/groups/public/")
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

subprojects {

    apply {
        plugin("java-library")
    }

    group = "dev.triumphteam"
    version = "3.0.4-e1"

    dependencies {
        compileOnly("org.jetbrains:annotations:21.0.1")
        compileOnly("org.spigotmc:spigot-api:1.16.5-R0.1-SNAPSHOT")
    }

    tasks {
        withType<JavaCompile> {
            sourceCompatibility = "1.8"
            targetCompatibility = "1.8"
            options.encoding = "UTF-8"
        }
    }

}
