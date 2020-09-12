# my-logutil-android
MyLogUtil project is a self-leanring project to learn how Android Library module work through dependency. And trying to learn documentation formationg.

### Steps to create Android Library Module:
I have learnt from [Levi Bostian](https://youtu.be/RYiZZprUNJw "Youtube Channel Link") youtube video tutorial.
***
**Step-1** Create a sample android project.<br>
**Step-2** Add a Android Library to your project.<br>
>File>New>New Module>Android Library

give name your module. Like I have name here `logutil`

**Step-3** Now create a Java class in your module java directory. In my case:

>logutl/java/com/imsisojib/logutil/MyLogs

**Step-4** Now create a `static` method into MyLogs.class to call it from other projects. In my case:
```Java:
public class MyLogs {
    public static final String TAG = "MY-LOGS";
    public static final String DATA_PERSISTENCE_ERROR = "DATA PERSISTENCE ERROR";

    public static void print(String message){
        Log.d(TAG,message);
    }

}
```
**Step-5** Now create a repository in [Github](https://github.com/ "Github") and `push` your android sample project which you have created.
**Step-6** Create a new `Release` for your github repository.
**Step-7** Now copy your repository link and go to [JitPack.io](https://jitpack.io/ "jitpack.io") and paste your repository in `git repo url` box and click to `Look Up`.

**Step-8** Hope there you will find your release version and select version to get the `Dependecy` implementation documentation. In my case i have added in below.

**Step-9** Use the given dependency link in your existing project and then you can see **logs** of gradle build status. Make sure you get `Build Successful` status then share your module to others.

**Lastly** You can add more module to your project and make their separate gradle dependency after creating new `release` for every time you add new mudule. You also add **Kotlin** version by adding **Kotlin Configuration** to your root level project or to each module. 

> Ctrl+Shit+A, will open up a search box. search for **Configure Kotlin in Project** , select and choose **Android with Gradle** then there you can apply kotlin for root level project or for single module which you like and `apply`.

It will configure kotlin in your module/root level project. Have a try... :) 


### Testing
***
To test the module before release, add the module to the project.
> Project Stucture>Dependencies> + Module Dependency (select your module name and apply)

after finishing gradle you can test your module from your root level android project. 


### Dependency
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

### Usages
Now it's only available for Debug mode in  `Java` code.
***
>MyLogs.print("Hello World");

### Output
Find the debug log with text `MY-LOGS` in your concole.
***
>2020-09-11 13:50:55.295 29904-29904/com.imsisojib.mylogutil D/MY-LOGS: Hello World

### License
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





