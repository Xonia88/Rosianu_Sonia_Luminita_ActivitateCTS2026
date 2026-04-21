# Farmacie - Probleme CTS

## C1
Farmacia dorește ca toate medicamentele să facă parte dintr-o categorie. Categoriile sunt salvate într-un enum {Raceala, Durere, Body}. Fiecare medicament o sa aibă preț și denumire. Să se implementeze modul care va inițializa obiecte din familia medicamentelor.

## C2
Farmacia dorește ca toate medicamentele să facă parte dintr-una din categoriile: Raceala, Durere, Body. Fiecare medicament o sa aibă preț și denumire. Să se implementeze modul care va inițializa obiecte din familia medicamentelor. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de categorii să nu fie necesare modificări în codul existent.

## C3
Atunci când un client achiziționează o rețetă în aplicație se realizează un obiect de tipul factură. Un obiect de tipul factură conține și informații extra precum: numarPungi, daca acel client a cerut pungi pentru medicamentele achiziționate, plataCuCard, dacă este selectată o plată cu cardul ci nu cash, cardFidelitate, dacă este prezentat cardul de fidelitate al clientului, cotaTVA, dacă respectivul client este plătitor de TVA, în caz contrar o să fie trecut 0. Să se implementeze modulul care permite crearea de obiecte de tip factură cu aceste opțiuni extra.

## C4
Farmacia are în dotare și un laborator în care mai mulți chimiști produc diferite rețete pentru medicamente. În momentul în care o rețetă este produsă trebuie ținut cont de cantitățile din soluții sunt folosite. Dacă o rețetă este creată este recomandat să fie folosită pentru crearea viitoarelor medicamente fără a se trece prin procesul de creare al rețetei. Să se implementeze modulul care facilitează crearea de noi obiecte de rețete fără a fi nevoie de apelul constructorului.

## C5
Farmacia achiziționează un nou software pentru gestiunea stocurilor e medicamente din depozit. Însă această aplicație nu folosește aceleași clase ca și aplicația de vânzare folosită de farmacie. De exemplu aplicația de vânzare conține metoda setareMedicament(), care primește id-ul medicamentului și apoi verificareDisponibilitate() care primește numărul de medicamente dorite pentru medicamentul setat anterior și returnează true sau false. Noua aplicație de gestiune a stocurilor de medicamente in depozit are o singură metodă verificăStocPentruMedicament() care primește ID-ul medicamentului și numărul dorit și returnează true sau false. Să se implementeze modulul care permite lucrul celor două framework-uri fără a modifica codul existent.

## C6
Atunci când un client dorește să cumpere medicamente farmacistul trebuie să verifice în sistem rețeta clientului, trebuie să verifice disponibilitatea medicamentelor solicitate în depozitul farmaciei, și verificarea cardului de sănătate. Farmacistul trebuie sa verifice toate le trei lucruri in trei locuri diferite. Sa se implementeze un modul in cadrul aplicației care să permită farmacistului verificarea tuturor celor trei elemente într-un singur loc.

## C7
Cu ocazia sărbătorilor de sfârșit de an dirigintele farmaciei dorește ca atunci când este printat bonul de casă să se printeze și o felicitare de La Mulți Ani pentru client. Se dorește adăugarea acestei noi funcționalități pentru clasa BonDeCasa la printare.

## C8
Dirigintele farmaciei dorește organizarea medicamentelor într-o structura arborescenta pentru o căutare facila a acestora de către farmaciști. Astfel medicamentele vor fi organizate in cadrul aplicației pe secțiuni (Răceala, Durere, Antibiotice, etc) Fiecare secțiune conține subsecțiuni (Adulți, Copii, etc) sau medicamentele din acea categorie. Sa se realizeze modulul care permite reprezentarea arborescenta a medicamentelor in cadrul aplicației.

## C9
Deoarece stocul de medicamente este foarte mic se impune ca atunci când clienții doresc să achiziționeze medicamente să se realizeze doar pe baza de rețetă. Pentru clienții care nu au rețeta achiziționarea nu se va realiza. Sa se realizeze un nivel intermediar care sa permită cumpărarea de medicamente doar de către persoanele care au rețetă.

## C10
Pentru fiecare rețetă achiziționată de la farmacie trebuie să se rețină informații cu privire la client precum: nume, număr de asigurare, etc, precum și informațiile despre rețeta achiziționată precum: număr rețetă, suma de plata, număr medicamente, etc. Astfel, dacă un client achiziționează mai multe rețete de-a lungul timpului, informațiile despre acesta sunt aceleași și se repetă, ocupând foarte multă memorie. Să se implementeze modulul de memorare al tuturor achizițiilor de rețete, astfel încât să nu ocupe memorie foarte multă.

## C11
Este dorită implementarea modului de plată pentru clienți care achiziționează produse. Modul de plată îl decide clientul în momentul în care trebuie să facă plata. Plata se poate realiza cu cardul sau cash. Sa se implementeze modulul de plata.

## C12
Farmacia dorește să anunțe toți clienții abonați la notificările farmaciei cu privire la ofertele de preț pentru anumite medicamente. Astfel se dorește implementarea unui modul care atunci când apare o ofertă să se trimită notificări tuturor persoanelor abonate la notificările farmaciei.

## C13
Pentru fiecare rețetă se dorește gestiunea transformărilor atunci cand medicamentele sunt cumpărate. O rețetă poate sa fie într-una din următoarele stări: Emisa, Solicitata, Achizitionata.

## C14
Achiziția de medicamente in Farmacie se face după o procedura bine stabilita care conține următorii pași: Se primește rețeta, se verifică în sistem stocul medicamentelor cerute, daca stocul este suficient se merge in depozit si se aduc medicamentele, daca stocul nu este suficient nu se face achiziția, se aduc medicamentele, se încasează banii, se scade din stoc si se emite bonul.

## C15
Deoarece se face o coada foarte mare la casa farmaciei, dirigintele acesteia dorește ca farmacistul care preia rețeta și sa trimită comenzi de aducere medicamente către ajutorul de farmacist. Ajutorul va prelua comenzile de aducere medicamente din depozit si la va aduce pe rând pe toate.