set projectLocation=C:\Users\tannu.sharma\eclipse-workspace\Task8\src\test\java\amazon_task07
cd %projectLocation%
set classpath=%projectLocation%;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\pom.xml
pause