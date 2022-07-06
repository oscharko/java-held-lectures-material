rmdir /s /q lib
mkdir lib
javac -d bin --module-path ..\com.tutego.greeter\lib src\module-info.java src\com\tutego\insel\main\Main.java
jar -c -f=lib/com.tutego.main@1.0.jar --main-class=com.tutego.insel.main.Main --module-version=1.0 -C bin .
java -p lib;..\com.tutego.greeter\lib -m com.tutego.main