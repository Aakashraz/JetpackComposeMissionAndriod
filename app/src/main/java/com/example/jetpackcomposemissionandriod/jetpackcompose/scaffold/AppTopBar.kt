package com.example.jetpackcomposemissionandriod.jetpackcompose.scaffold

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposemissionandriod.R


@OptIn(ExperimentalMaterial3Api::class)
@Preview(
    showBackground = true, showSystemUi = true,
    device = "spec:width=250dp, height=400dp"
)
@Composable
fun AppTopBar() {

    TopAppBar(
        title = {
            Text(
                text = "My App",
                fontWeight = FontWeight.SemiBold
            )
        },

        navigationIcon = {
            IconButton(
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_menu_rounded_24dp),
                    contentDescription = "Menu Icon"
                )
            }
        },

        actions = {

            IconButton(
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search_rounded_24dp),
                    contentDescription = "Search"
                )
            }

            IconButton(
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_more_vert_rounded_24dp),
                    contentDescription = "MoreVert"
                )
            }
        },

        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Magenta.copy(0.4f),
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        )
    )
}

