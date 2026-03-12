# Ćwiczenia 1 - Git i GitHub
Zadanie ma na celu zapoznanie się z pracą z Gitem.
## 1. Kiedy Git wykona fast-forward, a kiedy powstaje merge commit?
### fast-forward:
- __Scenariusz:__ Tworzymy nową gałąź z gałęzi main. Podczas gdy pracujemy na nowej gałęzi i tworzymy tam commity, gałąź main pozostaje bez zmian (nie dochodzą na niej nowe commity).
- __Działanie:__ Podczas scalania (merge), Git nie musi tworzyć nowego punktu w historii. Po prostu „przesuwa” wskaźnik gałęzi main na ostatni commit nowej gałęzi.
- __Rezultat:__ Struktura commitów pozostaje liniowa, a historia wygląda tak, jakby praca od początku odbywała się na jednej gałęzi.
### merge commit:
- __Scenariusz:__ Tworzymy nową gałąź, ale zanim ją scalimy, na gałęzi main również powstają nowe commity. Historie obu gałęzi „rozchodzą się”.
- __Działanie:__ Git musi połączyć dwa różne stany projektu. Tworzy w tym celu nowy, specjalny commit scalający (merge commit), który posiada dwóch „rodziców”.
- __Rezultat:__ W historii powstaje charakterystyczne rozgałęzienie i złączenie, które graficznie dokumentuje fakt istnienia bocznej gałęzi.
## Podsumowanie:
Główną różnicą jest to, czy gałąź bazowa (main) „czekała” na zakończenie prac w gałęzi bocznej. Jeśli tak – mamy `fast-forward`. Jeśli w międzyczasie gałąź bazowa również posunęła się naprzód – powstaje `merge commit`.
## 2. Czym w praktyce różni się merge od rebase?
- `Merge` - proces łączenia historii dwóch różnych gałęzi (branchy) w jedną.