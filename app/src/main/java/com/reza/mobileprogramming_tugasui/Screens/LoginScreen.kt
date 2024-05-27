package com.reza.mobileprogramming_tugasui.Screens

import android.widget.EditText
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.reza.mobileprogramming_tugasui.R
import org.w3c.dom.Text

@Composable
fun Login(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.phantom),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(16.dp))
//        EmailTextField(email)
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") })

        Spacer(modifier = Modifier.height(16.dp))
//          PasswordTextField(password)
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") })
        Spacer(modifier = Modifier.height(16.dp))
//          LoginButton()
        Button(
            onClick = { navController.navigate("home") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red
            ),
            shape = RoundedCornerShape(25)
        ) {
            Text(text = "Login", fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Text(text = "Don't have an account?", fontSize = 14.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Sign Up",
                modifier = Modifier.clickable {navController.navigate("register")},
                color = Color.Red
            )
        }
    }
}