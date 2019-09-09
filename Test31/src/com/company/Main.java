package com.company;

import java.util.*;
import java.security.SecureRandom;

import static java.lang.Math.PI;

//denna klassen heter Main
class Main {
    static Scanner scan = new Scanner(System.in);   //skapar ett objekt av klassen Scanner, som läser från tangentbordet

    public static void main(String[] args) {        //main-metoden
        boolean running = true;             //boolean som ska ändras när programmet ska stängas ner
        System.out.print("Välkommen!");
        do {            //do-while statement som får switch-satsen att loopas
            System.out.print("\n\n Ange med siffror vilken uppgift du vill testa (0=quit): ");   //utskrift (prompt)
            try {
                int val = scan.nextInt();   //initierar och deklarerar en variabel
                switch (val) {              //switch statement som hanterar användarens val
                    case 0:
                        running = false;    //denna kommer göra att programmet stängs ner
                        break;              //överflödigt break-statement för lättläslighet
                    case 1:
                        ett();              //kallar metoden "ett" med inga parametrar
                        break;
                    case 2:
                        tva();
                        break;
                    case 3:
                        tre();
                        break;
                    case 4:
                        fyra();
                        break;
                    case 5:
                        fem();
                        break;
                    case 6:
                        sex();
                        break;
                    case 7:
                        sju();
                        break;
                    case 8:
                        atta();
                        break;
                    case 9:
                        nio();
                        break;
                    case 10:
                        tio();
                        break;
                    case 11:
                        elva();
                        break;
                    case 12:
                        tolv();
                        break;
                    case 13:
                        tretton();
                        break;
                    case 14:
                        fjorton();
                        break;
                    case 15:
                        femton();
                        break;
                    case 16:
                        sexton();
                        break;
                    case 17:
                        sjutton();
                        break;
                    case 18:
                        arton();
                        break;
                    case 19:
                        nitton();
                        break;
                    case 20:
                        tjugo();
                        break;
                    case 21:
                        tjugoett();
                        break;
                    case 22:
                        tjugotva();
                        break;
                    case 23:
                        tjugotre();
                        break;
                    case 24:
                        tjugofyra();
                        break;
                    case 25:
                        tjugofem();
                        break;
                    case 26:
                        tjugosex();
                        break;
                    case 27:
                        tjugosju();
                        break;
                    case 28:

                        break;
                    case 29:
                        tjugonio();
                        break;
                    case 31:
                        trettioett();
                        break;
                    case 32:
                        trettiotva();
                        break;
                    case 33:
                        trettiotre();
                        break;
                    case 35:
                        trettiofem();
                        break;
                    case 36:
                        trettiosex();
                        break;
                    case 37:
                        trettiosju();
                        break;
                    case 38:
                        trettioatta();
                        break;
                    case 39:
                        trettionio();
                        break;
                    case 48:
                        fyrtioatta();
                        break;
                    case 49:
                        fyrtionio();
                        break;
                    case 50:
                        femtio();
                        break;
                    case 56:
                        femtiosex();
                        break;
                    case 57:
                        femtiosju();
                        break;
                    case 59:
                        femtionio();
                        break;
                    case 61:
                        sextioett();
                        break;
                    case 62:
                        sextiotva();
                        break;
                    case 63:
                    case 65:
                        sextiofem();
                        break;
                    case 68:
                        sextioatta();
                        break;
                    case 70:
                        sjuttio();
                        break;
                    case 71:
                        sjuttioett();
                        break;
                    case 72:
                        sjuttiotva();
                        break;
                    case 73:
                        sjuttiotre();
                        break;
                    case 75:
                        sjuttiofem();
                        break;
                    case 76:
                        sjuttiosex();
                        break;
                    case 77:
                        sjuttiosju();
                        break;
                    case 78:
                        sjuttioatta();
                        break;
                    case 79:
                        sjuttionio();
                        break;
                    case 80:
                        attio();
                        break;
                    default:        //om vad som anges inte är ett accepterat nummer
                        System.out.print("\nFörsök igen med ett annat nummer.\n");
                }
                if (running)
                    System.out.print("\n\nUppgift avklarad.");
            }
            catch(InputMismatchException e){
                e.printStackTrace();
                scan.nextLine();
            }
        }
        while (running);
        System.out.print("\n\nStänger ner.");

    }
    /**
     * Metod som beräknar kvadraten av ett tal
     */
    static void ett() {
        System.out.print("\n#KVADRATEN AV ETT TAL#");    //utskrift
        System.out.print("Ange heltal: ");            //utskrift (prompt)
        int tal = scan.nextInt();            //initierar och deklarerar tal med hjälp av scan-instansen av Scanner-klassen
        System.out.print("tal * tal = " + tal * tal); //beräknar och skriver ut på samma gång
    }

