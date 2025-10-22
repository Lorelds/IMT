package com.example.imt.ui.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun login(){
    Text(
        text = "halo semuanya aku jae"
    )

    Text(
        text = "coba edit ini sapa aja"
    )
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun loginPreview() {
    login()
}

