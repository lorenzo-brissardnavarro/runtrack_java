# Installation de l'environnement Java sous Windows

## 1. Installer le JDK

Le JDK (Java Development Kit) inclut tout le nécessaire pour compiler et exécuter un programme Java.

Suivre le guide d'installation officiel :

https://www.oracle.com/fr/java/technologies/downloads/

Choisissez le téléchargement qui convient à votre configuration, puis suivez les instructions d'installation.

## 2. Vérifier l'installation

Ouvrir un `terminal` ou un `cmd` et saisir :

```cmd
java -version
javac -version
```

Si les deux commandes affichent un numéro de version, l'installation est réussie.

> Si `javac` n'est pas reconnu, vérifiez que le dossier `bin` du JDK est bien ajouté à la variable d'environnement `PATH`.

## 3. Compiler le programme

Dans le terminal, utiliser la commande `cd` pour se rendre dans le dossier contenant le fichier, puis compiler avec `javac` :

```cmd
javac monFichier.java
```

Si aucune erreur n'apparaît, la compilation est terminée. Un nouveau fichier est alors présent dans le dossier :

```text
monFichier.class
```

## 4. Exécuter le programme

Une fois la compilation terminée, exécuter le programme avec (sans l'extension `.class`) :

```cmd
java monFichier
```