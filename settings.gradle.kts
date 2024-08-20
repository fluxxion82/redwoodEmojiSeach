pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
    }
}

rootProject.name = "emojiSearch"

include(":values")
include(":schema")
include(":schema:compose")
include(":schema:compose:protocol")
include(":schema:widget")

include (":schema:modifiers")
include (":schema:protocol-guest")
include (":schema:protocol-host")
include (":schema:testing")
include (":schema:widget")

include(":schema:widget:protocol")
include(":presenter")
include(":presenter-treehouse")
include(":launcher")
include(":shared-composeui")

include(":android-composeui")
include(":ios-shared")
