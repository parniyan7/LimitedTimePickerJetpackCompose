![wheel3](https://github.com/user-attachments/assets/fed825d6-1387-4eac-8ca4-77506ceb7694)
![wheel2](https://github.com/user-attachments/assets/bb0fad8a-3d54-43b7-bd3d-6f1ac44ac44c)

```
# TimePicker

A simple and intuitive time picker component for Android applications built using Jetpack Compose. This library allows users to select durations easily with a customizable interface.

## Features

- **Duration Selection**: Users can select hours and minutes using a vertical or horizontal wheel picker.
- **Customizable UI**: Manage your needed items for hour and minute the way you want.
- **Wheel effect**: The UI has its own implementation of scrolling.


## Usage

To use the `BaseDurationPicker` in your activity or composable function, follow the example below:

```kotlin
import com.parniyan.timepicker.components.BaseDurationPicker

@Composable
fun MyTimePicker() {
    BaseDurationPicker(
        current = (2 * 60 * 60) + (30 * 60), // Current time in seconds
        minimumSeconds = (1 * 60 * 60) + (15 * 60), // Minimum time allowed
        maximumSeconds = (22 * 60 * 60) + (45 * 60), // Maximum time allowed
        onConfirmClick = { selectedTime ->
            // Handle the selected time
        }
    )
}
```

## Preview

You can preview the time picker component using the `PickerPreview` composable function.

```kotlin
@Preview(showBackground = true)
@Composable
fun PickerPreview() {
    MyTimePicker()
}
```

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any bugs or feature requests.


## Author

Created by Parniyan on 1/3/2025.
