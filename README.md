# OnScreen Light ☀️

OnScreen Light is a **100% open-source, privacy-focused Android utility** designed to keep your screen ON with a **minimal, battery-efficient display**.

It is ideal for nightstand clocks, desk utilities, development testing, or any situation where you need to prevent screen timeout — without ads, tracking, or background services.

---

## 📦 Download APK

➡️ **Direct APK download (v1.0):**  
https://github.com/0xrohitsen/OnScreen-Light/blob/main/OnScreen-Light-v1.0.apk

> ⚠️ Note: This is a debug APK. Enable *“Install unknown apps”* on your device to install.

---

## ✨ Features

- 🖤 **OLED-Friendly**
  - Pure black background (`#000000`) to minimize battery usage on AMOLED/OLED displays.

- 🕒 **Minimal Analog Clock**
  - High-fidelity, architectural analog clock with thin white hands and clean markers.

- ⏱️ **Clock Launcher Icon**
  - Custom-designed, high-quality analog clock icon matching the app’s minimal aesthetic.

- 🖥️ **Immersive Fullscreen**
  - Automatically hides status bar and navigation bar for distraction-free use.

- 🔋 **Keep Screen On**
  - Uses `FLAG_KEEP_SCREEN_ON` to prevent the device from sleeping while the app is active.

- 🔒 **Privacy & Efficiency First**
  - 🚫 Zero permissions  
  - 🚫 No internet access  
  - 🚫 No ads or analytics  
  - 🚫 No background services  
  - 🚫 Stops completely when EXIT is pressed  

---

## 🚀 Usage

1. **Open**  
   Launch **OnScreen Light** manually from the app launcher.

2. **Use**  
   The screen will remain ON with a black display and minimal analog clock.

3. **Exit**  
   Tap the **EXIT** button to close the app and restore normal screen timeout behavior.

---

## 🛠️ Build From Source

To build the APK locally:

```bash
./gradlew assembleDebug
