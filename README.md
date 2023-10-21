# Dev_mobile
Nom: MENDJEMEN YOUMBI
Prenom: Sonia Ivana


#  Fonctions ( Rapport ) 

Dans ce TP , nous avons retenu plusieurs notions qui sont :
* Comment utiliser les conditions if.. et when.. selon le cas de figure que nous avons en face de nous; 
*Les arguments par défaut éliminent le besoin de versions multiples d'une fonction ou d'une méthode. Par exemple *fun swim(speed : String = "fast") { ... }*;
*Les fonctions compactes, ou fonctions à expression unique, peuvent rendre notre code plus lisible. Comme par exemple *fun isSunday(day: String) = day == "Sunday"* que nous avons utilisé sur trois arguments dans la fonction *shouldChanWater()*; 
*Certaines notions de base sur les filtres, c'est à dire comment les filtres paresseux et impatient se comporte ainsi que l'utilisé des fonction séquence et map qui permettent de voir le processus de filtrage en fonction de la condition qui est imposé.


# TP 3 Classes et Objets ( Rapport)

Dans ce TP, nous avons abordés plusieurs notions liées aux classes et aux objets qui sont:
* Comment déclarer des constructors , car ses derniers nous permette de manipuler les propriétés de chaque classe sans toute fois rendre le code complexe comme par exemple le construtor de la classe aquarium qui prend trois paramètres;
* Comment utiliser des modificateurs de visibilité comme par exemple public, protected, private et internal qui sont employés dans différents de figures en fonction de notre besoin;
* Comment permettre qu'une classe possède des sous classes. Pour qu'une classe soit mère, on doit mettre 'open' devant sa déclaration comme par exemple *open class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {}*. La classe fille est capable de modifier les proprités de sa mère en mettant le péfixe 'override' ou juste pour hériter des propriétés de la classe mère;
* Comment déclarer et utiliser les classes abstraites, les interfaces et les délégation d'interface;
* Comment déclarer une classe de données qui se fait avec le préfixe 'data' et un singleton qui se comporte comme un objet car c'est une classe qui ne peut qu'avoir une seule instance comme par exemple *object GoldColor : FishColor {}* 
