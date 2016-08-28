`Common` pkg contains all commonly used functions

`Box`, `Jive` are separate adoptions. If `Box` is packaged into final jar, 
the fat jar will have the ability to handle `Box` events, same is true of `Jive`

`Launcher` is nothing but a start module, we cannot add box, jive dependency to root pom.xml,
 for that it will bring cyclic dependency error.