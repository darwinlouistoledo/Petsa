
# Petsa  
A simple and small library for formatting Date `from` and `to` a given format in Android.


## Gradle configuration
First, you need to add this gradle configuration in your `build.gradle` files.

```gradle
// on your root project build.gradle
repositories {
    jcenter()
}


// on your app/sub module build.gradle
dependencies {
    implementation 'me.darwinlouistoledo:petsa:1.3'
}

```

## Usage
  Here are sample usage of the library. The `fomat()` method will return a String result.

```java
//Sample Result in String: 06/20/2020
Petsa.with(new Date())
     .toPattern("MM/dd/yyyy")
     .format();
```
```java
//With the use of predefined date time pattern
//Sample Result in String: June 20, 2020 02:05 AM
Petsa.with(new Date())
     .toPattern(DateTimePatterns.COMPLETE_LONG_DATE_1)
     .format();
```

```java
//Sample Result in String: 20/06/2020 02:05
Petsa.with(System.currentTimeMillis())
     .toPattern("dd/MM/yyyy HH:mm")
     .format();
```

```java
//Sample Result in String: March 09, 2020
Petsa.with("03/09/2018")
     .fromPattern("MM/dd/yyyy")
     .toPattern("MMMM dd, yyyy")
     .format();
```
```java
//With the use of predefined date time patterns
//Sample Result in String: March 09, 2020
Petsa.with("03/09/2018")
     .fromPattern(DateTimePatterns.MEDIUM_DATE_1)
	 .toPattern(DateTimePatterns.LONG_DATE_2)
     .format();
```
```java
//With the use of predefined date time patterns
//Sample Result in String: 20/06/2020 02:39
Petsa.with(System.currentTimeMillis())
     .toPattern(DateTimePatterns.LONG_DATE_1)
     .format();
```

```java
//Sample Result in String: 02:05 AM
Petsa.with(System.currentTimeMillis())
     .toPattern("hh:mm aa")
     .format();
```

```java
//With the use of predefined date time patterns
//Sample Result in String: 02:05 AM
Petsa.with(new Date())
     .toPattern(DateTimePatterns.TIME_12H)
     .format();
```
```java
//With the use of predefined date time patterns
//Sample Result in String: 02:05
Petsa.with(new Date())
     .toPattern(DateTimePatterns.TIME_24H)
     .format();
```

```java
//Sample Result in String: 6月 20, 2020 02:05 午前
Petsa.with(System.currentTimeMillis())
     .toPattern("MMMM dd, yyyy hh:mm aa")
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