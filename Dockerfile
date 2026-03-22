FROM maven:3.8.4-openjdk-17

WORKDIR /app

COPY . .

RUN mvn test

CMD ["mvn", "test"]