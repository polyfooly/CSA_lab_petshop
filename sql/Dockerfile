FROM postgres:9.3
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD password
ENV POSTGRES_DB testdb
COPY CreateDB.sql /docker-entrypoint-initdb.d/
