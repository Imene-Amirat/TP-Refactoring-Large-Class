# Code Smell : Large Class

## Description
Le code smell **Large Class** désigne une classe qui regroupe **trop de responsabilités** au sein d’une même entité.  
Elle devient difficile à comprendre, à maintenir et à faire évoluer, car elle viole le **principe de responsabilité unique (Single Responsibility Principle – SRP)**.

Une *Large Class* combine souvent plusieurs rôles, par exemple :
- gestion des données,
- logique métier,
- validation,
- affichage ou persistance.

---

## Problèmes engendrés
- Faible cohésion de la classe
- Couplage élevé
- Difficulté de maintenance
- Risque accru d’erreurs lors des évolutions

---

## Indices typiques
- Grand nombre de méthodes et d’attributs
- Méthodes longues ou hétérogènes
- Responsabilités non clairement séparées
- Difficulté à tester la classe isolément

---

## Refactoring recommandé
Le refactoring le plus couramment associé à ce code smell est **Extract Class**.

### Principe
Séparer les différentes responsabilités de la classe initiale en **plusieurs classes cohérentes**, chacune ayant un rôle précis.

### Bénéfices
- Meilleure lisibilité du code
- Respect du SRP
- Code plus modulaire et évolutif
- Tests plus simples

---

## Exemple (résumé)
Avant refactoring :
- Une seule classe gère données, calculs et affichage.

Après refactoring :
- Une classe pour les données
- Une classe pour la logique métier
- Une classe pour l’orchestration

---

## Conclusion
Le code smell **Large Class** est fréquent dans les projets réels.  
Son identification et sa correction par **Extract Class** permettent d’améliorer significativement la qualité du code sans modifier son comportement fonctionnel.
