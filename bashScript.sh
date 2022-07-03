#/bin/bash


echo "STEP 1: docker-compose-camunda-gradle-kotlin clonning"
git clone https://github.com/MaASemenycheva/docker-compose-camunda-gradle-kotlin.git

echo "STEP 2: docker-compose-camunda-gradle-kotlin dockerfile building"
DB_SERVER_NAMES=localhost
DS_PORT_NUMBERS=5432
DS_DATABASE_NAME=dcdb
DS_USER=tu_ma_db_migration
DS_PASSWORD=password
DS_SCHEMA=migration
cd ./docker-compose-camunda-gradle-kotlin
docker build --build-arg DB_SERVER_NAMES="$DB_SERVER_NAMES" --build-arg DS_PORT_NUMBERS="$DS_PORT_NUMBERS" --build-arg DS_DATABASE_NAME="$DS_DATABASE_NAME" --build-arg DS_USER="$DS_USER" --build-arg DS_PASSWORD="$DS_PASSWORD" --build-arg DS_SCHEMA="$DS_SCHEMA" -t lk .
echo "STEP 3: docker-compose-camunda-gradle-kotlin docker-compose running"
docker-compose up