# ChaosMicroservice
This microservice helps to trigger chaostoolkit experiment from any third party application / machine. 

You can import it to Eclipse and build with goal : clean install package 
Once you have done that , you will get the jar file inside target location of the project . 

Then you can simply start the micro service from a power shell where you have configured chaostoolkit by running : java -jar Micro-0.0.1-SNAPSHOT.jar  ( or any name which you have given ) . 

Result : Your microservice will be up and you can call it from jenkins with Invoke-RestMethod -Uri http://localhost:8249/api/users/milan/chat based on the URI . Here i have used a powershell plugin in jenkins and called the same from powershell prompt in jenkins . 


