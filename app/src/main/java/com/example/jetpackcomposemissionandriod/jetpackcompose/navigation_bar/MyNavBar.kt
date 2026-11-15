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
import androidx.navigation.NavController
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
                onClick = {navController.navigate(item.routes)},
                icon = {
                    Icon(imageVector = item.icon, contentDescription = "$item.title")
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