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

==========================
2  Réductions polynomiales

Q4.1)
  TSP renvoie les plus petit des cycles hamiltoniens possibles. La principe de HamiltonCycle est de trouver un cycle hamiltonien, quelqu'il soit. Ainsi, nous pouvons utiliser TSP, sans nous soucier de la taille du cycle, pour résoudre HamiltonCycle. HamiltonCycle se réduit donc polynomialement dans TSP sans modifier la donnée.

Q4.3)
  TSP est NP-Red

Q4.4)
  Non car la taille du cycle est prise en compte pour la résolution de TSP et que HamiltonCycle ne renvoie pas forcément le plus petit.

Q5.
  Les conditions pour que HamiltonCycle soit vraie sont D[ham(i)][ham(i + 1)] = true et D[ham(i)][0] = true, pour tout 0 <= i <= n-2.
  HamiltonPath ne connait qu'une condition comprise dans HamiltonCycle : D[ham(i)][ham(i + 1)] = true, pour tout 0 <= i <= n-2.
  Résoudre HamiltonCycle revient à résoudre HamiltonPath en rajoutant un sommet vers lequel tous les points convergent et qui mène à tous les sommets afin de transformer un éventuel chemin en cycle.
