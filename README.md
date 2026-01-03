# OnScreen Light ☀️

**OnScreen Light** is a 100% open-source, privacy-focused Android utility designed to keep your screen ON with a minimal, battery-efficient display. Perfect for nightstand clocks, desk utilities, or always-on monitoring.

## ✨ Features

-   **OLED-Friendly**: Pure black background (`#000000`) for zero battery drain on pixels in AMOLED/OLED screens.
-   **Minimal Analog Clock**: A high-fidelity, architectural clock design with thin white lines and smooth movement.
-   **Sun Glow Icon**: A custom-designed launcher icon matching the app's minimal aesthetic.
-   **Immersive Fullscreen**: Automatically hides status and navigation bars for a clean look.
-   **Keep Screen On**: Uses `FLAG_KEEP_SCREEN_ON` to prevent device sleep while active.
-   **Privacy & Efficiency**:
    -   🚫 **Zero Permissions**: No camera, no location, no storage.
    -   🚫 **No Internet**: 100% offline, no tracking, no ads.
    -   🚫 **No Background Work**: Stops completely when you hit EXIT.

## 🚀 Usage

1.  **Open**: Launch "OnScreen Light".
2.  **View**: Your screen stays on indefinitely with the minimal clock.
3.  **Exit**: Tap the **EXIT** button to close the app and restore normal timeout settings.

## 🛠️ Build from Source

Build the final APK using Gradle:

```bash
./gradlew assembleDebug
```

**APK Path**: `app/build/outputs/apk/debug/app-debug.apk`

## ⚖️ License

Licensed under the **MIT License**. Free for everyone to use, modify, and distribute.

---
*Simplicity. Privacy. Utility.*
