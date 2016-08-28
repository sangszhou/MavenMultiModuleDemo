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

**Answer:** After searching around for a few hours I finally got the answer for this question and 
the Answer is put feature dependencies to profiles(see pom.xml in Launch module), 
if only want box feature, create a profile named `box` and put `box` dependency in it. The drawback of this answer is not flexible 
enough, I was expecting add/remove dependency controlled by argument of maven package. But
this solution is good enough for now, we need this capability but the situation actually use it is sparse.

under `Launch` module, `mvn clean package -Psamsung` will remove `box` dependency. If no profile is 
specified, default profile will be used.