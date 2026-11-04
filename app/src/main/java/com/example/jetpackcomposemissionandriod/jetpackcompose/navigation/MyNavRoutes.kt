package com.example.jetpackcomposemissionandriod.jetpackcompose.navigation

import kotlinx.serialization.Serializable


// Sealed class creates a restricted hierarchy of classes,
// so, its subclasses can be defined in the same file.
// Each subclasses can have its own properties and methods.
@Serializable
sealed class MyNavRoutes {

    @Serializable
    object LoginScreen : MyNavRoutes()

    @Serializable
    object HomeScreen : MyNavRoutes()

    @Serializable
    data class WelcomeScreen(val userName: String) : MyNavRoutes()

}