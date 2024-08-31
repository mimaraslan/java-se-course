# Uygulama için JDK lazım gerekli.
# FROM amazoncorretto:17
FROM openjdk:17

# Bizim projemizdeki JAR dosyamızın Docker içinde çalışacağı konum.
ARG JAR_FILE=target/*.jar

# JAR dosyasını bu isimle Docker'ın içine kopyala
COPY ${JAR_FILE} devops-application.jar

# terminal komutları için CMD kullanılır
CMD  apt-get update -y

# projenin çalışacağı iç port
EXPOSE 8080

# Uygulamanın çalışmasını sağlar.
ENTRYPOINT ["java","-jar","devops-application.jar"]



