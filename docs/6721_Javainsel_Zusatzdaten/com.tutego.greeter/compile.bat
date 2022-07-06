rmdir /s /q lib
mkdir lib
javac -d bin src\module-info.java src\com\tutego\insel\greeter\Greeter.java
jar --create --file=lib/com.tutego.greeter@1.0.jar --module-version=1.0 -C bin .
jar --describe-module --file=lib/com.tutego.greeter@1.0.jar
