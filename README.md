# tdl-cucumber-one
A test project to try BDD. Here, on top of the usual Selenium and TestNG, we use Cucumber. Feature files are written in Gherkin, step definitions are in Java.
## Website under test
www.automationexercise.com
## Useful commands
### Running XPath in the Chrome console
```
document.evaluate("//h2[contains(., 'All Products')]", document, null, XPathResult.ANY_TYPE, null).iterateNext()
```
