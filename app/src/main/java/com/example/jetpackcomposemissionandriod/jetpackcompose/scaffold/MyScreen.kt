package com.example.jetpackcomposemissionandriod.jetpackcompose.scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(
    showBackground = true, showSystemUi = true,
    device = "spec:width=400dp, height=600dp"
)
@Composable
fun MyScreen() {

    Scaffold(
        topBar = { AppTopBar() },
        bottomBar = { AppBottomBar() },
        floatingActionButton = { FAB() }
    ) { innerPadding ->

//        Column(
//            modifier = Modifier
//                .padding(innerPadding)
//                .fillMaxSize(),
//            verticalArrangement = Arrangement.spacedBy(10.dp)
//        ) {
//            for (i in 1..15) {
//            MyScreenContent()
//            }
//        }

        // Using LazyColumn to display the content
        LazyColumn(
            modifier = Modifier
//                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            // Use the padding to the contentPadding parameter in LazyColumn
            contentPadding = innerPadding

        ) {
            items(15) {
                MyScreenContent()
            }
        }
    }
}