enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://plugins.gradle.org/m2/")
    }
    plugins{
        kotlin("jvm") version extra["kotlin.version"] as String
        id("com.android.application") version  extra["android.tool.version"] as String
        id("org.jetbrains.kotlin.android") version  extra["kotlin.version"] as String
        id("com.android.library") version extra["android.tool.version"] as String
        id("org.jetbrains.kotlin.kapt") version extra["kotlin.version"] as String
        kotlin("plugin.serialization") version extra["kotlin.version"] as String
        id("org.jetbrains.kotlin.kapt") version extra["kotlin.version"] as String
        id("com.google.devtools.ksp") version extra["ksp.version"] as String
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
    }
}
rootProject.name = "jetpackComposeKtsTemplate"
include(":app")
