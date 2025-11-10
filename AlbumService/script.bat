@echo off
echo Stopping albumservice
docker stop albumservice
echo Deleting container albumservice
docker rm albumservice
echo Deleting image albumservice
docker rmi albumservice
echo Running mvn package (skips tests)
call mvn package -DskipTests
echo Creating image albumservice
docker build -t albumservice .
echo Creating and running container albumservice
docker run -d -p 8906:8080 --name albumservice --network edufy_network albumservice
echo Done!