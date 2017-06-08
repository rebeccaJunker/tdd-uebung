# KSwe SoSe 2017 - Übung zu Test-Driven Development

In dieser Aufgabe soll an einigen Beispielen das Konzept des Test-Driven
Development (TDD) umgesetzt werden.

## Teil 1: TimeSeriesTest

Der Unit-Test `TimeSeriesTest` enthält eine Test-Method `public void testStatistics()`.
Gehe nach dem TDD-Verfahren vor und realisiere die entsprechende Logik, die im
Test definiert ist. Es müssen die Klassen `TimeSeries` und
`Observation` sowie deren Logik erstellt werden.

## Teil 1: Erweiterung des TimeSeriesTest mit Maßeinheiten

Erweitere den  Unit-Test `TimeSeriesTest` so, dass die Klassen `TimeSeries` und
`Observation` wie folgt erweitert werden:

* für eine `Observation` soll eine Maßeinheit definiert werden können (z.B. im
  Constructor)
 * folgende Einheiten sollen unterstützt werden: `m`, `dm`, `cm`, `mm`
* die Klasse `TimeSeries` soll um die Möglichkeit erweitert werden, den Mittelwert
  in einer bestimmten Maßeinheit ausgeben zu können

Auch hier soll nach TDD vorgegangen werden. Schreibe eine zusätzliche Methode,
die mit `@Test` annotiert ist und entsprechend als Test ausgeführt wird.

### Veröffentlichung

Committe und Pushe Deine Ergebnisse in deinen GitHub-Fork
