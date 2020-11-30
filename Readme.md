#СИСТЕМА СБОРКИ MAVEN, АВТОТЕСТЫ НА JUNIT5

Программа **BonusService** рассчитывает бонус клиентам (лимит - 500).
Для зарегистрированных пользователей он рассчитывается по формуле: 

    bonus = amount * 3 / 100 / 100;   

Для незарегистрированных:

    bonus = amount * 1 / 100 / 100;
  
Также в программе создан автотест **BonusServiceTest**, который включает в себя фреймворк **jUnit.Jupiter**, подключенного с репозитория [Maven Central](https://mvnrepository.com/)

В проекте был сгенерирован файл **pow.xml** (Project Object Model), в которым были сделаны следующие изменения:
    
1. Изменена версия Java:
    
```java
    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <maven.build.sourceEncoding>UTF-8</maven.build.sourceEncoding>
    </properties>
```

2. Добавлена зависимость jUnit.Jupiter

```java
    <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.6.2</version>
            <scope>test</scope>
    </dependency>
```

