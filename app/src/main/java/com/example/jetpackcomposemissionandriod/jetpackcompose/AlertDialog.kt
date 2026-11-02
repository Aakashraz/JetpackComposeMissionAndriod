package com.example.jetpackcomposemissionandriod.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposemissionandriod.R


@Preview(
    showBackground = true, showSystemUi = true,
    device = "spec:width=320dp, height=480dp"
)
@Composable
fun AlertDialogExample() {

    // State to show/hide the dialog box
    var openDialog by remember { mutableStateOf(false) }

    // To show Toast
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            )
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Alert Dialog Example",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray
                )

                IconButton(
                    // Trigger the openDialog to show Dialog
                    onClick = { openDialog = true },
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = Color.Magenta,
                        contentColor = Color.White
                    )
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_delete_rounded_filled_24dp),
                        contentDescription = "Delete Icon"
                    )
                }
            }

        }

        if (openDialog) {
            AlertDialog(
                onDismissRequest = { openDialog = false },
                title = { Text(text = "Delete Item") },
                text = {
                    Text(text = "Are you sure you want to delete this item?")
                },

                confirmButton = {
                    Button(
                        onClick = {
                            Toast.makeText(
                                context,
                                "Item has be deleted successfully!",
                                Toast.LENGTH_SHORT
                            ).show()
                            // Dismiss the Dialog box after deleting.
                            openDialog = false

                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.DarkGray,
                            contentColor = Color.White
                        )
                    ) {
                        Text(text = "Delete")
                    }
                },

                dismissButton = {
                    Button(
                        onClick = { openDialog = false },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.LightGray,
                            contentColor = Color.Gray
                        )
                    ) {
                        Text(text = "Cancel")
                    }
                },
                containerColor = Color.White,
                titleContentColor = Color.DarkGray,
                textContentColor = Color.DarkGray

            )
        }
    }
}