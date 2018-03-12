# Petsa
A simple library for formatting Date from and to a given format in Android.


# Gradle configuration
First, you need to add this gradle configuration in your `build.gradle` file.

```gradle
repositories {
    jcenter()
}

...

dependencies {
    ...
    compile 'me.darwinlouistoledo:petsa:1.0'
    ...
}

```

# Usage

Here are sample usage of the library. The `fomat()` method will return a String result.

```java
Petsa.with(new Date())
     .toFormat("MM/dd/yyyy").format();

```

```java
Petsa.with(System.currentTimeMillis())
     .toFormat("dd/MM/yyyy HH:mm")
     .format();
```

```java
Petsa.with("03/09/2018")
     .fromFormat("MM/dd/yyyy")
     .toFormat("MMMM dd, yyyy")
     .format();
```

```java
Petsa.with(System.currentTimeMillis())
     .toFormat("hh:mm aa")
     .format();
```

```java
Petsa.with(System.currentTimeMillis())
     .toFormat("MMMM dd, yyyy hh:mm aa")
     .locale(Locale.JAPAN)
     .format();
```

Remarks
------------
Any suggestions are welcome to improve the implementation. Will make some improvements and additional formatting support in the future releases.


License
------------
```
MIT License

Copyright (c) 2018 Darwin Louis Toledo

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
