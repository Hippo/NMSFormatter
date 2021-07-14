# NMSFormatter

A very simple utility to format strings to conform the server version.

# Add NMSFormatter to your project
```groovy
repositories {
    maven {
      url 'https://jitpack.io'
    }
}
```
```groovy
dependencies {
    implementation group: 'com.github.Hippo', name: 'NMSFormatter', version: '1.0.0'
}
```

# How to use

```java
String version = NMSFromatter.SERVER_VERSION;
String nmsEntity = NMSFormatter.formatNMS("Entity");
String craftWorld = NMSFormatter.formatCraft("CraftWorld");
```