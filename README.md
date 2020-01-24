# MavenPluginTester
Repo for studying some maven plugins

Format code
```bash 
mvn com.coveo:fmt-maven-plugin:format
```
Check format
```bash
mvn fmt:check
```
Sort pom
```bash
mvn sortpom:sort
```
Check sort
```bash
mvn sortpom:verify
```
Pmd code analysis
```bash
mvn pmd:pmd
```
Code lint
```bash
mvn checkstyle:checkstyle
```
SpotBugs
```bash
mvn spotbugs:check
```
SonarCloud
```bash
mvn verify sonar:sonar
```
