# Introduction
The following project is aimed at a tutorial on JAVA showing referred books and source code.
It consists of some sample code, which can then be compiled and packed using maven
The default is a very old old version and depends on ant-contrib v 1.0b2 (1.03 has severe issues and breaks the script!)

Use these files as base and extend to update them as per requirements of assignment/project. 

## Source Index (NB: WILL KEEP BEING UPDATED) 
|Directory                             |Description                                  |
|--------------------------------------|---------------------------------------------|
|helloworld                            |The basic Hello world                        |
|thebasic                              |primitive data types, expressions and loops. |
|stringsandarrays                      |Strings and Arrays                           |
|classes_inheritance_super             |Information on Classes and Inheritance       |
|enums_static_and_fun_stuff            |Enum and Statics                             |
|classes_inner_static_anonymous_demo   |Misc. Class stuff                            |
|designpatterns                        |This is still work in progress               |
|utilities                             |Common Source for All utility function       |
|jdbc                                  |Getting Started with JDBC                    |
|daopatterns                           |DAO, JDBC. DAO Patterns & Basic Collections  |
|Collections                           |ArrayList,HashMap/Table, Double LinkedList   |
|generics                              |Sample Stack implmenentation                 |
|exceptions                            |Exceptions                                   |
|threads                               |Threads                                      |

## Required Software
* Maven 
* ANT 
* Java (preferrably JDK 7+)
* PMD (Optional - if not installing it, remove references to PMD in Ant build files)
* Cobertura (Optional, but highly recommended)
* Eclipse or any semi-decent Java IDE. 


### Installing PMD
* Download PMD from https://github.com/pmd/pmd/releases/download/pmd_releases%2F5.4.0/pmd-bin-5.4.0.zip (NB: Update links as required) 
* Unzip file to c:\apps\pmd (NB: Update Build.properties accordingly) 
* Set System Variable PMD_HOME to c:\apps\pmd

### Installing Maven
* Download MAven and unzip to a folder
* set MAVEN_HOME to name of folders where it was unzipped. 

### Installing ANT
* Download MAven and unzip to a folder
* set ANT_HOME to name of folders where it was unzipped. 

### Additional config 
* download and copy following files to %ANT_HOME%\lib folder 
 * sonarqube-ant-task-2.4.jar
 * ant-contrib.jar  (Download from from http://sourceforge.net/projects/ant-contrib/files/ant-contrib/ant-contrib-1.0b2/ (Do not use 1.0b3))
 * maven-ant-tasks-2.1.3.jar
* Adjust paths in build.xml/build.properties as per your local configuration

