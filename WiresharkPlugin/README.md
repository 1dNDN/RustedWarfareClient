# How to install

1. Install the [Wireshark](https://www.wireshark.org/#download)
2. Put the [Wireshark Generic Dissector](http://wsgd.free.fr/download.html) into global or personal plugins folder (they are specified into Help/About Wireshark/Folders). If there is an epan sub-directory into the choosen folder, put the dll/library in it instead.
3.1 Execute in powershell as administrator `Set-ExecutionPolicy RemoteSigned`  
3.2 Execute `createhardlink.ps1`
4. Restart Wireshark
