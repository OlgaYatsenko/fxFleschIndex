# fxFleschIndex
## Overview
Programm (using JavaFX) opens window where user can insert some text and the programm will calculate and display Flesch Index (which shows how easy to read text. More => [Wiki](https://en.wikipedia.org/wiki/Flesch%E2%80%93Kincaid_readability_tests)).

Program opens window to enter/type text:
![alt text](https://github.com/OlgaYatsenko/fxFleschIndex/blob/master/windowToEnterText.png "Logo Title Text 1")

After pressing the button "FleschIndex" the index is displayed for entered text:
![alt text](https://github.com/OlgaYatsenko/fxFleschIndex/blob/master/FleschIndexDisplayed.png "Logo Title Text 1")


## Requirements
Java 11
JavaFX

## How to run on Linux from Terminal
Download JavaFX [JDK 16](https://gluonhq.com/products/javafx/) for your operating system. Make sure JAVA_HOME is properly set to the JDK installation directory.

../fxFleschIndex

```
export PATH_TO_FX=/<path to fx>/openjfx-16_linux-x64_bin-sdk/javafx-sdk-16/lib
```
Compile

```
javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.graphics,javafx.base -d src src/application/*.java src/document/*.java
```
Run
 ```
cd src
```
 ```
 java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.graphics,javafx.base application.Main

```
