package com.example.jetpackcomposemissionandriod

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposemissionandriod.jetpackcompose.NestedLazyLists
import com.example.jetpackcomposemissionandriod.jetpackcompose.navigation.LoginScreenUI
import com.example.jetpackcomposemissionandriod.jetpackcompose.navigation.NavGraph
import com.example.jetpackcomposemissionandriod.jetpackcompose.scaffold.MyScreen
import com.example.jetpackcomposemissionandriod.ui.theme.JetpackComposeMissionAndriodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeMissionAndriodTheme {
//                OutlinedTextFieldExample()
//                ButtonExample()
//                CardExample2()
//                StateManagementExample()
//                StateHoistingExample()
//                AlertDialogExample()
//                NavGraph()
//                NestedLazyLists()
                MyScreen()
            }
        }
    }
}
