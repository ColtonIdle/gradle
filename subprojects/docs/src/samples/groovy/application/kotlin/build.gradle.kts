plugins {
    groovy
    application
}

version = "1.0.2"
group = "org.gradle.sample"

repositories {
    jcenter()
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.5.7")
}

application {
    mainClassName = "org.gradle.sample.Main"
}