    /**
     * Beräknar försäljningslön
     */
    static void tva() {
        System.out.print("\n#FÖRSÄLJNINGSBONUSLÖN#\n");        //utskrift
        System.out.print("Ange försäljningssumma i heltal: ");    //utskrift
        double bonus = scan.nextInt();    //sparar som double men läser in som Int. försök inte stoppa mig.
        System.out.print("Slutgiltig lön (med 9% försäljningsbonus): " + (8000 + bonus * 0.09) + " SEK");
    }

    /**
     * Räknar om från timmar till minuter och sekunder
     */
    static void tre() {
        System.out.print("\n#TIMMAR TILL MINUTER OCH SEKUNDER\n");
        System.out.print("Ange antal timmar: ");    //prompt
        int timmar = scan.nextInt();                    //initierar och deklarerar hours
        int minuter = treTidsberaknare(timmar);
        int sekunder = treTidsberaknare(minuter);
        trePrintare(timmar,minuter,sekunder);
    }
    static int treTidsberaknare(int tid) {
        return (tid*60);
    }
    static void trePrintare(int timmar, int minuter, int sekunder) {

        System.out.printf("%d timm",timmar);

        if (timmar >1) System.out.print("ar");

        else System.out.print("e");
        System.out.printf(" = %d minuter = %d sekunder",minuter,sekunder); //beräknar och skriver ut
    }

    /**
     * Beräknar summa och medelvärde av tre tal
     */
    static void fyra() {
        System.out.print("\n#SUMMA OCH MEDELVÄRDE AV TRE TAL#");    //printar info
        int sum = 0;    //initierar och deklarerar
        System.out.print("Ange tre tal.");    //prompt
        for (int x = 0; x < 3; x++) {    //ett varv för varje tal
            System.out.print("\nAnge tal nr " + (x + 1) + ": ");    //prompt
            sum += scan.nextInt();        //adderar till summan
        }
        System.out.print("\nSumma: " + sum + "\nMedelvärde: " + (sum / 3)); //beräknar och skriver ut
    }

    /**
     * Beräknar SEK i £ och $
     */
    static void fem() {
        System.out.print("\n#VALUTAVÄXEL#\n");
        System.out.print("Ange pengar i SEK: ");    //prompt om input
        double sek = scan.nextDouble();             //initierar och deklarerar
        double pund = sekTillPund(sek);             //skickar till metod
        double usd = sekTillUSD(sek);
        System.out.printf("%n%.0f:- = £%.1f%n%.0f:- = $%.1f",sek,pund,sek,usd); //skriver ut
    }
    static double sekTillPund(double sek) {
        double pund = sek/6;
        return pund;
    }
    static double sekTillUSD(double sek) {
        double usd = sek/10;
        return usd;
    }

    /**
     * Beräknar a*x*x*x+7
     */
    static void sex() {
        System.out.print("\n#BERÄKNA a*x*x*x+7#\n"); //skriver ut info
        System.out.print("\nAnge a: ");    //prompt
        int a = scan.nextInt();            //initiera och deklarera
        System.out.print("\nAnge x:");
        int x = scan.nextInt();
        System.out.print("a*x*x*x+7=" + a * x * x * x + 7);    //utför uträkning och skriver ut
    }

    /**
     * Beräknar pris per tankning
     */
    static void sju() {
        System.out.print("\n#PRIS PER TANKNING#\n");    //skriver ut info
        System.out.print("Ange liter: ");            //prompt om input
        double liter = scan.nextDouble();              //input till liter
        System.out.print("\nAnge pris per liter: ");   //prompt om input
        double prisPerLiter = scan.nextDouble();       //spara input till pPL
        System.out.print("\nAnge eventuell rabatt i procent (ENDAST SIFFROR!): "); //här kan det bli knasigt #tryCatch
        double rabatt = scan.nextDouble();
        System.out.print("Nettopris per tank: " + (100 - rabatt) / 100 * (liter * prisPerLiter));    //räknar & skriver ut nettopris
    }

    /**
     * Beräknar area och omkrets av rektangel
     */
    static void atta() {
        System.out.print("\n#BERÄKNA AREA OCH OMKRETS AV REKTANGEL#\n");
        System.out.print("Ange bas: ");
        double bas = scan.nextDouble(); //läser med scan och initierar och deklarerar bas
        System.out.print("Ange höjd: ");
        double hojd = scan.nextDouble();
        System.out.print("\nOmkrets = " + (bas * 2 + hojd * 2) + "\nArea = " + (bas * hojd)); //beräknar och skriver ut
    }

    /**
     * Beräknar cirkels diameter,omkrets,area (no comment)
     */
    static void nio() {
        System.out.print("\n#BERÄKNA CIRKELS DIAMETER, OMKRETS, AREA#\n");
        System.out.print("Ange cirkelns radie: ");
        double r = scan.nextDouble();
        System.out.print("\nDiameter = " + (r + r) + "\nOmkrets = " + ((r * 2) * PI + "\nArea = " + (r * r * PI)));
    }

    /**
     * Temperaturomvandling (no comment)
     * Konverterar från F till C
     */
    static void tio() {
        System.out.print("\n#TEMPERATUROMVANDLAREN#\n");
        System.out.print("Ange temperatur i Fahrenheit: ");
        double f = scan.nextDouble();
        System.out.print(f + " Fahrenheit = " + (5 * (f - 32) / 9) + " Celsius");
    }

