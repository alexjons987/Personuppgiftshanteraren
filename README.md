# A) Personuppgiftshanteraren
Här är en grundläggande övning som hjälper dig förstå hur man tänker och arbetar i Java:

I denna övning ska du skapa ett enkelt program som hanterar information om en person.
Övningen introducerar flera grundkoncept i Java på ett praktiskt sätt.
Steg för steg:
## 1. Deklarera variabler för följande personuppgifter:
- Förnamn och efternamn (separata variabler)
- Ålder
- Längd i meter
- Vikt i kg
- Om personen är student (ja/nej)
## 2. Tilldela värden till alla variabler:
- Välj lämplig datatyp för varje variabel
- Skriv en kommentar vid varje variabel som förklarar ditt val av datatyp
- Tänk på att längd behöver decimaler medan ålder är heltal
## 3. Skriv ut informationen:
- Använd System.out.println för varje utskrift
- Testa både att skriva ut variabler direkt och att kombinera text med variabler
- Experimentera med olika sätt att formatera utskrifterna
## 4. Gör några enkla beräkningar:
- Räkna ut personens ålder om 5 år
- Konvertera längden till centimeter
- Experimentera med att kombinera olika datatyper i beräkningarna

Saker att testa och reflektera över:
- Vad händer om du försöker spara ett decimaltal i en heltalsvariabel?
- Vad händer om du försöker använda ett variabelnamn som börjar med en siffra?
- Prova att deklarera flera variabler på samma rad - hur fungerar det?
- Testa att ändra värden på variabler efter att du först tilldelat dem värden

Detta lär dig:
- Syntax för variabeldeklaration
- Namngivning av variabler
- Olika sätt att skriva ut information
- Grundläggande datatyper
- Hur man skriver kommentarer
- Hur man gör enkel formatering av utskrifter
- Grundläggande operatorer och beräkningar

Tips:
- Ta dig tid att experimentera med koden
- Skriv kommentarer som förklarar vad du gör
- Testa att göra samma sak på olika sätt
- Försök medvetet skapa några fel för att se vad som händer
- Var inte rädd för att testa dig fram

# B) Den Utökade Personuppgiftshanteraren
Här är en utvecklad version som introducerar metoder på ett naturligt sätt:

I denna övning ska du skapa ett program som hanterar personuppgifter och använder
metoder för att göra olika beräkningar och kontroller. Programmet ska fortfarande köras från
main-metoden men använda andra metoder för specifika uppgifter.
## 1. Börja med samma variabler som tidigare:
- Förnamn och efternamn (separata String-variabler)
- Ålder (int)
- Längd i meter (double)
- Vikt i kg (double)
- Student (boolean)
## 2. Skapa följande metoder:
- En metod som tar förnamn och efternamn som parametrar och returnerar fullständigt namn
- En metod som tar ålder som parameter och returnerar om personen är myndig (boolean)
- En metod som beräknar BMI (använd vikt och längd som parametrar)
- En metod som tar längd som parameter och returnerar längd i både meter och centimeter som en String
- En metod som skriver ut all information om personen snyggt formaterat
## 3. I main-metoden:
- Skapa alla variabler och ge dem värden
- Anropa dina metoder med dessa variabler
- Spara resultaten i nya variabler när metoderna returnerar värden
- Skriv ut resultaten

Saker att experimentera med:
- Prova både metoder som returnerar värden och void-metoder
- Testa vad som händer om du skickar fel datatyp som parameter
- Experimentera med att använda resultatet från en metod som parameter till en annan
- Testa att ha en metod som anropar en annan metod

Detta lär dig:
- Hur man skapar metoder
- Skillnaden mellan void och returnerande metoder
- Hur parametrar fungerar
- Metodanrop
- Variabelscope (vad som är tillgängligt var)
- Återanvändning av kod

Tips för implementation:
- Börja med enkla metoder och bygg på komplexiteten
- Tänk på beskrivande metodnamn
- Kommentera vad metoderna gör
- Var noga med att matcha returtyper med vad metoden faktiskt returnerar
- Testa varje metod separat innan du kombinerar dem

Utmaningar att lägga till när grunderna fungerar:
- Lägg till parametervalidering i metoderna (t.ex. att ålder inte kan vara negativ)
- Skapa en metod som tar emot flera parametrar av olika typer
- Gör en metod som returnerar olika värden baserat på flera villkor

Denna övning hjälper dig förstå:
- Modularisering av kod
- Hur man bryter ner problem i mindre delar
- Skillnaden mellan olika typer av metoder
- Hur man strukturerar kod på ett mer organiserat sätt
- Grundläggande felhantering
  Detta är ett bra nästa steg eftersom det:
- Bygger vidare på grundläggande koncept
- Introducerar metoder på ett praktiskt sätt
- Ger möjlighet till kreativ problemlösning
- Förbereder för objektorienterad programmering
- Visar fördelarna med återanvändbar kod

# C) Den Interaktiva Personuppgiftshanteraren
Bygger vidare på tidigare övning men lägger till logik för att hantera olika scenarios och kontrollflöden.
#### 1. Behåll de grundläggande variablerna och metoderna från förra övningen
#### 2. Lägg till nya metoder som använder kontrollstrukturer:
* `kontrolleraPersonStatus`:
  * Ta ålder som parameter
  * Använd if-else för olika ålderskategorier (barn, ungdom, vuxen, pensionär)
  * Returnera lämpligt statusmeddelande
* `beräknaBMIKategori`:
  * Ta BMI som parameter
  * Använd if-else if-kedja för olika BMI-intervall
  * Returnera viktkategori som String
* `skapaÅldersstatistik`:
  * Ta ålder som parameter
  * Använd for-loop för att visa året och åldern för de nästa 10 åren
  * Skriv ut prognosen
* `kontrolleraNamnFormat`:
  * Ta namn som parameter
  * Använd switch för att hantera olika format:
    * bara förnamn
    * för- och efternamn
    * för-, mellan- och efternamn
* `räknaVokaler`:
  * Ta ett namn som parameter
  * Använd while-loop för att gå igenom varje bokstav
  * Räkna antal vokaler
  * Bonus: Använd också en switch för att identifiera vokalerna
#### 3. I main-metoden:
* Skapa en enkel meny med switch-sats:
  * Val 1: Visa grundläggande information
  * Val 2: Visa åldersstatistik
  * Val 3: Visa BMI-analys
  * Val 4: Visa namnanalys
  * Val 0: Avsluta programmet
#### 4. Extra utmaningar med nästlade kontrollstrukturer:
* Skapa en metod som kombinerar olika villkor:
  * Kontrollera både ålder och student-status
  * Använd `&&`, `||` och nästlade if-satser
  * Returnera olika rabattnivåer baserat på kriterierna

### Detta lär dig
 * `if`, `else if`, `else`
 * switch-satser
 * for-loopar
 * while-loopar
 * Logiska operatorer
 * Nästlade kontrollstrukturer
 * Break och continue
 * Strukturerad programmering

### Tips för implementation
 * Börja med enkla kontrollstrukturer och bygg på komplexiteten
 * Testa varje kontrollstruktur separat
 * Var noga med kodindenteringen för läsbarhet
 * Använd konstanter för magiska nummer
 * Testa extremvärden och gränsfall

### Exempel på testfall att implementera
 * Testa negativa åldrar
 * Testa tomma namn
 * Testa olika kombinationer av villkor
 * Testa loop-gränser