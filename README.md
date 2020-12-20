# TimeAllocator - smart calendar
### Simple calendar map created with Java and using database

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
App for storing com.github.AndrzejKieler.domain like tasks, project, events or deadlines for specified date with various extra information, like priority, custom labels, repetition period etc.
For the snapshot version com.github.AndrzejKieler.domain are serialised to flat file, but it future it will be connected to database using Hybernate framework.
	
## Technologies
Project is created with:
* Java version: 15
* Lombok version: 1.18.12
	
## Setup
Project uses maven wrapper for build.

```
1| ./ cd ../TimeAllocator
    If you use Windows system run following script:
2| ./ mvnw.cmd clean install
    If you use Unix system run following script:
2| ./ mvnw clean install

```
<!-- 
    TODO
   * update frameworks
   * update build instruction
   * follow https://www.flynerd.pl/2018/06/jak-napisac-dobre-readme-projektu-na-githubie.html
--> 