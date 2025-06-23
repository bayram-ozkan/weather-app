# Temel image olarak OpenJDK 21 kullanıyoruz
FROM eclipse-temurin:21-jdk-alpine

# Uygulama dizinini oluştur
WORKDIR /app

# JAR dosyasını container'a kopyala
COPY target/*.jar app.jar

# Uygulamayı çalıştır
ENTRYPOINT ["java", "-jar", "app.jar"]
    