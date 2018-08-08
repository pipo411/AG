# AG
**Deploy a java application with Docker**

It’s an easy way to deploy, run, and manage applications using vm-like containers that are independent of elements like hardware and language, which makes these containers highly portable. And it’s all the rage.

So how do you deploy Java apps using Docker? You’re in the right place. I’ll walk through the process step by step – from installing Docker, to installing Java inside a Docker container, to deploying and running an app.

Docker supports just about any OS you’d care to use:

**•Linux.**

**•Mac.**

**•Windows.**

**•Windows Server.**

**•AWS.**

**•Azure.**

In order to do the deploy we need the following requirements:

**•Install Docker.**

**•Install java inside docker.**

**Steps:**
**1- Create a directory by using below command.**

     `$ mkdir  java-docker-application`

**2- Create a java class and save this as Sample.java file inside the directory**
     
     java-docker-application as Sample.java

**3- Create a Dockerfile**

   The dockerfile does not contain any file extension. Please save it simply with a Dockerfile name.
```
FROM java:8
   COPY . /var/www/java 
   WORKDIR /var/www/java 
   RUN javac Sample.java 
   CMD ["java", "Sample"]
```

**4- Building a Docker Image**
   Now, create an image by following the command below. In order to create an image, we must log in as root. In this example, we have switched to a root user. In the following command, java-application is the name of the image. We can have any name for our docker image.

    $ docker build -t java-application

The output is shown below:

```
[root@xyz java-docker-app]# docker build -t java-application .
  Sending build context to Docker daemon 3.072kB
  Step 1/5 : FROM java:8
  ---> d23bdf5b1b1b
  Step 2/5 : COPY . /var/www/java
  ---> Using cache
  ---> c34d8257c2c6
  Step 3/5 : WORKDIR /var/www/java
  ---> Using cache
  ---> 1c620a43fe4e
  Step 4/5 : RUN javac Sample.java
  ---> Using cache
  ---> b0d9d44eead7
  Step 5/5 : CMD java Sample
  ---> Using cache
  ---> 474c196d8cc1
  Successfully built 474c196d8cc1
  Successfully tagged java-application:latest
  ```
  
After making a successful image build, we are now ready to run our docker image in the next step.

**5- Run Docker Image**

Now we are going to run docker by using the following run command.

      `$ docker run java-application`

The output from the above command is as shown.
```
  [root@xyz java-docker-app]# docker run java-application
  This is java application
  by using Docker
  ```

Now, the docker image ran successfully. Apart from all these, you can also use other commands as well.


