# **Challenge**

## **Infinity War**

Thanos décide de programmer son gant de l'infini afin de créer une liste de `Hero`, dans le but final d'en supprimer la moitié.

Pour démarrer, [**fais un Fork du dépôt suivant**](https://github.com/WildCodeSchool/quest-java-collection1) puis clone-le en local.

> Pense bien à faire un Fork, sinon tu ne pourras rien pousser !

- [x] Initialise une `ArrayList` de `Hero` nommée `heroes`
- [x] Ajoute à la liste `heroes` les nouvelles instances de `Hero` suivantes :

```java
// name: Black Widow, age: 34
// name: Captain America, age: 100
// name: Vision, age: 3
// name: Iron Man, age: 48
// name: Scarlet Witch, age: 29
// name: Thor, age: 1500
// name: Hulk, age: 49
// name: Doctor Strange, age: 42
```

- [x] C'est l'anniversaire de Thor, il a maintenant 1501 ans ! Modifie son instance dans la liste
- [x] Mélange la liste de façon aléatoire grâce à une méthode existante (elle est dans une ressource d'une étape précédente)
- [x] Ne garde que la première moitié de la liste grâce à une méthode existante (elle est dans une ressource d'une étape précédente)
- [x] Avec une boucle, affiche dans le terminal le nom des héros encore en vie

Exemple de résultat possible lors de l'exécution de `Thanos` :

```
$ Scarlet Witch
$ Spider-Man
$ Hulk
$ Iron Man
```

## **Critères de validation**

- Le dépôt *GitHub* contient bien les fichiers `Hero.java` et `Thanos.java`
- La classe `Thanos` contient bien une `ArrayList` nommée `heroes`, avec les 8 instances de `Hero` demandées.
- La liste est bien mélangée aléatoirement grâce à une méthode
- La liste voit bien son nombre de héros réduit de moitié grâce à une méthode
- La classe `Thanos` se compile sans erreur et affiche dans le terminal un résultat proche de celui présenté précédemment (les noms des héros doivent varier selon l’exécution)