    /**
     * Avgör vilket av 2 tal som är störst (no comment)
     */
    static void elva() {
        System.out.print("\n#VILKET TAL ÄR STÖRST?#\n");
        System.out.print("Ange tal 1: ");
        int tal1 = scan.nextInt();
        System.out.print("\nAnge tal 2: ");
        int tal2 = scan.nextInt();
        if (tal1 < tal2)
            System.out.print("\nTal 2 är störst.");
        else if (tal1 > tal2)
            System.out.print("\nTal 1 är störst.");
        else
            System.out.print("\nTalen är lika stora!");
    }

    /**
     * Kolllar om mer än dubbelt så stort (no comment)
     */
    static void tolv() {
        System.out.print("\n#ÄR FÖRSTA TALET MER ÄN DUBBELT SÅ STORT SOM DET ANDRA?#\n");
        System.out.print("Ange tal 1: ");
        int tal1 = scan.nextInt();
        System.out.print("\nAnge tal 2: ");
        int tal2 = scan.nextInt();
        if (tal1 > (tal2 * 2))
            System.out.print("\nJa, tal 1 är mer än dubbelt så stort som tal 2.");
        else if (tal1 >= (tal2 * 2))
            System.out.print("\nNej, tal 1 är EXAKT dubbelt så stort som tal 2.");
        else
            System.out.print("\nNej, tal 1 är inte dubbelt så stort som tal 2.");
    }

    /**
     * Kolla om tal är jämnt (no comment)
     */
    static void tretton() {
        System.out.print("\n#KOLLA OM TALET ÄR JÄMNT#\n");
        System.out.print("Ange tal: ");
        if (scan.nextInt() % 2 == 0)
            System.out.print("\nTalet är jämnt.");
        else
            System.out.print("\n2Talet är udda.");
    }

    /**
     * Kör metoden tretton (eftersom det är samma uppgift)
     */
    static void fjorton() {
        tretton();
    }

    /**
     * Kollar om jämnt delbart (no comment)
     */
    static void femton() {
        System.out.print("\n#ÄR TAL 1 JÄMNT DELBART MED TAL 2?#\n");
        System.out.print("Läs in tal 1: ");
        int tal1 = scan.nextInt();
        System.out.print("Läs in tal 2: ");
        int tal2 = scan.nextInt();
        if (tal2 != 0 && tal1 % tal2 == 0)
            System.out.print("\nJämnt delbart.");
        else
            System.out.print("\nInte jämnt delbart.");
    }

    /**
     * Räkna ut pris med rabatt (no comment)
     */
    static void sexton() {
        double bruttoPris = 0;
        double nettoPris = 0;
        int antalVaror;
        double prisPerSt;
        System.out.print("\n#VAD SKA KUND BETALA?#\n");
        System.out.print("Ange antal varor: ");
        antalVaror = scan.nextInt();
        System.out.print("\nAnge pris per styck: ");
        prisPerSt = scan.nextDouble();

        if (antalVaror * prisPerSt >= 1000)
            System.out.print("\nMed 10% rabatt inräknat så blir nettopriset " + (antalVaror * prisPerSt) * 0.9 + " Kr");
        else
            System.out.print("\nPris = " + antalVaror * prisPerSt + " Kr\tIngen rabatt.");
    }

    /**
     * Division (no comment)
     */
    static void sjutton() {
        System.out.print("\n#THE DIVISION#\n");
        System.out.print("Ange tal 1: ");
        int tal1 = scan.nextInt();
        System.out.print("Ange tal 2: ");
        int tal2 = scan.nextInt();
        if (tal2 != 0)
            System.out.print("\n" + tal1 + "/" + tal2 + "=" + tal1 / tal2);
        else
            System.out.print("\nDu skrev en nolla som nämnare. Du vet att en inte får göra det men du gjorde det ändå.");
    }

    /**
     * Läs in x & y, skriv ut a
     */
    static void arton() {
        int x, y, a;
        System.out.print("\n#SKRIV UT LÄS IN X & Y, SKRIV UT A#\n");
        System.out.print("Ange X: ");
        x = scan.nextInt();
        System.out.print("Ange Y: ");
        y = scan.nextInt();
        a = (x > 5 + y) ? 2 : 5;
        System.out.print("\nA = " + a);
    }

    /**
     * Beräknar veckolön med ev. övertidsersättning
     */
    static void nitton() {
        System.out.print("\n#BERÄKNA TIMLÖN + ÖVERTID#\n");
        System.out.print("Ange timlön: ");
        int timlon = scan.nextInt();
        System.out.print("Ange arbetstid i timmar: ");
        int arbetstid = scan.nextInt();
        int veckolon = 40 * timlon;
        if (arbetstid > 40) {
            int slutlon = (int) (veckolon + (arbetstid - 40) * (timlon * 1.5)); //gör till int pga ser snyggare ut
            System.out.print("\nMer än 40 timmar jobbade! Workaholic much?" +
                    "\nVeckolön med övertidsersättning = " + slutlon + " Kr");
        } else
            System.out.print("\nVeckolön = " + timlon * arbetstid + " Kr");
    }

