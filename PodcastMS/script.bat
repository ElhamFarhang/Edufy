@echo off
echo Stopping podcastms
docker stop podcastms
echo Deleting container podcastms
docker rm podcastms
echo Deleting image podcastms
docker rmi podcastms
echo Running mvn package (skips tests)
call mvn package -DskipTests
echo Creating image podcastms
docker build -t podcastms .
echo Creating and running container podcastms
docker run -d -p 9904:9904 --name podcastms --network edufy_network podcastms
echo Done!