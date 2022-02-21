Coverage: 80%
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
EXAMPLE
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

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

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
