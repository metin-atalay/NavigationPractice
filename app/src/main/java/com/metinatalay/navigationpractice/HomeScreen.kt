package com.metinatalay.navigationpractice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navHostController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Home Screen")

        Button(onClick = {  navHostController.navigate(Destination.Feed.route) }) {
            Text(text = "to Feed screen")
        }

        Button(onClick = { navHostController.navigate(Destination.Profile.route) }) {
            Text(text = "to Profile screen")
        }

        Button(onClick = { navHostController.navigate(Destination.List.route) }) {
            Text(text = "to List screen")
        }
    }
}