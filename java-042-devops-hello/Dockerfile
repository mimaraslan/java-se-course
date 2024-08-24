# Uygulama için JDK gerekli
FROM amazoncorretto:21

# projede jar dosyasının bulunduğu yer
ARG JAR_FILE=target/*.jar

# jar dosyasını docker içinde en kök kısma kopyala
COPY ${JAR_FILE} application.jar

# linux güncelle
CMD apt-get update -y


# projenin iç portunu sabitle
EXPOSE 8080


# Docker içindeki jar dosyasını çalıştıran Java komutu
ENTRYPOINT ["java", "-jar", "application.jar"]



