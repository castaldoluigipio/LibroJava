import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        

        System.out.println("Inserisci il titolo \n");
        String nome= s.nextLine();

        System.out.println("Inserisci il nuovo titolo \n");
        String title= s.nextLine();

        System.out.println("Inserisci numero di pagine \n");
        int pagine= s.nextInt();

        System.out.println("Inserisci il numero di definizioni \n");
        int def= s.nextInt();
        Vocabolario V = new Vocabolario(nome,pagine,def);

        
      

        V.newTitle(title);
        V.info();
        
    }

}