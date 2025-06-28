plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.hilt.devtools.ksp) // Assuming this is your KSP plugin alias
    alias(libs.plugins.hilt.android)
}

android {
    namespace = "com.paul.wang.androidstarter" // Best practice to put namespace at the top of the android block
    compileSdk = libs.versions.androidCompileSDK.get().toInt()

    defaultConfig {
        minSdk = libs.versions.androidMinSDK.get().toInt()

        testInstrumentationRunner = "com.paul.wang.androidstarter.HiltTestRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true // Changed from minifyEnabled
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        debug {
            isMinifyEnabled = false // Changed from minifyEnabled
        }
    }
}


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.javaVersion.get().toInt()))
    }
}

dependencies {
    implementation(project(":viewmodel"))
    implementation(libs.hilt.android)

    ksp(libs.hilt.android.compiler)

    testImplementation(libs.androidx.runner)
}