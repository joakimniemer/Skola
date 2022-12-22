# Walker challenge

Du har nu chans att vinna ära och berömmelse genom att skapa den bästa gångaren
av alla! Tävlingen går ut på att varje skapa en liten klass som kan röra sig i
ett rutnät och vara den som rört sig över störst yta när matchen är slut. 

Spelplanen är ett rutnät 50x50 där fyra tävlande åt gången kämpar om vinsten.

En spelomgång berstår av att varje tävlande kommer att starta tre rutor in
(diagonalt) från ett slumpmässigt valt hörn och kan sedan röra sig ett steg i
taget åt valfritt håll.

Alla tävlande kommer sedan få flytta sig ytterligare ett steg i taget tills 
spelomgången är över. Om en tävlande rör sig in på en ruta där en mottävlande
redan varit dör vederbörande. Man skall alltså enbart gå på sina egna rutor
eller tomma rutor. Det finns dock inget sätt att ta reda på om en motspelare 
gått på en ruta eller ej!

Spelomgången tar omedelbart slut när endast en spelare är kvar på spelplanen.

Hela tävligen som sådan är uppbyggd på ett turneringsformat där en match består
av tre spelomgångar och de två tävlande som täckt flest rutor totalt under dessa
tre spelomgångar går vidare till nästa runda. 

I varje runda kommer de tävlande fyllas på med ytterligare mottävlande tills
antalet är jämnt delbart med fyra. Varje match kommer alltså alltid bestå av
exakt fyra spelare. Dessa extra spelare är alltid helt slumpmässiga i sitt
gående och kan inte vinna och gå vidare till nästa runda.

Spelet fortgår, spelomgång efter spelomgång, match efter match, runda efter 
runda tills det bara är fyra spelare kvar och en sista match spelas. Vinnaren
av den sista matchen är vinnaren av hela turneringen.

## Att skapa en walker

För att skapa ett bidrag till tävlingen behöver du skapa en klass som 
implementerar interfacet `Walker`. Du kan inte använda dig av några externa
bibliotek och din implementation bör finnas i en enda fil.

```Java
package se.yrgo.walkfighters;

public interface Walker {
    Direction nextStep(int x, int y);

    default String getName() {
        return getClass().getSimpleName();
    }

    default void setSize(int x, int y) {
        // don't do anything
    }
}
```

Din klass måste ha en konstruktor som inte tar några parametrar. Om klassen
inte går att ladda kommer den inte få vara med och spela.

Metoden `getName()` kan du använda för att ge din walker ett specifikt namn. 
Försök att använda din fantasi så den inte får samma namn som någon annan, då
kommer du kanske få dela segern...

Inför varje spelomgång kommer metoden `setSize()` att anropas med storleken
på spelytan (50x50). Här kan du initiera din klass på något vis som du anser
vara lämpligt.

Under spelets gång kommer sedan metoden `nextStep()` att anropas och du kommer
få reda på vilken position du för närvarande har på spelbrädet. Metoden måste 
returnera åt vilket håll du skall gå åt med hjälp av följande enum:

```Java
package se.yrgo.walkfighters;

public enum Direction {
    UP, DOWN, LEFT, RIGHT
}
```

Om du försöker gå över kanten på brädet kommer du att stå kvar på samma ruta
som tidigare.

**OBS!** Metoden `nextStep()` får inte ta längre tid än 150ms att köra (på min 
maskin). Tar metoden längre tid än så kommer din walker att dödas och tas ur
spel den rundan.

**OBS!** Ingen av metoderna får kasta något exception (eller annat).

Den walker som kommer att användas för att fylla ut matcher med färre än
fyra spelare ser ut som följande:

```Java
import java.util.concurrent.ThreadLocalRandom;
import se.yrgo.walkfighters.Direction;
import se.yrgo.walkfighters.Walker;

public class RandomWalker implements Walker {
    @Override
    public Direction nextStep(int x, int y) {
        Direction[] values = Direction.values();
        int num = ThreadLocalRandom.current().nextInt(values.length);
        return values[num];
    }
}
```

## Att kompilera och testa sina walkers

Med i detta paket finns det ett antal filer av yttersta vikt. Dels finns det
en jar-fil `walkfighters-1.0.0.jar` och en katalogm `walkers` i vilken du 
finner ett antal exempelfiler.

Jar-filen innehåller all kod för att köra programmet, inklusive de två klasser
du behöver för att skriva dina egna walkers.

För att kompilera exempelfilerna gå in i katalogen walkers och kör följande
kommando (nedan för bash):

```
javac -cp ../walkfighters-1.0.0.jar *.java
```

För att sedan provköra allt ställ dig i samma katalog som jar-filen ligger
i (där även katalogen walkers finns) och kör följande kommando:

```
java -cp walkfighters-1.0.0.jar se.yrgo.walkfighters.App
```

Du bör nu få upp ett grafiskt fönster med ett rutnät i. Klicka på rutnätet
för att starta varje ny spelomgång. När samtliga matcher är över kommer
finalomgångens spelare att visas med vinnaren överst.

Applikationen letar efter en katalog `walkers` och försöker ladda samtliga
klassfiler (*.class) den hittar där i. Det är därmed du som måste se till
att de är korrekt kompilerade först.

Turneringen kommer att köras med Java 11 och det är därmed lämpligt att du
säkerställer att din kod fungerar med den versionen.

## Deltagande

För att delta behöver du ha skickat in max två implementationer, i form utav
java-filer. Dessa kommer att placeras tillsammans med alla övriga bidrag (men 
utan mina exempel) i mappen `walkers` och kompileras. Du skall alltså inte
skicka in förkompilerade class-filer, de kommer inte få delta.

Tävlingsdatum kommer att annonseras senare.

## Buggar

Hittar du någon bugg som gör att spelet slutar fungera får du gärna rapportera
den så den kan åtgärdas innan tävlingsdagen. Självklart är det minst lika mycket
ära att hitta en bugg som att vinna!
