# OnScreen Light ☀️

**OnScreen Light** is a 100% open-source, privacy-focused Android utility designed to keep your screen ON with a minimal display. It is perfect for use as a nightstand clock, a desk utility, or any situation where you need to prevent your screen from timing out.

## ✨ Features

-   **OLED-Friendly**: Pure black background (`#000000`) for maximum battery efficiency on AMOLED/OLED screens.
-   **Minimal Analog Clock**: A clean, modern analog clock with thin white lines and smooth movement.
-   **Immersive Fullscreen**: Automatically hides the status bar and navigation bar for a distraction-free experience.
-   **Keep Screen On**: Prevents the device from sleeping as long as the app is in the foreground.
-   **Privacy First**:
    -   🚫 No Internet access.
    -   🚫 No Data collection or tracking.
    -   🚫 No Ads.
    -   🚫 No Background services.
    -   🚫 No Permissions required.
-   **Lightweight**: Minimalist codebase, built using modern Kotlin and Material Design.

## 🚀 Usage

1.  **Launch**: Open the app manually from your launcher.
2.  **View**: Your screen will remain ON with the minimal analog clock.
3.  **Exit**: Simply tap the **EXIT** button at the bottom center to close the app and restore your default screen timeout settings.

## 🛠️ Tech Stack

-   **Language**: Kotlin
-   **Architecture**: Single Activity (Native View-based)
-   **UI**: Custom Canvas-drawn Analog Clock
-   **Theme**: Material Components (DayNight)

## 🏗️ Build Instructions

To build the APK from source:

```bash
./gradlew assembleDebug
```

The APK will be located at: `app/build/outputs/apk/debug/app-debug.apk`

## ⚖️ License

This project is licensed under the **MIT License**. You are free to use, modify, and distribute it as you wish. See the [LICENSE](LICENSE) file for details.

---
*Built with simplicity and privacy in mind.*
