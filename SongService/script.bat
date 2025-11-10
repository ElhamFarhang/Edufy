@echo off
echo Stopping songservice
docker stop songservice
echo Deleting container songservice
docker rm songservice
echo Deleting image songservice
docker rmi songservice
echo Running mvn package (skips tests)
call mvn package -DskipTests
echo Creating image songservice
docker build -t songservice .
echo Creating and running container songservice
docker run -d -p 8905:8080 --name songservice --network edufy_network songservice
echo Done!