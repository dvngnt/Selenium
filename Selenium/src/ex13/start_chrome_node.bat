c:
cd %userprofile%\.m2\repository\org\seleniumhq\selenium\selenium-server-standalone\2.53.0
java -jar selenium-server-standalone-2.53.0.jar -role node -nodeConfig %userprofile%\git\Selenium\src\ex13\chrome_node.json -Dwebdriver.chrome.driver=%userprofile%\.m2\repository\webdriver\chromedriver\win32\2.22\chromedriver.exe