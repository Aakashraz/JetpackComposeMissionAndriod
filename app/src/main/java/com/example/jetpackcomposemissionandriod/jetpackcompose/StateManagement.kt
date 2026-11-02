package com.example.jetpackcomposemissionandriod.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(
    showBackground = true, showSystemUi = true,
    device = "spec:width=320dp, height=400dp"
)
@Composable
fun StateManagementExample() {

    // rememberSaveable saves the state even when the configuration changes.
    var score by rememberSaveable { mutableIntStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Score: $score",
            fontSize = 30.sp
        )
        Row() {
            Button(
                onClick = {score++},
                modifier = Modifier.weight(0.5f)

            ) {
                Text(text = "Increase")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = {score--},
                modifier = Modifier.weight(0.5f),
                enabled = score > 0
            ) {
                Text(text = "Decrease")
            }
        }

    }
}


// Parent Composable
@Composable
fun StateHoistingExample() {
    var score by remember { mutableIntStateOf(0) }
    CounterChild(
        score,
        increment = {score++},
        decrement = {score--}
        )
}


// Child Composable
@Composable
fun CounterChild(
    score: Int,
    increment: () -> Unit,
    decrement: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Score: $score",
            fontSize = 25.sp
        )
        Row() {
            Button (
                onClick = {increment()},
                modifier = Modifier.weight(0.5f),
            ) {
                Text(text = "Increase")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button (
                onClick = {decrement()},
                modifier = Modifier.weight(0.5f),
                enabled = score > 0
            ) {
                Text(text = "Decrease")
            }
        }
    }

}