    /**
     * Beräkna kvadraten av ett tal mellan 1 & 9 (no comment)
     */
    static void tjugo() {
        System.out.print("\n#KVADRERA ETT TAL MELLAN 1 OCH 9#\n");
        System.out.print("Ange ett tal mellan 1 och 9: ");
        int tal = scan.nextInt();
        if (tal > 0 && tal < 10)
            System.out.print("\n" + tal + " * " + tal + " = " + tal * tal);
        else
            System.out.print("\nDu skrev inte in ett tal mellan 1 och 9.");
    }

    /**
     * Kollar om tal är mellan -10 och 10
     */
    static void tjugoett() {
        int tal;
        System.out.print("\n#KOLLA OM MINDRE ÄN -10 ELLER STÖRRE ÄN 10#\n");
        System.out.print("Ange tal: ");
        tal = scan.nextInt();
        if (tal < -10)
            System.out.print("Talet är mindre än -10");
        else if (tal > 10)
            System.out.print("Talet är större än 10");
        else
            System.out.print("Talet ligger i spannet -10 till 10");
    }

    /**
     * Kollar om ett tal är mellan 0 och 9 men inte 5 (no comment)
     */
    static void tjugotva() {
        int tal;
        System.out.print("\n#ÄR TALET 0-9 MEN INTE 5?#\n");
        System.out.print("Ange tal: ");
        tal = scan.nextInt();
        if (tal < 10 && tal >= 0) {
            if (tal == 5) {
                System.out.print("Du skrev ju 5 ju.");
            } else {
                System.out.print("YES, mellan 0 och 9 och men inte 5!");
            }
        } else
            System.out.print("För högt/lågt.");


    }

    /**
     * Sesta om delbart med 3 men inte 30 (no comment)
     */
    static void tjugotre() {
        int tal;
        int talDelat;
        System.out.print("\n#TESTA OM DELBART MED 3 MEN INTE 30#\n");
        System.out.print("Ange tal: ");
        tal = scan.nextInt();
        if (tal % 3 == 0 && tal % 30 != 0) {
            talDelat = tal / 3;
            System.out.printf("Inte delbart med 30, men delbart med 3: " + "%d/3=%talDelat", tal, talDelat);
        } else
            System.out.print("Påståendet stämmer inte in på det angivna talet.");
    }

    /**
     * Testar om variabel är mellan 2 värden
     */
    static void tjugofyra() {
        double temperatur = 9999;
        System.out.print("\n#TA TEMPEN#\n");
        System.out.print("Ange kroppstemperatur: ");
        try {
            temperatur = scan.nextDouble();     //may throw exception
        } catch (InputMismatchException e) {
            System.out.println("\nERROR, input mismatch exception!\n");
            scan.nextLine();
        }

        if (temperatur < 35)
            System.out.print("Du verkar lite kall. Ta på dig en tröja, kanske?");
        else if (temperatur == 9999)
            System.out.print("Du skrev fel. Du skulle använt dig av heltal och endast heltal.");
        else if (temperatur > 42)
            System.out.print("SO HOT! OMG OMG ÖPPNA ETT FÖNSTER!");
        else
            System.out.print("Alldeles lagom");
    }

    /**
     * Beräknar om tal är pos eller neg
     */
    static void tjugofem() {
        System.out.print("\n#ÄR TALET POSITIVT ELLER NEGATIVT?#\n"); //skriver ut info
        System.out.print("Ange tal: ");        //prompt
        int tal = scan.nextInt();            //initierar och deklarerar
        if (tal > 0)                            //större än 0?
            System.out.println("\nPositivt");    //skriv ut positivt
        else if (tal < 0)                        //mindre än 0?
            System.out.print("\nNegativt");        //skriv ut negativt
        else                                    //annars
            System.out.print("\nNoll");            //skriv ut noll
    }

    /**
     * Testa vilket är störst
     */
    static void tjugosex() {
        int tal1, tal2;
        System.out.print("\n#TESTA VILKET TAL ÄR STÖRST#\n");
        System.out.print("Ange tal 1: ");
        tal1 = scan.nextInt();
        System.out.print("\nAnge tal 2: ");
        tal2 = scan.nextInt();
        if (tal1 > tal2)
            System.out.print(tal1 + " är större än " + tal2);
        else if (tal1 < tal2)
            System.out.print(tal2 + " är större än " + tal1);
        else
            System.out.print(tal1 + " och " + tal2 + " är lika stora");
    }


