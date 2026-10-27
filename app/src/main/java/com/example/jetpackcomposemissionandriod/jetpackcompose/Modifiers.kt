package com.example.jetpackcomposemissionandriod.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true,
    device = "spec:width=380dp, height=300dp")
@Composable
fun ModifiersExample() {
    Column(
        modifier = Modifier.fillMaxWidth().
            background(color = Color.Magenta).
            padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .background(color= Color.Cyan)
                .padding(all = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "Apple", fontSize = 15.sp)
            Text(text = "Banana", fontSize = 15.sp)
            Text(text = "Cherry", fontSize = 15.sp)
        }

        Box(
            modifier = Modifier
                .background(color = Color.DarkGray, shape = RoundedCornerShape(size=10.dp))
                .size(150.dp)
                .clickable( onClick = {})
                .border(width = 5.dp, color = Color.White, shape=RoundedCornerShape(10.dp)),
            contentAlignment = Alignment.Center,
        ) {
            Text(text="Center", fontSize = 17.sp, color = Color.White)
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .background(color= Color.Yellow)
                .padding(all= 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "One", fontSize = 15.sp)
            Text(text = "Two", fontSize = 15.sp)
            Text(text = "Three", fontSize = 15.sp)
        }
    }
}
