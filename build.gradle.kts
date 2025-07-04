// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    /**
     * Use `apply false` in the top-level build.gradle.kts file to add a Gradle
     * plugin as a build dependency but not apply it to the current (root)
     * project. Don't use `apply false` in sub-projects. For more information,
     * see Applying external plugins with same version to subprojects.
     */
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.hilt.android) apply false
    alias(libs.plugins.hilt.devtools.ksp) apply false
    alias(libs.plugins.kotlin.android) apply false
}
