package rs.math.oop.g13.p04.generickiStek;

interface Stek<T> {
    boolean jePrazan(); // празан стек
    int velicina(); // број елемената у стеку
    void push(T element); // додај на врх
    T top();    // елемент на врху стека
    void pop(); // скини елемент са врха
}