package com.example.jetpackcomposemissionandriod.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextExample() {
    Text(
        text = "Hello Android",
        color = Color.Blue,
        fontSize = 30.sp,
        fontFamily = FontFamily.SansSerif,
        letterSpacing = 3.sp,
        textAlign = TextAlign.Right

    )
}


//@Preview(showBackground = true,
//     showSystemUi = true,
//    device = "spec:width=360dp,height=200dp")
@Composable
fun TextFieldExample() {

    var name by remember { mutableStateOf("") }

    TextField(
        value = name,
        onValueChange = { name = it },
        // label = {Text(text = "Enter you Name")},
        placeholder = { Text(text = "Enter Name") },
        leadingIcon = { Text(text = "%%%") },
        trailingIcon = { Text(text = "$$$",
            fontWeight = FontWeight.SemiBold)
        },
        singleLine = true,
        shape = RoundedCornerShape(size=20.dp)
    )
}


//@Preview(showBackground=true, showSystemUi = true,
//        device= "spec:width=360dp, height=200dp"
//    )
@Composable
fun OutlinedTextFieldExample() {
    var name by remember {mutableStateOf("")}

    OutlinedTextField(
        value = name,
        onValueChange = {name = it},
        label = {Text(text = "Enter YOUr Name")},
        singleLine = true,
        shape = CircleShape,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.Red ,
            focusedTextColor = Color.Blue,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            unfocusedLabelColor = Color.DarkGray,
            focusedLabelColor = Color.Black,
            cursorColor = Color.Magenta,
            unfocusedBorderColor = Color.Blue,
            focusedBorderColor = Color.Black,
        )
    )
}



//@Preview(showBackground = true, showSystemUi = true,
//    device= "spec:width=360dp, height=200dp"
//)
@Composable
fun RowExample() {

    Row (
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    )
    {
        Text(text = "Apple", fontSize = 25.sp)
        Text(text = "Ananas", fontSize = 25.sp)
        Text(text = "Orange", fontSize = 25.sp)
    }
}


@Preview(showBackground = true, showSystemUi = true,
    device= "spec:width=360dp, height=300dp")
@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "LOGIN Here", fontSize = 20.sp)
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text(text = "Enter you username") }
        )
        OutlinedTextField(
            value = " ",
            onValueChange = { },
            label = { Text(text = "Enter you password") }
        )
    }
}



//@Preview(showBackground = true, showSystemUi = true,
//    device= "spec:width=360dp, height=300dp")
@Composable
fun BoxExample() {
    Box(
        modifier = Modifier.fillMaxSize(),

    ) {
        Text(
            text = "Note 1",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.TopCenter)
        )
        Text(
            text = "Note 2",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.CenterEnd)
        )
        Text(
            text = "Note 3",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.BottomStart)
        )
    }
}