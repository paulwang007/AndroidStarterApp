plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.hilt.devtools.ksp)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.paul.wang.datarepository"
    compileSdk = libs.versions.androidCompileSDK.get().toInt()

    defaultConfig {
        minSdk = libs.versions.androidMinSDK.get().toInt()

        testInstrumentationRunner = "com.paul.wang.androidstarter.HiltTestRunner"
    }

    buildFeatures {
        dataBinding = true // Or dataBinding.enable = true depending on AGP version and convention
    }

    // buildToolsVersion "36.0.0" // Generally not needed with AGP 4.0+
    // The Android Gradle plugin selects the build tools automatically.
    // Remove unless you have a very specific reason.
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.javaVersion.get().toInt()))
    }
}

hilt {
    // For multi module.
    enableAggregatingTask = true
}

dependencies {
    // ***  >>>>>>>>>>>>>>>>>>>>>>>>>>>> START Common Libraries <<<<<<<<<<<<<<<<<<<<< ***
    implementation(libs.androidx.hilt.common)
    implementation(libs.hilt.android)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.collection.ktx)
    implementation(libs.androidx.constraintlayout.v214)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.datastore.rxjava3)
    implementation(libs.androidx.datastore)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.reactivestreams.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.runtime.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.paging.compose)
    implementation(libs.androidx.paging.guava)
    implementation(libs.androidx.paging.runtime)
    implementation(libs.androidx.paging.rxjava3)
    implementation(libs.androidx.palette.ktx)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.sqlite.ktx)
    implementation(libs.androidx.startup.runtime)
    implementation(libs.androidx.work.multiprocess)
    implementation(libs.androidx.work.runtime.ktx)
    implementation(libs.material)
    implementation(libs.timber)
    implementation(libs.adapter.rxjava3)
    implementation(libs.converter.gson)
    implementation(libs.retrofit)
    implementation(libs.rxandroid)
    implementation(libs.rxjava)
    implementation(libs.hilt.android)
    implementation(libs.androidx.junit.ktx)

    ksp(libs.hilt.android.compiler)
    ksp(libs.hilt.compiler)

    // ***  ^^^^^^^^^^^^^^^^^^^^^^^^ END: Common Libraries ^^^^^^^^^^^^^^^^^^^^^^^^ ***
    testImplementation(kotlin("test"))
}
