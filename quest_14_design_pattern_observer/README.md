# **Challenge**

## **Desperate Friend : Saison 2**

Ton ami développeur est de nouveau dans tous ses états : son application bancaire ne fonctionne plus correctement !

Il y a encore quelques jours, il travaillait avec des données fictives, en synchrone : le montant était retiré et le résultat était renvoyé directement.

Désormais, il doit appeler le serveur bancaire et attendre le retour de ce dernier : cela prend du temps et il ne sait ni comment, ni quand afficher le solde.

Il a écrit le code suivant, qui crée un compte avec 1000€, retire 100€ puis affiche le solde du compte :

```java
Bank account = new Bank(1000);

Transactions.withdraw(account, 100);

System.out.printf("Your balance is: %d%n", account.getTotal());
```

Cependant le résultat affiche *"Your balance is: 1000"*, au lieu de *"Your balance is: 900"*.

Un collègue de ton ami a commenté son code afin de l'aider. Cependant, ce dernier ne sait pas comment procéder et se repose encore une fois sur toi pour le dépanner !

Pour démarrer, [**fais un Fork du dépôt suivant**](https://github.com/WildCodeSchool/quest-java-listener) puis clone-le en local.

> Pense bien à faire un Fork, sinon tu ne pourras rien pousser !

- [x] Ouvre les classes `Main`, `Bank` et `Transactions` afin d'en étudier les contenus respectifs.
- [x] Crée une interface `TransactionListener` avec la signature de méthode `void onComplete(Bank account);`
- [x] Dans la classe `Transactions`, modifie la méthode `withdraw` afin d'y ajouter en argument une instance de `TransactionListener`. Ensuite, appelle la méthode `onComplete` au moment opportun.
- [x] Dans la classe `Main`, modifie l'appel de la méthode `withdraw` et passe en paramètre une *classe anonyme* de `TransactionListener`. Déplace l'affichage du solde du compte à l'endroit propice.

Résultat attendu lors de l'exécution de `Main` :

```bash
$ Your balance is: 900
```

## **Critères de validation**

- Seuls les fichiers `Main.java` et `Transactions.java` doivent avoir été modifiés.
- Une interface `TransactionListener.java` doit avoir été créée.
- La classe `Main` se compile sans erreur et affiche dans le terminal le résultat attendu.
