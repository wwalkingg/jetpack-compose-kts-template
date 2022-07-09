val composeVersion = extra["compose.version"] as String

plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.kotlin.kapt")
    id("com.google.devtools.ksp")
}

android {
    namespace = "top.notbe.jetpackComposeKtsTemplate"
    compileSdk = 32
    defaultConfig {
        applicationId = "top.notbe.jetpackComposeKtsTemplate"
        minSdk = 28
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = composeVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
dependencies {
    val lifecycleVersion = "2.5.0-rc01"
    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.compose.ui:ui-tooling-preview:$composeVersion")
//    material2
//    implementation("androidx.compose.material:material:1.3.0-alpha01")
//  material3
    implementation("androidx.compose.material3:material3:1.0.0-alpha14")
    implementation("androidx.compose.material3:material3-window-size-class:1.0.0-alpha14")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")
    implementation("androidx.activity:activity-compose:1.5.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$composeVersion")
    debugImplementation("androidx.compose.ui:ui-tooling:$composeVersion")
    debugImplementation("androidx.compose.ui:ui-test-manifest:$composeVersion")
    // view-model
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion")
    // navigation
    implementation("androidx.navigation:navigation-compose:2.5.0")
    // navigation
    implementation("androidx.navigation:navigation-compose:2.5.0")
//    #accompanist
//    val accompanistVersion = "0.24.10-beta"
//    implementation("com.google.accompanist:accompanist-pager:$accompanistVersion")
//    implementation("com.google.accompanist:accompanist-systemuicontroller:$accompanistVersion")
//    implementation("com.google.accompanist:accompanist-flowlayout:$accompanistVersion")
//    implementation("com.google.accompanist:accompanist-permissions:$accompanistVersion")
//    #datetime
//    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.3.2")
//    #lottie - compose
//    implementation("com.airbnb.android:lottie-compose:5.2.0")
//    #ktor client
//    val ktorVersion = "2.0.2"
//    implementation("io.ktor:ktor-client-core:$ktorVersion")
//    implementation("io.ktor:ktor-client-cio:$ktorVersion")
//    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
//    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
//    #coil - load image
//    implementation("io.coil-kt:coil-compose:2.1.0")
//    #napier - kotlin log
//    implementation("io.github.aakira:napier:2.6.1")
//    #room
//    val roomVersion = "2.4.2"
//    implementation("androidx.room:room-runtime:$roomVersion")
//    annotationProcessor("androidx.room:room-compiler:$roomVersion")
//    kapt("androidx.room:room-compiler:$roomVersion")
//    ksp("androidx.room:room-compiler:$roomVersion")
//    implementation("androidx.room:room-ktx:$roomVersion")
//    #retrofit
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
}