plugins {
    id("com.santimattius.plugins.feature")
    id("com.santimattius.plugins.library.compose")
}

android {
    namespace = "com.santimattius.android.custom.second.feature"

}

dependencies{
    implementation(libs.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.compose.runtime.tracing)
    implementation(libs.androidx.compose.material3.windowSizeClass)
    implementation(project(mapOf("path" to ":core:ui")))
    androidTestImplementation(libs.bundles.android.testing)
}