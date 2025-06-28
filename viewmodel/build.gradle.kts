plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.hilt.devtools.ksp) // Assuming this is your KSP plugin alias from libs.versions.toml
    alias(libs.plugins.hilt.android)
}

android {
    namespace = "com.paul.wang.core_logic"
    compileSdk = libs.versions.androidCompileSDK.get().toInt()

    defaultConfig {
        minSdk = libs.versions.androidMinSDK.get().toInt()

        testInstrumentationRunner = "com.paul.wang.androidstarter.HiltTestRunner"
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.javaVersion.get().toInt()))
    }
}

dependencies {
    implementation(project(":model")) // Parentheses and double quotes for project dependency
    implementation(libs.hilt.android)

    ksp(libs.hilt.android.compiler)

    testImplementation(libs.androidx.junit.ktx)
}