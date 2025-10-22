package com.example.imt.ui.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun mainView(){
    testView()
}

@Composable
fun testView(){
    Text(
        text = "halo semuanya yang ngedit jae"
    )
}