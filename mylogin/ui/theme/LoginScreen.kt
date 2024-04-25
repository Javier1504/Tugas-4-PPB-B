package com.example.mylogin.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylogin.R

@Composable
fun LoginScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "Login image",
            modifier = Modifier.size(375.dp)
        )

        Text(
            text = "Selamat Datang",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Gas Login!",
            fontSize = 16.sp
        )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Email") }
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Password") }
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Button(onClick = { }) {
                Text(text = "Login")
            
        }
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Lupa Password?")
    }


            



}