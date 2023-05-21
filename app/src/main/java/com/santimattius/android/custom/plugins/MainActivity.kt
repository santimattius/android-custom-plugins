package com.santimattius.android.custom.plugins

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.santimattius.android.ui.component.AppScaffold

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppScaffold {
                ScreenContent(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(it)
                )
            }
        }
    }
}

@Composable
fun ScreenContent(modifier: Modifier = Modifier) {
    val uriHandler = LocalUriHandler.current
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        Column {
            ModuleAction("First Module") {
                uriHandler.openUri("app://feature/first")
            }
            ModuleAction("Second Module") {
                uriHandler.openUri("app://feature/second")
            }
        }
    }
}

@Composable
private fun ModuleAction(name: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
        onClick = onClick
    ) {
        Text(text = name)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AppScaffold {
        ScreenContent()
    }
}