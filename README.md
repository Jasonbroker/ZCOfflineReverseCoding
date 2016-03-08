# ZCOfflineReverseCoding
Offline reverse coding using Geojson

inspired by https://github.com/Alterplay/APOfflineReverseGeocoding, which is a Objective C version.

Algorithm

http://www.ecse.rpi.edu/Homepages/wrf/Research/Short_Notes/pnpoly.html

HOW to use?
```java

Object obj = OffLineReverseCoding.quaryLocationInfoOffline(latitude, longitude, getApplicationContext());

```
returns an object Country or City, containing the infomation you need. : )

see demo for usage.

The demo project only contains infomation of GeoJson for china provinces and 180 countries in the world.
If you wanna parse another country, You need add a GeoJson file to assets.

If you have any questions, please ask me.
