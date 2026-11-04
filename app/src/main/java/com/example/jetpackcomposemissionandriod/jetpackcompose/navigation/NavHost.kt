package com.example.jetpackcomposemissionandriod.jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute


@Composable
fun NavGraph() {

    // navController is used to navigate between the screens.
    // rememberNavController -> Create and Remember navController
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen
    ) {
         composable<MyNavRoutes.LoginScreen> {
             LoginScreenUI(navController)
         }

        composable<MyNavRoutes.HomeScreen> {
            HomeScreenUI(navController)
        }

        // backStackEntry is a Lambda function that have data and arguments
        // which are passed during Navigation.
        composable<MyNavRoutes.WelcomeScreen> { backStackEntry ->
            val data = backStackEntry.toRoute<MyNavRoutes.WelcomeScreen>()
            WelcomeScreenUI(data.userName, navController)
        }
    }
}