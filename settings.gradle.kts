pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
    }
    plugins{
        id("com.android.application") version  extra["android.tool.version"] as String
        id("org.jetbrains.kotlin.android") version  extra["kotlin.version"] as String
        id("com.android.library") version extra["android.tool.version"] as String
        id("org.jetbrains.kotlin.kapt") version extra["kotlin.version"] as String
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
    }
}
rootProject.name = "jetpackComposeKtsTemplate"
include(":app")
