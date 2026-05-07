# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Android application for module **S12 – JSON Parsing mit GSON** (Umwandlung von Strings in Java-Objekte). Written in **Java**, built with Gradle (Kotlin DSL).

- Package: `com.example.test_01`
- Language: Java 17
- Android SDK: `~/.sdks/android-sdk` (`ANDROID_HOME=$HOME/.sdks/android-sdk`)
- Java: OpenJDK 17 (Temurin) — `/Library/Java/JavaVirtualMachines/temurin-17.jdk/`
- Compile SDK: API 35, Minimum SDK: API 26

## Common Commands

```bash
# Build
./gradlew assembleDebug
./gradlew assembleRelease

# Test
./gradlew test                  # Unit tests (local JVM)
./gradlew connectedAndroidTest  # Instrumented tests (requires device/emulator)

# Lint
./gradlew lint

# Install on connected device
./gradlew installDebug
```

## Architecture

Single-module project (`:app`). Entry point is `MainActivity`, which uses edge-to-edge display and `ConstraintLayout`.

**Dependencies** are managed via the Gradle Version Catalog at `gradle/libs.versions.toml`. Key dependency:
- GSON: `implementation("com.google.code.gson:gson:2.10.1")`

**Tests** split into:
- `src/test/` — local JVM unit tests (JUnit 4)
- `src/androidTest/` — instrumented tests run on device (Espresso, AndroidJUnit4)

## Conventions

- Always use Kotlin DSL syntax for Gradle files (`.kts`), never Groovy
- Source code is Java — do not convert to Kotlin
- JDK version is 17 — do not use Java 21+ features
- Do not suggest SDK downloads — the Android SDK is already fully installed
