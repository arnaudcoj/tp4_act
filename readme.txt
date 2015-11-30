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

3 Optimisation versus Décision

Q7.
  TSP est plus simple que TSPOpt1. En effet, alors que TSP se contente de chercher une longueur inférieure ou égale au l donné, TSPOpt1 cherche le plus petit l possible, ce qui peut prendre plus d'itérations que pour TSP.
  TSPOpt1 étant P et TSP étant moins "exigeant", ce dernier est donc P.

  TSPOpt2 fonctionne de la même manière que TSPOpt1, à ceci près qu'il renvoie la plus petite tournée possible au lieu de sa longueur.
  Ainsi par transitivité, TSP est P si TSPOpt2 est P également.

Q8.
  Un exemple d'implantation de TSPOpt1 pourrait être une sorte de recherche dichotomique :
    lmax = longueur maximale possible (on peut l'obtenir en additionnant toutes les distances dans la matrice)
    lmin = 0
    Tant que lmin < lmax
      l = lmax / 2
      Si(TSP(l))
        lmin = l + 1
      sinon
        lmax = l - 1

  La longueur maximale est calculée en O(n²) car on parcourt toute la matrice. Le nombre d'appels à TSP est log(maximum des distances) (car dichotomie) et est donc limité. TSP étant P, alors TSPOpt1 est P.

Q9.
  On utilise TSPOpt1 pour déterminer la longueur minimale.
  Il suffit ensuite de coder un algorithme identique à TSP (que l'on considère P) mais qui renvoie cette fois-ci le parcours trouvé au lieu de renvoyer Oui.
