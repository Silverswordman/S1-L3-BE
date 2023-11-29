package Es2;

public class Sim {
    //attributi

    int telephoneNumber;
    double creditAvailable;
    int[] lastCalls;

    //    costruttori

    public Sim(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        this.creditAvailable = 0;
        this.lastCalls = new int[5];
    }
    //funzioni

}
