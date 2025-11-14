# Drill_Thread – Progetto Java con Thread

## 1. Descrizione del progetto
Questo progetto simula il processo industriale di assemblaggio di un trapano.  
Il trapano (`Drill`) può scavare solo dopo che tutti i componenti figli sono stati completati: `Body`, `EngineA` e `DrillPit`.

---

## 2. Struttura del progetto
- **Drill.java** → classe `padre`, coordina tutti i thread figli
- **Body.java** → thread `figlio` che costruisce il corpo
- **EngineA.java** → thread `figlio` che realizza il motore
- **DrillPit.java** → thread `figlio` che crea la punta

---

## 3. Funzionamento dei Thread
- Ogni thread figlio esegue il proprio `run()` in parallelo
- Simula il tempo di produzione con `Thread.sleep()`
- Alla fine il padre aspetta tutti i figli con `join()`

---

## 4. Autore 
- `Picioccolo` Matteo
- `5Cinf`
- Itis A. Volta

---

## 5. Contenuti della consegna
- Codice sorgente Java
- File `.zip` della Javadoc generata
- PDF UML con 4 classi
- README.md 

---

## 6. Come eseguire
1. Importare il progetto in IntelliJ IDEA
2. Eseguire `Main.java`
3. Osservare i messaggi dei thread
4. Il trapano inizia a scavare solo dopo che tutti i componenti sono completati
