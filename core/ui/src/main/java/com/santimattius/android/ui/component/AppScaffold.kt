@file:OptIn(ExperimentalMaterial3Api::class)

package com.santimattius.android.ui.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.santimattius.android.ui.R
import com.santimattius.android.ui.theme.AndroidCustomPluginsTheme

@Composable
fun AppScaffold(content: @Composable (PaddingValues) -> Unit) {
    AndroidCustomPluginsTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(text = stringResource(id = R.string.app_name)) })
                },
                content = { padding ->
                    content(padding)
                }
            )
        }
    }
}