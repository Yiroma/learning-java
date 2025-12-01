## **Go Autoboat !**

Afin de t'exercer à l'héritage, tu vas créer les classes suivantes :

- [x] Crée une classe abstraite `Vehicle`
- [x] Ajoute les attributs `String brand` et `int kilometers`
- [x] Crée un constructeur permettant d'initialiser `brand` et `kilometers`
- [x] Ajoute des *getters* et *setters* pour tous les attributs, en respectant les conventions
- [x] Crée une classe `Car` qui étend la classe `Vehicle`
- [x] Crée une classe `Boat` qui étend la classe `Vehicle`
- [x] Ajoute dans `Vehicle` la méthode abstraite `public String doStuff()`
- [x] Ajoute dans `Car` et `Boat` une implémentation du corps de la méthode `doStuff()`. Pour `Car`, tu devras retourner "Je suis {brand} et je fais vroum vroum !" et pour `Boat` : "Je suis {brand} et je fais glou glou !"
- [x] Crée une classe `Hangar` qui possédera une méthode *main()*
- [x] Ajoute des références vers des instances des classes `Car` et `Boat` dans la méthode *main()* de `Hangar`
- [x] Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode `doStuff()`
- [x] Compile et teste `Hangar` : quand tout fonctionne, crée un dépôt *git* et envoie le tout sur *GitHub*
- [x] Partage le lien du dépôt *GitHub* en solution

Exemple de résultat attendu lors de l'exécution de `Hangar` :

```bash
$ Je suis Clio et je fais vroum vroum !
$ Je suis Titanic et je fais glou glou !
```

## **Critères de validation**

- Le dépôt *GitHub* contient bien les fichiers `Vehicle.java`, `Car.java`, `Boat.java` et `Hangar.java`
- Les classes respectent les conventions de la POO : attributs privés, utilisation du mot-clef *this*, *getters* et *setters* nommés correctement.
- Des références à des instances de la classe `Car` et `Boat` sont présentes dans la classe `Hangar`
- La classe `Hangar` se compile sans erreur et affiche le résultat attendu dans le terminal
