package com.example.jetpackcomposemissionandriod.jetpackcompose

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemissionandriod.R





//@Preview(showBackground = true,
//    showSystemUi = true,
//    device="spec:width=300dp, height=400dp")
@Composable
fun ImageExample() {

    Image(
        painter = painterResource(R.drawable.wallpaperflare),
        contentDescription = "Image of Mountains",
        modifier = Modifier.padding(all=16.dp)
            .size(220.dp)
            .clip(RoundedCornerShape(20.dp)),
        contentScale = ContentScale.Crop
    )
}



@Preview(showBackground = true,
    showSystemUi = true,
    device="spec:width=300dp, height=400dp")
@Composable
fun IconExample() {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_person_4_sharp_w500_filled_g200_24dp),
            contentDescription = "User Person Icon",
            modifier = Modifier.size(50.dp),
            tint = Color.Blue,
            )
    }
}