//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in =  new Scanner (System.in);
        System.out.println("Inserisci quanti atleti ci partecipano alla gara");
        int n=in.nextInt();
        int i;
        String[] nomi=new String[n];
        int[] nazione=new int[n];
        double[] tempo=new double[n];
        for (i = 0; i<= n-1; i++){
            System.out.println("Inserisci il nome del "+(i+1)+"Atleta: ");
            nomi[i]=in.next();
            System.out.println("Inserisci la nazione del "+(i+1)+"Atleta: ");
            nazione[i]=in.nextInt();
            System.out.println("Inserisci il tempo del "+(i+1)+"Atleta: ");
            tempo[i]=in.nextDouble();
        }
        System.out.println("Lista + caratteristiche di ogni atleta: ");
        for (i = 0; i<= n-1; i++){
            System.out.println("Nome atleta "+(i+1)+": ");
            System.out.println(nomi[i]);
            System.out.println("Nazione atleta "+(i+1)+": ");
            System.out.println(nazione[i]);
            System.out.println("Tempo atleta "+(i+1)+": ");
            System.out.println(tempo[i]);
        }
        double min=tempo[0];
        int iMin=0;
        for (i = 0; i<= n-1; i++){
            if(tempo[i]< min){
                iMin=i;
                min=tempo[i];
            }
        }
        System.out.println("Nome atleta vincente "+nomi[iMin]+": ");
        System.out.println("Nazione atleta vincente "+nazione[iMin]+": ");
        System.out.println("Tempo atleta vincente "+tempo[iMin]+": ");
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md