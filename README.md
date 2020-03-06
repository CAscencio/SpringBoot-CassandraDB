# spring-boot-cassandra
SpringData Cassandra Repositories | SpringBoot

# STEP
# 1.Download & Install Cassandra from below link                                             
http://downloads.datastax.com/community/datastax-community-64bit_3.0.9.msi
# 2.	Now Go to C:\Program Files\DataStax Community\apache-cassandra\bin  Run bat file to 
cassandra.bat
# 3.Open Cassandra CQL Shell to create Cassandra table & Schema
# 4. Create Cassandra keyspace with name javatechie like below                      
create keyspace javatechie with replication={'class':'SimpleStrategy', 'replication_factor':1}
# 5. Create table for javatechie keyspace:
Use javatechie; 
CREATE TABLE User(
   id int PRIMARY KEY,
   name text,
   address text,
   age int
);

We are done with Table creation and environment setup now follow above code for development

