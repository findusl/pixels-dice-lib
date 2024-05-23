import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.`maven-publish`

plugins {
    `maven-publish`
    signing
}

publishing {
    // Configure all publications
    publications.withType<MavenPublication> {
        // Stub javadoc.jar artifact
        artifact(tasks.register("${name}JavadocJar", Jar::class) {
            archiveClassifier.set("javadoc")
            archiveAppendix.set(this@withType.name)
        })

        groupId = "de.lehrbaum.lib.pixels"
        artifactId = "pixels-dice-lib"
        version = "1.0.0"

        // Provide artifacts information required by Maven Central
        pom {
            name.set("Kotlin Multiplatform Pixels Dice Library")
            description.set("Library to connect to Pixels Dice from different platforms")
            url.set("https://github.com/findusl/pixels-dice-lib")

            licenses {
                license {
                    name.set("MIT")
                    url.set("https://opensource.org/licenses/MIT")
                }
            }
            developers {
                developer {
                    id.set("findusl")
                    name.set("Sebastian")
                    email.set("findus_l@outlook.com")
                }
            }
            scm {
                url.set("https://github.com/Kotlin/multiplatform-library-template")
            }
        }
    }
}

signing {
    if (project.hasProperty("signing.gnupg.keyName")) {
        useGpgCmd()
        sign(publishing.publications)
    }
}
