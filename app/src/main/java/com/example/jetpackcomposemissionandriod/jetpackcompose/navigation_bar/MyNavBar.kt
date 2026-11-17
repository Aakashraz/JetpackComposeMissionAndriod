package com.example.jetpackcomposemissionandriod.jetpackcompose.navigation_bar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.jetpackcomposemissionandriod.R


@Composable
fun MyNavBar(navController: NavHostController, key: String) {

    val navItems = listOf(
        NavItem(
            "Home", ImageVector.vectorResource(R.drawable.ic_home_rounded_filled_24dp),
            NavBarRoutes.Home
        ),
        NavItem(
            "Search", ImageVector.vectorResource(R.drawable.ic_search_rounded_24dp),
            NavBarRoutes.Search
        ),
        NavItem(
            "Notifications",
            ImageVector.vectorResource(R.drawable.ic_notifications_rounded_filled_24dp),
            NavBarRoutes.Notifications
        ),
        NavItem(
            "Profile", ImageVector.vectorResource(R.drawable.ic_person_book_rounded_filled_24dp),
            NavBarRoutes.Profile
        )
    )

    NavigationBar() {
        navItems.forEach { item ->
            NavigationBarItem(
                selected = item.title == key,
                onClick = {
                    navController.navigate(item.routes) {
                        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(imageVector = item.icon, contentDescription = null)
                    // Since the tab already has a visible label, you could even pass null to avoid the screen reader saying “Home” twice.
                },
                label = { Text(text = item.title) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Magenta,
                    selectedTextColor = Color.Magenta.copy(alpha = 0.5f),
                    indicatorColor = Color.Green.copy(alpha = 0.1f),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray
                )
            )
        }


    }
}


data class NavItem(
    val title: String,
    val icon: ImageVector,
    val routes: NavBarRoutes,
)