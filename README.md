# TP_InjectionDesDependancePart2
C'est la même application de la patie 1, mais cette fois-ci on a utiliser Spring  
Les commandes maven à savoir :  
1 > mvn compile : demander à Maven de compiler le projet  
![image](https://user-images.githubusercontent.com/102111459/174482022-85a48c8c-349a-486b-acb6-fb1247c11bd2.png)  
2 > mvn test :(compris 1>) pour exécuter tous les tests unitaires; Le frimework pour effectuer des tests unitaires : JUnite  
Pour effectuer un test unitaire il suffit de créer une classe dans le dossier test/java  
Par exemple on va tester la méthode Calcul qui permet de faire la somme de deux nombres, pour le faire on va créer une classe : CalculTest dans laquelle on va créer une méthode appelée testSomme de type void dans cette méthode on va créer un sinario de test en précisant la classe à tester (dans notre cas c'est la classe Calcul), on suite on va créer un objet de type calcul, puis on fait appele à la méthode à tester et on donne les entrés et la sortie, finalement on utilise la méthode: Assert.assertTrue, n'oublier pas d'ajouter l'annotation @Test  
Si on execute CalculTest nous obtenons un symbole montrons bien que le test est réussi  
![image](https://user-images.githubusercontent.com/102111459/174481666-1d27193e-b039-4ad1-8e42-540ef79dcd46.png)  
Si le test ne passe pas on aura un résultat comme ceci:  
![image](https://user-images.githubusercontent.com/102111459/174481739-856b9d0d-6d01-42f5-be24-54e6c9685a8b.png)  
L'ensemble des tests peuvent être lancer d'un seul coup à l'aide de la commande mvn test  
Pour le faire dans la ligne de commande on tape : mvn test nous obtenons le résultat suivant:  
![image](https://user-images.githubusercontent.com/102111459/174481953-d4c34c59-14bd-4479-85dd-6707675ae8b1.png)  
3 > mvn package :(compris 2>)  => génére le package .jar : Java Archive contient une application Java, ou .war : Web Archive Pour l'application Web  
![image](https://user-images.githubusercontent.com/102111459/174482060-69300795-5a6b-426c-a09d-d2c35e43a340.png)  
4 > mvn install : (compris 3>) pour installer le package générer dans le repository Maven.  
![image](https://user-images.githubusercontent.com/102111459/174482083-f9e1b2cf-8aca-4d10-8c55-3a65d403436d.png)  
5 > mvn deploy  
6 > mvn site : pour generer un fichier Html contenant la documentation à l'aide de Java Doc  

