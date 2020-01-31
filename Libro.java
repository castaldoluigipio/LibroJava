class Libro{
    private String titolo;
    private int numpag;

    public Libro(String titolo, int numpag){
        this.titolo=titolo;
        this.numpag=numpag;
    }

    public void info(){
        System.out.printf("Il numero di pagine %d \n",this.numpag);
    }

    public void newTitle(String newTitle){
        this.titolo=newTitle;
    }

    public int getPag(){
        return numpag;
    }
}