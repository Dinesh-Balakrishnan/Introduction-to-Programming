# Help and Documentation

**NOTE:** To see package documentation, look at '/usr/share/doc' in the Linux filesystem.

```bash
    man command
```

**manual:** Shows documentation for a command from the Unix Programmer's Manual.

```bash
    man -f command
    whatis command
```

'man' with the full tag, and 'whatis', display all manual pages covering the specified command, along with the chapter numbers.

```bash
    man n command
    man -a command
```

A specific chapter 'n', for a specified command, can be displayed using the 'man' command. All chapters covering the command can also be displayed at once using the 'all' command.

```bash
    man -k command
    apropos command
```

In English, apropos means relevant. This is quite fitting, as the 'man' command with the 'kindred' tag and apropos itself display all manual pages covering and referencing the specified command. 

```bash
   sudo mandb 
```

**man database:** Updates manual pages. 

```bash
   info 
   info command 
```

GNU, which stands for 'GNU's not Unix' is an operating system. It's creators also made their own documentation, a more modern version of 'man' pages. 'info' displays all available topics, while adding a command argument will display information pages for that particular command. While on the info page, '/' can be used to search for keywords and 'h' can be used to display the help menu.

```bash
    help
    cd --help
```

Some popular commands, such as cd, are built into the bash terminal rather than being located in the filesystem. These commands may not have a man page associated with them, but their documentation can be viewed using the 'help' tag. The 'help' command displays a short synopsis for built-in shell commands. 

```bash
    gnome-help
    khelpcenter
```

Linux desktop systems also have a graphical help application. These programs usually contain custom help for the desktop itself. 'gnome-help' is for GNOME, while 'khelpcenter' is for KDE.