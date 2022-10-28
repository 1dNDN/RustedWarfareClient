if (-NOT ([Security.Principal.WindowsPrincipal][Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole] "Administrator"))  
{  
  $arguments = "& '" +$myinvocation.mycommand.definition + "'"
  Start-Process powershell -Verb runAs -ArgumentList $arguments
  Break
}

New-Item -ItemType HardLink -Path "C:\Program Files\Wireshark\plugins\4.0\epan\rustedwarfare.fdesc" -Target (Join-Path -Path $PSScriptRoot -ChildPath "\rustedwarfare.fdesc")
New-Item -ItemType HardLink -Path "C:\Program Files\Wireshark\plugins\4.0\epan\rustedwarfare.wsgd" -Target (Join-Path -Path $PSScriptRoot -ChildPath ".\rustedwarfare.wsgd")
