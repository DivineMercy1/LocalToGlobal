Dim WinScriptHost
Set WinScriptHost = CreateObject("WScript.Shell")
WinScriptHost.Run Chr(34) & "C:\Users\Jon\Documents\Github\Test\LocalGlobal.bat" & Chr(34), 0
Set WinScriptHost = Nothing