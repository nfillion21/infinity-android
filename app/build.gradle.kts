import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "pgm.poolp.infinity"
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        applicationId = "pgm.poolp.infinity"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

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
    implementation (Dependencies.iconsExtended)
    implementation (Dependencies.composeUi)
    implementation (Dependencies.composeUiToolingPreview)
    implementation (Dependencies.composeMaterial3)
    implementation (Dependencies.composeMaterial)

    implementation (Dependencies.constraintLayout)

    implementation (Dependencies.lifecycleViewModelCompose)

    testImplementation (Dependencies.junit)

    androidTestImplementation (Dependencies.androidTestJunit)
    androidTestImplementation (Dependencies.androidTestEspresso)

    androidTestImplementation (Dependencies.composeUiTestJUnit4)
    debugImplementation (Dependencies.composeUiTestTooling)
    debugImplementation (Dependencies.composeUiTestManifest)

    implementation (Dependencies.hiltAndroid)
    //implementation (Dependencies.hiltAndroidCompiler)
    implementation (Dependencies.hiltNavigationCompose)

    implementation (Dependencies.pagingCompose)
    implementation (Dependencies.coilCompose)


}