c:
cd %userprofile%\.m2\repository\org\seleniumhq\selenium\selenium-server-standalone\2.53.0
java -jar selenium-server-standalone-2.53.0.jar -role hub http://localhost:4444/grid/register -hubConfig %userprofile%\git\Selenium\src\ex13\grid_hub.json
cmd /k