# **Challenge**

## **Endgame**

La population de héros réduite de moitié, Thanos a enfin terminé son travail. Aussi lui vient-il une révélation tardive : que va-t-il faire maintenant ?

Il hésite entre devenir fermier et recenser des héros restants, afin d'effectuer des statistiques.

Thanos choisit finalement la seconde option : il programme donc son gant de l'infini afin de réaliser des actions de tri sur des listes.

Pour démarrer, [**fais un Fork du dépôt suivant**](https://github.com/WildCodeSchool/quest-java-collection2) puis clone-le en local.

> Pense bien à faire un Fork, sinon tu ne pourras rien pousser !

- [ ] Modifie la classe `Hero` afin d'implémenter `Comparable`. L'ordre de tri par défaut sera sur l'attribut `name`, par ordre croissant.
- [ ] Dans la classe `Thanos`, fait en sorte que la liste de héros soit bien triée comme voulu.
- [ ] Dans la classe `Thanos`, ajoute un `Comparator` permettant de trier la liste de héros sur l'attribut `age` décroissant.

Voici le résultat attendu lors de l'exécution de `Thanos` :

```bash
$ Order by name:
$ Black Widow, 34
$ Captain America, 100
$ Hulk, 49
$ Thor, 1501
$
$ Order by age:
$ Thor, 1501
$ Captain America, 100
$ Hulk, 49
$ Black Widow, 34
```

## **Critères de validation**

- Le dépôt *GitHub* contient bien les fichiers `Hero.java` et `Thanos.java`
- La classe `Thanos` se compile sans erreur et affiche dans le terminal le même résultat que celui présenté précédemment
