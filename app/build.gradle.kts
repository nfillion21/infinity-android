plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "pgm.poolp.infinity"
    compileSdk = 32

    defaultConfig {
        applicationId = "pgm.poolp.infinity"
        minSdk = 31
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
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
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.coreAndroidX)
    implementation (Dependencies.lifecycleRuntime)
    implementation (Dependencies.activityCompose)
    implementation (Dependencies.composeUi)
    implementation (Dependencies.composeUiToolingPreview)
    implementation (Dependencies.composeMaterial3)

    testImplementation (Dependencies.junit)

    androidTestImplementation (Dependencies.androidTestJunit)
    androidTestImplementation (Dependencies.androidTestEspresso)

    androidTestImplementation (Dependencies.composeUiTestJUnit4)
    debugImplementation (Dependencies.composeUiTestTooling)
    debugImplementation (Dependencies.composeUiTestManifest)
}