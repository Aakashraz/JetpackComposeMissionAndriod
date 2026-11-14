package com.example.jetpackcomposemissionandriod.jetpackcompose.navigation_bar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.jetpackcomposemissionandriod.R


@Composable
fun MyNavBar() {

    val navItems = listOf(
        NavItem("Home", ImageVector.vectorResource(R.drawable.ic_home_rounded_filled_24dp)),
        NavItem("Search", ImageVector.vectorResource(R.drawable.ic_search_rounded_24dp)),
        NavItem("Notifications", ImageVector.vectorResource(R.drawable.ic_notifications_rounded_filled_24dp)),
        NavItem("Profile", ImageVector.vectorResource(R.drawable.ic_person_book_rounded_filled_24dp))
    )

    NavigationBar() {
        navItems.forEach { item ->
            NavigationBarItem(
                selected = true,
                onClick = {},
                icon = {
                    Icon(imageVector = item.icon, contentDescription = "$item.title")
                },
                label = { Text(text = item.title) }
            )
        }


    }
}


data class NavItem(
    val title: String,
    val icon: ImageVector
)