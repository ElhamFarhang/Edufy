@echo off
echo Stopping edufypodseasonservice
docker stop edufypodseasonservice
echo Deleting container edufypodseasonservice
docker rm edufypodseasonservice
echo Deleting image edufypodseasonservice
docker rmi edufy-podcast-service
echo Running mvn package
call mvn package
echo Creating image edufypodseasonservice
docker build -t edufypodseasonservice .
echo Creating and running container edufypodseasonservice
docker run -d -p 8083:8080 --name edufypodseasonservice --network edufy_network edufypodseasonservice
echo Done!