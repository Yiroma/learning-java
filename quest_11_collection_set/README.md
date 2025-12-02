# **Challenge**

## **Avengers : Pre-Sequel Part.1**

Thanos aime tellement faire des statistiques inutiles qu'il en vient à manquer d'inspiration. Heureusement, il découvre les ensembles ! Il décide de bidouiller encore une fois son Gant de l'infini, afin d'y attacher cette nouvelle fonctionnalité.

Pour démarrer, [**fais un Fork du dépôt suivant**](https://github.com/WildCodeSchool/quest-java-collection3) puis clone-le en local.

> Pense bien à faire un Fork, sinon tu ne pourras rien pousser !

Thanos possède un `TreeSet` de `Heroes`, implémentant `Comparable` avec un tri par `age` croissant.

- [x] En une seule ligne, récupère et supprime le héros le plus vieux de l'ensemble
- [x] Sans modifier l'ensemble d'origine, affiche la liste des héros par âge décroissant
- [x] Sans modifier l'ensemble d'origine, affiche la liste des héros par âge croissant, allant de `Spider-Man` (compris) à `Iron Man` (compris)

Résultat attendu lors de l'exécution de `Thanos` :

```bash
$ Oldest hero:
$ Thor
$
$ Heroes by age (descending) :
$ Captain America, 100
$ Hulk, 49
$ Doctor Strange, 42
$ Black Widow, 34
$ Scarlet Witch, 29
$ Vision, 3
$
$ Subset of heroes :
$ Spider-Man, 18
$ Scarlet Witch, 29
$ Black Widow, 34
$ Doctor Strange, 42
$ Iron Man, 48

```

## **Critères de validation**

- Le dépôt *GitHub* contient bien les fichiers `Hero.java` et `Thanos.java`
- Seule la classe `Thanos` doit être modifiée
- La classe `Thanos` se compile sans erreur et affiche dans le terminal un résultat identique à celui présenté précédemment
