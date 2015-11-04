GROUPE 4
COJEZ Arnaud
LEPRETRE Rémy
TP4

1)  u = une instance du probleme
    c = certiticat
    A = algorithme qui vérifie que c est valide pour u
    Q = algorithme qui vérifie que la taille de c est polynomiale par rapport à la taille de c
un certificat est une instance de solution du probleme pas forcément valide

Pour l'implémentation nous utiliserons une liste contenant les villes dans l'ordre dans lequel l'itinéraire va les parcourire.

La taille d'un certificat seras donc égale à n (le nombre de villes) +1 , il est donc bien borné polynomialement par rapport à la taille de l'entrée

//////////////////////////algorithme de vérification/////////////////////////////

2) 1. 
l1 = liste contenant les villes de taille n
l2 = nouvelle liste contenant l'itinéraire
tmp = variable temporaire pour le dernier élément de l'itinéraire

si l1 non vide
    r = random(taille de l1)
    ajoute r à l2
    supprime r à l1
    tmp = r
fin si
tant que l1 non vide
    r = random(taille de l1)
    ajoute r à l2
    supprime r à l1
fin tant que
ajoute tmp à l2
retourne l2

Parce qu'on considère que l'aléatoire est bien aléatoire, du coup toutes les villes ont la même probabilité d'être tiré au même moment.

2.
Il s'agit de vérifier avec notre algorithme que le certificat générée est valide ou non
