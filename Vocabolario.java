class Vocabolario extends Libro{
    private int numDef;

    public Vocabolario(String titolo, int numpag, int numDef){
         super(titolo,numpag);
         this.numDef=numDef;
    }

    public void info(){
        super.info();
        System.out.printf("Il numero di definizione e' %d \n", numDef);
        int n= this.getPag();
        int nMedio=this.numDef/n;
        System.out.printf("Il numero medio di definizioni per la pagina del vocabolario e' %d \n",nMedio);

    }
   
}