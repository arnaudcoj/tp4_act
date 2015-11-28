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
si tmp n'est pas null
	ajoute tmp à l2
retourne l2

Parce qu'on considère que l'aléatoire est bien aléatoire, du co


2.
Il s'agit de vérifier avec notre algorithme que le certificat générée est valide ou non


3)1. un certificat peut prendre n! valeurs

2. Nous proposons l'ordre lexycographique

3. On génère chaque certificat, pour chacun d'entre eux on vérifie que la longueur de la tournée est inférieur à la valeur demander, si c'est le cas on l'ajoute sinon on vérifie le certificat suivant.
A la fin on vérifie que la liste de solution n'est pas vide et si c'est le cas c'est qu'il y a une solution au problème.
