@echo off
setx DB_USERNAME "postgres"
setx DB_PASSWORD "123456789"
setx DB_URL "jdbc:postgresql://localhost:5432"
setx DB_AUTH_SERVICE_NAME "Micro_AuthServiceDB"
setx DB_JPA_DIALECT "org.hibernate.dialect.PostgreSQLDialect"