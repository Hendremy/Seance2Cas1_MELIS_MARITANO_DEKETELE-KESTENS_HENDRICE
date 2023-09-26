## Genie logiciel - Seance 2 Cas 1
Par Quentin MELIS, Alicia MARITANO, Nicolas DEKETELE-KESTENS & Rémy HENDRICE

# Situation de départ


## Solution 1
Pour pouvoir faire charger le USBCSmartphone ou n'importe quelle autre téléphone, il faudrait que leurs méthodes de chargement puisse être appelée sans connaître leur classe concrète. 
Pour ce faire, on peut faire en sorte que USBCSmartphone hérite de l'interface Chargeable. Ainsi, le StandardCharger peut le faire charger.

# Avantages 
- Solution naturelle, simple
- Pas trop de modification de code à effectuer

# Inconvénient
- Chaque téléphone définit sa manière de charger, par rapport à SRP, ce n'est pas la responsabilité d'un téléphone de se charger lui-même
- Devoir créer une classe de téléphone pour chaque différent type de port de chargement

## Solution 2
Exporter le type de chargement en propriété de classe Phone et faire en sorte que le chargeur charge différement selon cet attribut.
De plus, le chargeur n'a pas besoin de connaître le téléphone à sa création, seulement au moment de charger le téléphone.

# Avantages
- Moins de répétition de code
- Plus besoin de créer une classe pour chaque type de téléphone

# Désavantage
- Restructuration & modificiation du code => risque fort de casser le code déjà existant