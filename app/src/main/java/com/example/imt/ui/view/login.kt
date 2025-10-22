package com.example.imt.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun login(){
    //Login
    Column (){
        Text(
            text = "Pangeran Jember"
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun loginPreview() {
    login()
}

