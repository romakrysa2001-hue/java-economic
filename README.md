# TechCorp Simulator — Lekcja 1

Projekt edukacyjny wprowadzający w podstawy programowania obiektowego w języku Java.
Program modeluje uproszczoną firmę technologiczną, która zatrudnia pracowników
i realizuje projekty. Każdy projekt wymaga określonej ilości pracy, a pracownicy
generują punkty pracy w każdej turze symulacji.

## Struktura projektu

```
techcorp-simulator/
├── .gitignore
├── README.md
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    └── techcorp/
                        ├── Main.java
                        ├── Company.java
                        ├── Employee.java
                        └── Project.java
```

## Klasy

- **Employee** — pracownik (imię, poziom umiejętności, wynagrodzenie) z metodą `work()`.
- **Project** — projekt z zespołem pracowników, postępem i metodą `workOneTurn()`.
- **Company** — firma przechowująca pracowników i projekty (`hire`, `startProject`, `showStatus`).
- **Main** — punkt wejścia programu uruchamiający symulację.

## Wymagania

- Java 17 (JDK)
- Apache Maven 3.x

## Budowanie i uruchamianie

```bash
mvn compile
mvn exec:java
```

Pierwsze polecenie kompiluje kod źródłowy, drugie uruchamia program.

## Przykładowy wynik

```
Stan poczatkowy:
=== COMPANY STATUS ===
Name: TechCorp
Cash: 50000.0
Employees: 2
Projects: 1
Project: Mobile App, progress: 0/30, finished: false

--- Tura 1 ---
=== COMPANY STATUS ===
Name: TechCorp
Cash: 50000.0
Employees: 2
Projects: 1
Project: Mobile App, progress: 14/30, finished: false

--- Tura 2 ---
=== COMPANY STATUS ===
Name: TechCorp
Cash: 50000.0
Employees: 2
Projects: 1
Project: Mobile App, progress: 28/30, finished: false
```
