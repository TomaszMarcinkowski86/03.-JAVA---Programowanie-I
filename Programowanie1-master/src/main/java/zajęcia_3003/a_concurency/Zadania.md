Zadanie
Stwórz 4 wątki dla każdego ustaw inne priority 1, 3, 5 ,10.
W każdym wątku odpal pętle która będzie liczyc do 10.
Przy każdej iteracji ustaw sleep na około 500 ms.
Przy każdej iteracji wyświetl która to itracja pętli i priority wątku.
 
Zadanie (*) 

Alice and Bob have a bunch of gnomes and minions that live with them. Use monitors to model the following problem:
There are 7 gnomes (each of which is a thread that should have a name - e.g. gnome1, etc.) and there are 10 minions (each of which is a thread that should have a name - e.g. minion1, etc.) - you should create the threads using an array.
The minions and gnomes are created in the morning and go to work. Before the minions and gnomes go to work Alice makes them lunch and kisses them on the head. Alice does this one at a time.
Each gnome that receives a lunch and kiss on the forehead says “Have a good day”; each minion that receives a lunch and kiss on the forehead says “Thank you Alice”. They can only leave one at a time; minions first and then gnomes. Minions work in a deli and gnomes work in the mines. (Let them sleep for a random amount of time to mimic their workday.)
Bob sleeps until all the minions and gnomes leave, whereupon Alice wakes him up. Bob then receives a lunch and a kiss on the forehead and goes to work as well - he works as an accountant.

Minions wait until all the minions return from work to knock on the door. They signal Alice with a knock, she opens the door, and they go play games. They enter the house based on who was waiting at the door longest; i.e. the first to get there will enter first.
All gnomes wait until they are all present and that the minions have gone in before they knock on the door and signal Alice; she opens the door and the gnomes go play outside. Gnomes enter the house based on the last to arrive going first, etc.
Bob only enters the house if all gnomes and all minions have already arrived. He lets himself in if that is the case.
Alice prepares dinner for everyone. The table only seats 5 at a time. Whoever would like can come and eat; when they finish, they go to bed and the next group comes to eat. This goes on until everyone has eaten.
The gnomes want to use the bathroom before going to sleep, each one must use the bathroom. Use a semaphore to only allow one of them in at a time.
Gnomes and minions take a random amount of time to fall asleep, once they do, their threads are finished.
Alice and Bob then go to read a book. If someone is in the room the lights automatically go on; if they both leave the room, the lights automatically go off. There are two seats on the couch which they use for a random interval and then go to sleep (i.e. the thread is done).

Use monitors unless otherwise specified.
Make sure to use the monitor on an object
Give some examples of using a monitor on this
Each time a thread is doing something, it should say what it is doing.
Every thread should have a name.
When doing something, such as working, a thread should sleep for a random amount of time.
You should use at least two queues in the program.
Make sure there is no deadlock or indefinite postponement in your program.
For reference you can look at the udemy course on multithreading, videos: 13,14,15,20,21