#JAVA Installation on Sever

## 1. Upload JDK to server

`scp -i ~/.ssh/lilo.pem /home/vitaliy/Work/Backup/Lilo/jdk1.7.0_13.tar.gz   ubuntu@ec2-52-34-48-63.us-west-2.compute.amazonaws.com:/home/ubuntu/backup`

## 2. Unpack JDK archive

`tar xf jdk1.7.0_13.tar.gz`

## 3. Crate symbolic links


`cd /usr/bin/`

`ls -al | grep java`

`rm -Rf *java*`

`sudo ln -s /home/ubuntu/java/jdk1.7.0_13/bin/java java`

`sudo ln -s /home/ubuntu/java/jdk1.7.0_13/bin/javac javac`

`sudo ln -s /home/ubuntu/java/jdk1.7.0_13/bin/javaws javaws`

## 4. Check java 

`ubuntu@ip-172-31-17-147:~$ java -version`

`java version "1.7.0_13"`

`Java(TM) SE Runtime Environment (build 1.7.0_13-b20)`

`Java HotSpot(TM) 64-Bit Server VM (build 23.7-b01, mixed mode)`







