# How to install

1. Install the [Wireshark](https://www.wireshark.org/#download)
2. Put the [Wireshark Generic Dissector](http://wsgd.free.fr/download.html) into global or personal plugins folder (they are specified into Help/About Wireshark/Folders). If there is an epan sub-directory into the choosen folder, put the dll/library in it instead.
3. Execute
```
Start-Process powershell -Verb runAs
New-Item -ItemType HardLink -Path "C:\Program Files\Wireshark\plugins\4.0\epan\rustedwarfare.fdesc" -Target ".\WiresharkPlugin\rustedwarfare.fdesc"  
New-Item -ItemType HardLink -Path "C:\Program Files\Wireshark\plugins\4.0\epan\rustedwarfare.wsgd" -Target ".\WiresharkPlugin\rustedwarfare.wsgd"
```
 4. Restart Wireshark
