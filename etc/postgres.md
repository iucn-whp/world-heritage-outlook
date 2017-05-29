#POSTGRESS

##Installation

###Info link

http://www.postgresql.org/download/linux/ubuntu/

###Add repository

Create the file /etc/apt/sources.list.d/pgdg.list, and add a line for the repository

deb http://apt.postgresql.org/pub/repos/apt/ precise-pgdg main

Import the repository signing key, and update the package lists

wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | \
  sudo apt-key add -

sudo apt-get update

###Install Postgres

`apt-get install postgresql-9.4`



##Configuration

###Change 'postgres' password

`sudo -u postgres psql`

`ALTER USER "postgres" password 'postgres';`

`\q`

###Change password encryption method

`cd /etc/postgresql/9.4/main`

`sudo nano pg_hba.conf`

replace **'peer'** with **'md5'**

`sudo /etc/init.d/postgresql restart`


##Create database

`psql -U postgres`

`create database iucn_whp;` - create database;

`\l` - list of databases

`\c iucn_whp` - connect to DB

##Restore dump 

`psql iucn_whp -U postgres < iucn_whp.sql`