    /**
     * Vilket av tre tal som är minst
     */
    static void tjugosju() {
        int tal = 0;
        int temp = 0;
        System.out.print("\n#TRE TAL, VILKET ÄR MINST?#\n");
        for (int x = 1; x <= 3; x++) {
            System.out.print("Ange tal " + x + ": ");
            try {
                temp = scan.nextInt();
            } catch (InputMismatchException e) {
                x--;
                scan.nextLine();
                System.out.println("Felaktig input. Försök igen.");
            }
            if (x == 1)
                tal = temp;
            else if (temp < tal)
                tal = temp;
        }
        System.out.print("\nDet minsta talet är: " + tal);

    }

    static void tjugoatta() {

    }

    /**
     * Beräknar restid
     */
    static void tjugonio() {
        System.out.print("\n#BERÄKNA RESTID#\n"); //skriver ut info
        int avgH, avgM, restidH, restidM, ankH, ankM; //initierar variabler
        String ankSM = "";                                //initierar
        String ankSH = "";                                //initierar
        System.out.print("\nAnge avgångstimme: ");        //prompt
        avgH = scan.nextInt();                            //deklarerar
        System.out.print("\nAnge avgångsminut: ");        //prompt
        avgM = scan.nextInt();                            //deklarerar
        System.out.print("\nAnge restimmar: ");            //prompt
        restidH = scan.nextInt();                        //deklarerar
        System.out.print("\nAnge resminuter: ");        //prompt
        restidM = scan.nextInt();                        //deklarerar
        ankH = avgH + restidH;                            //ankomsttimme = avgångstimme + restimmar
        ankM = avgM + restidM;                            //ankomstminut = avgångsminut + resminuter

        while (ankM > 59) {                    //om minuterna är 60 eller mer
            ankM -= 60;                        //ta bort 60 minuter
            ankH += 1;                        //lägg till 1 timme
        }
        ankSM = String.valueOf(ankM);        //spara värdet av ankM till en sträng

        if (ankSM.length() == 1)            //om strängen bara har ett tecken
            ankSM = "0" + ankSM;            //lägg en nolla i början

        while (ankH > 23) {                    //för varje gång timmarna är 24 eller mer
            ankH -= 24;                        //ta bort 24 timmar
            System.out.print("\nNÄSTA DAG ");    //och skriv ut att en dag passerat
        }
        ankSH = String.valueOf(ankH);        //spara värdet av ankH till en sträng

        if (ankSH.length() == 1)            //om strängen bara har ett tecken
            ankSH = "0" + ankSH;            //lägg en nolla i början


        System.out.print("KLOCKAN " + ankSH + ":" + ankSM + " ankommer tåget"); //skriv ut de färdiga strängarna
    }

    /**
     * Läser in och skriv ut tal
     */
    static void trettioett() {
        int tal;
        System.out.print("\n#LÄS IN OCH SKRIV UT TAL#\n");    //skriver ut info
        System.out.print("Enter number: ");                    //prompt
        tal = scan.nextInt();                        //initierar och deklarerar

        while (tal != 0) {                    //körs tills en nolla skrivs in
            System.out.println(tal);        //skriver ut tal
            System.out.println("Enter number:");    //prompt
            tal = scan.nextInt();            //deklarerar
        }
    }

    /**
     * skriv ut talföljd 0 till 100
     */
    static void trettiotva() {
        int tal = 0;
        System.out.print("\n#SKRIV UT 0 2 4 6 osv till 100#\n");
        do {
            System.out.println(tal);
            tal = tal + 2;
        }
        while (tal < 101);
    }

    /**
     * skriv ut talföljd 100 till 0
     */
    static void trettiotre() {
        int tal = 100;
        System.out.print("\n#SKRIV UT 100 98 96 OSV TILL 0#\n");
        do {
            System.out.println(tal);
            tal = tal - 2;
        }
        while (tal >= 0);
    }

    /**
     * Kvadrater ett till nio
     */
    static void trettiofem() {
        int temp = 1;
        System.out.print("\n#KVADRATER 1 till 9#\n");
        while (temp < 10) {
            System.out.println(temp + " * " + temp + " = " + temp * temp);
            temp++;
        }
    }

    /**
     * Räknar med ränta
     */
    static void trettiosex() {
        double ranta = 0;
        int ar = 0;
        double temp = 0;
        double saldo = 1000;
        System.out.print("\n#1000 PENGAR PÅ BANKEN, MED RÄNTA#\n");
        System.out.print("Ange ränta: ");
        ranta = scan.nextDouble();

        while (ar < 10) {
            ar++;
            saldo = saldo * ranta;
            System.out.print("Saldo år " + ar + " = " + saldo + "\n");
        }

    }

    /**
     * Läs in och skriv ut tal
     */
    static void trettiosju() {
        int antalTal = -1;
        System.out.print("\n#ANGE ANTAL TAL ATT LÄSA IN OCH SKRIVA UT#\n");
        System.out.print("Ange antal tal: ");
        while (antalTal < 0) {
            try {
                antalTal = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.print("Felaktig input.\nAnge antal tal:");
            }
        }
        while (antalTal > 0) {
            System.out.print("Ange tal: ");
            try {
                System.out.println(scan.nextInt());
                antalTal--;
            } catch (InputMismatchException e) {
                System.out.println("Felaktig input");
                scan.nextLine();
            }
        }
    }

