# Genie logiciel - Seance 2 Cas 1
Par Quentin MELIS, Alicia MARITANO, Nicolas DEKETELE-KESTENS & Rémy HENDRICE

## Solution 2
Exporter le type de chargement en propriété de classe Phone et faire en sorte que le chargeur charge différement selon cet attribut.
De plus, le chargeur n'a pas besoin de connaître le téléphone à sa création, seulement au moment de charger le téléphone.

### Avantages
- Moins de répétition de code
- Plus besoin de créer une classe pour chaque type de téléphone
- Responsabilité du chargement relayée au StandardCharger
- Pour gérer un cas en plus, il suffit de rajouter un case au switch

### Désavantage
- Restructuration & modificiation du code => risque fort de casser le code déjà existant