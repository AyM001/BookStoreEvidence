# BookStoreEvidence Instructiuni :


Cloneaza proiectul local.

Conecteaza-te la o baza de date ( eu am folosit mySQl ) , si seteaza proprietatile acesteia in applicationProperties ( port , nume .. etc)

Deschide Postman si creeaza requestu-uri pentru fiecare endpoint pe care il vrei sa il testezi din clasa BookController.
O sa avem nevoie de : 
 - 1 endpoint pentru metoda de adaugare de carti                      POST
 - 1 endpoint pentru metoda de returnare a tuturor cartilor            GET
 - cate un endpoint pentru fiecare cerinta custom implementata          GET
 
 1. In request-ul de adaugare trebuie adaugat un JSON , am implementat deja un model pt o folosire mai usoara :  
 
 {
        "name": "Luceafarul",
        "description": "Nice",
        "releaseYear": 2000,
        "authorModel": {
            "name": "Eminescu"
        },
        "publisherModel": {
        "name": "PublisherAnonimus"
     },
        "fieldModel":  {
        "name": "Romance"
    }
}  
 
 , Id- ul este generat automat pentru fiecare obiect si nu este vizibil decat in baza de date.
 
 2. Apeleaza request-ul de returnare pentru a vedea ce ai adaugat.
 3. Creeaza cate un endpoint pentru fiecare request si apeleaza-l in Postman dupa parametri dati in Controller.
 
 Pana acum am acoperit cerintele generale ale proiectului.
 
 Pentru cerintele optinale ale proiectului au fost implementate dupa cum urmeaza:
 
 - Pentru parcurgerea listelor , am folosit lamdas in loc de Iterator deoarece este acelasi rezultat cu o cantitate semnificativ mai mica de cod.
 - Pentru stocarea si returnarea datelor am folosit o baza de date relationala MySQL.
 - Pentru tratarea exceptiilor am creat o exceptie custom pe care am aruncat-o si am tratat-o in scopul acestei cerinte.
 In momentul in care flow-ul va trece prin exceptia respectiva , va rog sa verificati consola pentru a vedea mesajul aruncat in tratarea exceptiei , 
 pentru asta puteti folosii endpoint-ul de returnarea a cartilor scrise de un autor dat.
 
 - Cu parere de rau , timpul nu mi-a permis sa ma ocup si de interfata grafica.
