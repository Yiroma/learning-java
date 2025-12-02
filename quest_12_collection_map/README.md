# **Challenge**

## **Avengers : Pre-Sequel Part.2**

Thanos est finalement devenu fan des Avengers et a décidé, après les avoir plus ou moins ressuscités, d'utiliser son Gant de l'infini afin d'organiser une fête.

Afin d'épater la galerie, il veut offrir à chaque invité sa fleur préférée !

Pour démarrer, [**fais un Fork du dépôt suivant**](https://github.com/WildCodeSchool/quest-java-collection4) puis clone-le en local.

> Pense bien à faire un Fork, sinon tu ne pourras rien pousser !

Thanos possède des éléments `Hero` et `Flower` :

- [x] Construire un `TreeMap` nommé `party`, avec en clé `Hero` et valeur `Flower`
- [x] Ajouter dans `party` les couples clé/valeur suivants :

```bash
* *Hulk*, *Thor* et *Scarlet Witch* ont une *Rose *
* *Vision* a une *Tulip *
* *Captain America* a une *Lily*
* *Doctor Strange* et *Black Widow* ont une *Violet*
```

- [x] En une seule ligne, afficher si `party` contient l'instance `begonia`
- [x] Parcourir le tableau associatif par ordre alphabétique de nom de héros, et afficher, pour chacun d'entre eux, sa fleur attribuée.

Résultat attendu lors de l'exécution de `Thanos` :

```bash
$ false
$ Violet
$ Lily
$ Violet
$ Rose
$ Rose
$ Rose
$ Tulip
```

## **Critères de validation**

- Le dépôt *GitHub* contient bien les fichiers `Hero.java` et `Thanos.java`
- La classe `Thanos` doit être modifiée
- La classe `Hero` peut être modifiée (mais ce n'est pas obligatoire)
- La classe `Thanos` se compile sans erreur et affiche dans le terminal un résultat identique à celui présenté précédemment
