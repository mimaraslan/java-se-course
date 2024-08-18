@echo off


setx DB_USERNAME "postgres"
setx DB_PASSWORD "123456789"
setx DB_URL "jdbc:postgresql://localhost:5432"
setx DB_AUTH_SERVICE_NAME "Micro_AuthServiceDB"
setx DB_JPA_DIALECT "org.hibernate.dialect.PostgreSQLDialect"
setx SERVICE_PORT 9090

setx DB_USER_PROFILE_SERVICE_NAME "micro_userprofileservicedb"

@REM Bu bir aciklama satitiridir. GitHub ayarlari
setx REMOTE_CONFIG_PATH_PROJECT "https://github.com/mimaraslan/config-server-remote-2024.git"
setx REMOTE_USERNAME "mimaraslan"
setx REMOTE_TOKEN_PASSWORD "KENDI_TOKEN_KODUNUZU_YAZINIZ"


