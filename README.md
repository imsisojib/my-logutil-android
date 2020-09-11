# my-logutil-android
MyLogUtil project is a self-leanring project to learn how Android Library module work through dependency. And trying to learn documentation formationg.

###Dependency
***
**Step 1.** Add the JitPack repository to your root build.gradle at the end of repositories:<br>

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

**Step 2.**  Add the dependency

```
dependencies {
	        implementation 'com.github.imsisojib:my-logutil-android:1.0.0'
	}
```

###Usages
Now it's only available for Debug mode in  `Java` code.
***
>MyLogs.print("Hello World");

###Output
Find the debug log with text `MY-LOGS` in your concole.
***
>2020-09-11 13:50:55.295 29904-29904/com.imsisojib.mylogutil D/MY-LOGS: Hello World

###License
***

```
MIT License

Copyright (c) 2020 MD SIRAJUL ISLAM SOJIB

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





