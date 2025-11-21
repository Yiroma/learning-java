# **Challenge**

## **Achat de bonbons**

Voici l'algorithme suivant :

```bash
   réel money ← 12.4;
   réel price ← 1.2
   entier candies ← 0
   Si money > 0 ET price > 0
       Tant que (money - price) >= 0
           candies ← candies + 1
           money ← money - price
       Fin Tant que
   Fin Si
   afficher candies

```

1. Crée un nouveau dossier dans `JavaProjects`, que tu nommeras `Candies`.
2. Dans le dossier `Candies`, crée la classe `CandyCount.java`.
3. Déclare ta classe `CandyCount` et ajoute une méthode *main()*, telle qu'elle est montrée dans la *Java - Introduction*.
4. Dans ta méthode *main()*, écris en Java le code de l'algorithme du *challenge*.
5. Compile et exécute le code afin de tester qu'il fonctionne correctement.
6. Copie ton code dans un **Gist** et partage le fichier `CandyCount.java` en solution.

## **Critères de validation**

- Le fichier doit bien s'appeler `CandyCount.java` et la classe `CandyCount`.
- La classe doit se compiler sans message d'erreur.
- À l'exécution de la classe compilée, le chiffre 10 doit apparaître dans le terminal.
