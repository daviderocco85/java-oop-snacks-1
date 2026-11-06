# Java OOP - Snacks-1

## Snack 1: Studente

Creazione della classe `Studente` per rappresentare uno studente attraverso i seguenti attributi:

- `firstName`: (`String`) nome dello studente.
- `lastName`: (`String`) cognome dello studente.
- `age`: (`int`) età dello studente.

La classe utilizza un costruttore con tre parametri per inizializzare gli attributi.

È inoltre presente un metodo `getStudentDetails()` che restituisce una stringa contenente i dati dello studente nel formato:

Es.: `Anselmo Bitta, 24 anni`

## Snack 2: Gestione di un Conto

Creazione della classe `ContoBancario` per rappresentare un conto bancario attraverso i seguenti attributi:


- `accountNumber`:(`String`) identificativo del conto bancario.
- `balance`:(`BigDecimal`) saldo disponibile sul conto.

La classe utilizza un costruttore che accetta il numero del conto e inizializza automaticamente il saldo a zero.

Sono inoltre presenti i seguenti metodi pubblici:

- `deposit()`: permette di depositare denaro sul conto.
- `withdraw()`: permette di prelevare denaro dal conto.
- `getCurrentBalance()`: restituisce il saldo corrente del conto.

## Snack 3: Registro Studenti

Creazione della classe `RegistroStudenti` per gestire un insieme di studenti attraverso un array privato di oggetti `Studente`.

La classe utilizza un costruttore senza parametri per inizializzare un registro vuoto.

Sono inoltre presenti i seguenti metodi:

- `addStudent()`: permette di aggiungere uno studente al registro, verificando che ci sia ancora spazio disponibile.
- `printStudents()`: stampa la lista degli studenti registrati, utilizzando direttamente un ciclo per scorrere l'array, senza ricorrere a metodi helper.
