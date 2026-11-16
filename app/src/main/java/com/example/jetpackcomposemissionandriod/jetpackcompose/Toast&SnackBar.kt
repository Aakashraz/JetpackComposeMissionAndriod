package com.example.jetpackcomposemissionandriod.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Preview(showBackground = true, showSystemUi = true,
    device = "spec:width=300dp, height=400dp"
)
@Composable
fun ToastExample() {

    // Context means the app's current state (environment/surrounding information) such as:
    // Which Activity the app is running on,
    // Which Screen it is on,
    // Which Resource needs to be accessed,
    // Which Service needs to be called.
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "This is a Toast Message.",
                    Toast.LENGTH_SHORT
                ).show()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "show toast ")
        }
    }
}


@Composable
fun SnackBarExample() {

    // SnackBarHostState is used to show snackbar.
    val snackBarHostState = remember { SnackbarHostState() }

    // Coroutines Scope -> To show SnackBar
    val scope = rememberCoroutineScope()
    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackBarHostState)
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    scope.launch {
                        // Show SnackBar
                        snackBarHostState.showSnackbar(
                            message = "This is a SnackBar Message.",
                            actionLabel = "UNDO",
                            duration = SnackbarDuration.Long
                        )
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "SHOW SNACK BARRRRR ")
            }
        }
    }

}