    /**
     * Populationsökningsberäkningsalgoritm
     */
    static void trettioatta() {
        int year = 2016;
        int popu = 26000;
        int yeardiff = 0;
        System.out.print("\n#POPULATIONSÖKNING I EN SMÅSTAD#\n");
        System.out.print("Prognos för vilket år?: ");
        yeardiff = scan.nextInt();
        yeardiff -= year;

        while (yeardiff > 0) {
            popu += popu * 0.001;
            popu -= 25;
            yeardiff--;
        }
        System.out.print("\nPrognos för år " + year + ": " + popu + " invånare");


    }

    static void trettionio() {
        int pris = 0;
        System.out.print("\n#PRIS MED MOMS#\n");


    }

    /**
     * Beräkna fakultet (n!)
     */
    static void fyrtioatta() {
        System.out.print("\n#BERÄKNA FAKULTET#\n");    //skriver ut info
        System.out.print("Ange n!: ");    //prompt
        int n = scan.nextInt();            //initierar och deklarerar
        int sum = 0;                    //initierar och deklarerar
        int nn = n;                        //initierar och deklarerar (for posterity)
        while (n > 1) {                    //kör så länge n är större än 1
            sum += n * (n - 1);            //gångrar n med n-1 och sparar till sum
            n--;                        //sänker n med 1
        }
        System.out.print("\n\n" + nn + "!: " + sum); //skriver ut
    }

    /**
     * Beräkna f
     */
    static void fyrtionio() {
        System.out.print("\n#BERÄKNA f(x)=x'n#\n"); //skriver ut info
        System.out.print("Ange x: ");        //prompt
        int x = scan.nextInt();                //initierar och deklarerar
        int sum = x;                        //initierar och deklarerar
        System.out.print("\nAnge n: ");        //prompt
        int n = scan.nextInt();                //initierar och deklarerar

        while (n > 1) {                        //så länge n är större än 1
            sum *= x;                    //sum gångras med x och sparas
            n--;                        //n minskas med 1
        }
        System.out.print("\n\nf= " + sum);    //skriver ut sum
    }

    /**
     * Skriver ut Multiplikationstabellerna 1-9
     */
    static void femtio() {  //Multiplikationstabell 1-9
        System.out.print("\n#MULTIPLIKATIONSTABELLEN#\n");
        for (int x = 1; x < 10; x++) { //går från 1 till 9
            for (int y = 1; y < 10; y++) { //går från 1 till 9 en gång för varje x
                System.out.println(x + "*" + y + "=" + (x * y)); //räknar och skriver ut
            }
        }
    }

    /**
     * Räknar tal och skriver ut summa och medelvärde
     */
    static void femtiosex() {
        System.out.print("#ÄNNU EN \" SKRIVA IN OCH SKRIVA UT\" MEN NU MED MEDELVÄRDE#\n");
        int counter = 0;    //initierar & deklarerar
        int sum = 0;        //initierar & deklarerar
        System.out.print("(STOPPVÄRDE = 9999\n\nAnge tal : ");    //prompt
        int tal = scan.nextInt();    //initierar och deklarerar
        while (tal != 9999) {        //körs tills 9999 skrivs in
            sum += tal;                //adderar tal till summa
            counter++;                //inkrementerar räknaren
            System.out.print("Ange tal: ");    //prompt
            tal = scan.nextInt();    //uppdaterar värdet av tal
        }
        System.out.print("\nMedelvärde: " + sum / counter);
    }

    /**
     * Beräknar antal mil per tankning
     */
    static void femtiosju() {
        System.out.print("\n#ANTAL MIL PER TANKNING#\n");    //skriver ut info
        double sumMil = 0;        //initierar och deklarerar
        double sumLiter = 0;    //initierar och deklarerar
        System.out.print("Ange hur många liter som tankats: ");    //prompt
        double literTankat = scan.nextDouble();    //initierar och deklarerar
        while (literTankat != 0) {    //tills noll skrivs in
            System.out.print("Ange hur många mil som körts: ");    //prompt
            double kordaMil = scan.nextDouble();    //initierar och deklarerar
            sumLiter += literTankat;            //literTankat läggs till till sumLiter
            sumMil += kordaMil;                    //kordaMil läggs till till sumMil
            System.out.println("\nDu har förbrukat " + literTankat / kordaMil + " liter/mil");    //beräkar och skrive ut
            System.out.print("Ange hur många liter som tankats: ");    //prompt (det ska vara såhär, det är en bra lösning)
            literTankat = scan.nextDouble();    // skriver över literTankat
        }
        System.out.print("\n\nSammanlagt " + sumLiter / sumMil + " liter/mil"); //skriver ut sammanlagt genomsnitt
    }

