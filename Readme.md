Для взаимодействия с бд postgres спользую docker контейнер:
docker run --name pg -p 5432:5432 -e POSTGRES_PASSWORD=123 -d postgres:12.4-alpine

docker из jar в терминале
docker build -t name .
docker run --name nameCont -p 8080:8080 -e -d name