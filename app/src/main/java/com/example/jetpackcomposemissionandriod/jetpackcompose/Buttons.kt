package com.example.jetpackcomposemissionandriod.jetpackcompose

import android.R.attr.height
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import com.example.jetpackcomposemissionandriod.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground=true,
    showSystemUi=true,
    device="spec:width=280dp, height=350dp")
@Composable
fun ButtonExample() {

    val context = LocalContext.current
    var userName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        Text(
            text = "*** Login Here ***",
            fontSize = 20.sp,
            fontStyle = Italic,
            fontWeight = FontWeight.SemiBold,
        )
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = userName,
            onValueChange = { userName = it },
            modifier = Modifier.fillMaxWidth(0.9f),
            label = { Text(text = "Enter you Username")}
        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth(0.9f),
            label = {Text(text = "Enter your e-mail")}
        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                Toast.makeText(context, "You Clicked the Button!!!",
                    Toast.LENGTH_SHORT).show()},
            modifier = Modifier.fillMaxWidth(0.5f).height(40.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.DarkGray,
                containerColor = Color.LightGray
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
            ),
//            border = BorderStroke(2.dp, Color.Blue),
            enabled = userName.isNotEmpty() && email.isNotEmpty()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon (
                    painter= painterResource(R.drawable.ic_person_4_sharp_w500_filled_g200_24dp),
                    contentDescription = "Person Icon",
                    )

                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "LOGIN", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
        }
    }

}