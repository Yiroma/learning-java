# **Challenge**

## **Un message codé pour Indy**

Entre deux smoothies et parties de chifoumi, Indiana Jones, le célèbre professeur / archéologue / aventurier, a récupéré trois papyrus antiques contenant chacun un message codé !

Heureusement, il a également découvert la manière de les déchiffrer, mais c'est un peu compliqué de le faire à la main.

Il te donne alors les instructions pour que tu développes un programme permettant d'automatiser le processus.

Cela pourra être d'autant plus utile s'il rencontre à nouveau ce système de chiffrement plus tard.

Voici comment procéder :

- Calcule la longueur de la chaîne et divise-la par 2, tu obtiendras ainsi le "chiffre-clé".
- Récupère ensuite la [**sous-chaîne**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-) de la longueur du chiffre-clé, en commençant à partir du 6ème caractère.
- [**Remplace les chaînes**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#replace-java.lang.CharSequence-java.lang.CharSequence-) '@#?' par un espace.
- Pour finir, [**inverse**](https://stackoverflow.com/questions/7569335/reverse-a-string-in-java) la chaîne de caractères.

Pour ceci, crée une classe **Decipherer** (c'est-à-dire un fichier *Decipherer.java*) où tu dois définir ta méthode.

Appelle ensuite ta méthode dans une méthode `main` sur chacun des messages suivants, et poste le code Java que tu as écrit, ainsi que les textes déchiffrés sur un Gist.

- message 1 : 0@sn9sirppa@#?ia'jgtvryko1
- message 2 : q8e?wsellecif@#?sel@#?setuotpazdsy0\*b9+mw@x1vj
- message 3 : aopi?sedohtém@#?sedhtmg+p9l!

### **Ressources**

- [**Java Methods**](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

## **Critères de validation**

- Le fichier `Decipherer.java` est disponible depuis un lien Gist,
- Les bons types sont appliqués au paramètre et au retour,
- Le mot clé `return` est utilisé dans la méthode pour renvoyer le résultat,
- L'affichage du résultat se fait bien à l’extérieur de la méthode et non directement dedans,
- Le message secret est bien déchiffré. Il faudra appeler la méthode trois fois, une fois pour chaque message, pour confirmer que tout fonctionne correctement.
