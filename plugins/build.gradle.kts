import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}
group = "com.santimattius.plugins"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

repositories {
    mavenCentral()
    google()
}

gradlePlugin {
    plugins {
        register("androidApplicationCompose") {
            id = "com.santimattius.plugins.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidApplication") {
            id = "com.santimattius.plugins.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "com.santimattius.plugins.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "com.santimattius.plugins.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("androidFlavors") {
            id = "com.santimattius.plugins.flavors"
            implementationClass = "AndroidApplicationFlavorsConventionPlugin"
        }

        register("androidFeature") {
            id = "com.santimattius.plugins.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
    }
}