    /**
     * Beräknar största och minsta talet
     */
    static void femtionio() {
        System.out.print("\n#STÖRSTA OCH MINSTA TALET#\n");    //skriver ut info
        int big = 0;                            //initierar och deklarerar
        int small = 0;                            //initierar och deklarerar
        System.out.print("Ange antal: ");        //prompt
        int antalTal = scan.nextInt();            //initierar och deklarerar
        int counter = 1;                        //initierar och deklarerar
        System.out.print("\nAnge tal: ");        //prompt
        int tal = scan.nextInt();                //initierar och deklarerar
        big = tal;                                //första talet är störst hittils
        small = tal;                            //första talet är minst hittils
        while (antalTal > 0) {                    //kör så långt användaren valt
            if (tal > big)                        //om tal är större än störst
                big = tal;                        //så är tal det nya största
            else if (tal < small)                //om tal är mindre än minst
                small = tal;                    //så är tal det nya minsta
            if (antalTal == 1)
                break;                            //bryt om den är på sista talet
            System.out.print("Ange tal: ");
            tal = scan.nextInt();
            antalTal--;                            //räkna ner antalTal med 1
        }
        System.out.print("\nStörsta talet: " + big + "\nMinsta talet: " + small); //skriv ut svaren
    }

    /**
     * Skriv tal i nummerordning (no comment)
     */
    static void sextioett() {
        System.out.print("\n#SKRIV TAL I NUMMERORDNING#\n");
        int counter = 1;
        int oldNr = 0;
        System.out.print("Ange NewNr: ");
        int newNr = scan.nextInt();

        while (newNr != 0) {
            if (newNr < oldNr) {
                System.out.println("Tal nr " + counter + " är fel, dess värde är " + newNr);
            }
            oldNr = newNr;
            counter++;
            System.out.print("Ange NewNr: ");
            newNr = scan.nextInt();
        }
    }

    /**
     * Kolla om 10 tal är inom 5000-10000 (no comment)
     */
    static void sextiotva() {
        System.out.print("\n#SKRIV TAL MELLAN 5000 OCH 10000 FÖR ATT FÅ RÄTT#\n");
        int counter = 1;
        boolean correct = true;
        System.out.print("Ange tal: ");
        int tal = scan.nextInt();

        while (counter < 10) {
            if (tal < 5000 || tal > 10000)
                correct = false;

            counter++;
            System.out.print("Ange tal: ");
            tal = scan.nextInt();

        }
        if (correct)
            System.out.print("10 korrekta tal. a winner is you.");
        else

            System.out.print("You made a stupid.");

    }
    static void sextiofem() {
        System.out.print("#\nSTÖRSTA OCH NÄST STÖRSTA I LISTAN#\n");
        int storst;
        int nastStorst;
        int[] lista = new int[100];
        SecureRandom secRandom = new SecureRandom();
        System.out.println("Hela jävla listan: ");

        for (int x = 0;x<100;x++) {
            lista[x] = secRandom.nextInt();
        }
        storst = lista[0];
        nastStorst = lista[0];
        for (int x = 0;x<100;x++) {
            System.out.println(lista[x]);
            if (lista[x]>storst) {
                storst = lista[x];
            }
            else if (lista[x]>nastStorst) {
                nastStorst = lista[x];
            }
        }

        System.out.printf("Störst = %d\tNäst störst = %d",storst,nastStorst);
    }
    static void sextioatta() {
        System.out.print("\n#DUBBLA ALLA ELEMENT I LISTAN#\n");
        int[] lista = new int[]{3,5,-23,345,5};
        for (int x = 0;x<lista.length;x++){
            System.out.print(lista[x]+ " * 2 = ");
            lista[x] *= 2;
            System.out.println(lista[x]);
        }

    }
    /**
     * Vektors antal positiva tal
     */
    static void sjuttio() {
        int[] lista = new int[]{3, -5, 53, -43, 0}; //skapa en ny lista, deklarera innehåll
        int antalPos = 0;
        System.out.print("\n#ANTAL POSITIVA TAL I VEKTORN#\n");

        for (int x = 0; x < lista.length; x++) {
            if (lista[x] > 0)
                antalPos++;
        }
        System.out.print("\nListan innehåller " + antalPos + " positiva tal.");
    }
    static void sjuttioett() {
        int bigger = 0;
        int[] lista = new int[]{343,-3452,43,536,55};
        for ( int x = 1; x<lista.length;x++){
            if (lista[x]>lista[0]){
                bigger++;
            }
        }
        System.out.print(bigger+" tal är större än det första talet.");
    }
    static void sjuttiotva() {
        int[] lista = new int[]{32,532,-234234,532,-34,-435,345,-4359,-45,45};

        for (int x = lista.length-1;x>=0;x--) {
            if (lista[x]<0){
                System.out.print("Det sista negativa talet i listan finns på index "+x);
                break;
            }
        }
    }
    /**
     * Vektors summa och medelvärde
     */
    static void sjuttiotre() {
        int[] lista = new int[]{3, 8, -3, 54, 89};
        int sum = 0, medel = 0;
        System.out.print("\n#SUMMA OCH MEDELVÄRDE AV VEKTORNS INNEHÅLL#\n");

        for (int x = 0; x < lista.length; x++) {
            sum += lista[x];
        }
        medel = sum / lista.length;

        System.out.printf("Summa = %d\tMedelvärde = %d", sum, medel);
    }
    static void sjuttiofyra() {

    }

