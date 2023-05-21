package com.santimattius.android.custom.first_feature

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.santimattius.android.ui.component.AppScaffold
import com.santimattius.android.ui.component.Center
import com.santimattius.android.ui.theme.Greeting

class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScreenContent()
        }
    }
}

@Composable
private fun ScreenContent() {
    AppScaffold {
        Center(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Greeting("First Feature")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ScreenContent()
}