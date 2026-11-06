package com.example.jetpackcomposemissionandriod.jetpackcompose.scaffold

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemissionandriod.R


@Preview(
    showBackground = true, showSystemUi = true,
    device = "spec:width=250dp, height=400dp"
)
@Composable
fun FAB() {

    FloatingActionButton(
        onClick = { },
        containerColor = Color.Green.copy(0.9f),
        contentColor = Color.White,
        elevation = FloatingActionButtonDefaults.elevation(
            defaultElevation = 8.dp
        )
    ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add_2_rounded_24dp),
                contentDescription = "Add Icon",
                modifier = Modifier.size(24.dp)
            )

    }
}