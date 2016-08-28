### How to run
cd into Launcher module

run `mvn spring-boot:run`

### Notes
`Common` pkg contains all commonly used functions.

`Box`, `Jive` are separate adoptions. If `Box` is packaged into fat jar, 
the fat jar will have the ability to handle `Box` events(add new route `/box` to jar), 
same is true for `Jive`(this module is empty for now)

`Launcher` is nothing but a start module, we cannot add `box`, `jive` dependency to root pom.xml,
 for that it will introduce cyclic dependency error.
 
 In `Launcher`'s pom file, `box` and `common` dependencies are declared so `/box` and `/common` routes are
 added into web service.
 
### Question
Available adoptions are all added into fat jar in default. But in some situations,
only a portion of adoptions are needed, how to dynamically add/remove dependencies when packaging?

