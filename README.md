## OnClickListener

### Description

The app attaches an ```OnClickListener``` to a ```Button``` which updates the text of
a ```TextView``` when clicked.

Sample Code:

```java
// Get the Button.
Button updateButton = findViewById(R.id.button_update);

// Attaching an OnClickListener to updateButton.
        updateButton.setOnClickListener((v) -> {
        // Get the TextView.
        TextView textView = findViewById(R.id.text_view);
        textView.setText(R.string.text_two);
        });
```

### Screenshots

| Device      | Virtual | OS        | API | Screens                                                                                                               |
|-------------|---------|-----------|-----|-----------------------------------------------------------------------------------------------------------------------|
| Pixel 6 Pro | Yes     | Android Q | 29  | [Main Screen](https://user-images.githubusercontent.com/122201501/227121676-ccb4357d-8c88-4ff1-aac8-06efdbc6d3e7.png) |
