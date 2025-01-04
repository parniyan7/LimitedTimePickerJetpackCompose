package com.parniyan.timepicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.parniyan.timepicker.components.BaseDurationPicker
import com.parniyan.timepicker.ui.theme.TimePickerTheme
import com.parniyan.timepicker.util.TimeUtil


/**
 ** Created by Parniyan on 1/3/2025.
 **
 */


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TimePickerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Picker(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
private const val MinimumTime = (1 * 60)
private const val MaximumTime = (23 * 60 * 60) + (59 * 60)
private const val currentTime =((15 * 60) + (60 * 60)).toString()
@Composable
fun Picker(modifier: Modifier) {
    BaseDurationPicker(
        current = TimeUtil.convertTimeToDuration(currentTime),
        minimumSeconds = MinimumTime,
        maximumSeconds = MaximumTime,
        onConfirmClick = {
            //do your action
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PickerPreview() {
    TimePickerTheme {
        Picker(modifier = Modifier.fillMaxSize())
    }
}