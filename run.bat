set projectLocation=C:\Users\91984\eclipse-workspace\Selenium\Practice4
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testing.xml