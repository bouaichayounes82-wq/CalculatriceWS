
# TP2 : Mise en œuvre de Jakarta XML Web Services

## Informations générales

- **Établissement :** Faculté des Sciences de Sfax
- **Département :** Informatique et Communications
- **Formation :** Licence LSI3
- **Étudiant :** Bouaicha Younes
- **Année universitaire :** 2026-2027

## 1. Objectif du TP

L'objectif de ce TP est de créer, publier et tester un service web SOAP en Java en utilisant Jakarta XML Web Services (JAX-WS).

Le service réalisé est une calculatrice qui permet d'effectuer quatre opérations :
- Addition
- Soustraction
- Multiplication
- Division

## 2. Environnement de travail

- Java JDK
- IntelliJ IDEA
- Maven
- Jakarta XML Web Services (JAX-WS)
- SoapUI 5.10.0

## 3. Structure du projet

Le projet Maven est organisé en plusieurs packages :

- `service` : contient l'interface `ICalculatrice` et la classe `Calculatrice`.
- `serveur` : contient la classe `ServeurJWS` qui permet de publier le service SOAP.
- `pom.xml` : contient les dépendances Maven nécessaires.
- `capture` : contient les captures de travail :structure du projet , document WSDL , test addition , test multiplication,test division et test soustraction.

![Structure du projet](captures/Structure%20du%20projet.png)

## 4. Publication du service web

Le service SOAP est publié à l'adresse suivante :

`http://localhost:8686/`

Le fichier WSDL est accessible à partir de l'adresse :

`http://localhost:8686/?wsdl`

Le WSDL décrit les opérations disponibles et les paramètres nécessaires pour utiliser le service.

![Document WSDL](captures/Document%20WSDL.png)

## 5. Test du service avec SoapUI

Après la publication du service, nous avons importé le fichier WSDL dans SoapUI afin de tester les différentes opérations.

### 5.1. Test de l'addition

Paramètres :
- a = 10
- b = 5

Résultat attendu : 15

![Test addition](captures/test%20addition.png)

### 5.2. Test de la multiplication

Paramètres :
- a = 10
- b = 5

Résultat attendu : 50

![Test multiplication](captures/test%20multiplication.png)

### 5.3. Test de la soustraction

Paramètres :
- a = 10
- b = 5

Résultat attendu : 5

![Test soustraction](captures/test%20soustraction.png)

### 5.4. Test de la division

Paramètres :
- a = 10
- b = 5

Résultat attendu : 2

![Test division](captures/test%20division.png)

## 6. Conclusion

Ce TP nous a permis de comprendre les étapes de création et de publication d'un service web SOAP en Java avec Jakarta XML Web Services.

Nous avons également appris à utiliser un fichier WSDL pour décrire le service et SoapUI pour tester ses différentes opérations.
