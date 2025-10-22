package com.example.testweek7.ui.view

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun testPreview() {
    testView()
}

@Composable
fun testView() {
    Text(
        text ="sange banget maksimal",
        style = MaterialTheme.typography.bodySmall.copy(color = Color.Gray)

    )
}
