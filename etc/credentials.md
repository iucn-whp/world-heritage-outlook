#LIVE

##SSH
`ssh  -i ~/.ssh/rmsikey.pem ubuntu@54.246.114.83`

##DB

`jdbc.default.username=postgres`

`jdbc.default.password=iucn@1234`

`jdbc.default.url=jdbc:postgresql://localhost:5432/iucn_whp`

###DB dump

`pg_dump -U postgres iucn_whp > iucn_whp.sql`

###Download dump

scp -i ~/.ssh/rmsikey.pem ubuntu@54.246.114.83:/home/ubuntu/iucn_whp.sql.zip .

scp -i ~/.ssh/rmsikey.pem ubuntu@54.246.114.83:/home/ubuntu/liferay-portal-6.1.1-ce-ga2/data.tar.gz .


#DEMO

##SSH

`ssh -i ~/.ssh/lilo.pem ubuntu@ec2-52-34-48-63.us-west-2.compute.amazonaws.com`

##DB

`jdbc.default.username=postgres`

`jdbc.default.password=postgres`

`jdbc.default.url=jdbc:postgresql://localhost:5432/iucn_whp`

###Retore DB dump

`psql -U postgres iucn_whp < iucn_whp.sql`




###Set 'test' DB password
`update user_ set password_ = 'qUqP5cyxm6YcTAhz05Hph5gvu9M=' WHERE emailaddress = 'alok.sen@rmsi.com';`

###Users
*alok.sen@rmsi.com / test*

*elodie@lilo.co.uk / Password01*

###File upload

`scp -i ~/.ssh/lilo.pem /home/vitaliy/Work/Liferay/6.1.1/lilo/liferay-portal-6.1.1-ce-ga2/deploy/* ubuntu@ec2-52-34-48-63.us-west-2.compute.amazonaws.com:/home/ubuntu/deploy/30-May-2016`

scp -i ~/.ssh/lilo.pem /home/vitaliy/Work/Backup/Lilo/live/* ubuntu@ec2-52-34-48-63.us-west-2.compute.amazonaws.com:/home/ubuntu/backup/live



