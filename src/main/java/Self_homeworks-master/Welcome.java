package introduction;


public class Welcome {



    public static void main(String[] args)
    {
        String[] powitania = new String[3];
        //deklaruje ile linijek ma mi sie wyswietlic
        powitania[0] = "Witaj Pawle!";
        //zaczynam od zera liczenie linijek czyli zero to tak jakby jeden
        powitania[1] = "tu Twoja Java zaczynamy przygode";
        powitania[2] = "nie boj sie bedzie fajnie";
        for (String p : powitania)
            //deklaruje Stringa p
            System.out.println(p);
        //wyswietlam samo p aby bylo elegancko
    }
}

