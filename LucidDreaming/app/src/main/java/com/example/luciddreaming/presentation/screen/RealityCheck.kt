package com.example.luciddreaming.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun RealityCheck() {
    // vibrate randomly in the day
    // day session

    // show big text
    // then disappear and show reality check instruction
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    RealityCheck()
}