    /**
     * beräknar summa av positiva och negativa tal i en vektor
     */
    static void sjuttiofem() {
        int sumpos = 0, sumneg = 0;
        System.out.print("\n#SUMMA AV POSITIVA OCH AV NEGATIVA TAL I VEKTOR#\n");
        int[] lista = new int[]{3, 5, -34, -5, -3};
        for (int x = 0; x < lista.length; x++) {
            if (lista[x] > 0)
                sumpos += lista[x];
            else            //är det noll så sker ändå ingen förändring
                sumneg += lista[x];
        }
        System.out.printf("%nSumma positiva tal = %d\t Summa negativa tal = %d", sumpos, sumneg);
    }

    /**
     * Skriva äver till annan vektor
     */
    static void sjuttiosex() {
        int[] vek1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vek2 = new int[10];
        System.out.print("\nSKRIVA ÖVER TILL EN ANNAN VEKTOR, FAST BAKLÄNGES!!#\n");

        for (int x = 0; x < 10; x++) {
            System.out.println("Vektor 1 plats [" + x + "] = " + vek1[x]);
            vek2[9 - x] = vek1[x];
        }
        System.out.print("\nNOW WATCH THIS!\n\n");
        for (int x = 0; x < 10; x++) {
            System.out.println("Vektor 2 plats [" + x + "] = " + vek2[x]);
        }


    }

    /**
     * Skriva ut vektorns innehåll baklänges
     */
    static void sjuttiosju() {
        int[] lista = new int[10];

        System.out.print("Läs in 10 heltal:");
        for (int x = 0; x < lista.length; x++) {
            try {
                lista[x] = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Felaktig input, försök igen.");
                scan.nextLine();
                x--;
            }
        }
        for (int x = lista.length - 1; x >= 0; x--) {
            System.out.println(lista[x]);
        }
    }

    static void sjuttioatta() {
        int talj = 0, namn = 0, kvot = 0;
        boolean taljOK = false, namnOK = false;
        System.out.print("\n#TÄLJARE OCH NÄMNARE I BRÅK#\n");
        System.out.print("Ange täljare: ");
        while (!taljOK) {
            taljOK = true;
            try {
                talj = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Incorrect. Försök igen.");
                taljOK = false;
            }
        }
        System.out.print("Ange nämnare: ");
        while (!namnOK || namn == 0) {
            namnOK = true;
            try {
                namn = scan.nextInt();
            } catch (InputMismatchException f) {
                scan.nextLine();
                System.out.print("Incorrect. Försök igen. ");
                namnOK = false;
            }
            if (namn == 0) {
                System.out.println("Nämnaren får inte vara 0.");
            }
        }


        kvot = talj / namn;
        System.out.printf("%d/%d=%d", talj, namn, kvot);


    }

    /**
     * vända på bråk
     */
    static void sjuttionio() {
        double[] vektor = new double[2];
        double taljare = 1;
        double namnare = 1;
        double kvot;
        System.out.print("\n#VÄNDA PÅ ETT BRÅK#\n");
        for (int x = 0; x < 2; x++) {
            if (x == 0)
                System.out.print("Ange täljaren: ");
            else
                System.out.print("Ange nämnaren: ");
            try {
                vektor[x] = scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again.");
                scan.nextLine();
                x--;
            }
        }
        taljare = vektor[0];
        namnare = vektor[1];
        if (vektor[1] <= 0) {
            namnare = vektor[1] * -1;
            System.out.printf("Nämnaren var %+d. Inte OK. Nämnaren är nu %+d", vektor[1], namnare);
        } else if (vektor[1] == 0) {
            vektor[1] = 1;
            System.out.print("Nämnaren var noll. Inte OK. Nämnaren är nu 1.");
        }

        kvot = taljare / namnare;
        System.out.printf("\n% .0f/% .0f=% .3f", taljare, namnare, kvot);


    }

    /**
     * Beräknar största gemensamma divisorn
     */
    static void attio() {
        int tal = 2;
        int sgd = 1;
        int[] vektor = new int[2];
        System.out.print("\n#STÖRSTA GEMENSAMMA DIVISOR#\n");
        System.out.println("Ange två heltal: ");
        for (int x = 0; x < tal; x++) {
            try {
                vektor[x] = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Felaktig inmatning, försök igen.\n");
                scan.nextLine();
                x--;
            }
        }

        while (tal <= vektor[0] && tal <= vektor[1]) {
            if (vektor[1] % tal == 0 && vektor[0] % tal == 0)
                sgd = tal;
            tal++;
        }
        for (int x = 0; x < 2; x++) {
            vektor[x] /= sgd;
        }
        System.out.printf("Största gemensamma divisorn är %d " +
                "%nFörkortat så är bråket %d/%d", sgd, vektor[0], vektor[1]);
    }
}

