dependencies {
    compileOnlyApi("com.mojang:brigadier:1.0.500")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.11.0")

    testImplementation("io.mockk:mockk:1.14.11")
    testImplementation(kotlin("test"))
}
