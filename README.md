Sample code to store data in Azure Cache for Redis


1) Go to portal and create a Azure Cache Redis container.


2) I disabled non SSL port which was default port of Redis 6379. Hence port number for me is 6380


3) Create a quickstart maven project and update pom.xml accordingly.


4) Replace your hostname in REDIS_HOST and password(Access keys->Copy Primary) in REDIS_PASSWORD in the code.

5) Run the code and you can see the output, you can also go to the console of Redis host by clicking on console in the overview page.

6) In console you can type **get Message**. Here Message is the key where we stored the data/cache. 
