# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

Das Projekt parsed JSON-Objekte mit Gson, wandelt Strings in Java-Objekte um und wird mit dem Android View System umgesetzt. Es sind 3 Klassen geplant, die über ein UI auswählbar sind.

---

# Projektplan: JSON Parsing mit GSON

**Thema:** S12 – Umwandlung von Strings in Java-Objekte
**Vortrag:** 8–12 Minuten
**Abgabe:** Vortrag + lauffähiges Projekt + Dokumentation
**Technologie:** Android (Empty Views Activity), Java, Gradle, GSON

---

## Projektidee

Eine Android-App, in der der User aus 3–4 Klassen wählen kann. Pro Klasse wird ein JSON-Template mit leeren Feldern in einem großen Textfeld angezeigt. Der User füllt die Werte aus, klickt auf "Parsen", und GSON wandelt den String in ein Java-Objekt um. Das fertige Objekt wird angezeigt — bei fehlerhaftem JSON erscheint eine verständliche Fehlermeldung.

---

## Klassenstruktur (aufeinander aufbauend)

| # | Klasse | Felder | GSON-Konzept |
|---|--------|--------|--------------|
| 1 | `Person` | name (String), alter (int), email (String) | Einfaches flaches Mapping |
| 2 | `Student` | name (String), matrikelnummer (int), adresse (Adresse) | Verschachtelte Objekte |
| 3 | `Kurs` | kursname (String), dozent (String), teilnehmer (List\<String\>) | Arrays / Listen |
| 4 | `Universität` *(Bonus)* | name (String), standort (Adresse), kurse (List\<Kurs\>) | Alles kombiniert |

---

## App-Ablauf

1. Startseite: 3–4 Buttons zur Klassenauswahl (Person, Student, Kurs, …)
2. Nach Auswahl: JSON-Template wird im Textfeld angezeigt, z.B.
   ```json
   {"name": "", "alter": "", "email": ""}
   ```
3. User füllt die Werte aus
4. Klick auf "Parsen"
5. GSON führt `new Gson().fromJson(jsonString, Person.class)` aus
6. **Erfolg →** Objekt-Daten werden übersichtlich angezeigt
7. **Fehler →** Fehlermeldung (z.B. "Alter muss eine Zahl sein", "Ungültiges JSON")

---

## Phasenplan

### Phase 1 – Grundlagen verstehen
- Was ist JSON? (Syntax, Datentypen, Aufbau)
- Was ist GSON? Warum nutzt man es?
- Einfache Beispiele durchlesen und nachvollziehen
- Unterschied: Serialisierung (`toJson`) vs. Deserialisierung (`fromJson`)

### Phase 2 – Projektumgebung aufsetzen
- Android Studio: Neues Projekt mit Empty Views Activity
- GSON-Dependency in `build.gradle` einbinden
- Erstes Minimalbeispiel: JSON-String → Java-Objekt in der Console (Logcat)

### Phase 3 – App entwickeln
- UI bauen (Startseite mit Buttons, Parsing-Screen mit Textfeld + Button + Ausgabebereich)
- Klasse 1 (Person) — einfaches Parsing implementieren
- Klasse 2 (Student) — verschachteltes Parsing
- Klasse 3 (Kurs) — Listen/Arrays parsen
- Fehlerbehandlung (try-catch, ungültiges JSON, falsche Datentypen)
- Klasse 4 (Bonus) + Feinschliff

### Phase 4 – Dokumentation
- Projektbeschreibung (Was macht die App?)
- Klassendiagramm
- Code-Erklärungen zu den wichtigsten Stellen
- Anleitung: Wie baut/startet man das Projekt?
- Verwendete Quellen

### Phase 5 – Präsentation bauen
- **Einleitung:** Was ist JSON? Warum braucht man Parsing?
- **Hauptteil:** GSON vorstellen, Live-Demo / Code-Walkthrough durch die App
- **Schluss:** Vor-/Nachteile von GSON, Zusammenfassung
- Zeitplanung: ca. 2 Min Einleitung, 7 Min Hauptteil, 2 Min Schluss

### Phase 6 – Probelauf
- Vortrag laut üben und Zeit stoppen
- App nochmal komplett durchtesten
- Doku gegenlesen
- Backup der App auf USB / Cloud

---

## Wichtige GSON-Methoden für den Vortrag

| Methode | Beschreibung |
|---------|-------------|
| `new Gson()` | GSON-Instanz erzeugen |
| `fromJson(String, Class)` | JSON-String → Java-Objekt |
| `toJson(Object)` | Java-Objekt → JSON-String (Bonuspunkt) |

---

## Mögliche Fehlerszenarien für die Demo

- User gibt Buchstaben in ein Zahlenfeld ein
- JSON-Klammern fehlen oder sind falsch
- Pflichtfelder sind leer
- JSON-Keys stimmen nicht mit Klassenfeldern überein
