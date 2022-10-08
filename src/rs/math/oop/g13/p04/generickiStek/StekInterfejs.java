package rs.math.oop.g13.p04.generickiStek;

interface StekInterfejs<T> {
    boolean jePrazan(); // празан стек
    int velicina(); // број елемената у стеку
    void dodaj(T element); // додај на врх
    T vrh();    // елемент на врху стека
    void ukloni(); // скини елемент са врха
}