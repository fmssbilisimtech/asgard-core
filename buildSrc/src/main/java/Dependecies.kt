object ApplicationId {

    const val ID = "com.asgard.asgardcore"
}

object Modules {
    const val APP = ":app"
    const val COMMON = ":common"
    const val CUSTOM_SNACKBAR = ":layouts:snackbar"
}

object Releases {
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
}

object Versions {

    //GLOBAL
    const val APP_COMPAT = "1.5.1"
    const val CORE_KTX = "1.7.0"
    const val KOTLIN = "1.5.10"
    const val MATERIAL = "1.7.0"
    const val CONSTRAINT_LAYOUT = "2.1.4"
    const val COMPILE_SDK = 32
    const val MIN_SDK = 21
    const val TARGET_SDK = 32

    //KOTLIN
    const val HILT = "2.44"
}

object KotlinLibraries {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"

    //Hilt
    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
}

object AndroidLibraries {
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
}

