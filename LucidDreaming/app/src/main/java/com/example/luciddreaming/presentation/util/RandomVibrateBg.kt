package com.example.luciddreaming.presentation.util

import android.os.Vibrator
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.luciddreaming.presentation.component.Bar

@Composable
fun RandomVibrateBg() {
//    Vibrator.VIBRATION_EFFECT_SUPPORT_YES

}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    RandomVibrateBg()
}