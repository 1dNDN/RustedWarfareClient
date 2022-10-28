# How to install

1. Install the [Wireshark](https://www.wireshark.org/#download)
2. Put the [Wireshark Generic Dissector](http://wsgd.free.fr/download.html) into global or personal plugins folder (they
   are specified into Help/About Wireshark/Folders). If there is an epan sub-directory into the choosen folder, put the
   dll/library in it instead.
3. Execute in powershell as administrator `Set-ExecutionPolicy RemoteSigned`
4. Execute `createhardlink.ps1`
5. Restart Wireshark
