package com.example.jetpackcomposemissionandriod.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun HorizontalDividerExample() {

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Profile Details")
        HorizontalDivider(
            modifier = Modifier.width(120.dp).padding(vertical = 16.dp),
            thickness = 2.dp,
            color = Color.DarkGray
        )
        Text(text = "More Information")
    }

}


@Preview(showBackground = true, showSystemUi = true,
    device = "spec:width=240dp, height=320dp")
@Composable
fun VerticalDividerExample() {
    Row(
        modifier = Modifier.fillMaxHeight().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "Profile Details")

        VerticalDivider(
            modifier = Modifier.height(50.dp).padding(horizontal = 16.dp),
            thickness = 2.dp,
            color = Color.Blue
        )

        Text(text = "More Information")
    }

    }