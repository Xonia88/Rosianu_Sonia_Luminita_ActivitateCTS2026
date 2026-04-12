# B1 - Restaurant - Simple Factory

## Cerință
Restaurantul servește mai multe tipuri de supe (legume, ciuperci, vită).
Tipurile sunt definite într-un enum și trebuie creat un modul care permite instanțierea obiectelor din familia supelor.

## Pattern folosit
Simple Factory

## Descriere
Am implementat o interfață `Supa` și clase concrete pentru fiecare tip de supă.
Clasa `FactorySupa` creează obiectele în funcție de tipul primit ca parametru (enum).

## Output
Supa de legume  
Supa de ciuperci  
Supa de vita