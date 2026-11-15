package com.example.jetpackcomposemissionandriod.jetpackcompose.navigation_bar

import kotlinx.serialization.Serializable


@Serializable
sealed class NavBarRoutes {

    @Serializable
    object Home : NavBarRoutes()
    @Serializable
    object Search : NavBarRoutes()
    @Serializable
    object Notifications : NavBarRoutes()
    @Serializable
    object Profile : NavBarRoutes()
}