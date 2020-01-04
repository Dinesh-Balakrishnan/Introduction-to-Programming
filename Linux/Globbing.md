# Globbing and System Searches

## Globbing

Globbing is the practice of searching for files and directories based on patterns of characters, which uses wildcards. When globbing, the wildcards undergo file expansion and find matching files/directories. The wildcards are:

| Wildcard | Result |
| -------- | ------ |
| ? | 	Matches any single character|
| * |	Matches any string of characters|
| [set] | Matches any character in the set of characters|
| [!set] | Matches any character not in the set of characters|
| 

**NOTE:** Globbing using wildcards isn't the same as using regex. That said, set functionality is very similar.

```bash
   ls -a [a-z].*
```
Globbing is mainly used with the ls command. In this example, all files that have a single alphabet character name will be printed out to the console.

```bash
   ls -a "filename/pathname"
```

To stop typed content from globbing, put double quotes around the content.

- - - -

## System Searches

```bash
   sudo updatedb
   locate filename/pathname (partial)
```

Linux systems have a database of the filesystem, which they 
automatically update once a day. The database can be 
manually updated by running the 'update database' command 
as a super user. The 'locate' command uses this database 
to find all matching files and directories that match the 
argument string.

```bash
   find
   find pathname -type <f, d, l> -name <filename/pathname>
   find pathname -iname <filename>
```

Without any options, 'find' lists all contents in the current/specified directory and its subdirectories. With the type option, 'find' can target files, directories, or symbolic links. The name option targets content with the specified name, while the iname does the same while ignoring case.

```bash
   find pathname -exec command {} ';'
   find pathname -ok command {} ';'
```

The 'execute' and 'ok' options both perform commands on all results produced by find, the only difference being that 'ok' prompts the user before executing the commands. The squiggly brackets will be replaced with the results. NOTE: The 'execute' option has to be closed with ';'.

```bash
   find pathname -ctime d
   find pathname -atime -d
   find pathname -mtime +d
```

Files can be searched for by their creation time, last accessed time, and last modified time in days. The + sign represents less than, while the - sign represents greater than.

```bash
   find pathname -size b 
   find pathname -size +10M (Greater than 10 MB)
```

Files can also be searched for by their size. The default unit is in bytes. Unit Symbols:
   * Bytes - c
   * Kilobytes - k
   * Megabytes - M
   * Gigabytes - G

