Coverage: 50.9%
# Inventory Management System (IMS) Project

The aim of the IMS project is to build an application that an end user can interact with via a Command-Line Interface (CLI). The technological tools used for creating this IMS project were:

•	Version Control System: Git

•	Source Code Management: GitHub

•	Kanban Board: Jira

•	Database Management System: MySQL Server 5.7+ (local or GCP instance)

•	Back-End Programming Language: Java

•	Build Tool: Maven

•	Unit Testing: JUnit


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

I used Jira to plan my project 

https://tasnima23.atlassian.net/jira/software/projects/IMS/boards/1/backlog

### Prerequisites

What things you need to install the software and how to install them

```
Eclipse IDE for Java Developers 
•To install this, you need to click on this link http://www.eclipse.org/downloads

JAVA - Java SE Development Kit 
•To install this, you need to click on this link https://www.oracle.com/uk/java/technologies/javase/javase-jdk8-downloads.html

Database - MySQL 
•To install this, you need to click on this link https://dev.mysql.com/downloads/windows/installer/8.0.html


Maven - Apache Maven 
• To install this, you need to click on this link https://maven.apache.org/download.cgi?Preferred=ftp://ftp.osuosl.org/pub/apache/
```

### Installing

A step by step series of examples that tell you how to get a development env running

Following the installation of the software, I created a database in the local mySQL server

• Open up the mySQL workbench application

• Select Local instance mySQL under MySQL Connections

• Enter the credentials

• Open a new file for the IMS Project 

• Create a new database called 'ims'

```
DROP SCHEMA IMS;
CREATE DATABASE IF NOT EXISTS IMS;
USE IMS;
```

Also open up Eclipse IDE for Java Developers and check the pom.xml file 
Save the SQL database into the folder where your IMS Project is saved in Eclipse

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

To ensure the system is working correctly for all the CRUD functionalities, you need to right click on the runner and click on Run As >> Java Application
This will print commands in the console and you should be able to choose what entity you would like to select from the database


### Unit Tests 

There should be tests created for each class. These tests for my IMS project were 

• CustomerTest

•ProductTest

•OrderTest

•Order_itemTest

•CustomerDAOTest

•ProductDAOTest

•OrderDAOTest

•Order_itemDAOTest

•CustomerControllerTest

•ProductControllerTest

•OrderControllerTest

•Order_ItemControllerTest

JUnit is an open source unit testing for Java. To run these tests, you need go on the test you wish to run and then right click and click on Run As >> JUnit Test
To see the coverage of the test, you need to right click and click on Coverage As >> JUnit Test
 
```
@Test
	public void testCreate() {
		final Customer created = new Customer(2L, "chris", "perrins");
		assertEquals(created, DAO.create(created));
	}
```

Mockito is an open source testing framework. It allows the creation of mock objects in automated unit tests. 

```
@Test
	public void testCreate() {
		final String Product_name = "GTA 5";
		final Double Product_cost = 32.90;
		final Products created = new Products(Product_name, Product_cost);

		Mockito.when(utils.getString()).thenReturn(Product_name);
		Mockito.when(utils.getDouble()).thenReturn(Product_cost);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(dao, Mockito.times(1)).create(created);
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
